//String is immutable

import java.util.*;

public class String_buffer {

    static void k(){
    //     String s=new String("Hello");
    //     s.concat("world");
    //     System.out.println(s);
    // }
    
    // String s1=new String("Hello");
    // String s2=new String("Hello");
    // System.out.println(s1==s2);             //false
    // System.out.println(s1.equals(s2)); //true
    
    
    // StringBuffer s1=new StringBuffer("Hello");
    // StringBuffer s2=new StringBuffer("Hello");
    // System.out.println(s1==s2);             //false
    // System.out.println(s1.equals(s2)); //false as object of StringBuffer is passed references are compared because StringBuffer does not override equals method of Object class.
    
    // final StringBuffer s2=new StringBuffer("Hello "); //mutable because final makes variable mutable not objects 
    // s2.append("world");
    // System.out.println(s2);           
    
    // final StringBuffer sb =new StringBuffer("Wednesday ");
    // sb=new StringBuffer("Highly recomended");  //error: cannot assign a value to final variable sb
    // System.out.println(sb);           
    

    
    

    
    





}

    
    public static void main(String[] args) {
        k();
    }
}


