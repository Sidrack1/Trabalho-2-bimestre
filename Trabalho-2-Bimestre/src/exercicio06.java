public class exercicio06 {

    public static void main(String[] args) {
        int num= 0;
        imprimePar(num);
    }
    static void imprimePar(int num){
        if(num <=100){
            System.out.println(num);
            num+=2;
        imprimePar(num);
        }
    }
}