
public class ValidateCpf {
    public static void main(String[] args) {
        String cpf = "52998224725";
        float multFirstNumber = 10;
        float multSecondNumber = 11;
        double calc = 0;
        String lastNumbers;
        String compare;


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

        //System.out.println((calc * 10) % 1);

        lastNumbers += Double.toString((calc * 10) % 11).replace(".0", "");

        compare = cpf.substring(9);

        if (lastNumbers == compare){
            System.out.println("Cpf valido");
        }else{
            System.out.println("invalido");
        }

    }
}
