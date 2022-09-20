import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int i=0,x= input.nextInt();
        int y=x;
        while(y!=0){
            y/=10;
            i++;
        }
        int total=0;
        y=x;
        while(y!=0){
            int a=y%10;
            total+=a;
            y/=10;
        }
        System.out.println("TOTAL:"+total);
    }
}