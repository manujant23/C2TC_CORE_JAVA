package Coding_Java;

public class Armstrong_3_digit {
    public static void main(String[] args)
    {
 
        int n = 153;// inside n there is 153
        int temp = n;// temp = 153
        int p = 0;// we are decalaring and initz p to 0 
 

        while (n > 0) {
 
            int rem = n % 10;//153 % 10 ===3   rem = 3
            p = (p) + (rem * rem * rem );//27+125+1=153
            n = n / 10;//153/10==n=15,15/10==1
        }
 
       
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
    }
}
