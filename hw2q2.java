import java.lang.Math;
public class hw2q2 {
    public static int[] convertStringToArray(long num) {
        int[] decNumber = new int[8];
        for (int i = 0;i<8;i++){
            int divid = (int) Math.pow(10, 7-i);
            decNumber[i]= (int) (num / divid);
            num = num %divid;
        }
        return decNumber;
      } 
    public static int[] convertPosiToNeg(int[] posit){
        int[] negat = new int[8];
        for (int i = 0;i<8;i++){//flip the positive 8-bit 2’s-complement binary numbers
            if(posit[i]==0){
                negat[i]=1;
            }else{
                negat[i]=0;
            }
        }
        negat[7]+=1;//add 1 in the last 
        if(negat[7]>1){
            int n =1;
            negat[7]=0;
            negat[7-n]+=1;
            while(negat[7-n]==2){
                negat[7-n]=0;
                negat[6-n]+=1;
                n++;
            }
        }
        return negat;
    }
    public static void performAdd(int[] dec1, int[] dec2){
        int[] performadd = new int[8];
        if(dec1[0]==0&&dec2[0]==0){//when both input is positive 
            for(int i =7;i>=0;i--){
                performadd[i]= dec1[i]+dec2[i];
                if(performadd[i]==2){
                    performadd[i]=0;
                    dec1[i-1]+=1;
                }
            }
            if(performadd[0]==1){
                System.out.print("(Warrning: Overflow occured) ");
            }
        }
        else if(dec1[0]==0&&dec2[0]==1||dec1[0]==1&&dec2[0]==0){//when one input is negative & another input is positive
            for(int i =7;i>=0;i--){
                performadd[i]= dec1[i]+dec2[i];
                if(performadd[i]>=2 && i!=0){
                    performadd[i]=0;
                    dec1[i-1]+=1;
                }else if(performadd[i]>=2 && i==0){
                    performadd[i]=0;
                }
            }
        }
        else if(dec1[0]==1&&dec2[0]==1){//when both input is negative
            for(int i =7;i>=0;i--){
                performadd[i]= dec1[i]+dec2[i];
                if(performadd[i]>=2 && i!=0){
                    performadd[i]=0;
                    dec1[i-1]+=1;
                }else if(performadd[i]>=2&&i==0){
                    performadd[i]=0;
                }
            }
            if(performadd[0]==0){
                System.out.print("(Warrning: Underflow occured) ");
            }
        }
        for (int i = 0;i<8;i++){
            System.out.print(performadd[i]);
        }
        System.out.println();
    }
    public static void performSub(int[] dec1, int[] dec2){
        if(dec2[0]==0){//when both dec2 is positive 
            dec2= convertPosiToNeg(dec2);
            System.out.print("intput2 to negative intput2: ");
            for (int i = 0;i<8;i++){
                System.out.print(dec2[i]);
            }
            System.out.println();
            performAdd(dec1,dec2);
        }
    }
    public static void main(String[] args) {
        String input1 = args[0];
        String operation = args[1];
        String input2 = args[2];
        System.out.println("Arithmetic Operations");
        System.out.println("input1 is :"+input1);
        int[] dec1 = convertStringToArray(Integer.parseInt(input1));
        System.out.println("input2 is :"+input2);
        int[] dec2 = convertStringToArray(Integer.parseInt(input2));
        //for (int i =0;i<8;i++){ System.out.println(dec1[i]);}
         // test that dec1 has correct values
        //for (int i =0;i<8;i++){ System.out.println(dec2[i]);}
        // test that dec2 has correct values
        if (operation.equals("+")) {
            System.out.print("result: ");
            performAdd(dec1, dec2);
        }
        else if (operation.equals("-")) {
            System.out.print("result: ");
            performSub(dec1, dec2);
        }
    }
}
