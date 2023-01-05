import java.util.ArrayList;

class arraylist {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Kharar");
        cities.add("Delhi");
        cities.add("CHD");
        cities.add("LKO");
        cities.add("Jaipur");
        cities.add("Noida");
        
        System.out.println(cities);
        System.out.println(cities.get(2)); //getting index
    }
}