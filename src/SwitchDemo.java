public class SwitchDemo {
    public static void main(String[] args) {
        int dieValue = 1;

        switch (dieValue) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Very high!");
                break;
        }

        switch (dieValue) {
            case 1:
                System.out.println("Odd");
                break;
            case 2:
            case 4:
            case 5:
                System.out.println("Even");
        }
    }
}
