import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [][] myarray=new int[3][3];
        for(int i=0;i<myarray.length;i++)
        {
            for(int j=0;j<myarray.length;j++)
            {
                myarray[i][j]= scan.nextInt();
            }
        }
//        Output
        for(int i=0;i<myarray.length;i++)
        {
            for(int j=0;j<myarray.length;j++)
            {
                System.out.print(myarray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose:");
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++)
            {
                System.out.println(myarray[i][j]);
            }
        }
    }
}
