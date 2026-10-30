//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    
    char[][] matriu = new char[5][5];

    // Una sola passada per generar la figura
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == j || i + j == 4) {
                matriu[i][j] = 'X';
            } else {
                matriu[i][j] = ' ';
            }
        }
    }

    // Mostrar la matriu
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(matriu[i][j] + " ");
        }
        System.out.println();
    }
}