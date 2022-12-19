import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            DataModel dataModel = new DataModel("input.txt");

            Integer maxSum = dataModel.maximumSum();
            Utilities.print(maxSum);

            Integer[] topThreeSums = dataModel.topThreeSums();
            Utilities.print(topThreeSums);
            
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}