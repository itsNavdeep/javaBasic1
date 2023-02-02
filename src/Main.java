import java.util.Scanner;
public class Main {


    public static void printSum(int a,int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public  static void factorial(int a){
        if (a<=0)
        {
            System.out.println("CANT FIND FACTORIAL");;
        }
        else{
            int fact=1;
            for(int i=a;i>=1;i--){
                fact=fact*i;

            }
            System.out.println("Factorial of "+a+" is "+fact);
        }
    }
    public static void gcd(int a,int b)
    {
        int commonfactor=1;
        for(int i=2;i<=a;i++)
        {
            if (a%i==0 && b%i==0)
            {
                commonfactor*=i;
            }
        }
        System.out.println(commonfactor);;
    }
    public static void fSeries(int a)
    {
        if (a==1){
            System.out.println("0");
        }
        if (a==2){
            System.out.println("0 1");
        }
        int i=0;
        int j=1;
        System.out.print("0 1 ");
        for(int k=0;k<a;k++)
        {
            int temp=i+j;
            System.out.print(temp+" ");
            i=j;
            j=temp;
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

//        System.out.println("Hello world!");
//        String name= scan.next();
//        System.out.println(name);
//        char greeting=scan.next().charAt(0);
//        switch (greeting){
//            case 'a':
//                System.out.println("Hello");
//                break;
//            case 'b':
//                System.out.println("BONJOUR");
//                break;
//            default:
//                System.out.println("Hi");
//        }

//        int a=scan.nextInt();
//        int b= scan.nextInt();
//        printSum(a,b);
//        factorial(a);
//        gcd(a,b);
//        fSeries(a);
//        int [] marks=new int[3];
//        marks[0]=95;
//        marks[1]=100;
//        marks[2]=86;
//        for(int i=0;i< marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }


    }
}