public class MergeSortEx {
    public static void mergeSort(int[] array){
        int length = array.length;

        if(length <= 1){
            return;
        }

        int midPoint = length / 2;
        int[] leftArray =  new int[midPoint];
        int[] rightArray = new int[length - midPoint];

        int leftIndex = 0;
        int rightIndex = 0;
        for(int i = 0; i < length; i++){
            if(i < midPoint){
                leftArray[leftIndex] = array[i];
                leftIndex++;
            } 
            else{
                rightArray[rightIndex] = array[i];
                rightIndex++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        sort(leftArray, rightArray, array);
    }

    public static void sort(int[] leftArray, int[] rightArray, int[] array){
        int length = array.length;
        int leftLength = array.length / 2;
        int rightLength = length - leftLength;

        int arrayI = 0;
        int leftI = 0;
        int rightI = 0;

        while(leftI < leftLength && rightI < rightLength){
            if(leftArray[leftI] < rightArray[rightI]){
                array[arrayI] = leftArray[leftI];
                leftI++;
            }
            else{
                array[arrayI] = rightArray[rightI];
                rightI++;
            }
            arrayI++;
        }

        while(leftI < leftLength){
            array[arrayI] = leftArray[leftI];
            leftI++;
            arrayI++;
        }

        while(rightI < rightLength){
            array[arrayI] = rightArray[rightI];
            rightI++;
            arrayI++;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 2, 8, 9, 3, 5, 7, 10};

        for(int i : array){
            System.out.print(i + ", ");
        }
        System.out.println();
        mergeSort(array);

        for(int i : array){
            System.out.print(i + ", ");
        }
    }
}
