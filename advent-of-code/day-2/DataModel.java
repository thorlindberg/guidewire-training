import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DataModel {

  private String contents;
  private String[] groups;
  private String[][] data;
  private Round[] rounds;
  
  public int score() {
    int result = 0;
    for (int i = 0; i < rounds.length; i++) {
      result += rounds[i].score();
    }
    return result;
  }

  public DataModel(String filePath) throws IOException {

    contents = readFile(filePath);
    groups = contents.split("\n");
    String[][] result = new String[groups.length][];
    for (int i = 0; i < groups.length; i++) {
      String[] parts = groups[i].split(" ");
      result[i] = new String[parts.length];
      for (int j = 0; j < parts.length; j++) {
        result[i][j] = parts[j];
      }
    }
    data = result;

    rounds = new Round[data.length];
    for (int i = 0; i < data.length; i++) {
      if (data[i].length < 2) {
        continue;
      }
      HandSign opponent = interpretSign(data[i][0]);
      HandSign response = interpretSign(data[i][1]);
      if (opponent != null && response != null) {
        rounds[i] = new Round(opponent, response);
      }
    }

  }

  public static String readFile(String filePath) throws IOException {
    File file = new File(filePath);
    byte[] bytes = Files.readAllBytes(file.toPath());
    return new String(bytes);
  }

  public HandSign interpretSign(String x) {
    switch (x) {
      case "A": return HandSign.ROCK;
      case "X": return HandSign.ROCK;
      case "B": return HandSign.PAPER;
      case "Y": return HandSign.PAPER;
      case "C": return HandSign.SCISSORS;
      case "Z": return HandSign.SCISSORS;
      default: return null;
    }
  }

}

class Round {

  public HandSign opponent;
  public HandSign response;

  public Round(HandSign opponent, HandSign response) {
    this.opponent = opponent;
    this.response = response;
  }

  public Result result() {
    if (opponent == response) {
      return Result.DRAW;
    } else if (opponent == HandSign.ROCK && response == HandSign.SCISSORS) {
      return Result.LOSE;
    } else if (opponent == HandSign.SCISSORS && response == HandSign.PAPER) {
      return Result.LOSE;
    } else if (opponent == HandSign.PAPER && response == HandSign.ROCK) {
      return Result.LOSE;
    } else {
      return Result.WIN;
    }
  }

  int score() {
    return response.points() + result().points();
  }

}

enum HandSign {

  ROCK, PAPER, SCISSORS;

  int points() {
    switch (this) {
      case ROCK: return 1;
      case PAPER: return 2;
      case SCISSORS: return 3;
      default: return 0;
    }
  }

}


enum Result {

  WIN, LOSE, DRAW;

  int points() {
    switch (this) {
      case WIN: return 6;
      case LOSE: return 0;
      case DRAW: return 3;
      default: return 0;
    }
  }

}