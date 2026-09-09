package fiveexceptionhandangling;

import com.sun.source.tree.TryTree;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int result=10/0;
        } catch (Exception e) {
            System.out.println("0 cant be divided by zero");
        }
        try{
            int []a={1,2,3};
            System.out.println(a[10]);
        }
        catch (Exception e){
            System.out.println("out of bound exception");
        }
    }
}
