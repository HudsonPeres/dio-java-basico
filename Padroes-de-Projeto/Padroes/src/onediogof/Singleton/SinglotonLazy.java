package onediogof.Singleton;

public class SinglotonLazy {
    
    private static SinglotonLazy instancia;

    private SinglotonLazy(){
        super();
    }

    public static SinglotonLazy getInstancia(){
        if (instancia == null) {
            instancia = new SinglotonLazy();
        }
        return instancia;
    }

}
