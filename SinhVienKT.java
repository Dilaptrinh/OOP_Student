package sinhvien;

import java.util.Scanner;

public class SinhVienKT extends SinhVien {
   private double Score1;
   private double Score2;
   public SinhVienKT(){
      
   }
   public SinhVienKT(String Name, String Mssv, int Age, double Score1, double Score2) {
      super(Name, Mssv, Age);
      this.Score1 = Score1;
      this.Score2 = Score2;
   }
   public double getScore1() {
      return this.Score1;
   }
   public void setScore1(double Score1) {
      this.Score1 = Score1;
   }
   public double getScore2() {
      return this.Score2;
   }
   public void setScore2(double Score2) {
      this.Score2 = Score2;
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
      System.out.println("Score 1 : "+getScore1()+" | Score 2 : "+getScore2()+" is Studen KT");
   }
}
