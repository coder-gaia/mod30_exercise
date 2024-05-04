/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.SERVICES;

import br.com.alexandreG.DAO.IProdutoDAO;
import br.com.alexandreG.DOMAIN.Produto;
import br.com.alexandreG.SERVICES.GENERICS.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }
}
