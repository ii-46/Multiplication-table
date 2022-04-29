import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.print( "Start bang: ");
        int sb = sc.nextInt();

        System.out.print( "jub bang: ");
        int eb = sc.nextInt();

        System.out.print( "piem toe la: ");
        int ba = sc.nextInt();

        System.out.print( "kunkup: ");
        int sk = sc.nextInt();

        System.out.print( "jrn hod: ");
        int ek = sc.nextInt();

        System.out.print( "tue kun piem toe la: ");
        int ka = sc.nextInt();
        if ( sb < eb && sk < ek ) { //1
            for(int i = sb; i < eb; i+=ba){
                System.out.println("Bang: " + i + "der");
                for(int p = sk; p < ek ; p+=ka)
                {
                    System.out.println(i + "X" + p + "=" + (i*p));
                }
            }
        } else if ( sb < eb && sk > ek ) { //2
            for(int i = sb; i < eb; i+=ba) {
                System.out.println( "Bang: " + i + "der" );
                for (int p = sk; p > ek; p -= ka) {
                    System.out.println( i + "X" + p + "=" + (i * p) );
                }
            }

        }  else if ( sb > eb && sk < ek ) { //3
                for (int i = sb; i > eb; i -= ba) {
                    System.out.println( "Bang: " + i + "der" );
                    for (int p = sk; p < ek; p += ka) {
                        System.out.println( i + "X" + p + "=" + (i * p) );
                    }
                }
            }
        else if ( sb > eb && sk > ek ) { //4
            for (int i = sb; i > eb; i -= ba) {
                System.out.println( "Bang: " + i + "der" );
                for (int p = sk; p > ek; p -= ka) {
                    System.out.println( i + "X" + p + "=" + (i * p) );
                }
            }
        }
        else if ( sb == eb && sk == ek ) { //5
            for (int i = sb; i == eb; i += ba) {
                System.out.println( "Bang: " + i + "der" );
                for (int p = sk; p == ek; p += ka) {
                    System.out.println( i + "X" + p + "=" + (i * p) );
                }
            }
        }
        else if ( sb == eb && sk < ek ) { //6
            for (int i = sb; i == eb; i += ba) {
                System.out.println( "Bang: " + i + "der" );
                for (int p = sk; p < ek; p += ka) {
                    System.out.println( i + "X" + p + "=" + (i * p) );
                }
            }
        }
        else if ( sb == eb && sk > ek ) { //7
            for (int i = sb; i == eb; i += ba) {
                System.out.println( "Bang: " + i + "der" );
                for (int p = sk; p > ek; p -= ka) {
                    System.out.println( i + "X" + p + "=" + (i * p) );
                }
            }
        }
        else if ( sb > eb && sk == ek ) { //8
            for (int i = sb; i > eb; i -= ba) {
                System.out.println( "Bang: " + i + "der" );
                for (int p = sk; p == ek; p += ka) {
                    System.out.println( i + "X" + p + "=" + (i * p) );
                }
            }
        }
        else if ( sb < eb && sk == ek ) { //8
            for (int i = sb; i < eb; i += ba) {
                System.out.println( "Bang: " + i + "der" );
                for (int p = sk; p == ek; p += ka) {
                    System.out.println( i + "X" + p + "=" + (i * p) );
                }
            }
        }
        }
    }
