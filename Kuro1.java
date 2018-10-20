package kuro;
import java.util.Scanner;
public class Kuro1{
    public static void main(String[] args) {
        Scanner cetak = new Scanner(System.in);
        String pil;
        System.out.print("mkn :");
        pil = cetak.nextLine();
        
        switch(pil){
            case "mkn":
                System.out.println("Maknanan");
                break;
            default:
                System.out.println("Salah");
                break;
        }
    }
}