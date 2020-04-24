public class main {
    public static void main(String[] args) {
        Node n4 = new Node();
        Node n2 = new Node(1, "1", n4);
        Node n1 = new Node(1,"1",n2);
        Node n3 = new Node(1, "1", n2);
        System.out.println(n3.equals(n1));

//        System.out.println(n1.eqa(n2));
    }

}
