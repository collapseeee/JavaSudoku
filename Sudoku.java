public class Sudoku {
    public static void main(String[] args) {
        SudokuTablePrint(RandomUniqueNumber());
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
    public static int[][] RandomUniqueNumber () {
        int[][] numberInArray = new int[9][9];
        int remainingAvailableNumber = 0;
        int randomIndexNumber = 0;
        for (int i=0; i<numberInArray.length; i++) {
            int[] availableNumbers = {1,2,3,4,5,6,7,8,9};
            remainingAvailableNumber = availableNumbers.length;
            for (int j=0; j<numberInArray.length; j++) {
                //Random number for array index.
                randomIndexNumber = (int)(Math.random()*remainingAvailableNumber);
                //Assign the randomed number to the array.
                numberInArray[i][j] = availableNumbers[randomIndexNumber];
                //Reduce the range of number that can be random.
                availableNumbers[randomIndexNumber] = availableNumbers[remainingAvailableNumber - 1];
                remainingAvailableNumber--;
            }
        }
        return numberInArray;
    }
}