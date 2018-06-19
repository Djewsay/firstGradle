package les;

import java.util.ArrayList;

public class Arrayles {
    public static void main(String[] args) {





        ArrayList<String> namen = new ArrayList<>();

        namen.add("Jimi");
        namen.add("James");
        namen.add("Amy");
        namen.add("Kurt");
        namen.add("Jim");



        for (int i = 0; i < namen.size(); i++){


            if(namen.get(i).toLowerCase().substring(0,1).equals("j")){
                System.out.println(namen.get(i));
                namen.remove(i);


            }
        }






    }
}
