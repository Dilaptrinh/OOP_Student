package sinhvien;

import java.util.Scanner;

public class SinhVienIT extends SinhVien {
   private double Score1;
   private double Score2;

   public SinhVienIT(){

   }
   public SinhVienIT(String Name, String Mssv, int Age, double Score1, double Score2) {
      super(Name, Mssv, Age);
      this.Score1 = Score1;
      this.Score2 = Score2;
   }
   public double  getScoreIT1() {
      return this.Score1;
   }
   public void setScoreIT1(double Score1) {
      this.Score1 = Score1;
   }
   public double getScoreIT2() {
      return Score2;
   }
   public void setScoreIT2(double Score2) {
      this.Score2 = Score2;
   }
   @Override
   public void input(){
      super.input();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Scan Score 1 : ");
      setScoreIT1(scanner.nextDouble());

      System.out.println("Scan Score 2 : ");
      setScoreIT2(scanner.nextDouble());
      
   }

   @Override
   public void display(){
      super.display();
      System.out.println("Score 1 : "+getScoreIT1()+" | Score 2 : "+getScoreIT2()+" is Student IT");
   }
   
}
