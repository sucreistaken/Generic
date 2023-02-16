public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(10);



        System.out.println(list.size());

        System.out.println(list.get(11));
        System.out.println("*********");
        System.out.println(list.indexOf(10));
        System.out.println(list.isEmpty());
        System.out.println(list.sublist(0,10));

    }
}