import java.util.ArrayList;
import java.util.List;

public class Veiculo extends Transportadora{
    private List<Transportadora> transportadoras;

    public Veiculo(String descricaoPedido) {
        super(descricaoPedido);
        this.transportadoras = new ArrayList<Transportadora>();
    }

    public void addTransportadora(Transportadora transportadora) {
        this.transportadoras.add(transportadora);
    }

    public String getTransportadora() {
        String saida = "";
        saida = "Unidade: " + this.getDescricao() + "\n";
        for (Transportadora transportadora : transportadoras) {
            saida += transportadora.getTransportadora();
        }
        return saida;
    }
}
