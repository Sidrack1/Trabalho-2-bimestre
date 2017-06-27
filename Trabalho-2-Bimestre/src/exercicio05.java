import java.util.Scanner;
public class exercicio05 {

    public static void main(String[] args) {
        int vetor[]= new int[10];
        int i= 0;
        int contador= 1;
        int maior= 0;
        guardaNum(vetor, i, contador, maior);
    }
    static void guardaNum(int vetor[],int i, int contador, int maior){
        Scanner numero = new Scanner(System.in);
            if (contador <=10){
                System.out.println("Digite o "+ contador+"º número");
                vetor[i] = numero.nextInt();
                
                if(maior == 0){
                    maior = vetor[i];
                }
                    if(maior < vetor[i]){
                        maior = vetor[i];
                    }
                i++;
                contador++;
                guardaNum(vetor, i, contador, maior);
            }
            else{
                System.out.println("O maior valor é: "+maior);
    }
}
}