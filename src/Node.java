public final class Node {
    private int count;
    private String name;
    private Node child;

    public Node(int count, String name, Node child) {
        this.count = count;
        this.name = name;
        this.child = child;
    }

    public Node() {

    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public Node getChild() {
        return child;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else {
            Node n1 = null;
            try {
                n1 = (Node) obj;
            } catch (Exception e) {
                System.out.println("Объект не принадлежит классу Node");
                return false;
            }
            if (n1.getChild() != null && this.getChild() != null) {
                return (this.getCount() == n1.getCount()) && (this.getName().equals(n1.getName())) && (this.getChild().equals(n1.getChild()));
            } else {
                if (n1.getChild() == null && this.getChild() == null) {
                    return (this.getCount() == n1.getCount()) && (this.getName().equals(n1.getName()));
                } else {
                    return false;
                }
            }
        }
    }
}
