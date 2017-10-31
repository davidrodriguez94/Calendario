
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
        dia = 01;
        mes = 01;
        anno = 01;
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
    
    public String obtenerFecha()
    {
        String mostrarFecha;
        String d = String.valueOf(dia);
        String m = String.valueOf(mes);
        String a = String.valueOf(anno);
        
        if(dia < 10){
            d = "0" + d;
        }
        if(mes < 10){
            m = "0" + m;
        }
        if(anno < 10){
            a = "0" + a;
        }
        return (dia + "-" + mes + "-" + anno);
    }
}
