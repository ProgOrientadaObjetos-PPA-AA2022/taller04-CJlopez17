package profesor;
public class Ejecutor {
    public static void main(String[] args) {
        Profesor pf = new Profesor();
        Profesor pf2 = new Profesor("Josue Sebastian", "Lopez Piedra",1150181557, 400.00);
        pf.establecerSueldoTol();
        pf.obtenerSueldoTol();
        System.out.printf("%s\n", pf);
        System.out.printf("%s\n", pf2);
    }
}
