/**
 * Experiment 13 - Question 3
 */
class Main {
    public static void main(String[] args) {
        String word = "racecar";
        boolean isPalindrome = true;
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
