/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.SERVICES.GENERICS.JPA;

import java.io.Serializable;
import java.util.Collection;

import br.com.alexandreG.DAO.Persistente;
import br.com.alexandreG.DAO.GENERIC.IGenericDAO;
import br.com.alexandreG.DAO.GENERIC.JPA.IGenericJapDAO;
import br.com.alexandreG.EXCEPTIONS.DAOException;
import br.com.alexandreG.EXCEPTIONS.MaisDeUmRegistroException;
import br.com.alexandreG.EXCEPTIONS.TableException;
import br.com.alexandreG.EXCEPTIONS.TipoChaveNaoEncontradaException;

public abstract class GenericJpaService<T extends Persistente, E extends Serializable>
        implements IGenericJpaService<T, E> {

    protected IGenericJapDAO<T, E> dao;

    public GenericJpaService(IGenericJapDAO<T, E> dao) {
        this.dao = dao;
    }


    @Override
    public T cadastrar(T entity) throws DAOException, TipoChaveNaoEncontradaException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws DAOException, TipoChaveNaoEncontradaException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, DAOException, TableException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }


}
