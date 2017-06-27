public class exercicio01 {
    public static void main(String[] args) {
        int contador=0;
        imprimeNumeros(contador);
    }
    static void imprimeNumeros(int contador){
        if(contador <=100){
            System.out.println(contador);
            contador++;
            imprimeNumeros(contador);
        }
    }
}