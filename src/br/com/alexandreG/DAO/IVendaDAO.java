/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.DAO;

import br.com.alexandreG.DAO.GENERIC.IGenericDAO;
import br.com.alexandreG.DOMAIN.Venda;
import br.com.alexandreG.EXCEPTIONS.DAOException;
import br.com.alexandreG.EXCEPTIONS.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
