package les.Exceptions;

public enum Bewerking {


    OPTELLEN(),
    AFTREKKEN(),
    VERMENIGVULDIGEN(),
    DELEN();



    Bewerking() {

    }


    public void telOp (double getal1,double getal2){

        double res = getal1 + getal2;
        System.out.println(res);

    }


    public void trekAf ( double getal1, double getal2){

        double res = getal1 - getal2;
        System.out.println(res);
    }


    public void verMenigvuldig ( double getal1, double getal2){

        double res = getal1 * getal2;
        System.out.println(res);
    }



    public void delenDoor ( double getal1, double getal2){

        double res = getal1 / getal2;
        System.out.println(res);
    }




}