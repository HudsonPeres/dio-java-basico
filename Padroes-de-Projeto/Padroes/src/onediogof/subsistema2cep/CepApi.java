package onediogof.subsistema2cep;

public class CepApi {
    
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    
    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String ceo){
        return "Natal";
    }
        public String recuperarEstado(String ceo){
        return "RN";
    }   

}
