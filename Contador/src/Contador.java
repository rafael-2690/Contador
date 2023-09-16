import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();

        try{
            contar(numero1, numero2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    
        
}
static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
    if(numero1>numero2){
        throw new ParametrosInvalidosException();
    }
    else{
    int resto = numero2 - numero1;
    
    for(int i = 1; i <= resto; i++ ){
        System.out.println("Imprimindo o número: " + i);
    }
    }
}
private static class ParametrosInvalidosException extends Exception{

}
}



