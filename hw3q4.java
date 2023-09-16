/*
* Write a Generating Truth Table for 2-to-1 Multiplexer
@ @author JiYoon Kang
* created Feb 13, 2023
*/
public class hw3q4 {
    public static int andgate(int a,int b){
        int result= a&b;
        return result;
    }
    public static int orgate(int a,int b){
        int result= a|b;
        return result;
    }
    public static int notgate(int a){
        if(a == 1){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println("Truth Table for 2-to-1 Multiplexer:");
        System.out.println("Data0 | Data1 | Select | Out ");
        for(int select =0;select<2;select++){
            for(int d0 =0;d0<2;d0++){
                for(int d1 =0; d1<2;d1++){
                    int r1 = andgate(notgate(select),d0);// not select line and data-0
                    int r2 = andgate(select,d1);// select line and data-1
                    int out = orgate(r1,r2);//r1 or r2
                    System.out.println("  "+d0+"   |   "+d1+"   |    "+select+"   |  " +out);
                }
            }
        }
    }
}