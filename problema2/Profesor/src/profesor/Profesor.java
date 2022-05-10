package profesor;
public class Profesor {
    private String nombre;
    private String apellido;
    private int cedula;
    private double sueldo_basico;
    private double sueldo_total;
    
    public Profesor(){ 
        nombre = "Camilo Jose";
        apellido = "Lopez Correa";
        sueldo_basico = 400.00;
        sueldo_total = 500.00;
        cedula = 115187456;
    }
    public Profesor (String nom, String ape, int dni, double sueldo_bas){
        nombre = nom;
        apellido = ape;
        cedula = dni;
        sueldo_basico = sueldo_bas;
        
    }    
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerApellido(String c){
        apellido = c;
    }
    public void establecerCedula (int c){
        cedula = c;
    }
    public void establecerSueldoBas (double c){
        sueldo_basico = c; 
    }
    public void establecerSueldoTol (){
        sueldo_total = sueldo_basico +(sueldo_basico * 0.20);
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    } 
    public int obtenerCedula(){
        return cedula;
    } 
    public double obtenerSueldoBas(){
        return sueldo_basico;
    }
    public double obtenerSueldoTol(){
        return sueldo_total;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre del trabajador: %s\nApellidos del "
                + "Trabajador: %s\nCedula del trabajador: %d\nSueldo basico del "
                + "trabajador: %.2f\nSueldo total del trabajador: %.2f\n", obtenerNombre(),
                obtenerApellido(),obtenerCedula(),obtenerSueldoBas(),obtenerSueldoTol());
        return cadena;
    }
}
