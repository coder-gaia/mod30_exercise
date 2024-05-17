/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.DAO.JPA;

import br.com.alexandreG.DAO.GENERIC.JPA.GenericJpaDB2DAO;
import br.com.alexandreG.DOMAIN.JPA.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super();
    }

}
