public class Multiples {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3) {

                x = x+1;

            } else if (divisibleBy5) {

                x = x+1;

            }
        }
        System.out.println(x);
    }
}