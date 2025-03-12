package chap08.abst;

public class ImplementC implements InterfaceC{

    @Override
    public void methodA() {
        System.out.println("ImplementC.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementC.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ImplementC.methodC");
    }

    public static void main(String[] args) {
        InterfaceA interA = new ImplementC();
        interA.methodA();
        System.out.println("==================");


        InterfaceB interB = new ImplementC();
        interB.methodB();
        System.out.println("==================");

        ImplementC implC = new ImplementC();
        implC.methodA();
        implC.methodB();
        implC.methodC();
    }
}
