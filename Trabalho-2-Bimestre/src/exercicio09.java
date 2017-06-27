public class exercicio09 {

    public static void main(String[] args) {
        int num= 99;
        imprimeImp(num);
    }
    static void imprimeImp(int num){
        if(num >=0){
            System.out.println(num);
            num-=2;
        imprimeImp(num);
        }
    }
}