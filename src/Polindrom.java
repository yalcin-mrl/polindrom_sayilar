import java.util.Scanner;

public class Polindrom {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı gir: ");
        int n = sc.nextInt();
        int tmp = n, c= 0,first =0,sec = 0;
        while(tmp>0){
            int k = tmp%10;
            tmp /=10;
            if(c==0){
                first = k;
            }
            if(tmp<1){
                sec = k;
            }
            c++;
        }
        if(first == sec){
            System.out.println(n + " Polindrom sayıdır.");
        }else{
            System.out.println(n + " Polindrom sayı değildir.");
        }
    }
}
