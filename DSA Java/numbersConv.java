public class numbersConv {
    public static int BinaryToDecimal(int binary){
        int decimal = 0;
        int pow = 0;
        while(binary>0){
            int LastDigit = binary%10;
            decimal += LastDigit*Math.pow(2,pow);
            binary = (int) binary/10;
            pow++;
        }
        return decimal;
    }

    public static void DecimalToBinary(int decimal){
        int binary=0;
        int pow = 0;
        while(decimal>0){
            int rem = decimal%2;
            binary += rem* Math.pow(10,pow);
            decimal /= 2;
            pow++;
        }
        System.out.println("Binary Number: "+ binary);
    }

    public static void main(String args[]){
        System.out.println(BinaryToDecimal(111));
        DecimalToBinary(7);
    }
}
