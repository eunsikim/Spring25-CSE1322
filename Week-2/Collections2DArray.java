public class Collections2DArray {
    public static void main(String[] args) {
        int[][] myList = new int[3][3];

        for(int i = 0; i < myList.length; i++){
            for(int j = 0; j < myList[i].length; j++){
                myList[i][j] = (i * myList.length) + j + 1;
            }
        }

        for(int[] row : myList){
            for(int number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < myList.length; i++){
            for(int j = 0; j < myList[i].length; j++){
                System.out.print(myList[i][j] + " ");
            }
            System.out.println();
        }
    }
}
