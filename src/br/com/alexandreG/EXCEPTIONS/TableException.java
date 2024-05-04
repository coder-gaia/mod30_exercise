/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.EXCEPTIONS;

import java.io.Serial;

public class TableException extends Exception {

    @Serial
    private static final long serialVersionUID = -7509649433607067138L;

    public TableException(String msg) {
        super(msg);
    }

}
