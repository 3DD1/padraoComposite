import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {


    @Test
    void deveRetornarPedidoSemInformacao() {
        try {
            Pedido pedido = new Pedido();
            pedido.get();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Disciplina sem ementa", e.getMessage());
        }
    }

}