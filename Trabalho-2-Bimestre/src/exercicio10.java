import java.util.Scanner;
public class exercicio10 {

    public static void main(String[] args) {
        int matriz[][]= new int[5][5];
        int i= 0;
        int j= 0;
        int contador= 0;
        guardaNum(matriz, i, j, contador);
    }
    static void guardaNum(int matriz[][],int i, int j, int contador){
        Scanner numero = new Scanner(System.in);
        contador++;
            if (contador <=25){
                if(j<4){
                System.out.println("Digite o "+ contador+"º número");
                matriz[i][j] = numero.nextInt();
                j++;
                guardaNum(matriz, i, j, contador);
                }else{
                System.out.println("Digite o "+ contador+"º número");
                matriz[i][j] = numero.nextInt();
                i++;
                j= 0;
                guardaNum(matriz, i, j, contador);
                }
            }
    }
}