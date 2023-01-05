import java.util.*;
import java.lang.Math;

class input{
    void in(){
        Scanner sc=new Scanner(System.in);
    }
}

class assignment_3{
    public static void main(String[] args) {
        // min_max m = new min_max();
        // m.fun();

        // sort s = new sort();
        // s.sort();

        // second_min_max sm=new second_min_max();
        // sm.s_min_min();

        min_distance md=new min_distance();
        md.min_dis();

        // insert_del_in_array id =new insert_del_in_array();
        // id.insert();
        // id.delete();
    }
}

class min_max{
    static void fun(){
        int min,max=0;
        int arr[]={1,56,7,9,45,13,4};
        int size=arr.length;
        min=arr[4];

        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("max element is :");
        System.out.println(max);
        System.out.println("min element is :");
        System.out.println(min);
        
    }

}

class sort{

    static void sort(){


    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Size of array : ");
    int size=sc.nextInt();
    int arr[]=new int[size];

    System.out.println("Enter Array: ");

    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
        
    System.out.println("Array is:  ");

    for(int j=0;j<size;j++){
        
        System.out.print(arr[j]+" ");
    }

        for(int i=0;i<size-1;i++){

                for(int j=0;j<size-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1]; 
                arr[j+1]=temp;
            }
        
        }
        }

        System.out.println("\nSorted Array is :  ");

        for(int j=0;j<size;j++){
            
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }

       

}

class second_min_max{

    void s_min_min(){
    int arr[]={4,6,3,67,12,43,89,100,345};
    int size = arr.length;
    int s_min,s_max=0;
    int min,max=0;
    min=100;
    s_min=100;

        for(int i=0;i<size;i++){

            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }

        for(int j=0;j<size;j++){
            if(arr[j]>s_max && arr[j]!=max ){
                s_max=arr[j];
            }
            if(arr[j]<s_min && arr[j]!=min){
                s_min=arr[j];
            }
        }

        System.out.println("Max and min are : ");
        System.out.println(max+" "+min);
        System.out.println("Second max and min are : ");
        System.out.println(s_max+" "+s_min);

    }
}

class min_distance{
    void min_dis(){
        int arr[]={4,6,3,67,12,43,89,100,345};
        int size=arr.length;
        int min_distance=-1;
        int min=100;
        
        
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++){
                min_distance=(arr[i]-arr[j]);
                if(min_distance <0) min_distance*=(-1);
                if(min>min_distance)
                {
                    min=min_distance;
                }
            }
            
        }
        System.out.println(min);
        
        
        
    }

}

class insert_del_in_array{
    
    int arr[]={4,6,3,67,12,43,89,100,345};
    int size=arr.length;

    void insert(){
        
    };
    
    void delete(){
        
    };
}
