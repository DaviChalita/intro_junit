package carrinho;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;

public class CarrinhoTest {

    Carrinho carrinho;
    Produto detergente;
    Produto biscoito;
    Produto abacaxi;

    @BeforeEach
    public void inicializa() {
        carrinho = new Carrinho();
        abacaxi = new Produto("Abacaxi amarelo", 10);
        carrinho.addItem(abacaxi);
        biscoito = new Produto("Biscoito de chocolate", 3);
        carrinho.addItem(biscoito);
        detergente = new Produto("Detergente neutro", 4);
        carrinho.addItem(detergente);
    }

    @Test
    public void testTamanhoCarrinho() {
        int tamCarrinho = carrinho.getQtdeItems();
        Assertions.assertEquals(tamCarrinho, 3);
    }

    @Test
    public void testRemoveItem() throws ProdutoNaoEncontradoException {
        carrinho.removeItem(detergente);
        int qtdItens = carrinho.getQtdeItems();
        Assertions.assertEquals(qtdItens, 2);
    }

    @Test
    public void testValorTotal(){
        double valTotal = carrinho.getValorTotal();
        Assertions.assertTrue(valTotal > 0);
    }
}
