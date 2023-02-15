class TicTacToe {
    public String comprobarGanador(char[][] tablero) {
        // Comprobar las filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ') {
                return tablero[i][0] + " ha ganado";
            }
        }

        // Comprobar las columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != ' ') {
                return tablero[0][i] + " ha ganado";
            }
        }

        // Comprobar las diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return tablero[0][0] + " ha ganado";
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return tablero[0][2] + " ha ganado";
        }

        // Comprobar si hay un empate
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(tablero[i][j] == ' '){
                    return "No hay ganador";
                }
            }
        }
        return "Empate";
    }
}