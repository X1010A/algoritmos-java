
/**
 * 
 * @author Rodrigo Cayola Rojas
 * @version 1.0
 */
public class Cesar
{
 
    private String [] alfabeto;
    private int rotacion;
    
    public Cesar(String [] alfabeto, int rotacion)
    {
        this.alfabeto = alfabeto;
        this.rotacion = rotacion;
    }
    
    /**
     * alfabeto = {a,b,c,d,p,r,s,t, ,0,2}
       rotacion = 3
     * 
     * AbraCadrabaPatasDCabra 2020
     * 
     * dp drds dpdtd2d0srdp dacbcb
     * z = a+b y nose que
     * Hola de nuevo
     * nose se termino falta
     */
    
    public String cifrar (String cadena){
        String respuesta = "";
        
        for(int i = 0; i< cadena.length(); i++){
            String aux = "";
            aux += cadena.charAt(i);
            respuesta += replaceAlfabeto(aux);
            
        }     
        return respuesta;
        }
    /**
     * alfabeto = {a,b,c,d,p,r,s,t, ,0,2}
     * AbraCadrabaPatasDCabra 2020
     * dp drds dpdtd2d0srdp dacbcb   
    
    private String replaceAlfabeto(String otro){
        String aux = "";
      
        for(int i = 0; i< alfabeto.length; i++){
            if(otro.compareToIgnoreCase(alfabeto[i]) == 0){
                if(i+rotacion > alfabeto.length){                   
                    i = 0;
                }
                aux += alfabeto[i+rotacion];
            }
        }
        return aux;
    }
    **/
    private String replaceAlfabeto(String otro){
        String aux = "";
        boolean bandera = true;
        int i = 0;
        while(bandera){
           
            if(otro.compareToIgnoreCase(alfabeto[i]) == 0){
                if(i+rotacion >= alfabeto.length && i+rotacion <= alfabeto.length -2 ){                   
                    i = 0;
                }
                
                
                aux += alfabeto[i+rotacion];
                    bandera = false;
                
            }
             i++;
        }
        return aux;
    }
    
    }
    