
/**
 * Write a description of class Inscripcion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inscripcion extends Liquidacion
{
    private LiquidacionServicio liquidacionServicio;
    
    Inscripcion(LiquidacionServicio liquidacionServicio) {
        this.liquidacionServicio = liquidacionServicio;
        this.setTipo("Inscripcion");
    }
    
    public double getTotal() {
        return liquidacionServicio.getTotalInscripcion();
    }
}
