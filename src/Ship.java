public class Ship {

    public int[] locationsCells;
    public int numOfHits = 0;
    public int[] userGuess;


    //metodo para verificar o chute e retornar um hit, miss ou kill.
    public String checkYourself(int userGuess) {
        String resultado = "miss";
        for (int cell : locationsCells) {
            if (userGuess == cell) {
                resultado = "hit";
                numOfHits++;
                break;
            }

        }
        if (numOfHits == locationsCells.length) {
            resultado = "kill";
        }

        return resultado;

    }

    public void setLocationsCells(int[] cellLocation) {
        locationsCells = cellLocation;


    }
}



