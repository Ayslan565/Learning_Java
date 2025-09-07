import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Criando um array para 6 lutadores
        Lutador l[] = new Lutador[6];

        // 2. Preenchendo o array com lutadores diferentes
        l[0] = new Lutador("Ayslan 'O Programador'", "Brasília-DF", 20, 1.80f, 70.3f, 11, 2, 1);
        l[1] = new Lutador("Pedro 'Pedra'", "São Paulo-SP", 28, 1.75f, 83.0f, 14, 2, 3);
        l[2] = new Lutador("João 'O Carrasco'", "Rio de Janeiro-RJ", 30, 1.85f, 83.9f, 12, 3, 0);
        l[3] = new Lutador("Ricardo 'Animal'", "Curitiba-PR", 25, 1.70f, 70.0f, 5, 4, 3);
        l[4] = new Lutador("Ivan 'O Terrível'", "Rússia", 33, 1.88f, 118.0f, 22, 1, 0);
        l[5] = new Lutador("Kenji 'O Samurai'", "Japão", 37, 1.72f, 90.5f, 15, 5, 5);

        Luta UFC = new Luta();
        UFC.marcarLuta(l[2],l[1]);
        UFC.lutar();
        l[2].status();
        l[5].status();

    }
}