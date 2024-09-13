package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int length=String.valueOf(number).length();
        int multiple=1;
        for(int i=0;i<length;i++) {
            int a=(int)Math.pow(10,i);
            int b=(number/a)%10;

            multiple*=b;

        }
        System.out.println(multiple);

    }
}
