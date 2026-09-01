public class App {
    public static void resolverHanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + source + " a " + target);
            return;
        }
        resolverHanoi(n - 1, source, auxiliary, target);
        System.out.println("Mover disco " + n + " de " + source + " a " + target);
        resolverHanoi(n - 1, auxiliary, target, source);
    }
    public static void main(String[] args) throws Exception {
        int n = 3; // Number of disks
        resolverHanoi(n, 'A', 'C', 'B'); // A, B, and C are the names of the rods
    }
}
