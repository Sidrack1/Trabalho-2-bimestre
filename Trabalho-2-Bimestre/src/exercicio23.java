import java.util.Scanner;
public class exercicio23 {
    
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int result= maxDC(a, b);
        System.out.println("O MDC desses 2 numeros é igual a: "+result);
    }
    public static int maxDC(int a, int b){
        Scanner entrada=new Scanner(System.in);
        if(a==0){
        System.out.println("Digite o 1º numero(deve ser menor que o 2º): ");
        a=entrada.nextInt();
        System.out.println("Digite o 2º numero(deve ser maior que o 1º): ");
        b=entrada.nextInt();
        maxDC(a, b);
        }
        else if((a % b == 0 )){
            return b;
        }
        return maxDC(b,(a % b));
        } 
}