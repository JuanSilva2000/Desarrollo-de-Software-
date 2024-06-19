public class Map {
    String[][] mapa = new String[5][5];

    public Map() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapa[i][j] = "";
            }
        }
    }

    public void addBase(int x, int y){
        mapa[x-1][y-1] = "B";
    }

    public void addLaserTower(int x, int y) {
        if (isValidPosition(x,y)){
            mapa[x-1][y-1] = "LT";
        }else throw new IllegalArgumentException("Posicion no valida");


    }

    public void addCannonTower(int x, int y) {
        if (isValidPosition(x,y)){
            mapa[x-1][y-1] = "CT";
        }else throw new IllegalArgumentException("Posicion no valida");

    }

    public void addArrowTower(int x, int y) {
        if (isValidPosition(x,y)) {
            mapa[x - 1][y - 1] = "AT";
        }else throw new IllegalArgumentException("Posicion no valida");
    }

    public void printMap() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print("[" + mapa[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public boolean isValidPosition(int x, int y){
        if(mapa[x-1][y-1] == ""){
            return true;
        }

        return false;
    }
}
