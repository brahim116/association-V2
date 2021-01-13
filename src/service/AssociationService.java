/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Association;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class AssociationService {

    public int ouvrir(String reference, long id, String nom, String categorie, double montantAdhesion, List<Association> associations) {
        if (id < 0) {
            return -1;

        }
        int indice = findIndexById(id, associations);
        if (indice != -1) {
            return -2;
        }
        else{
            Association a = new Association(id, reference, nom, categorie, montantAdhesion);
            associations.add(a);
        }
        return  1;
        
    }

    public int findIndexById(long id, List<Association> associations) {
        for (int i = 0; i < associations.size(); i++) {
            Association a = associations.get(i);
            if (a.getId() == id) {
                return i;
            }
        }
        return -1;

    }
    
      public Association findByReference(String reference, List<Association> associations) {
        for (int i = 0; i < associations.size(); i++) {
            Association a = associations.get(i);
            if (a.getReference().equals(reference)) {
                return a;
            }
        }
        return null;

    }
}
