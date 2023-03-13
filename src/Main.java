import java.util.Arrays;

public class Main {
    static int countdigits(int n){
        int res =0;
        while(n>0)
        {
            n = n/10;
            res ++;
        }
        return res;
    }
    public static boolean  isprime(int n){

      if(n == 1 || n ==0)
          return false;
      if(n==2 || n==3)
          return true;
      if(n%2 ==0 || n % 3==0)
          return false;
      for(int i =5; i *i <n ; i =i+6)
          if(n% i ==0 || n% (i+2) ==0)
              return false;

      return true;
    }
    static int gcd(int a , int b)
    {
        if(b==0)
            return a;
        else return gcd(b,a%b);
    }
    static boolean plaindrome(int x){
        int res =0;
        int temp = x;
        while(temp!=0){
            int ld = temp%10;
            res = res*10 +ld;
            temp = temp/10;
        }
        return (res == x);
    }
   public static int fact(int x)
    {
//        if(x==0)
//            return 1;
//        else return x* fact(x-1);
        int res = 1;
        for(int i =2;i<=x;i++)
            res = res*i;
        return res;
    }
   public static int trailingzero(int x){
       System.out.println("i am in this funct");
        int countzero =0;
        int res = fact(x);
       System.out.println(res);
        while(res%10==0){
            countzero++;
            res = res/10;
        }
        return countzero;
    }
    public static int lcd(int a , int b){
        return (a*b)/ gcd(a,b);
    }
    static void printPrimeFactors(int n)
    {
        if(n <= 1)
            return;

        while(n % 2 == 0)
        {
            System.out.print(2+" ");

            n = n / 2;
        }

        while(n % 3 == 0)
        {
            System.out.print(3+" ");

            n = n / 3;
        }

        for(int i=5; i*i<=n; i=i+6)
        {
            while(n % i == 0)
            {
                System.out.print(i+" ");

                n = n / i;
            }

            while(n % (i + 2) == 0)
            {
                System.out.print((i + 2)+" ");

                n = n / (i + 2);
            }
        }

        if(n > 3)
            System.out.print(n+" ");

        System.out.println();
    }
    static void divisors(int n){
        int i =1;
        for( i =1; i*i<n;i++)
        {
            if(n%i==0)
                System.out.println("the divisors are " + i);
        }
        for ( ; i>=1;i--)
        {
            if(n%i ==0)
                System.out.println("the divisior are " + n/i);
        }
    }
    static void sieve(int n)
    {
        if(n <= 1)
            return;

        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime, true);

        for(int i=2; i <= n; i++)
        {
            if(isPrime[i])
            {
                System.out.println(i);
                for(int j = i*i; j <= n; j = j+i)
                {
                    isPrime[j] = false;
                }
            }
        }

//        for(int i = 2; i<=n; i++)
//        {
//            if(isPrime[i])
//                System.out.print(i+" ");
//        }
    }
    static void bitpower(int n, int x){
       int res= 1;
       while(n!=0){
            //if(n%2!=0){
           if((n&1)==1)
             res= res*x;
            x=x*x;
           // n=n/2;
           n = n>>1;

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("the number of digits are " + countdigits(1234));
        System.out.println("Is the number 3003  palindrome  " + plaindrome(3003));
        System.out.println("Is This prime number" + isprime(10));
        System.out.println("The gcd is " + gcd(5,10));
        System.out.println("the factorial of 5 is " + fact(5));
        System.out.println("The trailing zero in factorial of 100 is" + trailingzero(5));
        System.out.println("the lcd is " + lcd(6,4));
        printPrimeFactors(450);
        divisors(15);
        sieve(18);
        bitpower(5,4);
    }
}