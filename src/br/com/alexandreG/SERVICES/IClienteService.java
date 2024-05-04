/**
 * @author alexandre.gaia
 */
package br.com.alexandreG.SERVICES;

import br.com.alexandreG.DOMAIN.Cliente;
import br.com.alexandreG.EXCEPTIONS.DAOException;
import br.com.alexandreG.SERVICES.GENERICS.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}