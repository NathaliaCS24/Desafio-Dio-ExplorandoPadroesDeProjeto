package one.innovationone.gof.singleton;

// * Singleton "apressado"
// *
// * @author NathaliaCS24

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
