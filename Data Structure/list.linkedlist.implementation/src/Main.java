public class Main {
  public static void main(String[] args) {
    // LinkedList 인스턴스화해서 numbers 변수 생성
    LinkedList numbers = new LinkedList();

    numbers.addFirst(30);
    System.out.println("First input\n" + numbers);

    numbers.addFirst(20);
    numbers.addFirst(10);
    numbers.addFirst(0);
    System.out.println("after addFirst\n" + numbers);

    numbers.addLast(40);
    numbers.addLast(50);
    numbers.addLast(60);
    System.out.println("after addLast\n" + numbers);

    numbers.add(1, 15);
    System.out.println("after add(1, 15)\n" + numbers);

    System.out.println(numbers.removeFirst());
    System.out.println("after removeFirst\n" + numbers);

    System.out.println(numbers.remove(2));
    System.out.println("after remove(2)\n" + numbers);

    System.out.println(numbers.removeLast());
    System.out.println("after removeLast\n" + numbers);

    System.out.println("after size\n" + numbers.size());

    System.out.println("after get(0)\n" + numbers.get(0));

    System.out.println("after indexOf(30)\n" + numbers.indexOf(30));

    LinkedList.ListIterator i = numbers.ListIterator();
    System.out.println("after next() & hasNext()");
    while (i.hasNext()) {
      System.out.println(i.next());
    }

    System.out.println("after add(60) & add(70)");
    i.add(60);
    // i.next(); * 위의 after next() & hasNext() 코드 주석 처리 후 작동할 것!
    i.add(70);
    System.out.println(numbers);

    System.out.println("after remove if it's 15");
    // 하기 코드는 위의 after next() & hasNext() 코드 주석 처리 후 작동할 것!
    while (i.hasNext()) {
      if ((int) i.next() == 15) {
        i.remove();
      }
    }
    System.out.println(numbers);
  }
}
