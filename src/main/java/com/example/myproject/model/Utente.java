package com.example.myproject.model;

public class Utente {
    private int id;
    private String username;
    private String password;
    private String email;
    private Ruolo ruolo;

    public Utente() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Ruolo getRole() {

        return ruolo;
    }

    public void setRole(Ruolo ruolo) {

        this.ruolo = ruolo;
    }


}