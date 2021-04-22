import java.lang.Math;
/**
 * Abstract class CalculatorTrigonometri
 *
 * @author  dientaufan
 * @version 0.1
 */
public abstract class CalculatorTrigonometri extends Calculator
{
   protected double sudut;
   
   public abstract void konversi(double sudut);
   
   public double sin()
   {
       return Math.sin(this.sudut); 
   }
   
   // cos 
   // tan

   
}
