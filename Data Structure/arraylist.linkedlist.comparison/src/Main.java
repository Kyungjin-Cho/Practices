public class Main {
  public static void main(String[] args) throws Exception {
    ArrayList a = new ArrayList();
    a.addLast(10);
    a.addLast(20);
    a.addLast(30);

    LinkedList l = new LinkedList();
    l.addLast(10);
    l.addLast(20);
    l.addLast(30);

    /**
     * ArrayList의 경우, 첫 인덱스에 새로운 값을 추가하려면 뒤의 값들을 먼저 뒤로 보내야 함
     * LinkedList의 경우, 첫 노드(head)를 새로운 값의 next로 지정하고 새로운 값을 head로 지정하면 됨(훨씬 빠름)
     */
    a.addFirst(5);
    l.addFirst(5);

    /**
     * ArrayList는 random access memory이며, 어느 인덱스의 값에 접근하든 동일한 속도로 접근 가능함.
     * LinkedList의 경우, 처음부터 그 위치의 값을 하나씩 순차적으로 찾아가야 함.
     */
    a.get(1);
    l.get(1);

    /**
     * ArrayList의 경우, 해당 노드 뒤의 값을 모두 먼저 뒤로 보낸 후 새로운 값 추가 가능
     * LinkedList의 경우, 순차적으로 값을 검색해야 하지만
     * 새로운 node의 이전 node의 next를 새로운 node로 설정하고,
     * 새로운 node의 next를 다음 node로 설정하면 됨
     */
    ArrayList.ListIterator ai = a.listIterator();
    while (ai.hasNext()) {
      if ((int) ai.next() == 20) {
        ai.add(25);
      }
    }
    LinkedList.ListIterator li = l.ListIterator();
    while (li.hasNext()) {
      if ((int) li.next() == 20) {
        li.add(25);
      }
    }

    // ArrayList 내부적으로 사용하는 배열의 크기가 고정됨. 100개 이상 값을 추가하려고 하면 에러 발생함 하지만 java 내부적으로는
    // ArrayList에 추가된 값들의 수가 배열의 크기를 초과할 경우, 기존 크기의 2배로 배열의 크기를 늘린 후 기존의 데이터를 새로운 배열
    // 크기로 이동시킴(Dynamic Array)

    // LinkedList는 메모리가 허용하는 한 무한히 많은 값들을 추가할 수 있음
  }
}
