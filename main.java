import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data [][];
        data = new int [2][5];

        for(int a=0;a<2;a++){
            System.out.println();
            for(int i=0;i<5;i++){
                System.out.print("masukan angka :");
                int angka=input.nextInt();
                data[a][i]=angka;
            }
        }
        for(int a=0;a<2;a++){
            System.out.println( );
            for(int i=0;i<5;i++){
                System.out.println(data[a][i]);
                int hasil=data[a][i]%2;

                if(hasil==0){
                    System.out.println("genap");
                }else{
                    System.out.println("ganjil");
                }
            }
        }
    }
}
