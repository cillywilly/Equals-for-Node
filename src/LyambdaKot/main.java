package LyambdaKot;


class main {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println(myCat);

        // создаем лямбду
        Settable<Cat> s = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };
        Polovoi<Cat> p = (cot) -> cot.getAge() % 13 == 0;

        // вызываем метод, в который передаем кота и лямбду
        changeEntity(myCat, s);
        setMale(myCat,p);
        // выводим на экран и видим, что состояние кота изменилось (имеет имя и возраст)
        System.out.println(myCat);
    }

    private static <T extends WithNameAndAge>  void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "Мурзик", 13);
    }

    private static <T extends WithNameAndAge> void setMale(T cot,Polovoi p) {
        cot.setPol(p.setMale(cot));
    }
}




