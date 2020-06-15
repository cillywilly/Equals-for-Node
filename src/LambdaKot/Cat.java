package LambdaKot;

class Cat implements WithNameAndAge {

    private String name;
    private int age;
    private boolean muj;

    public int getAge() {
        return this.age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setPol(boolean pol) {
        this.muj = pol;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "muj? = " + muj;
    }
}
