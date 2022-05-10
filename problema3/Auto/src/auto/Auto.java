package auto;
public class Auto {
    private int cedula;
    private String marca;
    private int anio_fav;
    private double valor_mat;
    private double valor_tot;
    
    public Auto(){
        cedula = 1150187456;
        marca = "Kia Sportage";
        anio_fav = 5;
        valor_mat = 27500.00;
    }
    public Auto (int ced, String marc, double val_tat){
        cedula = ced;
        marca = marc;
        valor_tot = val_tat;
    }
    public void etablecerCedula(int c){
        cedula = c;
    }
    public void establecerMarca (String c){
        marca = c;
    }
    public void establecerAniofav (int c){
        anio_fav = c;
    }
    public void establecerValorMatricula (double c){
        valor_mat = c;
    }
    public void establecerValorTotal (){
        valor_tot = 0.002 * (anio_fav * valor_mat);
    }
    public int obtenerCedula(){
        return cedula;
    }
    public String obtenerMarca(){
        return marca;
    }
    public int obtenerAnioFav(){
        return anio_fav;
    }
    public double obtenerValorMatricula(){
        return valor_mat;
    }
    public double obtenerValorTotal(){
        return valor_tot;
    }
    @Override
     public String toString(){
        String cadena = String.format("Cedula: %d\nMarca: %s\nAño de fabricacion:"
                + " %.2f\nValor en % de matricula: 0.002%\nValor total del vehiculo:"
                + " %.2f\n",obtenerCedula(),obtenerMarca(),obtenerAnioFav(),
                obtenerValorMatricula(),obtenerValorTotal());
        return cadena; 
    }
}
