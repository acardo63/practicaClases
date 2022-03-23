
/**
 * Write a description of class Matricula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matricula extends Liquidacion
{
    private LiquidacionServicio liquidacionServicio;
    
    Matricula(LiquidacionServicio liquidacionServicio) {
        this.liquidacionServicio = liquidacionServicio;
        this.setTipo("Matricula");
    }
    
    public double getTotal() {
        return liquidacionServicio.getTotalMatricula();
    }
}
