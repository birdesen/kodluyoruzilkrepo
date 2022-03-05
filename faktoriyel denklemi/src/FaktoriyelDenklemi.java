import java.util.Scanner;
public class FaktoriyelDenklemi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("n değeri giriniz: ");
        int n = scan.nextInt();
        System.out.print("r değeri giriniz: ");
        int r = scan.nextInt();

        int totaln = 1;
        int totalr = 1;
        int totalnr = 1;

        for(int i=1; i<=n; i++){
            totaln = totaln * i;
        }
        for(int i=1; i<=r; i++){
            totalr = totalr * i;
        }
        for(int i=1; i<=(n-r); i++){
            totalnr = totalnr * i;
        }

        System.out.println("C(n,r) = n! / (r! * (n-r)!)=" + totaln/(totalr*totalnr));

    }
}
