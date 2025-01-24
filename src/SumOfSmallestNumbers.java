public class SumOfSmallestNumbers {
    static int smallestOnes(int[] arr) {
        if (arr.length < 2) {
            return arr[0];
        }

        int smallestOne = arr[0];
        int smallestTwo = arr[1];

        if (arr[0] > arr[1]) {
            smallestOne = arr[1];
            smallestTwo = arr[0];
        } else {
            smallestOne = arr[0];
            smallestTwo = arr[1];
        }

        for (int i = 2;i < arr.length;i++) {
            if (arr[i] < smallestOne) {
                smallestTwo = smallestOne;
                smallestOne = arr[i];
            } else if (arr[i] < smallestTwo) {
                smallestTwo = arr[i];
            }
        }
        System.out.println("smallestOne "+smallestOne);
        System.out.println("smallestTwo "+smallestTwo);

        return smallestOne+smallestTwo;
    }

    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 1, 2, 3, 4, 1};

        System.out.println("sum "+smallestOnes(arr));
    }
}
