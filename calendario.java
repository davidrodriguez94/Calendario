
/**
 * Write a description of class calendario here.
 *
 * @author (David Rodriguez Diez)
 * @version (a version number or a date)
 */
public class calendario
{
    // Iniciando variables dia, mes y año
    private int dia;
    private int mes;
    private int anno;

    /**
     * Constructor for objects of class calendario
     */
    public calendario()
    {
        dia = 1;
        mes = 1;
        anno = 1;
    }

    /**
     * Avanza la fecha 1 día
     */
    public void avanzarFecha()
    {
        if(dia < 30){
            dia = dia + 1;
        }
        else{
            dia = 1;
            if(mes < 12)
            {
                mes = mes + 1;
            }
            else{
                mes = 1;
                anno = anno + 1;
            }
        }
    }
    
    /**
     * Ficha la fecha que se indica
     */
    public void fijaFecha(int d, int m, int a)
    {
        dia = d;
        mes = m;
        anno = a;
    }
}
