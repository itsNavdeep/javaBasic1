import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        System.out.println("Your name is : "+name);
//        Concatenation
        String firstName="Tony";
        String lastName="Stark";
        String fullName=firstName+lastName;
        System.out.println(fullName);
//        Lenght
        System.out.println(lastName.length());
//        charAt
        for(int i=0;i<lastName.length();i++)
        {
            System.out.print(lastName.charAt(i));
        }
        System.out.println();
//        Compare to
//        case 1 s1>s2 return +ve value
//        case 2 s1==s2 return 0
//        case 3 s1<s2 return -ve value
        String name1="Tony2";
        String name2="Tony";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String are not equal");
        }
//        Why we are using compare to because == fail for few case
//        Example
        if (new String("Tony")==new String("Tony")){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String are not equal");
        }

//        Substring
        String sentence="My Name is Tony";
        String firstname=sentence.substring(11);
        System.out.println(firstname);
//        ParseInt Method of Integer class
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number);
//        ToString method of string class
        int number1=123;
        String stri=Integer.toString(number1);
        System.out.println(number1);

    }
}
