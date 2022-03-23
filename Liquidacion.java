/**
 * Abstract class Liquidacion - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Liquidacion
{
    private int valor;
    private String tipo;
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    abstract double getTotal();
}
