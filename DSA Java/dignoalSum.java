public class dignoalSum {
    public static void main(String args[]){
        int matrix[][] = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };
        
        int n = matrix.length-1;
        int rightSum = 0;
        int i = 0;
        while(i<=n){
            rightSum += matrix[i][i];
            i++;
        }

        int j=n, leftSum = 0;
        i=0;
        while(i<=n){
            leftSum += matrix[i][j];
            i++; j--;
        }

        if(n%2 == 0){
            i = (int) n/2;
            leftSum -= matrix[i][i];
        }


        System.out.println("Right Sum: "+ rightSum);
        System.out.println("Left Sum: "+ leftSum);

        System.out.println("Total Sum: "+ (rightSum+leftSum));
    }
}
