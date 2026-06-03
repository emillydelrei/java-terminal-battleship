import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        java.util.Random randomGeneration = new java.util.Random();
        Scanner scanner = new Scanner(System.in);
        int[] sea = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tamanhomar = sea.length - 3;
        int posicaoInicial = randomGeneration.nextInt(tamanhomar);
        int[] posicao = {posicaoInicial + 1, posicaoInicial + 2, posicaoInicial};

        Ship myShip = new Ship();

        myShip.locationsCells = posicao;

        boolean itsAlive = true;

        int numGuess=0;

        while (itsAlive) {

            System.out.println("digite seu palpite de 0 á " + sea.length);

            String guess = scanner.nextLine();
            int intGuess = Integer.parseInt(guess);

            // Pergunte ao navio o resultado
            String result = myShip.checkYourself(intGuess);
            System.out.println(result); // <--- ADICIONE ISSO
            numGuess++;
            // Verifique se o jogo acabou
            if (result.equals("kill")) {
                itsAlive = false;
                System.out.println("Você afundou o navio em " + numGuess + " tentativas!");
            }

        }


    }
}

