/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.TipoBibliografia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp1
 */
@Stateless
public class TipoBibliografiaFacade extends AbstractFacade<TipoBibliografia> {

    @PersistenceContext(unitName = "EXAMENPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoBibliografiaFacade() {
        super(TipoBibliografia.class);
    }
    
}
