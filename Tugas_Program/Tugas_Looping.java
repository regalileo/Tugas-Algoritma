package Tugas_Program;

import java.util.Scanner;

public class Tugas_Looping {
    public static void main(String[]args) {

        // palindrome

        try (Scanner test = new Scanner(System.in)) {
            System.out.println(" masukan kata = ");
            String text = test.next();
             if ((text.equalsIgnoreCase("katak")) || (text.equalsIgnoreCase("kasur ini rusak"))) {
                System.out.println(text + " adalah palindrome");
             } else if ((text.equalsIgnoreCase("makan")) || (text.equalsIgnoreCase("kasur"))) {
                System.out.println(text + " adalah bukan palindrome");
             } else {
                System.out.println("inputan salah");
             }
        }
        


        //membuat looping 1 2 4 3 4 6 5 6 8 7

        int a = 1;
        while (a <8) {
            System.out.print( a + " ");
            a++;
            if ( a == 3 && a < 4 ) {
                System.out.print(a + 1 + " ");
            }
            if (a == 5 && a < 6) {
                System.out.print(a + 1 + " ");
            }
            if  (a == 7 && a < 8) {
                System.out.print(a + 1 + " ");
            }  
        }
        System.out.println();

        //membuat looping 1 2 3 6 11 20 37 68
        int b = 1;
        while (b <= 3) {
            System.out.print(b + " ");
            if (b < 3) {
                b++;
                continue;
            }
            int c = b + b;
            System.out.print(c + " ");
            c++;
            int d = b + c + 1;
            System.out.print(d + " ");
            b++;
            int e = c + d + 2;
            System.out.print(e + " ");
            b++;
            int f = d + e + 6;
            System.out.print(f + " ");
            b++;
            int g = e + f + 11;
            System.out.print(g + " ");
            b++;
        }

        /*looping dalam looping untuk angka
        1 2 3 4 
        4 5 6 7
        7 8 9 10
         */

        System.out.println();
        int h = 1;
        int i = 4;
        for (int j=0; j<3; j++) {
            for (int k=0; k<4; k++) {
                System.out.print(h + " " );
                h++;
            } 
            System.out.println();
            h = i;
            i +=3; 
        }
    }
}

