/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.DAO.JPA;

import br.com.alexandreG.DAO.GENERIC.JPA.GenericJpaDB3DAO;
import br.com.alexandreG.DOMAIN.JPA.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

}