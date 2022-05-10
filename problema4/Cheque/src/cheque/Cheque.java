package cheque;
public class Cheque {
    private String nombre_cliente;
    private String nombre_banco;
    private double valor_cheque;
    private double comision_banco;
    public Cheque(){
        nombre_cliente = "Camilo Lopez";
        nombre_banco = "Banco de Loja";
        valor_cheque = 500.00;
    }
    public Cheque(String nom, String nomBn, double val_chec){
        nombre_cliente = nom;
        nombre_banco = nomBn;
        valor_cheque = val_chec;
    }
    public void estabablecerNombreCliente(String c){
        nombre_cliente = c;
    }
    public void estabablecerNombreBanco(String c){
        nombre_banco = c;
    }
    public void establecerValorCheque(double c){
        valor_cheque = c;
    }
    public void establecerComisionBanco(){
        comision_banco = valor_cheque * 0.003 + valor_cheque;
    }
    public String obtenerNombreCliente (){
        return nombre_cliente;
    }
    public String obtenerNombreBanco(){
        return nombre_banco;
    }
    public double obtenerValorCheque(){
        return valor_cheque;
    }
    public double obtenerComisionBanco(){
        return comision_banco;
    }
    @Override
     public String toString(){
        String cadena = String.format("El nombre del cliente es: %s\nEl nombre "
                + "del banco es: %s\nValor del cheque: %.2f\nComision del banco: %.2f\n",
                obtenerNombreCliente(),obtenerNombreBanco(),obtenerValorCheque(),
                obtenerComisionBanco());        
        return cadena; 
     }    
}
