
package evendigitsum;


public class Main {

    
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-1));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    
    public static int getEvenDigitSum (int number){
        int sum = 0;
        int digit = 0;
        if (number < 0){
            return -1;
        }
        do {
            digit = number % 10;
            number /= 10;
            if (digit % 2 == 0){
                sum += digit;
            }
        }while (number > 0 );
        return sum;
    }
}
    

