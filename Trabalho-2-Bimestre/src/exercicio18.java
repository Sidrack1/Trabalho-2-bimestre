import java.util.Scanner;
public class exercicio18 {
    
    public static void main(String[] args) {
        double cap= -2;
        double juros= -2;
        double tempo= -2;
        double result= -2;
        calculaJuros(cap, juros, tempo, result);    
    }
    static void calculaJuros(double cap, double juros, double tempo, double result){
        Scanner in = new Scanner(System.in);
        if(cap==-2){
        System.out.println("Quanto foi investido (Em R$)?");
        cap= in.nextDouble();
        calculaJuros(cap, juros, tempo, result);
        }
        else if(juros==-2){
        System.out.println("Qual a porcentagem dos Juros cobrado (Apenas numeros)?");
        juros= in.nextDouble();
        calculaJuros(cap, juros, tempo, result);
        }
        else if(tempo==-2){
        System.out.println("Qual o periodo de tempo (Em meses)?");
        tempo= in.nextDouble();
        calculaJuros(cap, juros, tempo, result);
        }
        else{
            result= (cap*juros*tempo)/100;
            System.out.println("O juros cobrado é de: R$"+result);
        }
    }
}