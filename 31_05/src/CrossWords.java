import java.lang.Math;
public class CrossWords {
    public static void main(String[] args){
        char[][] matrix ={
                {'c','i','a','i'},
                {'u','i','g','h'},
                {'v','l','a','n'},
                {'w','c','d','o'},
                {'w','c','d','o'},
        };
        System.out.println(findWord(matrix, "cuvww"));
    }

    public static boolean findWord(char[][] matrix, String word){
        int rows = matrix.length;
        int cols = matrix[0].length;
        return findOrizontal(matrix, word, rows, cols) || findVertical(matrix, word, rows, cols) ||
               findBackwards(matrix, word, rows, cols) || findDiagonal(matrix, word, rows, cols);
    }

    public static boolean findOrizontal(char[][] matrix, String word, int rows, int cols){
        if(cols<word.length()) return false;
        for (int row = 0; row < rows; row++) {
            int k = 0; //conta il carattere a cui è arrivato il controllo di word
            for (int col = 0; col < cols; col++) {
                int spareSpace = cols - col; // spazio rimasto per il controllo
                int spareWord = word.length() - k; // spazio rimasto per il controllo della parola
                if(spareSpace < spareWord) break; // se non c'è spazio salta il ciclo e passa alla riga successiva
                if (matrix[row][col] == word.charAt(k)) k++;
                if (k==word.length()) return true;
            }
        }
        return false;
    }
    public static boolean findVertical(char[][] matrix, String word, int rows, int cols){
        if(rows<word.length()) return false;
        for (int col = 0; col < cols; col++) {
            int k = 0;
            for (int row = 0; row < rows; row++) {
                int spareSpace = rows - row; // spazio rimasto per il controllo
                int spareWord = word.length() - k; // spazio rimasto per il controllo della parola
                if(spareSpace < spareWord) break;
                if (matrix[row][col] == word.charAt(k)) k++;
                if (k==word.length()) return true;
            }
        }
        return false;
    }
    public static boolean findBackwards(char[][] matrix, String word, int rows, int cols){
        return findBackwardsOrizontal(matrix, word, rows, cols) || findBackwardsVertical(matrix, word, rows, cols);
    }
    public static boolean findBackwardsOrizontal(char[][] matrix, String word, int rows, int cols){
        if(cols<word.length()) return false;
        for (int row = rows-1; row >= 0; row--) {
            int k = 0; //conta il carattere a cui è arrivato il controllo di word
            for (int col = cols-1; col >= 0; col--) {
                int spareSpace = col+1; // spazio rimasto per il controllo
                int spareWord = word.length() - k; // spazio rimasto per il controllo della parola
                if(spareSpace < spareWord) break;
                if (matrix[row][col] == word.charAt(k)) k++;
                if (k==word.length()) return true;
            }
        }
        return false;
    }
    public static boolean findBackwardsVertical(char[][] matrix, String word, int rows, int cols){
        if(rows<word.length()) return false;
        for (int col = cols - 1; col >= 0; col--) {
            int k = 0;
            for (int row = rows - 1; row >= 0; row--) {
                int spareSpace = row+1; // spazio rimasto per il controllo
                int spareWord = word.length() - k; // spazio rimasto per il controllo della parola
                if(spareSpace < spareWord) break;
                if (matrix[row][col] == word.charAt(k)) k++;
                if (k==word.length()) return true;
            }
        }
        return false;
    }
    public static boolean findDiagonal(char[][] matrix, String word, int rows, int cols){
        if(cols<word.length() || rows<word.length()) return false;
        for (int row = 0; row < rows; row++) {
            int auxCol = 0;
            int k = 0; //conta il carattere a cui è arrivato il controllo di word
            for (int col = auxCol, auxRow = row; col < cols && auxCol < cols && auxRow < rows; col++, auxRow++) {
                int spareSpaceRow = rows - row;
                int spareSpaceCol = cols - col;
                int spareWord = word.length() - k; // spazio rimasto per il controllo della parola
                if((spareSpaceRow < spareWord && spareSpaceCol < spareWord)) break;
                if(matrix[auxRow][col] == word.charAt(k)) k++;
                if(k==word.length()) return true;
                if(col+1==cols || auxRow+1== rows) {
                    k=0;
                    auxRow = row-1;
                    col=auxCol++;
                }
            }
        }
        return false;
    }
}
