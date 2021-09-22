import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {


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