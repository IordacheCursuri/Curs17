package compilare;

public class Exemplu5 {

    public static void main(String[] args) {


        System.out.println("Ana are mere" + "si pere");

        if( true  ) {
            System.out.println("se printeaza doar daca conditia din if este -> true");
        } else {
            System.out.println("se printeaza doar daca conditia din if este -> false");
        }


        for(int i = 0; i < 20; i++){

            if(i == 10) {
                System.out.println("Am iesit din loop");
                break;
            }
            System.out.println(i);

        }

    }
}
