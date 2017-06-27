import java.util.Scanner;
public class exercicio13 {

    public static void main(String[] args) {
    int med= 0;
    int i=0;
    int contador=1;
    int vetor[]= new int[10];
    mediaArit(med, i, contador, vetor);
    }
    static void mediaArit(int med, int i, int contador, int vetor[]){
        Scanner in= new Scanner(System.in);
        if(contador<=10){
        System.out.println("Digite a média do "+contador+"º aluno (sem usar ponto ou virgula).");
        vetor[i]= in.nextInt();
        i++;
        contador++;
        mediaArit(med, i, contador, vetor);
        }
        else if(contador== 11){
            i=0;
            contador=12;
            mediaArit(med, i, contador, vetor);
        }
        else if(i<10){
            med= (med+vetor[i]);
            i++;
            mediaArit(med, i, contador, vetor);
        }
        else{
            med= (med/10);
            System.out.println("A média aritmética dessas notas é: "+med);
        }
    }
}