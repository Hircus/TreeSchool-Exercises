import java.util.Random;
import java.util.Scanner;

public class Labirynth {
    /*
    # Labyrinth

    Negli anni 80 molti videogiochi :video_game: avevano una grafica "testuale" e
    cioè usavano i caratteri base del computer per disegnare a schermo.

    Possiamo rappresentare un labirinto come una matrice di caratteri, in cui il carattere "-" rappresenta uno spazio vuoto,
    la "P" la posizione del giocatore e la "E" l’uscita.

    Scrivete un programma che permette ad un utente di giocare al vostro labirinto. Per farlo potrà scrivere sulla console
    di java le lettere «WASD» per muoversi (come in molti videogiochi per PC). Quando il giocatore raggiunge il traguardo,
    verrà avvisato di aver vinto e il programma termina.

    Bonus stage:

    Generate il labirinto randomicamente

    ## Io ve lo dico, è difficile...
    Fate in modo che il computer sia in grado di risolvere da solo il labirinto.
    */
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int dim = 5;
        char[][] labyrinth = new char[dim][dim];

        for (int i = 0; i < labyrinth.length; i++) {
            for (int j = 0; j < labyrinth[0].length; j++) {
                labyrinth[i][j] = '-';
            }
        }

            /*
        labyrinth[0][2] = 'W';
        labyrinth[0][3] = 'W';
        labyrinth[1][1] = 'W';
        labyrinth[1][3] = 'W';
        labyrinth[2][0] = 'P';
        labyrinth[2][1] = 'W';
        labyrinth[2][3] = 'W';
        labyrinth[2][4] = 'W';
        labyrinth[3][2] = 'W';
        labyrinth[3][4] = 'E';
        labyrinth[4][0] = 'W';
        labyrinth[4][4] = 'W';
        **/

        for (int i = 0; i < labyrinth.length; i++) {
            int j1 = random.nextInt(dim);
            int j2 = random.nextInt(dim);
            labyrinth[i][j1] = 'W';
            labyrinth[i][j2] = 'W';
        }

        labyrinth[random.nextInt(dim)][random.nextInt(dim)] = 'E';
        labyrinth[random.nextInt(dim)][random.nextInt(dim)] = 'P';


        printMatrix(labyrinth);
        //System.out.println("Dove vuoi muoverti?");
        //String a = reader.nextLine();

        if (autoMovement(labyrinth, ' ')) System.out.println("Vittoria");
    }

    public static boolean movement(char[][] labyrinth, String a) {
        int rowP = -1, colP = -1, rowE = -1, colE = -1;
        Scanner reader = new Scanner(System.in);
        String input;

        for (int i = 0; i < labyrinth.length; i++) {
            for (int j = 0; j < labyrinth[i].length; j++) {
                if (labyrinth[i][j] == 'P') {
                    rowP = i;
                    colP = j;
                }
                if (labyrinth[i][j] == 'E') {
                    rowE = i;
                    colE = j;
                }
            }
        }

        switch (a) {
            case "w":
                if (rowP > 0) {
                    if (labyrinth[rowP - 1][colP] == '-' || labyrinth[rowP - 1][colP] == 'E') {
                        labyrinth[rowP][colP] = '-';
                        rowP--;
                        labyrinth[rowP][colP] = 'P';
                    } else {
                        System.out.println("C'è un muro in quella direzione!");
                    }
                } else {
                    System.out.println("C'è un muro in quella direzione!");
                }
                break;
            case "s":
                if (rowP < labyrinth.length - 1) {
                    if (labyrinth[rowP + 1][colP] == '-' || labyrinth[rowP + 1][colP] == 'E') {
                        labyrinth[rowP][colP] = '-';
                        rowP++;
                        labyrinth[rowP][colP] = 'P';
                    } else {
                        System.out.println("C'è un muro in quella direzione!");
                    }
                } else {
                    System.out.println("C'è un muro in quella direzione!");
                }
                break;
            case "a":
                if (colP > 0) {
                    if (labyrinth[rowP][colP - 1] == '-' || labyrinth[rowP][colP - 1] == 'E') {
                        labyrinth[rowP][colP] = '-';
                        colP--;
                        labyrinth[rowP][colP] = 'P';
                    } else {
                        System.out.println("C'è un muro in quella direzione!");
                    }
                } else {
                    System.out.println("C'è un muro in quella direzione!");
                }
                break;
            case "d":
                if (colP < labyrinth[rowP].length - 1) {
                    if (labyrinth[rowP][colP + 1] == '-' || labyrinth[rowP][colP + 1] == 'E') {
                        labyrinth[rowP][colP] = '-';
                        colP++;
                        labyrinth[rowP][colP] = 'P';
                    } else {
                        System.out.println("C'è un muro in quella direzione!");
                    }
                } else {
                    System.out.println("C'è un muro in quella direzione!");
                }
                break;
            default:
                System.out.println("Chiave non riconosciuta!");
                break;
        }
        printMatrix(labyrinth);
        if (rowP == rowE && colE == colP) return true;
        else {
            System.out.println("Dove vuoi muoverti?");
            input = reader.nextLine();
            return movement(labyrinth, input);
        }
    }

    public static boolean autoMovement(char[][] labyrinth, char a) {
        int rowP = -1, colP = -1, rowE = -1, colE = -1, index;
        char input, nextTile = ' ';
        String comandi = "wasd";
        Scanner reader = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < labyrinth.length; i++) {
            for (int j = 0; j < labyrinth[i].length; j++) {
                if (labyrinth[i][j] == 'P') {
                    rowP = i;
                    colP = j;
                }
                if (labyrinth[i][j] == 'E') {
                    rowE = i;
                    colE = j;
                }
            }
        }

        index = random.nextInt(comandi.length());
        input = comandi.charAt(index);
        switch (input) {
            case 'w':
                if (rowP > 0) {
                    nextTile = labyrinth[rowP - 1][colP];
                    if (nextTile == '-' || nextTile == 'E') {
                        labyrinth[rowP][colP] = '-';
                        rowP--;
                        labyrinth[rowP][colP] = 'P';
                    }
                }
                break;
            case 's':
                if (rowP < labyrinth.length - 1) {
                    nextTile = labyrinth[rowP + 1][colP];
                    if (nextTile == '-' || nextTile == 'E') {
                        labyrinth[rowP][colP] = '-';
                        rowP++;
                        labyrinth[rowP][colP] = 'P';
                    }
                }
                break;
            case 'a':
                if (colP > 0) {
                    nextTile = labyrinth[rowP][colP - 1];
                    if (nextTile == '-' || nextTile == 'E') {
                        labyrinth[rowP][colP] = '-';
                        colP--;
                        labyrinth[rowP][colP] = 'P';
                    }
                }
                break;
            case 'd':
                if (colP < labyrinth[rowP].length - 1) {
                    nextTile = labyrinth[rowP][colP + 1];
                    if (colP < labyrinth[rowP].length - 1) {
                        if (nextTile == '-' || nextTile == 'E') {
                            labyrinth[rowP][colP] = '-';
                            colP++;
                            labyrinth[rowP][colP] = 'P';
                        }
                    }
                }
                break;
            default:
                System.out.println("Chiave non riconosciuta!");
                break;
        }
        printMatrix(labyrinth);
        if (rowP == rowE && colE == colP) return true;
        else return autoMovement(labyrinth, input);
    }

    public static void printMatrix(char[][] labyrinth) {
        for (char[] chars : labyrinth) {
            System.out.println(chars);
        }
        System.out.println();
    }
}
