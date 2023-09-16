/*
* Write a Generating Truth Table for 1-Bit Adder
@ @author JiYoon Kang
* created Feb 13, 2023
*/
public class hw3q3 {
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
    public static int xorgate(int a, int b){
        int ab1 = andgate(notgate(a),b);
        int ab2 = andgate(notgate(b),a);
        int ab = orgate(ab1,ab2);
        return ab;
    }
    public static void main(String[] args){
        System.out.println("Adder Truth Table:");
        System.out.println("A | B | Carry-In | Sum | Carry-Out");
        for(int a =0; a<2;a++){
            for(int b =0;b<2;b++){
                for(int cin =0;cin<2;cin++){
                    int ab = xorgate(a,b);
                    int abc = xorgate(ab,cin);
                    int r1 = andgate(a,b);
                    int r2 = andgate(ab,cin);
                    int cout1 = orgate(r1,r2);
                    System.out.println(a+" | "+b+" |    "+cin+"     |  " +abc+"  |     "+cout1);
                }
            }
        }
    }
}
