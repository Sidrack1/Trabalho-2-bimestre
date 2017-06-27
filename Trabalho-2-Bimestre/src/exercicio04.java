import java.util.Scanner;
public class exercicio04 {

    public static void main(String[] args) {
        int vetor[]= new int[10];
        int i= 0;
        int contador= 1;
        int menor= 0;
        guardaNum(vetor, i, contador, menor);
    }
    static void guardaNum(int vetor[],int i, int contador, int menor){
        Scanner numero = new Scanner(System.in);
            if (contador <=10){
                System.out.println("Digite o "+ contador+"º número");
                vetor[i] = numero.nextInt();
                
                if(menor == 0){
                    menor = vetor[i];
                }
                    if(menor >= vetor[i]){
                        menor = vetor[i];
                    }
                i++;
                contador++;
                guardaNum(vetor, i, contador, menor);
            }
            else{
                System.out.println("O menor valor é: "+menor);
    }
}
}