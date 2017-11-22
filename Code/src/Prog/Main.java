//Создать класс Сова с полями имя возраст порода и методами
// охотиться() пожиратьДобычу() спать().
//Внутри методов просто выводить на экран фразу "Сова охотится",
// "Сова пожирает добычу" и т.д.
//Создать в главном классе 4 совы, две из которых будут спать,
// одна охотиться и еще одна пожирать добычу.

package Prog;

public class Main {
    public static void main(String[] args) {
        Owl owl1 = new Owl();
        owl1.setName("Hedwig");
        owl1.setAge(5);
        owl1.setBreed("Asio otus");
        System.out.println(owl1);
        owl1.sleep();

        Owl owl2 = new Owl();
        owl2.setName("Errol");
        owl2.setAge(3);
        owl2.setBreed("Strix nebulosa");
        System.out.println(owl2);
        owl2.sleep();

        Owl owl3 = new Owl();
        owl3.setName("Hermes");
        owl3.setAge(3);
        owl3.setBreed("Bubo bubo");
        System.out.println(owl3);
        owl3.eat();

        Owl owl4 = new Owl();
        owl4.setName("Brodwin");
        owl4.setAge(2);
        owl4.setBreed("Glaucidium passerinum");
        System.out.println(owl4);
        owl4.hunt();

    }

}
