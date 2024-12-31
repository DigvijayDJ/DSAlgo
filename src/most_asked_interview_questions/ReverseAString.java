package most_asked_interview_questions;

public class ReverseAString {
    public static void main(String[] args){

        System.out.println("Reverse String :"+ reverseString("RAM"));
    }

    public static String reverseString(String s){
        int i = 0;
        char[] chars = s.toCharArray();
        int j = chars.length-1;

        while(i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
