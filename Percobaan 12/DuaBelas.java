
/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 *  PBO Sesi 11
 */

 class MyException extends Exception {
    private String Teks;
 MyException(String s)
 {
 Teks="Exception generated by: "+s;
 System.out.println(Teks);
 }
}
class Eksepsi
{
 static void tampil(String s)throws Exception
 {
 System.out.println("Tampil");
 if(s.equals("amir"))
 { 
 throw new MyException(s);
 }
 System.out.println("OK!"); 
 }
 public static void main(String[] args)throws Exception 
 {
 try
 {
 tampil("ali");
 tampil("amir");
 }
 catch(MyException ex)
 {
 System.out.println("Tangkap:"+ex);
 }
 }
}