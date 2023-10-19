package onediogof;
import onediogof.Singleton.SingletonEager;
import onediogof.Singleton.SingletonLazyHolder;
import onediogof.Singleton.SinglotonLazy;
import onediogof.Strategy.Comportamento;
import onediogof.Strategy.ComportamentoAgressivo;
import onediogof.Strategy.ComportamentoDefensivo;
import onediogof.Strategy.ComportamentoNormal;
import onediogof.Strategy.Robo;
import onediogof.Facade.Facade;


public class teste {
    public static void main(String[] args) {

        //Singleton
        SinglotonLazy lazy = SinglotonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SinglotonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //facede

       Facade facade = new Facade();
       facade.migrarCliente("Alexandre", "59000000");


    }
}
