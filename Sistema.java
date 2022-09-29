import java.util.Scanner;

public class Sistema {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Produto bicicleta = new Produto('Bicicleta', 'Caloi', 500.60);
        Lote lote = new Lote(1, "29/09/2025", bicicleta);
    }
}
