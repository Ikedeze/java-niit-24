import java.text.NumberFormat;
import java.util.Locale;

public class Pract1 {
    public static void main(String[] args) {
        NumberFormat nmf = NumberFormat.getCompactNumberInstance(Locale.US,
        NumberFormat.Style.SHORT);
    }
    
}
