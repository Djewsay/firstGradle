package les.enums;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();


        System.out.println(EnumMonths.valueOf(month).getRain());
        System.out.println(EnumMonths.valueOf(month).getTemp());
        System.out.println(EnumMonths.valueOf(month).getZon());


    }
}
