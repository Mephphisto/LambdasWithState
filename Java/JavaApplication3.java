
public class JavaApplication {
    static int counter = 0;
    @FunctionalInterface
    public interface IntUnaryOperator {
        int applyAsInt();
    } 
    public static IntUnaryOperator f = () -> {
        return counter++;
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(f.applyAsInt());
        System.out.println(f.applyAsInt());
        System.out.println(f.applyAsInt());
        System.out.println(f.applyAsInt());
    }
    
}
