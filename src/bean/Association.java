/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author PC
 */
public class Association {

    private long id;
    private String reference;
    private String nom;
    private String categorie;
    private double montantAdhesion;

    public Association() {
    }

    public Association(long id) {
        this.id = id;
    }

    public Association(long id, String reference) {
        this.id = id;
        this.reference = reference;
    }

    public Association(long id, String reference, String nom) {
        this.id = id;
        this.reference = reference;
        this.nom = nom;
    }

    public Association(long id, String reference, String nom, String categorie) {
        this.id = id;
        this.reference = reference;
        this.nom = nom;
        this.categorie = categorie;
    }

    public Association(long id, String reference, String nom, String categorie, double montantAdhesion) {
        this.id = id;
        this.reference = reference;
        this.nom = nom;
        this.categorie = categorie;
        this.montantAdhesion = montantAdhesion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getMontantAdhesion() {
        return montantAdhesion;
    }

    public void setMontantAdhesion(double montantAdhesion) {
        this.montantAdhesion = montantAdhesion;
    }

    @Override
    public String toString() {
        return "Association{" + "id=" + id + ", reference=" + reference + ", nom=" + nom + ", categorie=" + categorie + ", montantAdhesion=" + montantAdhesion + '}';
    }

}
