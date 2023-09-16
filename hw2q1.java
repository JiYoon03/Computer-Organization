public class hw2q1 {
    public static int[] convertStringToArray(long num) {
      int[] decNumber = new int[8];
      for (int i = 0;i<8;i++){
          int divid = (int) Math.pow(10, 7-i);
          decNumber[i]= (int) (num / divid);
          num = num %divid;
      }
      return decNumber;
    } 
  public static void performAnd(int[] dec1, int[] dec2){
      int[] performand = new int[8];
      System.out.print("result: ");
      for(int i =0;i<8;i++){
          performand[i]= dec1[i]&dec2[i];
          System.out.print(performand[i]);
      }
      System.out.println();
  }
  public static void performOr(int[] dec1, int[] dec2){
      int[] performor = new int[8];
      System.out.print("result: ");
      for(int i =0;i<8;i++){
          performor[i]= dec1[i]|dec2[i];
          System.out.print(performor[i]);
      }
      System.out.println();
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
      if (operation.equals("&")) {
          performAnd(dec1, dec2);
      }
      else if (operation.equals("|")) {
        performOr(dec1, dec2);
      }
  }
}