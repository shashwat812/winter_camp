//reverse string
//
//
//
public class reverse_array {
    
    static void reverse(){
        String s1= "reverse string";
        int j=s1.length();
        // Character ch = s1.charAt(j-1);
        int h=j;

        while(h--){
            System.out.println(s1[h]);
        }

        
    }

    public static void main(String[] args) {
        reverse();
    }
}
