/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.DAO.JPA;

import br.com.alexandreG.DAO.GENERIC.JPA.GenericJpaDAO;
import br.com.alexandreG.DOMAIN.JPA.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class, "Postgre1");
    }

}
