import java.util.Scanner;
public class exercicio22 {
    
    public static void main(String[] args) {
        int x=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o numero da sequencia Fibonacci que deseja: ");
        x= in.nextInt();
        System.out.println("Numero da sequencia Fibonacci: "+fib(x));
    }
    static int fib(int x){
        if(x<=2){
            return 1;
        }
        else{
            return fib(x-1)+ fib(x-2);
        }
    }  
}