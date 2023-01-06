package exerciciosjava;
public class Condicoes {
    public static void main(String[] args) {
        double imposto;
        double sal = 30000;
        double impostoBySal;

        if (sal < 34000){
    
            imposto = 10.0/100;
    
        }else if (sal >= 34000 || sal < 68000){
    
            imposto = 37.35/100;
    
        }else {
    
            imposto = 50/100;
        }

        impostoBySal = sal * imposto;

        System.out.println(impostoBySal);
    }
}
