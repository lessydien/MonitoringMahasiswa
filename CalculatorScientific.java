
/**
 * class CalculatorScientific
 *
 * @author dientaufan
 * @version 0.1
 */
public class CalculatorScientific extends Calculator
{
    

    /**
     * Constructor for objects of class Calculator
     */
    public CalculatorScientific()
    {
        // initialise instance variables
        super.jumlahobject += 1;
       
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public CalculatorScientific(double op1, double op2)
    {
        super.op1 = op1;
        super.op2 = op2;
        super.jumlahobject += 1;
    
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public CalculatorScientific(double op2)
    {
        
        super.op2 = op2;
        super.jumlahobject += 1;
        
    
    }
    
    
    /**
     * menghitungFaktorial
     *
     * @param  int op1
     *         
     * @return int 4! = 4x3x2x1 (example)
     */
    public int menghitungFaktorial(int op1) 
    {
        // tugas
        int hasil = 5;
        return hasil;
    }
    
    // method menghitung luas lingkaran
    // method menghitung luas bujur sangkar
}
