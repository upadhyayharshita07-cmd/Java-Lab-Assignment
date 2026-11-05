/**
 * Experiment 14 - Question 1
 */
class Main {
    public static void main(String[] args) {
        String s = "programming";
        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println("Vowels: " + vowels);
    }
}
