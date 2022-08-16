/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author faroe
 */
public class BllCategoria {
    
    //classe business logic layer
    private DaoCategoria daoCategoria;

    public BllCategoria() {
        this.daoCategoria = new DaoCategoria();
    }
    
    public boolean modify(Categoria categoria){
    
        if(categoria==null)
            return false;
        
        if(categoria.getId()==0)
            return daoCategoria.insert(categoria);
        else
            return daoCategoria.update(categoria);
       
    }
}
