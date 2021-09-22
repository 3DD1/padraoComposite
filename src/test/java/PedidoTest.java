import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarDescricaoPedido() {
        Veiculo veiculo1 = new Veiculo("VAN");

        Veiculo veiculo2 = new Veiculo("VAN Mercedez");
        Encomenda encomenda21 = new Encomenda("Juiz de Fora - MG", 0000456);
        veiculo2.addTransportadora(encomenda21);

        Veiculo veiculo3 = new Veiculo("VAN Fiat");
        Encomenda encomenda31 = new Encomenda("Belo Horizonte - MG", 0000345);
        Encomenda encomenda32 = new Encomenda("Piau - MG", 0000231);
        veiculo3.addTransportadora(encomenda31);
        veiculo3.addTransportadora(encomenda32);

        Veiculo descricaoPedido = new Veiculo("Entregas na região de Minas Gerais");
        descricaoPedido.addTransportadora(veiculo1);
        descricaoPedido.addTransportadora(veiculo2);
        descricaoPedido.addTransportadora(veiculo3);

        Pedido pedido = new Pedido();
        pedido.setDescricaoPedido(descricaoPedido);

        assertEquals("Entregas na região de Minas Gerais\n" +
                "VAN\n" +
                "VAN Mercedez\n" +
                "Juiz de Fora - MG: 0000456\n" +
                "VAN Fiat\n" +
                "Belo Horizonte - MG 0000345\n" +
                "Piau - MG 0000231\n", pedido.getDescricaoPedido());
    }

    @Test
    void deveRetornarPedidoSemInformacao() {
        try {
            Pedido pedido = new Pedido();
            pedido.getDescricaoPedido();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pedido sem informação", e.getMessage());
        }
    }

}