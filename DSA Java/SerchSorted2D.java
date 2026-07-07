public class SerchSorted2D {
    public static void main(String args[]){
        int matrix[][] = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };


        int startRow = matrix[0].length-1;
        int startCol = 0;
        int key = 0;

        while(startRow < matrix[0].length && startCol < matrix.length && startCol >=0 && startRow >=0 ){
            if(matrix[startCol][startRow] == key){
                System.out.println("Found Element: ("+ startCol+", "+ startRow+")");
                break;
            }

            if(matrix[startCol][startRow] > key )
                startRow--;
            else
                startCol++;
        }

    }
}
