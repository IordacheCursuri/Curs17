package colectii;

import java.util.HashMap;
import java.util.Map;

public class Exemplu8 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Roma");
        map.put(5, "Paris");
        map.put(15, "Bucuresti");
        map.put(5, "Timisoara");
        map.put(5, "Iasi");



//        if(map.containsKey(128)) {
//            System.out.println("Paris");
//        } else{
//            System.out.println("Londra");
//        }

        System.out.println(map.get(5));

    }

}
