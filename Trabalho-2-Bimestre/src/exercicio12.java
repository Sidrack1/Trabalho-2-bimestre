import java.util.Scanner;
public class exercicio12 {

    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int vetor[]= new int [10];
    int i= 0;
    int numero;
    int contador= 1;
    System.out.println("Digite o Número desejado: ");
    numero= in.nextInt();
    System.out.println("A tabuada desse número é: ");
    tabuada(vetor, i, numero, contador);
    }
    static void tabuada(int vetor[], int i, int numero, int contador){
            if(contador<=10){
            vetor[i]= (numero*contador);
            System.out.println(numero+"x"+ contador+"="+vetor[i]);
            contador++;
            i++;
            tabuada(vetor, i, numero, contador);
            }
    }
}