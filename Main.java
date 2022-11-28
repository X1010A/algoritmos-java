import java.util.Scanner;
/**
 * 
 * @author Rodrigo Cayola Rojas
 * @version 1.0
 */
public class Main
{
    public static void main(String args[]){
           boolean peligro;
           Bruja amelia = new Bruja("abracadabra", "hocus");
           Bruja ming   = new Bruja("pocus hocuspocus hosuc", "cabra");
           Bruja baratuja = new Bruja("higos oscuros y verdes", "abra");
           peligro = amelia.correPeligro(ming);   // la respuesta es true
           System.out.println(peligro);
           peligro = amelia.correPeligro(baratuja); // la respuesta es false
           System.out.println(peligro);
           peligro = ming.correPeligro(amelia); // la respuesta es false
           System.out.println(peligro);
           peligro = ming.correPeligro(baratuja); // la respuesta es false
           System.out.println(peligro);
           peligro = baratuja.correPeligro(amelia); // la respuesta es true
           System.out.println(peligro);
           peligro = baratuja.correPeligro(ming); // la respuesta es false
           System.out.println(peligro);
    }    
}
