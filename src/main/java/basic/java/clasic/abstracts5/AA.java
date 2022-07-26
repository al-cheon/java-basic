package basic.java.clasic.abstracts5;

abstract public class AA implements A {
    void aaa() {
        System.out.println("aaa");
        bbb();
    }

    protected abstract void bbb();
    abstract protected void ccc();
}
