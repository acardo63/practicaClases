
/**
 * Write a description of class DerechoGrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DerechoGrado extends Liquidacion
{
    private LiquidacionServicio liquidacionServicio;
    
    DerechoGrado(LiquidacionServicio liquidacionServicio) {
        this.liquidacionServicio = liquidacionServicio;
        this.setTipo("Derecho grado");
    }
    
    public double getTotal() {
        return liquidacionServicio.getTotalDerechoGrado();
    }
}
