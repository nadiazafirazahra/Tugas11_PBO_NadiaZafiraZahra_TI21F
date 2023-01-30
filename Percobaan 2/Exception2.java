
/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 *  PBO Sesi 11
 */
public class Exception2 {
    public static void main(String[] args) {
 int i=0;
 String greetings[]={
 "Hello World!",
 "No,I mean it!",
 "HELLO WORLD!"
 };
 while(i<3)
 {
 try
 {
 System.out.println(greetings[i]);
 i++;
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 System.out.println("Resetting index value");
 i=0;
 }
 }
 }
}