/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.DAO.JPA;

import br.com.alexandreG.DAO.GENERIC.JPA.GenericJpaDAO;
import br.com.alexandreG.DOMAIN.JPA.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO<C> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class, "Postgre1");
    }

}
