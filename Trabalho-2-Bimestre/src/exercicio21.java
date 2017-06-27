import java.util.Scanner;
public class exercicio21 {
    
    public static void main(String[] args) {
        int entrada=0;
        int a=0;
        int result= 0;
        Scanner in=new Scanner(System.in);
        System.out.println("Deseja calcular o numero triangular de qual numero? ");
        entrada= in.nextInt();
        triang(entrada, a, result);
    }
    static void triang(int entrada, int a, int result){
        if(entrada>0){
            a= a+entrada;
            entrada--;
            triang(entrada, a, result);
        }
        else{
            result=a;
            System.out.println("Resultado= "+result);
        }
    }   
}