import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            DataModel dataModel = new DataModel("input.txt");
            Utilities.print(
                dataModel.maximumSum()
            );
            Utilities.print(
                dataModel.topThreeSums()
            );
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}