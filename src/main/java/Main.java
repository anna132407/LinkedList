public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("banan");
        list.add("lolo");
        list.add("ururu");
        list.add("vauvau");
        list.add("yoyoy");
        System.out.println(list);
        list.remove("banan");
        System.out.println(list);
        System.out.println(list.size());

    }
}
