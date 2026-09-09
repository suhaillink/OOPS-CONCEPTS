package four.project;

import java.util.*;

public class UserMangementDemo
{
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
//        Set<User> users1Roles = new HashSet<User>(Arrays.asList("Admin","User"));
//        User user1=new User(true,"Suhail",true);
        users.add(new User(true,"Suhail",new HashSet<>(Arrays.asList("ADMIN","USER"))));

        users.add(new User(false,"Kumar",new HashSet<>(Arrays.asList("USER"))));

        users.add(new User(true,"Sujith",new HashSet<>(Arrays.asList("MANAGER"))));

        //REMOVE INACTIVE USERS

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext())
        {
            if(!iterator.next().isActive())
            iterator.remove();
        }
        System.out.println("ACTIVE USERS");

        //PRINT ACTIVE USERS
        for(User user:users)
            System.out.println(user.getName());

        //COUNT USERS PER ROLES
        Map<String,Integer> map = new HashMap<>();

        for (User user:users)
            for(String role:user.getRoles())
                map.put(role,map.getOrDefault(role,0)+1 );
        System.out.println();
        System.out.println("Count");
        for(Map.Entry<String,Integer> entry:map.entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());
    }
}
