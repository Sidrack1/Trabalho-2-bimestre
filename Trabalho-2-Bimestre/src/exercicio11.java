import java.util.Scanner;
public class exercicio11 {

    public static void main(String[] args) {
        int matriz[][][]= new int[5][5][5];
        int i= 0;
        int j= 0;
        int k= 0;
        int contador= 0;
        guardaNum(matriz, i, j, k, contador);
    }
    static void guardaNum(int matriz[][][],int i, int j, int k, int contador){
        Scanner numero = new Scanner(System.in);
        contador++;
            if (contador <=125){
                if(k<4){
                System.out.println("Digite o "+ contador+"º número");
                matriz[i][j][k] = numero.nextInt();
                k++;
                guardaNum(matriz, i, j, k, contador);
                }else if(j<4){
                System.out.println("Digite o "+ contador+"º número");
                matriz[i][j][k] = numero.nextInt();
                j++;
                k= 0;
                guardaNum(matriz, i, j, k, contador);
                }else{
                System.out.println("Digite o "+ contador+"º número");
                matriz [i][j][k] = numero.nextInt();
                i++;
                j= 0;
                k= 0;
                guardaNum(matriz, i, j, k, contador);
                }
            }
    }
}