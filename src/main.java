import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,result;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        n=input.nextInt();
        result=0;
        for (int i=1;i<n;i++){
            if (n % i == 0){
                result +=i;
            }
        }
        if (result == n){
            System.out.println(n+" Sayısı Mükemmel Sayıdır");
        }else {
            System.out.println(n+" Sayısı Mükemmel Sayı değildir");
        }

    }
}
