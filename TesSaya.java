// Driver Class 
import java.util.Scanner;

public class TesSaya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama :");
        String nama = in.nextLine();
        System.out.println("ID :");
        int id = in.nextInt();
        System.out.println("Nilai anda :");
        double ipk = in.nextDouble();

        Saya nauval = new Saya(id, nama, ipk);
        // Nilai diatas 75 lulus
        if (nauval.getIpk() >= 75) {
            System.out.println(nauval.getNama() + " Lolos");
        }else{
            System.out.println(nauval.getNama() + " tidak lolos");
        }

        // Nilai Huruf 
        if (nauval.getIpk() < 60 ){
            System.out.println("E");
        }else if (nauval.getIpk() >= 60 && nauval.getIpk() < 70 ){
            System.out.println("D");
        }else if (nauval.getIpk() >= 70 && nauval.getIpk() < 80){
            System.out.println("c");
        }else if (nauval.getIpk() >= 80 && nauval.getIpk() < 90){
            System.out.println("B");
        }else if (nauval.getIpk() >= 90){
            System.out.println("A");
        }
        
        in.close();
    }
}


