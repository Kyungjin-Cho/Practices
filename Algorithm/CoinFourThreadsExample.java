public class CoinFourThreadsExample {
  static int head = 0;
  static int tail = 0;

  public static void main(String[] args) {
    CoinFourThreads c1 = new CoinFourThreads(25000);
    CoinFourThreads c2 = new CoinFourThreads(25000);
    CoinFourThreads c3 = new CoinFourThreads(25000);
    CoinFourThreads c4 = new CoinFourThreads(25000);

    String[] firstArray = c1.run();
    String[] secondArray = c2.run();
    String[] thirdArray = c3.run();
    String[] fourthArray = c4.run();

    for (int i = 0; i < 25000; i++) {
      if (firstArray[i].equals("head")) {
        head++;
      } else {
        tail++;
      }
    }

    for (int i = 0; i < 25000; i++) {
      if (secondArray[i].equals("head")) {
        head++;
      } else {
        tail++;
      }
    }

    for (int i = 0; i < 25000; i++) {
      if (thirdArray[i].equals("head")) {
        head++;
      } else {
        tail++;
      }
    }

    for (int i = 0; i < 25000; i++) {
      if (fourthArray[i].equals("head")) {
        head++;
      } else {
        tail++;
      }
    }

    System.out.println("Out of " + (head + tail)
        + ", head: " + head + ", tail: " + tail);

  }
}
