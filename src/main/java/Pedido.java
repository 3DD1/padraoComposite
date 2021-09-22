public class Pedido {

    private Transportadora descricaoPedido;


    public void setDescricaoPedido(Transportadora descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public String getDescricaoPedido() {
        if (this.descricaoPedido == null){
            throw new NullPointerException("Pedido sem informação");
        }
        return this.descricaoPedido.getTransportadora();
    }
}
