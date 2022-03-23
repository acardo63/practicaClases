
/**
 * Write a description of class Liquidar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Liquidar
{
    public static void main(String args[]) {
        Liquidacion liquidacionMatriculaEAFIT = new Matricula(new LiquidacionEAFIT());
        System.out.println("El valor de su liquidación de " + liquidacionMatriculaEAFIT.getTipo() 
                            + " en EAFIT es " + liquidacionMatriculaEAFIT.getTotal());
                            
        Liquidacion liquidacionMatriculaUNAULA = new Matricula(new LiquidacionUNAULA());
        System.out.println("El valor de su liquidación de " + liquidacionMatriculaUNAULA.getTipo() 
                            + " en UNAULA es " + liquidacionMatriculaUNAULA.getTotal());
    }
}
