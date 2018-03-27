import java.util.Scanner;

public class oop1 {
    static int massiiviElementideKorrutis1(int[] m) {
        int korr = 1;
        for (int i = 0; i < 101; i++) {
            korr *= m[i];//korr = korr'm[i];
        }
        return korr;
    }

    //double juhuarv = Math.random()'(b-a)+a;
    //int juhutaisarv = Math.round(Math.random() ' (b-a) + a);

    // static int massiiviElementideKorrutis2(int[] m) {
    // int korr = 1;
    //for (int  e: m) {
    //    korr *=e;
    // }
    //}
    static boolean kasSummaSuuremNullist(int a, int b){
        int summa = a + b;
        if (summa <= 0) {
            return false;
        }
        else {
            return true;
        }
    }

    static int summaYhestSajani () {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        return sum;
    }

    static int kasutajalt(){
        Scanner sc = new Scanner(System.in);
        int summa = 0;
        System.out. println ("Palun sisesta esimene arv: ");
        int a = sc.nextInt();
        System.out. println ("Palun sisesta teine arv: ");
        int b = sc.nextInt();
        System.out. println ("Palun sisesta kolmas arv: ");
        int c = sc.nextInt();
        sc.close();
        return a+ b+ c;

    }
    public static void main (String[] args){
        int arv = kasutajalt();
        System.out.println(arv);
        //int[] massiiv = {1, 3, 5, 2};
        //System.out.println (massiiviElementideKorrutis1 (massiiv));
        // int[] massiiv = new int[10];
        //int a = 4;
        //int b = -9;
        //int sum = summaYhestSajani();
        //System.out.println (sum);
        //boolean c = kasSummaSuuremNullist(a, b);
        //System.out.println ("Arvude " + a + " ja " + b + " summa on positiivne:" + c );
    }
}
