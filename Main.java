import java.lang.Math;
/**
 * class Main 
 *
 * @author dientaufan
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
       /*
       System.out.println(Calculator.info);
       
       Calculator calculator1 = new Calculator();
       Calculator calculator4 = new Calculator();
       Calculator calculator2 = new Calculator(3,5);
       Calculator calculator3 = new Calculator(3);
       
       System.out.println("Nilai awal setelah konstruktor dipanggil");
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
       
       
       System.out.println("Nilai setelah op1 dan op2 diganti");
       calculator1.op2 = 10;
       calculator2.op2 = 20;
       calculator3.op2 = 30;
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       calculator1.setOp1(40);
       calculator2.setOp1(50);
       calculator3.setOp1(60);
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
        
       System.out.println("");
       System.out.println(Calculator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       calculator1.op1  = 3.4;
       calculator2.op2 = 5.4;
       double hasil2 = calculator1.jumlah();
       double hasil3 = calculator1.jumlah(4.5, 6.5);
       
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil3);
       */
      
       /*
       CalculatorProgrammer clp = new CalculatorProgrammer();
       System.out.println(clp.jumlah(4,5));
       System.out.println(clp.konversiBilangantoHex(4));
       */
      
       /*
       CalculatorScientific cs = new CalculatorScientific();
       System.out.println(cs.jumlah(4,5));
       System.out.println(cs.menghitungFaktorial(4));
       System.out.println(CalculatorScientific.jumlahobject);
       
       CalculatorScientific cs2 = new CalculatorScientific(2,3);
       System.out.println(cs2.op1);
       System.out.println(cs2.op2);
       
       */
      /*
       CalculatorTrigonometri  clr = new CalculatorTriRadian();
       CalculatorTrigonometri  cld = new CalculatorTriDegree();
       
       clr.op1 = 3;
       clr.op2 = 4;
       System.out.println(clr.jumlah());
       
       cld.op1 = 3;
       cld.op2 = 4;
       System.out.println(clr.jumlah());
       double sudutindegree = 30; 
       double sudutinrad = Math.PI / 6;
       cld.konversi(sudutindegree);
       clr.konversi(sudutinrad);
       
       System.out.println(cld.sin());
       System.out.println(clr.sin());
       
       CalculatorScientific cs = new CalculatorScientific();
       System.out.println(cs.menghitungFaktorial(4)); 
       */
      
      Calculator cl = new Calculator();
      SimpanOperasiCalculator  spr = new SimpanOperasiKeMemoryReverse();
      //SimpanOperasiCalculator  spr = new SimpanOperasiKeMemoryForward();
      
      cl.setSimpanOperasi(spr);
      
      cl.op1 = 1;
      cl.op2 = 1;
      System.out.println(cl.jumlah());
      
      cl.op1 = 2;
      cl.op2 = 2;
      System.out.println(cl.jumlah());
      
      cl.op1 = 3;
      cl.op2 = 3;
      System.out.println(cl.jumlah());
      System.out.println("Data dari memori: ");
      System.out.println(cl.bacaOperasi());
      
      
    }
    
}
