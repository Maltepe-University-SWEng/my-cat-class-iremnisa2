package tr.edu.maltepe.oop;
public  class Simple_main {

    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", 3);

        // Kedinin adını ve yaşını yazdır
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());

        // Kedinin miyavlamasını sağla
        myCat.meow();
    }
}


