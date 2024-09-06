
/**
 * Write a description of class Lat1_HelloWorld here.
 *
 * @author Augury El Rayeb
 * @version 1.0
 */
public class Lat1_HelloWorld
{
    // instance variables - replace the example below with your own
    private String pesan;

    /**
     * Constructor for objects of class Lat1_HelloWorld
     */
    public Lat1_HelloWorld()
    {
        // initialise instance variables
        pesan = "Hello World";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    pesan
     */
    public String tampilPesan()
    {
        // put your code here
        return pesan;
    }
    
    public static void main(String [] args) {
        Lat1_HelloWorld hello = new Lat1_HelloWorld();
        String teks = hello.tampilPesan();
        System.out.println(hello.tampilPesan());
    }
}
