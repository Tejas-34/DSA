import java.util.Scanner;

public class patterns{
    public static void Pattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void StarPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void CharPattern(int n){
        char c = 'A';
        for(int i=1; i<=n; i++){
            for(char j=0; j<i; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }


        public static void HollowTraingle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void InvertedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedHalfPyramidNumbers(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FLOYDsTraingle(int n){
        int num = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void Triangle1_0(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number a:  " );
        // int a = sc.nextInt();
        // System.out.println("Enter Numbeb b: ");
        // int $ = sc.nextInt();

        // int sum = a+$;
        // System.out.println("addition of " + a + "and "+$+ " is "+ sum);\
        

        Triangle1_0(5);
       
    }
}