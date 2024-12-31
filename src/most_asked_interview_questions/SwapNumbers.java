package most_asked_interview_questions;

public class SwapNumbers {
    public static void main(String[] args){
        int a = 35;
        int b = 53;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Swapped number are a : "+a+" b :"+b);
    }
}
