package sinhvien;

import java.util.Scanner;

public class SinhVienKT extends SinhVien {
   private double Score1;
   private double Score2;
   public SinhVienKT(){
      
   }
   public SinhVienKT(double score1, double score2) {
      Score1 = score1;
      Score2 = score2;
   }
   public SinhVienKT(String Name, String Mssv, int Age, double score1, double score2) {
      super(Name, Mssv, Age);
      Score1 = score1;
      Score2 = score2;
   }
   public double getScore1() {
      return Score1;
   }
   public void setScore1(double score1) {
      Score1 = score1;
   }
   public double getScore2() {
      return Score2;
   }
   public void setScore2(double score2) {
      Score2 = score2;
   }
   @Override
   public void input(){
      super.input();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Scan Score 1 : ");
      setScore1(scanner.nextDouble());

      System.out.println("Scan Score 2 : ");
      setScore2(scanner.nextDouble());
      
   }
   
   @Override
   public void display(){
      super.display();
      System.out.println("Score 1 : "+getScore1()+" | Score 2 : "+getScore2());
   }
}
