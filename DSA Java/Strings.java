public class Strings {

    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void DirectionDistance(String str){
        int x=0,y=0;
        int len = str.length();

        for(int i=0; i<len; i++){
            char c = str.charAt(i);
            if(c == 'W' )
                x--;
            else if(c == 'N')
                y++;
            else if(c == 'E')
                x++;
            else if(c == 'S')
                y--;
            else
                System.out.println("Invalid Direction");
        }

        double a = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2)) ; 
        System.out.println("Shortest Ditance: " + a);

    }



    public static void main(String[] args) {


        // String str = "madam";
        // if (isPalindrome(str)) {
        //     System.out.println("String is palindrome..");
        // } else {
        //     System.out.println("Not Palindrome..");
        // }


        DirectionDistance("WNEENESENNN");
    }


}
