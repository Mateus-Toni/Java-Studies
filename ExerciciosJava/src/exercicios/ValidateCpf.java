package exercicios;

public class ValidateCpf {
    public static void main(String[] args) {

        String cpf = "52998224725";
        float multFirstNumber = 10;
        float multSecondNumber = 11;
        double calc = 0;
        String lastNumbers;

        for (int count=0; count <= (cpf.length() - 3); count++){

            calc += Integer.parseInt(cpf.split("")[count]) * multFirstNumber;

            multFirstNumber--;

        }

        lastNumbers = Double.toString((calc * 10) % 11).replace(".0", "");
        calc = 0;

        for (int count=0; count <= (cpf.length() - 2); count++){

            calc += Integer.parseInt(cpf.split("")[count]) * multSecondNumber;

            multSecondNumber--;

        }

        lastNumbers += Double.toString((calc * 10) % 11).replace(".0", "");
        
        if (lastNumbers.equals(cpf.substring(9))){

            System.out.println("Cpf valido");

        }else{

            System.out.println("invalido");
        
        }

    }
}
