import java.util.Scanner;
public class exercicio17 {

    public static void main(String[] args) {
        int a =0;
        int b =0;
        int result =0;
        int cont =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        a = in.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = in.nextInt();
        multip(a, b, cont, result);
    }
    static void multip(int a, int b, int cont, int result){
        if(cont <= a){
            System.out.print("+"+b);
            result = result + b;
            cont++;
            multip(a, b, cont, result);
        }
        else{
            System.out.println(" =" +result);
        }   
    }
}