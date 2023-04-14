public class CoinFourThreads {
  private int tossTimes;
  private String[] tossArray = new String[50000];
  int head = 0;
  int tail = 0;

  public CoinFourThreads(int tossTimes) {
    this.tossTimes = tossTimes;
  }

  public String[] run() {
    for (int i = 0; i < tossTimes; i++) {
      int result = (int) (Math.random() * 2) + 1;
      if (result == 1) {
        tossArray[i] = "head";
      } else {
        tossArray[i] = "tail";
      }
    }
    return tossArray;
  }
}
