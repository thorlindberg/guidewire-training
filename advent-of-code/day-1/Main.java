import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {

            DataModel dataModel = new DataModel("input.txt");

            Integer maxSum = dataModel.maximumSum();
            System.out.println(maxSum);

            Integer[] topThreeSums = dataModel.topThreeSums();
            System.out.println(topThreeSums);
            
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}