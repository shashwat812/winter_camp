
//important 
// string immutable
// difference b/w == , compareTo() , isequal()

import java.util.*;
public class test {

    

    static void string1(){
        String sub="Example of Substring";
        String f="Shashwat ";
        String s="Mishra";
        String s3="Hello";
        String s2="Bello";
        int i=0;

        char ch=sub.charAt(i);
        String s4= new String("hi");
        String s5= new String("hola");


        int s1 = f.length();

         
        System.out.println(s1);
        System.out.println(f+s);
        System.out.println(f==s);
        System.out.println(s3.compareTo(s2));  //compareTo
        System.out.println(s4.compareTo(s5));
        System.out.println(sub.substring(0,11)); // substring
        System.out.println(sub.substring(11));
    }

    public static void main(String[] args) {
        string1();
    }
    
}
