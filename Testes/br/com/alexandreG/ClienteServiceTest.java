package br.com.alexandreG;

import br.com.alexandreG.DAO.ClienteDaoMock;
import br.com.alexandreG.DAO.IClienteDAO;
import br.com.alexandreG.DOMAIN.Cliente;
import br.com.alexandreG.EXCEPTIONS.DAOException;
import br.com.alexandreG.EXCEPTIONS.TipoChaveNaoEncontradaException;
import br.com.alexandreG.SERVICES.ClienteService;
import br.com.alexandreG.SERVICES.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Alexandre");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setAge("20");

    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Alexandre Gaia");
        clienteService.alterar(cliente);

        Assert.assertEquals("Alexandre Gaia", cliente.getNome());
    }
}