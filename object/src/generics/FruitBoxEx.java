package generics;

public class FruitBoxEx {
    public static void main(String[] args) {
        Box3<Fruit> fruitbox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        // Fruit : Fruit + Apple + Grape
        // Apple : Apple
        // Toy : Toy

        fruitbox.add(new Fruit());
        fruitbox.add(new Apple());
        fruitbox.add(new Grape());

        appleBox.add(new Apple());

        toyBox.add(new Toy());

        System.out.println(fruitbox);
        System.out.println(appleBox);
        System.out.println(toyBox);

        FruitBox<Fruit> fruitBox2 = new FruitBox<>();
        FruitBox<Apple> appleBox2 = new FruitBox<>();
        FruitBox<Grape> grapeBox2 = new FruitBox<>();
        // T extends Fruit : Fruit 혹은 Fruit 를 상속받은 클래스
        // FruitBox<Toy> toyBox2 = new FruitBox<>();

        fruitBox2.add(new Fruit());
        fruitBox2.add(new Apple());
        fruitBox2.add(new Grape());

        System.out.println(Juicer.makeJuice(fruitBox2));

        appleBox.add(new Apple());
        System.out.println(Juicer.makeJuice(appleBox2));

        grapeBox2.add(new Grape());
        System.out.println(Juicer.makeJuice(grapeBox2));
    }
}
