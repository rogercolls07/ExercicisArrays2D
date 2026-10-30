//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner llegir = new Scanner(System.in);

    int suma = 0;
    System.out.println("Quantes files vols? ");
    int n = llegir.nextInt();

    System.out.println("Quantes columnes vols?");
    int m = llegir.nextInt();


    int [][] matriu = new int[n][m];
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
        for (int i = 0; i < n; i++) {
            sumaColumna += matriu[i][j];
        }
        vectorSuma[j] = sumaColumna;
    }

    System.out.println("Suma de cada columna:");
    for (int j = 0; j < m; j++) {
        System.out.println("Columna " + j + ": " + vectorSuma[j]);
    }


}
