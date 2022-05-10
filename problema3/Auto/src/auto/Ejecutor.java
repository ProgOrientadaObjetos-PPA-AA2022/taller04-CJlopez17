package auto;
public class Ejecutor {
    public static void main(String[] args) {
        
    Auto vh = new Auto();
    Auto vh2 = new Auto(1150187456, "Chevrolet Camarao", 70000.00);
    
    vh.establecerValorTotal();
    vh.obtenerValorTotal();
    vh2.establecerValorTotal();
    vh2.obtenerValorTotal();
    
    System.out.printf("%s\n", vh);
    System.out.printf("%s\n", vh2);
    }
}
