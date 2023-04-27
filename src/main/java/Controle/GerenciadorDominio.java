package Controle;

import Dao.ConexaoHibernate;

public class GerenciadorDominio {

    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory();
    }

}
