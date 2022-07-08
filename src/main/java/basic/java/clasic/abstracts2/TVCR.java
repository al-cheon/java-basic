package basic.java.clasic.abstracts2;

public class TVCR extends Tv implements Ivcr {
    //todo 다중상속 대신 이렇게 활용한다
    Vcr vcr = new Vcr();

    @Override
    public void play() {
        vcr.play();  //todo vcr 인스턴스를 이용할 수 있다
    }

    @Override
    public void stop() {
        vcr.stop();
    }

    @Override
    public void reset() {
        vcr.reset();
    }

    @Override
    public int getCounter() {
        return vcr.getCounter();
    }

    @Override
    public void setCounter(int counter) {
        vcr.setCounter(counter);
    }
}
