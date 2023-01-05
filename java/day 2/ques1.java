// WAP to count no of vowels and consonants in a string. string can contain special characters however only lower case are allowed in string

public class ques1 {
    

    static void count_v_and_c(String input){
        int count_v=0;
        int count_c=0;

        int totalength =input.length();

        for(int i=0;i<input.length();i++){
        char ch=input.charAt(i);
        if(ch == 'a' || ch=='i' || ch == 'e' ||ch=='o' || ch=='u'){
            count_v ++;
        }
        else{
            count_c ++;
        }
        }

        System.out.println("Number of vowels in string are : "+ count_v);
        System.out.println("Number of consonants in string are : "+ count_c);

    }

    public static void main(String[] args) {
        count_v_and_c("count no of vowels and consonants");
    }

}
