/*
* Write a Generating Truth Tables
@ @author JiYoon Kang
* created Feb 13, 2023
*/
public class hw3q2 {
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
        System.out.println("Truth Table 1:");
        System.out.println("(A and B) or (C and D)");
        System.out.println("A | B | C | D | Out");
        for(int a =0; a<2;a++){
            for(int b =0;b<2;b++){
                for(int c =0;c<2;c++){
                    for(int d=0;d<2;d++){
                        int r1 = andgate(a,b);// A and B
                        int r2 = andgate(c,d);// C and D
                        int result1 = orgate(r1,r2);
                        System.out.println(a+" | "+b+" | "+c+" | "+d+" |  "+result1);
                    }

                }
            }
        }
        System.out.println("================================");
        System.out.println("Truth Table 2:");
        System.out.println("A and (B or C) and ((not C) or (not D))");
        System.out.println("A | B | C | D | Out");
        for(int a =0; a<2;a++){
            for(int b =0;b<2;b++){
                for(int c =0;c<2;c++){
                    for(int d=0;d<2;d++){
                        int r3 = andgate(a,orgate(b,c));// A and (B or C)
                        int r4 = orgate(notgate(c),notgate(d));//not C or not D
                        int result2 = andgate(r3,r4);
                        System.out.println(a+" | "+b+" | "+c+" | "+d+" |  "+result2);
                    }

                }
            }
        }
        System.out.println("================================");
        System.out.println("Truth Table 3:");
        System.out.println("((A and (not B) and (not C)) or ((not A) and B and (not C)) or ((not A) and (not B) and C)");
        System.out.println("A | B | C | Out");
        for(int a =0; a<2;a++){
            for(int b =0;b<2;b++){
                for(int c =0;c<2;c++){
                    int r5 = andgate(a,andgate(notgate(c),notgate(b)));//(A and (not B) and (not C)
                    int r6 = andgate(b,andgate(notgate(a),notgate(c)));//(not A) and B and (not C)
                    int r7 = andgate(c,andgate(notgate(a),notgate(b)));//(not A) and (not B) and C
                    int result3 = orgate(r5,orgate(r6,r7));
                    System.out.println(a+" | "+b+" | "+c+" |  "+result3);
                }
            }
        }
    }
}

