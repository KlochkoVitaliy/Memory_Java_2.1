import java.util.Arrays;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    //Task 5
    public static void changeValue(int value) {
        value = 22;
    }

    //Task 6
    public static void changeValue1(Integer value1) {
        value1 = 22;
    }

    //Task 7
    public static void changeValue2(Integer[] value2) {
        value2 = new Integer[]{1, 2};
    }

    //Task 8
    public static void changeValue3(Integer[] value3) {
        value3 = new Integer[]{99, 2};
    }

    public static void main(String[] args) {

        System.out.println(ANSI_GREEN+"Task 5 "+ANSI_RESET);

        //Task 5
        int value = 33;
        System.out.println("value " + value);
        changeValue(value);
        System.out.println("value " + value);

        // Answer task 5
//        При попадании в метод сущность копирует то, что хранится в ней, свое значение.
//        Т. е. когда мы создаем переменную int value = 33, а затем передаем ее в метод changeValue(value), внутри метода мы работаем уже не с переменной value,
//        а со значением 33. Даже если мы в методе изменим значение, значение внутри переменной value останется прежним.

        System.out.println(ANSI_GREEN+"Task 6 "+ANSI_RESET);

        //Task 6
        Integer value1 = 33;
        System.out.println("value1 " + value1);
        changeValue1(value1);
        System.out.println("value1 " + value1);

        // Answer task 6
//        Основное различие, разумеется, в том, что Integer — это полнофункциональный объект, который занимает место в куче,
//        а в коде мы пользуемся ссылками на него, которые неявно преобразуются в значения:
//                       int value = 33; - value число!
//                       Integer value1 = 33; - value1 ссылка на обьект!
//      Integer - это фактически ссылка на объект, указывающая на новый объект Integer; int - это прямое хранилище значения данных.
//      При присваивании значения переменной типа Integer обычно выделяется память в куче под новый объект, как будто мы написали new Integer(33).
//      И надо помнить так же, что объект Integer никогда не меняет своего значения. Даже если мы в методе изменим значение, значение внутри переменной value останется прежним.

        System.out.println(ANSI_GREEN+"Task 7 "+ANSI_RESET);

        //Task 7
        Integer[] value2 = {3, 4};
        System.out.println("value2 " + Arrays.toString(value2));
        changeValue2(value2);
        System.out.println("value2 " + Arrays.toString(value2));

        //Answer task 7
        //В Java ссылочные типы хранятся в области кучи. Поскольку массивы также являются ссылочными типами (их можно создать с помощью ключевого слова «new» ),
        // они также хранятся в области кучи. Массивы используются для хранения нескольких значений в одной переменной вместо объявления отдельных переменных для
        // каждого значения. В Java в массиве хранятся примитивные значения (int, char и т.д.) или ссылки (т.е. указатели) на объекты.
        //В случае массива объектов ссылка на массив хранится в куче. И сами элементы массива тоже хранят ссылку на объекты.
        // Даже если мы в методе изменим значение, значение внутри переменной value останется прежним.

        System.out.println(ANSI_GREEN+"Task 8 "+ANSI_RESET);

        //Task 8
        Integer[] value3 = {3, 4};
        System.out.println("value3 " + Arrays.toString(value3));
        changeValue3(value3);
        System.out.println("value3 " + Arrays.toString(value3));

        //Answer task 8
        //Какое бы значение не стояло в массиве метода changeValue3, даже если мы в методе изменим значение, значение внутри переменной value останется прежним.
        //Задания 5-8 сделаны по аналогии с использованием примитивов и ссылок.

        System.out.println(ANSI_GREEN+"Task 9 "+ANSI_RESET);

        //Task 9
        Person person = new Person("Lyapis ", "Trubetskoy");
        Person.changePerson(person);
        System.out.println("person = " + person);

        //Answer 9
        //В методе changePerson мы использовали оператор присваивания и записали в переменную Person которая находится внутри метода новый обьект,
        // но так как в переменных не сами обьекты, а ссылки на них, мы записали в эту переменную не сам обьект, а ссылку на него. И переменная person в методе main
        // как указвала именно на этот обьект, так и указывает на него. Ведь переменная person в методе changePerson совершенно отдельная переменная.
        // Перед вызовом метода значение переменной person из метода main записывается в параметр person с помощью оператора присваивания. Сделать изменения в обьекте,
        // на который указывает переменная, переданная в метод, внутри метода - можно. Записать в переменную,
        // которую мы передаем в метод, указатель на новый обьект внутри метода - нельзя.

        System.out.println(ANSI_GREEN+"Task 10 "+ANSI_RESET);

        //Task 10
        Person person1 = new Person("Lyapis ", "Trubetskoy");
        Person.changePerson1(person1);
        System.out.println("person1 = " + person1);

        //Answer 10
        //ТК изменение в методе changePerson1 касаемые строк name & surname были внесены в поле класса Person, то при вызове метода в классе main мы получили значеия метода changePerson1.

    }
}

