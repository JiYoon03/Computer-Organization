/*
* Write a Evaluating Circuits
@ @author JiYoon Kang
* created Feb 13, 2023
*/
public class hw3q1 {
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
        int a = 1;
        int b1 = 1;
        int b2 = 0;
        int c1 = 0;
        int c2 = 1;
        int d = 0;
        System.out.println("Circuit1:");
        System.out.println("(A and B) or (C and D), A = "+a+", B = "+b1+", C = "+c1+", D = "+d);
        int r1 = andgate(a,b1);// A and B
        int r2 = andgate(c1,d);// C and D
        int result1 = orgate(r1,r2);
        System.out.println("result: "+result1);
        System.out.println("Circuit2:");
        System.out.println("A and (B or C) and (not C) or (not D), A = "+a+", B = "+b2+", C = "+c2+", D = "+d);
        int r3 = andgate(a,orgate(b2,c2));// A and (B or C)
        int r4 = orgate(notgate(c2),notgate(d));//not C or not D
        int result2 = andgate(r3,r4);
        System.out.println("result: "+result2);
    }
}
