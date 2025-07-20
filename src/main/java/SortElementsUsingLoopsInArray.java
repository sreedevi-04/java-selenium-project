public class SortElementsUsingLoopsInArray {

        public static void main(String[] args) {
            int[] arr = {50, 20, 70, 10, 40};

            // Bubble Sort Logic
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    // Swap if the current element is greater than the next
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // Print sorted array
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }