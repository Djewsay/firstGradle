package les.unitTesting;

public class Breuk {


    private int teller;
    private int noemer;


    public Breuk(int teller, int noemer) {
        this.teller = teller;
        this.noemer = noemer;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }

    public int getTeller() {
        return teller;
    }

    public int getNoemer() {
        return noemer;
    }





    public Breuk multiply(Breuk a){

        int resTeller = this.teller * a.noemer;
        int resNoemer = this.noemer * a.teller;

        Breuk resultaat = new Breuk(resTeller, resNoemer);

        return resultaat;

    }


    public Breuk add(Breuk b){

        int resNoemer = this.noemer * b.noemer;
        int resTeller = this.teller + b.noemer;

        Breuk resultaat = new Breuk(resTeller,resNoemer);
        return resultaat;

    }




}
