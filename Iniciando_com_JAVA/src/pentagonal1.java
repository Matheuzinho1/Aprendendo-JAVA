package Iniciando_com_JAVA.src;

public class pentagonal1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            System.out.println(i + "º pentagonal: " + (i * (3 * i - 1) / 2));
        }
    }
}
