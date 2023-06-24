package exerciciosjava.src.exercicio001;

public class ValidateCpf {
    
    public static void main(String[] args) {

        String cpf = "52998224725";
        float multNumber = 10;
        double calc = 0;
        String lastNumbers;

        for (int count=0; count <= (cpf.length() - 3); count++){

            calc += Integer.parseInt(cpf.split("")[count]) * multNumber;

            multNumber--;

        }

        lastNumbers = String.valueOf((int) (calc * 10) % 11);
        multNumber = 11;
        calc = 0;

        for (int count=0; count <= (cpf.length() - 2); count++){

            calc += Integer.parseInt(cpf.split("")[count]) * multNumber;

            multNumber--;

        }

        lastNumbers += String.valueOf((int) (calc * 10) % 11);

        if (lastNumbers.equals(cpf.substring(9))){

            System.out.println("Cpf valido");

        }else{

            System.out.println("invalido");
        
        }

    }
}
