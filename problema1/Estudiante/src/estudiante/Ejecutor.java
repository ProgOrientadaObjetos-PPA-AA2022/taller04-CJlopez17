package estudiante;

public class Ejecutor {

    public static void main(String[] args) {
        Estudiante gp = new Estudiante();
        gp.establecerpromedio();
        gp.obtenerpromedio();
        System.out.printf("%s\n", gp);
        
    }
}
