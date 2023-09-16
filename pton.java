public class pton {  
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
public static void main(String[] args) {
 String num = "00010110";
 int[] arr1 = new int[8];

 arr1 = convertStringToArray(Integer.parseInt(num));
 for (int i =0;i<8;i++){ System.out.print(arr1[i]);}
 System.out.println();
 arr1 = convertPosiToNeg(arr1);
 for (int i =0;i<8;i++){ System.out.print(arr1[i]);}

}
    
}
