
// Find percentage of occurence of uppercase, lowercase,digits and special characters in tha given string

import java.util.*;
import java.text.DecimalFormat;
class ques2{

    static void stringpercentage(String input){
        float totalchar = input.length();
        float Uppercase=0;
        float lowercase=0;
        float digits=0;
        float others=0;

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i); //returns the index of string charAt

            if(Character.isUpperCase(ch)){ //isUpperCase is method of Character class
                // System.out.println(Uppercase);
                Uppercase++;
            }
            else if(Character.isLowerCase(ch)){
                lowercase++;
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
            else{
                others++;
            }
            
        }
        System.out.println(digits);
        System.out.println(lowercase);
        System.out.println(Uppercase);
        System.out.println(others);

         // float Upperchar_per = (Uppercase/totalchar)*100;
        // float lowerchar_per = (lowercase/totalchar)*100;
        // float digits_per=(digits/totalchar)*100;
        // float others_per = (others/totalchar)*100;

        // DecimalFormat format = new DecimalFormat("##.##");  


        System.out.println("In"+input+":");
        System.out.println("Percentage of Uppercase is :  "+ (Uppercase/totalchar)*100);
        System.out.println("Percentage of lowercase is : "+ (lowercase/totalchar)*100);
        System.out.println("Percentage of digits is :"+(digits/totalchar)*100 );
        System.out.println("Percentage of others is :"+(others/totalchar)*100 );
    }

    public static void main(String[] args) {
        stringpercentage(" My gmail ID : shashawtmishra812@gmail.com");
    }
     


}