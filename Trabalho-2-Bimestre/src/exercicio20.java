import java.util.Scanner;
public class exercicio20 {
    
    public static void main(String[] args) {
        int entrada=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Deseja calcular o fatorial de qual numero? ");
        entrada= in.nextInt();
        System.out.println("Resultado= "+fat(entrada));
    }
    static int fat(int entrada){
        if(entrada==0){
            return 1;
        }
        else{
            return entrada*fat(entrada-1);
        }
    }
}