/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Association;
import bean.InscriptionAssociation;
import java.util.List;
import java.util.ArrayList;
import service.AssociationService;

/**
 *
 * @author PC
 */
public class InscriptionAssociationService {

    public int ouvrir(String referenceAssociation, long id, String cin, long annee, List<InscriptionAssociation> InscriptionAssociations) {
        if (id < 0) {
            return -1;
        } else {
            InscriptionAssociation c = new InscriptionAssociation(id);
            c.setOuvert(true);
        }
        int indice2 = findByIdIndex2(id, InscriptionAssociations);
        if (indice2 != -1) {
            return -2;
        }

        int indice3 = findByCin(cin, InscriptionAssociations);
        if (indice3 != -1) {
            return -3;
        } else {
            InscriptionAssociation asso = new InscriptionAssociation(id, referenceAssociation, cin, annee);
            InscriptionAssociations.add(asso);
        }
        return 1;

    }

    public int findByIdIndex2(long id, List<InscriptionAssociation> InscriptionAssociations) {
        for (int i = 0; i < InscriptionAssociations.size(); i++) {
            InscriptionAssociation asso = InscriptionAssociations.get(i);
            if (asso.getId() == id) {
                return i;
            }
        }
        return -1;

    }

    public int findByCin(String cin, List<InscriptionAssociation> inscriptionAssociations) {
        for (int i = 0; i < inscriptionAssociations.size(); i++) {
            InscriptionAssociation asso = inscriptionAssociations.get(i);
            if (asso.getCin().equals(cin)) {
            } else {
                return i;
            }
        }
        return -1;

    }

    public int payee(List<InscriptionAssociation> inscriptionAssociations, List<Association> associations, String cin, String referenceAssociation, double montant, long annee) {
        AssociationService associationService = new AssociationService();

        Association association = associationService.findByReference(referenceAssociation, associations);
        if (association == null) {
            return -1;
        }
        InscriptionAssociation inscriptionAssociation = findByAnneeAndCinAndIdAssociaciation(annee, cin, referenceAssociation, inscriptionAssociations);

        if (inscriptionAssociation == null) {
            InscriptionAssociation myInscriptionAssociation = new InscriptionAssociation(1L, referenceAssociation, cin, montant, annee, cin, true, association.getMontantAdhesion());
            inscriptionAssociations.add(myInscriptionAssociation);
            return 1;
        } else if (association.getMontantAdhesion() < inscriptionAssociation.getMontantPayee() + montant) {
            return -2;
        } else {
            inscriptionAssociation.setMontantPayee(montant + inscriptionAssociation.getMontantPayee());
            return 2;
        }

    }

    private InscriptionAssociation findByAnneeAndCinAndIdAssociaciation(long annee, String cin, String referenceAssociation, List<InscriptionAssociation> inscriptionAssociations) {
        for (int i = 0; i < inscriptionAssociations.size(); i++) {
            InscriptionAssociation ins = inscriptionAssociations.get(i);
            if(ins.getAnnee()==annee && ins.getCin().equals(cin) && ins.getReferenceAssociation().equals(referenceAssociation)){
                return ins;
            }
            
        }
        return  null;
    }

}
