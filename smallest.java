public class smallest {

    public static void main(String[] args) {

        int[] array = {14, 51, 0, -16, 100};

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        int size = array.length;

        int indS = 0;
        int indL = 0;

        for(int i = 0; i < size; i++) {

            if(array[i] < small) {
                small = array[i];
                indS = i;
            }

            if(array[i] > large) {
                large = array[i];
                indL = i;
            }
        }

        System.out.println("The smallest value is: " + small);
        System.out.println("The smallest value index is: " + indS);

        System.out.println("The largest value is: " + large);
        System.out.println("The largest value index is: " + indL);
    }
}