/* *****************************************************************************
 *  Name:              Alfredo
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String Champion = "";
        String Challenger = "";
        double order = 1.0;
        boolean accept;

        Champion = StdIn.readString();
        // accept = StdRandom.bernoulli(1 / order);

        while (!StdIn.isEmpty()) {
            order++;
            accept = StdRandom.bernoulli(1 / order);
            Challenger = StdIn.readString();
            if (accept) {
                Champion = Challenger;
            }
            // System.out.printf("String: %s - Probability: %.1f - Accept: %b%n", Challenger, 1.0 / order, accept);
        }
        System.out.println(Champion);
    }
}
