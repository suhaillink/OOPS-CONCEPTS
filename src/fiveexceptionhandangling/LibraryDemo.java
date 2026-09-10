package fiveexceptionhandangling;
class Library{
    int availableBooks =3;

    public void borrowbook(int booksRequested){
        try {
            int []book ={101,102,103};
            System.out.println("Books requested :"+ book[booksRequested]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Books not available");
        }
        catch(NullPointerException e){
            System.out.println("Nullpointerexception");
        }
        finally{
            System.out.println("books present :"+ availableBooks);
        }

    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library=new Library();
        library.borrowbook(1);
    }
}
