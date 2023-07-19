import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("25/06/1987"));

       System.out.println(cli);

       sc.close();
    }
}
