package exerciciosjava.src.exercicio002;

public class Parcelas {

    public static void main(String[] args) {
        
        double carValue = 67500;
        double minParcelas = 1000;
        int parcelas = 0;

        for (double i = minParcelas; i <= carValue; i += minParcelas) {
            
            System.out.println(i);
            parcelas += 1;

            

        }

        System.out.println(parcelas);

    }
}
