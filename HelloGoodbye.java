/* *****************************************************************************
 *  Name:              Alfredo
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Must be at least 2 Arguments");
        }
        else {
            System.out.printf("Hello %s %s %n", args[0], args[1]);
            System.out.printf("Goodbye %s %s %n", args[0], args[1]);
        }

    }
}
