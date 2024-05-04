/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.SERVICES;

import br.com.alexandreG.DAO.IClienteDAO;
import br.com.alexandreG.DOMAIN.Cliente;
import br.com.alexandreG.EXCEPTIONS.DAOException;
import br.com.alexandreG.EXCEPTIONS.MaisDeUmRegistroException;
import br.com.alexandreG.EXCEPTIONS.TableException;
import br.com.alexandreG.SERVICES.GENERICS.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}