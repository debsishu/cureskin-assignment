/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int seatNumber = sc.nextInt();
            System.out.println(getOppositeSeat(seatNumber - 1) + " " + getSeatPosition(seatNumber - 1));
        }
        sc.close();
    }

    private static int getOppositeSeat(int seat) {
        int part = seat % 12;
        boolean isOpposite = false;
        if (part > 5) {
            isOpposite = false;
        } else {
            isOpposite = true;
        }

        int firstRowSeat = part % 6;
        if (isOpposite) {
            return seat + (2 * (5 - firstRowSeat) + 1) + 1;
        } else {
            return seat - (2 * (firstRowSeat) + 1) + 1;
        }
    }

    private static String getSeatPosition(int seat) {
        int part = seat % 12;
        int firstRowSeat = part % 6;

        if (firstRowSeat == 0 || firstRowSeat == 5) {
            return "WS";
        }
        if (firstRowSeat == 1 || firstRowSeat == 4) {
            return "MS";
        }
        if (firstRowSeat == 2 || firstRowSeat == 3) {
            return "AS";
        }
        return "";
    }
}
