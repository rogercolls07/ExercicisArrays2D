//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);

    int suma = 0;


    System.out.println("Quantes columnes vols?");
    int m = llegir.nextInt();


    int [][] matriu = new int[3][m];
    int [] vectorSuma = new int[m];

    for (int i = 0; i < matriu.length; i++) {

        for (int j = 0; j < matriu[i].length; j++) {

            System.out.print("Pon el numero ("+i+", "+j+"): ");
            matriu[i][j] = llegir.nextInt();
        }
    }
// Suma de cada columna
    for (int j = 0; j < m; j++) {
        int sumaColumna = 0;
        for (int i = 0; i < 3; i++) {
            sumaColumna += matriu[i][j];
        }
        vectorSuma[j] = sumaColumna;
    }

    System.out.println("Suma de cada columna:");
    for (int j = 0; j < m; j++) {
        System.out.println("Columna " + j + ": " + vectorSuma[j]);
    }

    // Màxim i mínim de cada columna
    int[] vectorMax = new int[m];
    int[] vectorMin = new int[m];

    for (int j = 0; j < m; j++) {
        vectorMax[j] = matriu[0][j];
        vectorMin[j] = matriu[0][j];
        for (int i = 1; i < 3; i++) {
            if (matriu[i][j] > vectorMax[j]) {
                vectorMax[j] = matriu[i][j];
            }
            if (matriu[i][j] < vectorMin[j]) {
                vectorMin[j] = matriu[i][j];
            }
        }
    }

// Mostrar resultats
    for (int j = 0; j < m; j++) {
        System.out.println("Columna " + j + " -> màxim: " + vectorMax[j]
                + ", mínim: " + vectorMin[j]);
    }

}
