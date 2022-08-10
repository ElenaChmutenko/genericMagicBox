public class Main {
    public static void main(String[] args) throws Exception {
        // create classes to pass them as a parameter to the constructor MagicBox
        // to make new T-type arrays
        Class strClass = Class.forName("java.lang.String");
        Class integerClass = Class.forName("java.lang.Integer");
        MagicBox<String> strMagicBox = new MagicBox<> (strClass, 5);
        MagicBox<Integer> integerMagicBox = new MagicBox<> (integerClass, 4);

        strMagicBox.box[0] = "Harry";
        strMagicBox.add("Hermione");
        System.out.println(strMagicBox.add("Ron"));
        System.out.println(strMagicBox);

        integerMagicBox.add(2);
        integerMagicBox.add(3);
        integerMagicBox.add(5);
        integerMagicBox.add(7);
        System.out.println(integerMagicBox);
        System.out.println(integerMagicBox.pick());
        System.out.println(strMagicBox.pick());

    }

}