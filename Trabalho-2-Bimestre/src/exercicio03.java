import java.util.Scanner;
public class exercicio03 {

    public static void main(String[] args) {
        int vetor[]= new int[10];
        int i= 0;
        int contador= 1;
        int soma= 0;
        guardaNum(vetor, i, contador, soma);
    }
    static void guardaNum(int vetor[],int i, int contador, int soma){
        Scanner numero = new Scanner(System.in);
            if (contador <=10){
                System.out.println("Digite o "+ contador+"º número");
                vetor[i] = numero.nextInt();
                soma += vetor[i];
                i++;
                contador++;
                guardaNum(vetor, i, contador, soma);
            }
            else{
                System.out.println("A soma desses números é: "+soma);
    }
}
}