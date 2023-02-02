import java.util.Scanner;

public class spiralMatrix {
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
        int top=0;
        int bottom=2;
        int left=0;
        int right=2;
        int direction=0;
        while(top<=bottom && left<=right)
        {
            if(direction==0){
                for(int i=left;i<=right;i++)
                {
                    System.out.print(myarray[top][i]+" ");
                }
                top+=1;
            } else if (direction==1) {
                for(int i=top;i<=bottom;i++){
                    System.out.print(myarray[i][right]+" ");
                }
                right-=1;

            } else if (direction==2) {
                for(int i=right;i>=left;i--){
                    System.out.print(myarray[bottom][i]+" ");
                }
                bottom-=1;
            }
            else{
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(myarray[i][left]+" ");
                }
                left+=1;
            }
            direction=(direction+1)%4;
        }
    }
}
