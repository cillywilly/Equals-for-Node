package LyambdaKot;


class main {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println(myCat);

        // ������� ������
        Settable<Cat> s = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };
        Polovoi<Cat> p = (cot) -> cot.getAge() % 13 == 0;

        // �������� �����, � ������� �������� ���� � ������
        changeEntity(myCat, s);
        setMale(myCat,p);
        // ������� �� ����� � �����, ��� ��������� ���� ���������� (����� ��� � �������)
        System.out.println(myCat);
    }

    private static <T extends WithNameAndAge>  void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "������", 13);
    }

    private static <T extends WithNameAndAge> void setMale(T cot,Polovoi p) {
        cot.setPol(p.setMale(cot));
    }
}




