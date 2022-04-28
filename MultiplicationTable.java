import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.print( "Start bang: ");

        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();

        System.out.print( "jub bang: ");
        int k = sc.nextInt();

        System.out.print( "piem toe la: ");
        int j = sc.nextInt();

        System.out.print( "kunkup: ");
        int m = sc.nextInt();

        System.out.print( "jrn hod: ");
        int n = sc.nextInt();

        System.out.print( "tue kun piem toe la: ");
        int o = sc.nextInt();
        for(int i = a; i <= k; i+=j){
                System.out.println("Bang: " + i + "der");
            for(int p = m; p <= n ; p+=o)
            {
                System.out.println(i + "X" + p + "=" + (i*p));
            }
        }
    }
}