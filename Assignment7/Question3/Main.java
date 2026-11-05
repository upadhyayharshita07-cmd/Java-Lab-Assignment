/**
 * Experiment 7 - Question 3
 */
class Main {
    public static void main(String[] args) {
        int n = 1024;
        int count = 0;
        // Time Complexity: O(log n)
        while (n > 1) {
            n = n / 2;
            count++;
        }
        System.out.println("Halving steps: " + count);
    }
}
