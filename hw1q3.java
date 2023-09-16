public class hw1q3 {
    public static void convertDecimalTotwoComplementBinary(int dec){    
        int unsignedBinary[] = new int[40];
        if(dec<129 && dec>-129){    
            if(-1<dec){//positive number
                for(int j = 0;j<8;j++){//conver to binary 
                    if(dec!=0){
                        unsignedBinary[j] = dec%2;    
                        dec = dec/2;   
                    }else{
                        unsignedBinary[j] =0;   
                    }
                }
                for(int i = 7;i >= 0;i--){    
                    System.out.print(unsignedBinary[i]);    
                } 
            }else{//negative number
                dec *= -1;//make negative number as positive number
                dec--;//and subtract 1
                for(int j = 0;j<8;j++){//conver dec to binary
                    if(dec!=0){
                        unsignedBinary[j] = dec%2;    
                        dec = dec/2;   
                    }else{
                        unsignedBinary[j] =0;   
                    }
                }
                for(int j = 0;j<8;j++){//flip the binary
                    if(unsignedBinary[j]==0){
                        unsignedBinary[j] += 1;    
                    }else{
                        unsignedBinary[j] -=1;   
                    }
                }
                for(int i = 7;i >= 0;i--){    
                    System.out.print(unsignedBinary[i]);    
                } 
            }   
            System.out.println();//new line  
        }else{//when dec is out of the range print error message
            System.out.printf("error!! INPUT should be between -128 to 128!");
        }
    }    
   public static void main(String args[]){      
   System.out.println("Decimal of 13 is: ");  
   convertDecimalTotwoComplementBinary(13);    
   System.out.println("Decimal of 100 is: ");  
   convertDecimalTotwoComplementBinary(100);    
   System.out.println("Decimal of -94 is: ");  
   convertDecimalTotwoComplementBinary(-94); 
   System.out.println("Decimal of -128 is: ");  
   convertDecimalTotwoComplementBinary(-128); 
   System.out.println("Decimal of 0 is: ");  
   convertDecimalTotwoComplementBinary(0); 
   System.out.println("Decimal of 129 is: ");  
   convertDecimalTotwoComplementBinary(129); 
   }
}
