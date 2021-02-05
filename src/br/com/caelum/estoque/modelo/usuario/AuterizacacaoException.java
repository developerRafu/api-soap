package br.com.caelum.estoque.modelo.usuario;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault", messageName="AutorizacaoFault")
public class AuterizacacaoException extends Exception {

    private static final long serialVersionUID = 1L;

    public AuterizacacaoException(String msg) {
        super(msg);
    }

    //novo
    public String getFaultInfo() {
        return "Token invalido";
    }

}
