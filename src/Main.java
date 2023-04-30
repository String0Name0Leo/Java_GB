import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        twoWords(s1, s2);
        System.out.println("Halo");
    }

    private static void twoWords(String s1, String s2) {
        if (s1.length() > s2.length()) {
            System.out.println(" S1 > S2");
        } else if (s2.length() > s1.length()) {
            System.out.println("S2 > S1");
        } else {
            System.out.println("S2 = S1");
        }
    }


}

