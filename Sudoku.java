public class Sudoku {
    public static void main(String[] args) {
        int[][] sudokuTable = new int[9][9];
        
        for (int i=0; i<sudokuTable.length; i++) {
            for (int j=0; j<sudokuTable.length; j++) {
                sudokuTable[i][j] = (int)((Math.random()*9)+1);
            }
        }   
        SudokuTablePrint(sudokuTable);
    }
    public static void SudokuTablePrint (int sudokuNumber[][]) {
        System.out.println("+---------+---------+---------+");
        for (int i=0; i<sudokuNumber.length; i++) {
            System.out.print("|");
            for (int j=0; j<sudokuNumber.length; j++) {
                System.out.print(" " +sudokuNumber[i][j] + " ");
                if (j==2 || j ==5) {
                    System.out.print("|");
                }
            }
            System.out.println("|");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println("+---------+---------+---------+");
            }
        }
    }
}