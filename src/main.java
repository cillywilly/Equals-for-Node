import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class main {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println(myCat);

        // создаем л€мбду
        Settable<Cat> s = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };
        Polovoi<Cat> p = (cot) -> {
            if (cot.getAge() % 13 == 0) {
                return true;
            } else return false;
        };

        // вызываем метод, в который передаем кота и л€мбду
        changeEntity(myCat, s);
        setMale(myCat,p);
        // выводим на экран и видим, что состо€ние кота изменилось (имеет им€ и возраст)
        System.out.println(myCat);
    }

    private static <T extends WithNameAndAge>  void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "ћурзик", 13);
    }

    private static <T extends WithNameAndAge> void setMale(T cot,Polovoi p) {
        cot.setPol(p.setMale(cot));
    }
}

interface WithNameAndAge {
    void setName(String name);
    void setAge(int age);
    void setPol(boolean pol);
}

interface Settable<C extends WithNameAndAge> {
    void set(C entity, String name, int age);
}

interface Polovoi <C extends WithNameAndAge>{
    boolean setMale(C cot);
}

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
                '}' + "pol = "+ muj;
    }
}


//    public static boolean scramble(String str1, String str2) {
//        return true;
//    }
//
//    /*считает сумму чисел кратных 3 и 5 до переданного числа number*/
//    public static int solution(int number) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 1; i <= number-1; i++) {
//            if (i % 3 == 0) {
//                if (!arrayList.contains(i)) {
//                    arrayList.add(i);
//                }
//            }
//            if (i % 5 == 0) {
//                if (!arrayList.contains(i)) {
//                    arrayList.add(i);
//                }
//            }
//        }
//        int res = 0;
//        for (int i : arrayList
//        ) {
//            res += i;
//        }
//        return res;
//    }
//    /*7 делит слово по парам букв armen->[ar, me, n_]*/
//    public static String[] solution(String s) {
//        char[] chars = s.toCharArray();
//        int count =0;
//        if (s.length() % 2 == 0) {
//            String[] res = new String[chars.length/2];
//            for (int i = 0; i < res.length; i++) {
//                res[i] = String.valueOf(chars[count+i]) + chars[count+i + 1];
//                count++;
//            }
//            return res;
//        } else {
//            String[] res = new String[chars.length/2+1];
//            for (int i = 0; i < res.length; i++) {
//                if (count != res.length-1) {
//                    res[i] = String.valueOf(chars[count + i])+chars[count + i + 1];
//                    count++;
//                } else {
//                    res[i] = String.valueOf(chars[count + i])+String.valueOf('_');
//                }
//            }
//            return res;
//        }
//    }
//
//    /*6 возвращает срединную букву из слова asa->s  asfa->sf*/
//    public static String getMiddle(String word) {
//        char[] chars = word.toCharArray();
//        char res = chars[(chars.length) / 2];
//        if (word.length() % 2 == 0) {
//            char res1 = chars[(chars.length/2)-1];
//            return String.valueOf(res1)+ res;
//        } else {
//            return String.valueOf(res);
//        }
//    }
//
//    /*5 в список массивов типа
//    * ArrayList<int[]> list = new ArrayList<>();
//    * добавл€етс€ массив типа
//        list.add(new int[] {10,0});
//        * метод возвращ€ет число= +[0] -[1] всех массивов*/
//    public static int countPassengers(ArrayList<int[]> stops) {
//        int res = 0;
//        for (int[] i : stops
//             ) {
//            res += i[0] - i[1];
//        }
//        return res;
//    }
//
//    /*4 расставл€ет слова в строке типа "4of Fo1r pe6ople g3ood th5e the2" в "правильном" пор€дке*/
//    public static String order(String words) {
//        if (!words.equals("")) {
//            String[] sentenses = words.split(" ");
//            String[] riteString = new String[sentenses.length+1];
//
//            for (String s : sentenses
//            ) {
//                for (Integer i = 1; i < sentenses.length+1; i++) {
//                    if (s.contains(i.toString())) {
//                        riteString[i] = s;
//                    }
//                }
//            }
//            StringBuilder res = new StringBuilder();
//            for (int i=1;i<riteString.length;i++
//            ) {
//                res.append(riteString[i]);
//                if (i < riteString.length-1) {
//                    res.append(" ");
//                }
//            }
//            return res.toString();
//        }
//        return "";
//    }
//
//    /*3 считает буквы a 'e' 'i' 'o' 'u' в строке*/
//    public static int getCount(String str) {
//        int vowelsCount = 0;
//        if (str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")) {
//            char[] bukv = str.toCharArray();
//            for (char buk: bukv) {
//                if (buk == 'a') {
//                    vowelsCount++;
//                }if (buk == 'e') {
//                    vowelsCount++;
//                }if (buk == 'i') {
//                    vowelsCount++;
//                }if (buk == 'o') {
//                    vowelsCount++;
//                }if (buk == 'u') {
//                    vowelsCount++;
//                }
//            }
//        }
//        return vowelsCount;
//    }
//
//    /*2 "переворачивает" слова длиньше 4 букв*/
//    public static String spinWords(String sentence) {
//        String[] words = sentence.split(" ");
//        StringBuilder res = new StringBuilder();
//        for (String s : words) {
//            if (s.length() > 4) {
//                char[] byob = s.toCharArray();
//                for (int i = byob.length-1; i >= 0; i--) {
//                    res.append(byob[i]);
//                    if (i == 0 && !s.equals(words[words.length-1])) {res.append(" ");}
//                }
//            } else  {
//                res.append(s);
//                if (!s.equals(words[words.length-1])) {res.append(" ");}
//            }
//        }
//        return res.toString();
//    }
//
//    /*1 мен€ет слово-слово-слово на слово—лово
//    * и слово_слово_слово на —лово—лово
//    * Ќ≈ ћ≈Ќ№Ў≈ и Ќ≈ ЅќЋ№Ў≈ “–®’ —Ћќ¬*/
//    public static String toCamelCase (String s){
//        if (s.contains("-")) {
//            ArrayList<String> list = new ArrayList<>();
//            StringBuilder res = new StringBuilder();
//            list.add(s.substring(0, s.indexOf("-")));
//            list.add(s.substring(s.indexOf("-")+1, s.lastIndexOf("-")));
//            list.add(s.substring(s.lastIndexOf("-")+1));
//            res.append(list.get(0));
//            for (int i = 1; i < list.size(); i++) {
//                String o =  list.get(i).substring(0, 1).toUpperCase();
//                String y = list.get(i).substring(1);
//                o+=y;
//                list.set(i, o);
//                res.append(list.get(i));
//            }
//            return res.toString();
//        }
//        if (s.contains("_")) {
//            ArrayList<String> list = new ArrayList<>();
//            StringBuilder res = new StringBuilder();
//            list.add(s.substring(0, s.indexOf("_")));
//            list.add(s.substring(s.indexOf("_")+1, s.lastIndexOf("_")));
//            list.add(s.substring(s.lastIndexOf("_")+1));
////            res.append(list.get(0));
//            for (int i = 0; i < list.size(); i++) {
//                String o =  list.get(i).substring(0, 1).toUpperCase();
//                String y = list.get(i).substring(1);
//                o+=y;
//                list.set(i, o);
//                res.append(list.get(i));
//            }
//            return res.toString();
//        }
//        return "";
//    }
//}
