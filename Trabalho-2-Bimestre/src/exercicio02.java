public class exercicio02 {

    public static void main(String[] args) {
    int contador=100;
    imprimeNumeros(contador);
    }
    static void imprimeNumeros(int contador){
        if(contador>=0){
            System.out.println(contador);
            contador--;
            imprimeNumeros(contador);
        }
    }
}