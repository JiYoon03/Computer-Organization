public class hw1q1 {
    public static int convertUnsignedBinaryToDecimal(long num) {
        int decNumber = 0, i = 0;
        long remain;
        
        while (num != 0) {
          remain = num % 10;
          num /= 10;
          decNumber += remain * Math.pow(2, i);
          ++i;
        }
        
        return decNumber;
      }
    public static void main(String[] args) {

        // binary number
        long num1 = 1101;
        long num2 = 1000000;
        long num3 = 1111110;
        long num4 = 01010101;
    
        // call method by passing the binary number
        int dec1 = convertUnsignedBinaryToDecimal(num1);
        int dec2 = convertUnsignedBinaryToDecimal(num2);
        int dec3 = convertUnsignedBinaryToDecimal(num3);
        int dec4 = convertUnsignedBinaryToDecimal(num4);
    
        System.out.println("Unsinged Binary to Decimal");
        System.out.println(num1 + " = " + dec1);
        System.out.println(num2 + " = " + dec2);
        System.out.println(num3 + " = " + dec3);
        System.out.println(num4 + " = " + dec4);
      }

}