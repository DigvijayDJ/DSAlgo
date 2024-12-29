package strings;

public class Palindrome {
    public static void main(String[] args){
        String s1 = "madama";

        int i = 0, j = s1.length()-1;
        boolean isPalindrome = false;

        while(i<j){
            if(s1.charAt(i) != s1.charAt(j)){
                System.out.println(isPalindrome);
                return;
            }
            else {
                i++;
                j--;
            }
        }
        isPalindrome = true;
        System.out.println(isPalindrome);
        return;
    }
}
