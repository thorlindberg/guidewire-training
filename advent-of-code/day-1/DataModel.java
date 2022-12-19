import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DataModel {

  private String contents;
  private String[] groups;
  private Integer[][] data;

  public DataModel(String filePath) throws IOException {
    contents = readFile(filePath);
    groups = contents.split("\n\n");
    Integer[][] result = new Integer[groups.length][];
    for (int i = 0; i < groups.length; i++) {
        String[] parts = groups[i].split("\n");
        result[i] = new Integer[parts.length];
        for (int j = 0; j < parts.length; j++) {
            result[i][j] = Integer.parseInt(parts[j]);
        }
    }
    data = result;
  }

  public static String readFile(String filePath) throws IOException {
    File file = new File(filePath);
    byte[] bytes = Files.readAllBytes(file.toPath());
    return new String(bytes);
  }

  public Integer maximumSum() {
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < data.length; i++) {
      for (int j = i; j < data.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          for (int l = 0; l < data[k].length; l++) {  // add this loop
            sum += data[k][l].intValue();
          }
        }
        maxSum = Math.max(maxSum, sum);
      }
    }
    return maxSum;
  }

  public Integer[] topThreeSums() {
    Integer[] topThree = new Integer[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    for (int i = 0; i < data.length; i++) {
      for (int j = i; j < data.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          for (int l = 0; l < data[k].length; l++) {
            sum += data[k][l].intValue();
          }
        }
        if (sum > topThree[0]) {
          topThree[2] = topThree[1];
          topThree[1] = topThree[0];
          topThree[0] = sum;
        } else if (sum > topThree[1]) {
          topThree[2] = topThree[1];
          topThree[1] = sum;
        } else if (sum > topThree[2]) {
          topThree[2] = sum;
        }
      }
    }
    return topThree;
  }

}