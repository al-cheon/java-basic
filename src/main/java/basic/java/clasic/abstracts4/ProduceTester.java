package basic.java.clasic.abstracts4;

public class ProduceTester {

    public static void main(String[] args) {
        User user = new User();
        user.autoProduce(new ProviderA());  //todo 기가 막힌다
        user.autoProduce(new ProviderB());
        user.autoProduce(() -> new Providable() { //todo 응용버전 익명의 구현체
            @Override
            public void produce() {
                System.out.println("interface 는 구현체가 필요하다. " +
                        "항상 Impl을 만들고 있을 필요없이 이렇게 매번 익명의 구현체를 만들어 쓸 수도 있다.");
            }
        });

    }
}
