public class exercicio07 {

    public static void main(String[] args) {
        int num= 1;
        imprimeImp(num);
    }
    static void imprimeImp(int num){
        if(num <=100){
            System.out.println(num);
            num+=2;
        imprimeImp(num);
        }
    }
}