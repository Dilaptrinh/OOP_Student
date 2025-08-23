package sinhvien;

import java.util.Scanner;

public class SinhVienIT extends SinhVien {
   private double ScoreIT1;
   private double ScoreIT2;

   public SinhVienIT(){
      
   }

   public SinhVienIT(double score1, double score2) {
      ScoreIT1 = score1;
      ScoreIT2 = score2;
   }
   public SinhVienIT(String Name, String Mssv, int Age, double score1, double score2) {
      super(Name, Mssv, Age);
      ScoreIT1 = score1;
      ScoreIT2 = score2;
   }
   public double getScoreIT1() {
      return ScoreIT1;
   }
   public void setScoreIT1(double score1) {
      ScoreIT1 = score1;
   }
   public double getScoreIT2() {
      return ScoreIT2;
   }
   public void setScoreIT2(double score2) {
      ScoreIT2 = score2;
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
      System.out.println("Score 1 : "+getScoreIT1()+" | Score 2 : "+getScoreIT2());
   }
   
}
