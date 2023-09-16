public class hw1q2 {
    public static void convertDecimalToUnsignedBinary(int dec){    
        int unsignedBinary[] = new int[40];    
        int indexnum = 0;    
        while(dec > 0){    
            unsignedBinary[indexnum++] = dec%2;    
          dec = dec/2;    
        }    
        for(int i = indexnum-1;i >= 0;i--){    
          System.out.print(unsignedBinary[i]);    
        }    
   System.out.println();//new line  
   }    
   public static void main(String args[]){      
   System.out.println("Decimal of 13 is: ");  
   convertDecimalToUnsignedBinary(13);    
   System.out.println("Decimal of 128 is: ");  
   convertDecimalToUnsignedBinary(128);    
   System.out.println("Decimal of 622 is: ");  
   convertDecimalToUnsignedBinary(622); 
   System.out.println("Decimal of 2049 is: ");  
   convertDecimalToUnsignedBinary(2049); 
   }
}
