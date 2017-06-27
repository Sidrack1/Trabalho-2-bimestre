import java.util.Scanner;
public class exercicio16 {

    public static void main(String[] args) {
    int i=0;
    int contador=1;
    String vetor[]= new String[10];
    nomesArm(i, contador, vetor);
    }
    static void nomesArm(int i, int contador, String vetor[]){
        Scanner in= new Scanner(System.in);
        if(contador<=10){
        System.out.println("Digite o nome do "+contador+"º aluno: ");
        vetor[i]= in.nextLine();
        i++;
        contador++;
        nomesArm(i, contador, vetor);
        }
        else if(contador== 11){
            i=0;
            contador=12;
            nomesArm(i, contador, vetor);
        }
        else if(i<10){
            System.out.println("Nome: "+vetor[i]);
            i++;
            nomesArm(i, contador, vetor);
        }
    }
}