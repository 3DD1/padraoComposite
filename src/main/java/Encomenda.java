public class Encomenda extends Transportadora{
    private int notaFiscal;

    public Encomenda(String descricao, int notaFiscal) {
        super(descricao);
        this.notaFiscal = notaFiscal;
    }



    public String getTransportadora() {
        return "Pedido: " + this.getDescricao() + " - número: " + this.notaFiscal + "\n";
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
