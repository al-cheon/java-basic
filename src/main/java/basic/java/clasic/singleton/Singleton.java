package basic.java.clasic.singleton;

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }


    private static class Holder {
        public static final Singleton instance = new Singleton();
    }
}
