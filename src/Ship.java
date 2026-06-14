public class Ship {

    private int[] locationsCells;
    private int numOfHits = 0;


    //metodo para verificar o chute e retornar um hit, miss ou kill.
    public String checkYourself(int userGuess) {
        String resultado = "miss";

        for (int i = 0; i < locationsCells.length; i++) {
            if (userGuess == locationsCells[i]) {
                resultado = "hit";
                locationsCells[i] = -1;
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



