package les.enums;

public enum EnumMonths {


        JANUARY (1,2,3),
        FEBRUARY (4,5,5);




        public final int temp;
       public final int rain;
        public final int zon;


    EnumMonths(int rain, int temp, int zon) {

        this.rain = rain;
        this.temp = temp;
        this.zon = zon;

    }


    public int getTemp() {
        return temp;
    }

    public int getRain() {
        return rain;
    }

    public int getZon() {
        return zon;
    }
}
