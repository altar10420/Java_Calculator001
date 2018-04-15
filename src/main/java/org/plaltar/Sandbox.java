package org.plaltar;

public class Sandbox {
    public static void main(String[] args) {

        String a = "z";
        String aa = a; //przepisuję adres i dlatego jest tylko 1 obiekt (nie tworzę nowego)

        System.out.println(aa == a);
        System.out.println(aa.equals(a));
        String z = "z";
        System.out.println(a == z);
    }
}
