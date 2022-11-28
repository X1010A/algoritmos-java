public class Bruja{

    private String palabraDebil;
    private String conjuro;
    
    public Bruja(String conjuro, String debil){
        this.palabraDebil = debil;
        this.conjuro = conjuro;
    }
    
    public boolean correPeligro(Bruja otro){
        boolean res = false;
        
        if(conjuro.length() < otro.palabraDebil.length()){
            res = conjuro.contains(otro.palabraDebil);
        }else{
            res = otro.conjuro.contains(palabraDebil);
        }

        return res;
    }
    
}