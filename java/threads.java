import java.util.*;
public class threads extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        threads t1=new threads();
        t1.run();
    }
}
