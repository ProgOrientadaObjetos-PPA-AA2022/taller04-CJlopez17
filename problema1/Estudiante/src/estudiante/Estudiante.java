package estudiante;
public class Estudiante {
        private String nom_Estudainte;
        private double calf1;
        private double calf2;
        private double calf3;
        private double calf_fin;
    public Estudiante(){
        nom_Estudainte = "Camilo Lopez";
        calf1 = 9.56;
        calf2 = 8.53;
        calf3 = 9.57;
    }
    public Estudiante(String nom_est, double calfi1, double calfi2,
            double calfi3){
        nom_Estudainte = nom_est;
        calf1 = calfi1;
        calf2 = calfi2;
        calf3 = calfi3;
    }
    public void establecerNombre_Estudiante(String c){
        nom_Estudainte = c;
    }
    public void establecercalfi1(double c){
        calf1 = c;
    }
    public void establecercalfi2(double c){
        calf2 = c;
    }
    public void establecercalfi3(double c){
        calf3 = c;
    }
    public void establecerpromedio(){
        calf_fin = (calf1 + calf2 + calf3)/3;
    }
    public String obtenerNombre_Estudiante(){
        return nom_Estudainte;
    }
    public double obtenercalfi1(){
        return calf1;
    }
    public double obtenercalfi2(){
        return calf2;
    }
    public double obtenercalfi3(){
        return calf3;
    }
    public double obtenerpromedio(){
        return calf_fin;
    }
    @Override
    public String toString(){
        String cadena = String.format("El nombre del Estudiante es: %s\n"
                + "Calificacion del primer parical: %.2f\nCalificacion del segundo "
                + "Parcial: %.2f\nCalificacion del tercer Parcial: %.2f\n"
                + "Calificacion final: %.2f\n", obtenerNombre_Estudiante(),obtenercalfi1(),
                        obtenercalfi2(),obtenercalfi3(),obtenerpromedio());
        return cadena;
    }
}
