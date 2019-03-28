package pl.waw.sgh;

public class PrimeNumbers {

    public static void main(String[] args) {
        int num = 13;
        boolean test = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                test = true;
                break;
            }
        }

        if (!test)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

