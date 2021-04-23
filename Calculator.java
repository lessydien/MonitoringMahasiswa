
/**
 * class Calculator
 *
 * @author dientaufan
 * @version 0.1
 */
public class Calculator
{
    // op1
    public double op1=0;
    public double op2=0;
    public static final String info = "Kalkulatorku";
    public static int jumlahobject = 0;
    private SimpanOperasiCalculator soc;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        this.jumlahobject += 1;
    }
    
    /**
     * Constructor for objects of class Calculator
     */
    public Calculator(SimpanOperasiCalculator soc)
    {
        // initialise instance variables
        this.soc = soc;
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public Calculator(double op1, double op2)
    {
        this.op1 = op1;
        this.op2 = op2;
        this.jumlahobject += 1;
    
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public Calculator(double op2)
    {
        this.op2 = op2;
        this.jumlahobject += 1;
        
    
    }
    
    
    
    
    /**
     * set op1
     *
     * @param  double op1  
     * @return  void
     */
    public void setOp1(double op1)
    {
        this.op1 = op1;
    }
    
    /**
     * set soc
     *
     * @param  SimpanOperasiCalculator   
     * @return  void
     */
    public void setSimpanOperasi(SimpanOperasiCalculator soc)
    {
        this.soc = soc;
    }
    
    
    /**
     * get op1
     *
     * @param  double op1  
     * @return  void
     */
    public double  getOp1()
    {
        return this.op1;
    }
    
    
    /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  double hasil penjumlahan op1 + op2
     */
    public double jumlah() 
    {   
        simpanOperasi(String.valueOf(this.op1) +" + "+ String.valueOf(this.op2));
        return this.op1 + this.op2;
    }
    
     /**
     * jumlah dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public double jumlah(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return jumlah();
    }
    
    
    /**
     * simpanOperasi
     *
     * @param  String data
     *      
     * @return void
     */
    public void simpanOperasi(String data) 
    {
        //simpan operasi
        this.soc.simpanOperasi(data);
    }
    
    /**
     * bacaOperasi
     *
     * @param  void
     *      
     * @return String
     */
    public String bacaOperasi() 
    {
        //baca operasi
        return this.soc.bacaOperasi();
    }
    
    
    
}
