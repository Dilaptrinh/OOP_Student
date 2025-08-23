package sinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("Hello World !");
      System.out.println("Please enter student number!");
      Scanner scanner=new Scanner(System.in);
      int n =scanner.nextInt(); 
      scanner.nextLine(); // không cần gán vào biến
      ArrayList<SinhVien> Array = new ArrayList<>();

      for(int i=0;i<n;i++){
         System.out.println("Studen number "+(i+1)+" Please Choice Type Student \" IT (1) Or KT (2) \" | Clear Your Choice : ");
         String Choice=scanner.nextLine();
         SinhVien sv=null;
         if(Choice.equalsIgnoreCase("1")){
            sv=new SinhVienIT();
            Array.add(sv);
         }else if(Choice.equalsIgnoreCase("2")){
            sv=new SinhVienKT();
            Array.add(sv);
         }else{
            System.out.println("Choice Youself Wrong ! , Please Reat Choice");
            i--;
            continue;
         }
         sv.input();
         Array.add(sv);
      }
      for(SinhVien B:Array){
         B.display();
      }
   }
}
