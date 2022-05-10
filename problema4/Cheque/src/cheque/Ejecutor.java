package cheque;
public class Ejecutor {
    public static void main(String[] args) {
        
        Cheque chek = new Cheque();
        Cheque chek2 = new Cheque("Marisabel Lopez","Banco de Pichincha",250.00);
        
        chek.establecerComisionBanco();
        chek.obtenerComisionBanco();
        chek2.establecerComisionBanco();
        chek2.obtenerComisionBanco();        
        
        System.out.printf("%s\n", chek);
        System.out.printf("%s\n", chek2);
    }       
}
