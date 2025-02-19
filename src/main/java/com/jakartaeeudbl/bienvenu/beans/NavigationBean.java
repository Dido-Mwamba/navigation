/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakartaeeudbl.bienvenu.beans;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("NavigationBean")
@ViewScoped
public class NavigationBean implements Serializable {

    public String ajouter() {
        // Logique pour ajouter
        return "lieu";
    }

    public String visiter() {
        // Logique pour visiter
        return "visiter";
    }

    public String voirApropos() {
        // Logique pour naviguer vers la page À propos
        return "a_propos";
    }
}
