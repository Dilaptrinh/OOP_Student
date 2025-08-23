package sinhvien;

import java.util.Scanner;

public class SinhVien implements Interface {
   private String Name;
   private String Mssv;
   private int Age;

   public SinhVien(){

   }
   public SinhVien(String Name,String Mssv,int Age){
      this.Name=Name;
      this.Mssv=Mssv;
      this.Age=Age;
   }
   public void setName(String Name){
      this.Name=Name;
   }
   public void setMssv(String Mssv){
      this.Mssv=Mssv;
   }
   public void setAge(int Age){
      this.Age=Age;
   }
   public String getName(){
      return this.Name;
   }
   public String getMssv(){
      return this.Mssv;
   }
   public int getAge(){
      return this.Age;
   }
   @Override
   public void input(){
      Scanner scanner=new Scanner(System.in);

      System.out.println("Scan Name : ");
      setName(scanner.nextLine());

      System.out.println("Scan ID : ");
      setMssv(scanner.nextLine());

      System.out.println("Scan Age : ");
      setAge(scanner.nextInt()); scanner.nextLine();
   }

   @Override
   public void display(){
      System.out.println("Name : "+getName()+" | ID : "+getMssv()+" | Age : "+getAge());
   }
}
