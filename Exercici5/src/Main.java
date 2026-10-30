void main() {
    Scanner llegir = new Scanner(System.in);

    int ALUMNES = 20;
    int NOTES = 3;
    int TOTAL = 6; // 3 notes + promig + màxima + mínima

    double[][] matriu = new double[ALUMNES][TOTAL];

    // a. Llegir les notes parcials de cada alumne
    for (int i = 0; i < ALUMNES; i++) {
        for (int j = 0; j < NOTES; j++) {
            System.out.print("Alumne " + i + ", nota parcial " + (j + 1) + ": ");
            matriu[i][j] = llegir.nextDouble();
        }
    }

    // b. Calcular promig, nota més alta i més baixa de cada alumne
    for (int i = 0; i < ALUMNES; i++) {
        double suma = matriu[i][0];
        double max = matriu[i][0];
        double min = matriu[i][0];

        for (int j = 1; j < NOTES; j++) {
            suma += matriu[i][j];
            if (matriu[i][j] > max) {
                max = matriu[i][j];
            }
            if (matriu[i][j] < min) {
                min = matriu[i][j];
            }
        }

        matriu[i][3] = suma / NOTES; // promig
        matriu[i][4] = max;          // nota més alta
        matriu[i][5] = min;          // nota més baixa
    }

    // c. Imprimir la matriu resultant en forma de matriu
    System.out.println();
    System.out.println("N1   N2   N3   PROM MAX  MIN");
    for (int i = 0; i < ALUMNES; i++) {
        for (int j = 0; j < TOTAL; j++) {
            System.out.print(matriu[i][j] + "\t");
        }
        System.out.println();
    }

    // d. Millor i pitjor nota del curs complet
    double millorCurs = matriu[0][0];
    double pitjorCurs = matriu[0][0];

    for (int i = 0; i < ALUMNES; i++) {
        for (int j = 0; j < NOTES; j++) {
            if (matriu[i][j] > millorCurs) {
                millorCurs = matriu[i][j];
            }
            if (matriu[i][j] < pitjorCurs) {
                pitjorCurs = matriu[i][j];
            }
        }
    }

    System.out.println();
    System.out.println("Millor nota del curs: " + millorCurs);
    System.out.println("Pitjor nota del curs: " + pitjorCurs);
}