/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author PC
 */
public class InscriptionAssociation {

    private long id;
    private String referenceAssociation;
    private String cin;
    private double montantPayee;
    private long annee;
    private String date;
    private boolean ouvert;
    private double montantAdhesion;

    public InscriptionAssociation() {
    }

    public InscriptionAssociation(long id) {
        this.id = id;
    }

    public InscriptionAssociation(long id, String referenceAssociation) {
        this.id = id;
        this.referenceAssociation = referenceAssociation;
    }

    public InscriptionAssociation(double montantPayee, double montantAdhesion, List<InscriptionAssociation> c) {
        this.montantPayee = montantPayee;

        this.montantAdhesion = montantAdhesion;
    }

    public InscriptionAssociation(long id, String referenceAssociation, String cin) {
        this.id = id;
        this.referenceAssociation = referenceAssociation;
        this.cin = cin;
    }

    public InscriptionAssociation(long id, String referenceAssociation, String cin, long annee) {
        this.id = id;
        this.referenceAssociation = referenceAssociation;
        this.cin = cin;
        this.annee = annee;
    }

    public InscriptionAssociation(long id, String referenceAssociation, String cin, double montantPayee) {
        this.id = id;
        this.referenceAssociation = referenceAssociation;
        this.cin = cin;
        this.montantPayee = montantPayee;

    }

    public InscriptionAssociation(long id, String referenceAssociation, String cin, double montantPayee, long annee) {
        this.id = id;
        this.referenceAssociation = referenceAssociation;
        this.cin = cin;
        this.montantPayee = montantPayee;
        this.annee = annee;
    }

    public InscriptionAssociation(long id, String referenceAssociation, String cin, double montantPayee, long annee, String Date) {
        this.id = id;
        this.referenceAssociation = referenceAssociation;
        this.cin = cin;
        this.montantPayee = montantPayee;
        this.annee = annee;
        this.date = Date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReferenceAssociation() {
        return referenceAssociation;
    }

    public void setReferenceAssociation(String referenceAssociation) {
        this.referenceAssociation = referenceAssociation;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public double getMontantPayee() {
        return montantPayee;
    }

    public void setMontantPayee(double montantPayee) {
        this.montantPayee = montantPayee;
    }

    public long getAnnee() {
        return annee;
    }

    public void setAnnee(long annee) {
        this.annee = annee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public double getMontantAdhesion() {
        return montantAdhesion;
    }

    public void setMontantAdhesion(double montantAdhesion) {
        this.montantAdhesion = montantAdhesion;
    }

    public InscriptionAssociation(long id, String referenceAssociation, String cin, double montantPayee, long annee, String Date, boolean ouvert, double montantAdhesion) {
        this.id = id;
        this.referenceAssociation = referenceAssociation;
        this.cin = cin;
        this.montantPayee = montantPayee;
        this.annee = annee;
        this.date = Date;
        this.ouvert = ouvert;
        this.montantAdhesion = montantAdhesion;
    }

    @Override
    public String toString() {
        return "InscriptionAssociation{" + "id=" + id + ", referenceAssociation=" + referenceAssociation + ", cin=" + cin + ", montantPayee=" + montantPayee + ", annee=" + annee + ", date=" + date + ", ouvert=" + ouvert + ", montantAdhesion=" + montantAdhesion + '}';
    }

}
