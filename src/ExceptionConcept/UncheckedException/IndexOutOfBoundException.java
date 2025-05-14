package ExceptionConcept.UncheckedException;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[5]);
    }
}
