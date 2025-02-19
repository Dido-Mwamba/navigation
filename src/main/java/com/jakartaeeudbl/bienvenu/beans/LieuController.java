/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakartaeeudbl.bienvenu.beans;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import jakarta.enterprise.context.RequestScoped;

@Named
@ViewScoped
public class LieuController implements Serializable {

    private String nom;
    private String description;
    private double latitude;
    private double longitude;

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

    // Méthode pour enregistrer le lieu
    public String enregistrerLieu() {
        // Logique pour enregistrer le lieu
        System.out.println("Lieu enregistré: " + nom + ", " + description + ", " + latitude + ", " + longitude);
        return "lieu"; // Rediriger vers la page de confirmation ou autre
        
    }
}
