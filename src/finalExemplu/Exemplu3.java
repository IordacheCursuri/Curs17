package finalExemplu;

public class Exemplu3 {

    public static void main(String[] args) {

        final int x = 9;

      //  x = 2;

        System.out.println(x);


        /**
         *  final:
         *   - pus pe filed face sa nu mai putem modifica acea valoare. In momentul in care vom
         *     vrea sa modificam o valoare "final" => roare de compilare
         *
         *   - pus pe clasa -> face ca acea clasa sa nu mai poata fi mostenita
         *
         *   - pus pe o metoda -> face ce acea metoda sa nu mai poate fi suprascrisa
         *
         * */


    }


    public void doSomething() {
        System.out.println("test");
    }

}
