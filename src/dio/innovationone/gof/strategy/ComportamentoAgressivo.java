package dio.innovationone.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressimvamente...");
    }

}
