
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
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println(mahasiswa.nama);
        mahasiswa.nama = "mirza";
        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.nama+" "+mahasiswa.membuatTugas("Matematika"));
    }
    
}
