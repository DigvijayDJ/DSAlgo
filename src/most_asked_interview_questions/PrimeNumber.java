package most_asked_interview_questions;

public class PrimeNumber {
    public static void main(String[] args){
        int n = 97;
        System.out.println(checkPrime(7));
    }

    public static boolean checkPrime(int n){
        for(int i = 2; i*i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


}
