import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            DataModel dataModel = new DataModel("input.txt");
            Utilities.print(
                dataModel.score()
            );
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}