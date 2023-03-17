import java.util.Arrays;

public class Arrays {
  public static void main(String[] args) {

  }

  public String binarySearch(String[] countries, String searchKey) {

    Arrays.sort(countries);

    int upperB = countries.length;
    int lowerB = 0;
    while (lowerB <= upperB) {

      int mid = (upperB + lowerB) / 2;

      if (searchKey.equals(countries[mid])) {
        return countries[mid];
      } else if (searchKey.compareTo(countries[mid]) < 0) {
        upperB = mid - 1;
      } else {
        lowerB = mid + 1;
      }
    }

    return "country not found message";
  }
}
