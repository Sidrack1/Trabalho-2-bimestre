public class exercicio08 {

    public static void main(String[] args) {
        int num= 100;
        imprimePar(num);
    }
    static void imprimePar(int num){
        if(num >=0){
            System.out.println(num);
            num-=2;
        imprimePar(num);
        }
    }
}