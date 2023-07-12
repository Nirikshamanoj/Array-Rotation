import java.util.Scanner;
public class ArrayRotation
{
    static int[] reverseArray(int[] A)
    {
        int size=A.length;
        int i=0,j=size-1;
        while (i<j)
        {
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
        return A;
    }
    static int[] pattern(int start, int end, int[] array)
    {
        int size=array.length;
        int i=start,j=end;
        while (i<j)
        {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int B=scanner.nextInt();
        if(n<B)
        {
            B=B%n;
        }
        int[] array =new int[n];
        array=reverseArray(A);
        array=pattern(0,B-1,A);
        array=pattern(B,n-1,A);
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
