/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakartaeeudbl.bienvenu.beans;

/**
 *
 * @author REAL TIME
 */

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("lieuBean")
@ViewScoped
public class LieuBean implements Serializable {

    private String nom;
    private String description;
    private double latitude;
    private double longitude;
    private List<Lieu> listeLieux = new ArrayList<>();
    private Lieu dernierLieu; // Dernier lieu ajouté

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<Lieu> getListeLieux() {
        return listeLieux;
    }

    public Lieu getDernierLieu() {
        return dernierLieu;
    }

    // Méthode pour enregistrer le lieu
    public String enregistrerLieu() {
        Lieu lieu = new Lieu(nom, description, latitude, longitude);
        listeLieux.add(lieu);
        dernierLieu = lieu; // Mettre à jour le dernier lieu ajouté

        // Réinitialiser les champs
        nom = "";
        description = "";
        latitude = 0.0;
        longitude = 0.0;

        return null; // Rester sur la même page
    }
}
