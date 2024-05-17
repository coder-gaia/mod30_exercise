/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.DAO.GENERIC.JPA;

import br.com.alexandreG.DAO.Persistente;

import java.io.Serializable;

public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }

}
