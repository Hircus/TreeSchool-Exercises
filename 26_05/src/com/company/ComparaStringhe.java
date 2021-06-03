package com.company;

public class ComparaStringhe {

    public static void main(String[] args) {
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        System.out.println("2".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        System.out.println("1".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        System.out.println("3".equals(""+compareStrings(a, b, c)));
    }

    private static int compareStrings(String a, String b, String c) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        String c1 = c.toLowerCase();
        int aa = a1.equals(a1) ? 1 : 0;
        int ab = a1.equals(b1) ? 1 : 0;
        int ac = a1.equals(c1) ? 1 : 0;

        if(a1.equals(b1)){
            if (b1.equals(c1)) return 3;
            return 2;
        }
        else return 1;

        //System.out.println(aa + ab + ac);
        //return aa + ab + ac;

    }
}
