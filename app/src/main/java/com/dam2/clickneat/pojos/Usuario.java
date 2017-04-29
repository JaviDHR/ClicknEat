package com.dam2.clickneat.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ferna on 27/04/2017.
 */

public class Usuario extends BaseClass {

    @Expose
    private int id;
    @Expose
    private String username;
    @Expose
    private String password;
    @Expose
    private String email;
    @Expose
    private boolean enabled;
    @Expose
    private int facebook_id;
    @Expose
    private String facebook_access_token;
    @Expose
    private int google_id;
    @Expose
    private String google_access_token;
    @Expose
    private PerfilUsuario perfil;
    @Expose
    private ArrayList<Token> tokens;
    @Expose
    private ArrayList<Publicacion> publicaciones;
    @Expose
    private ArrayList<Reserva> reservas;
    @Expose
    private ArrayList<Conversacion> conversacionesIniciadas;
    @Expose
    private ArrayList<Conversacion> conversacionesRecibidas;
    @Expose
    private ArrayList<Mensaje> mensajes;

    // Constructor generico
    public Usuario() {

        super(Usuario.class, new TypeToken<List<Usuario>>(){});

        this.id                         = 0;
        this.username                   = "";
        this.password                   = "";
        this.email                      = "";
        this.enabled                    = false;
        this.facebook_id                = 0;
        this.facebook_access_token      = "";
        this.google_id                  = 0;
        this.google_access_token        = "";
        this.perfil                     = new PerfilUsuario();
        this.tokens                     = new ArrayList();
        this.publicaciones              = new ArrayList();
        this.reservas                   = new ArrayList();
        this.conversacionesIniciadas    = new ArrayList();
        this.conversacionesRecibidas    = new ArrayList();
        this.mensajes                   = new ArrayList();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
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

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled(){
        return this.enabled;
    }

    public int getFacebook_id() {
        return facebook_id;
    }

    public void setFacebook_id(int facebook_id) {
        this.facebook_id = facebook_id;
    }

    public String getFacebook_access_token() {
        return facebook_access_token;
    }

    public void setFacebook_access_token(String facebook_access_token) {
        this.facebook_access_token = facebook_access_token;
    }

    public int getGoogle_id() {
        return google_id;
    }

    public void setGoogle_id(int google_id) {
        this.google_id = google_id;
    }

    public String getGoogle_access_token() {
        return google_access_token;
    }

    public void setGoogle_access_token(String google_access_token) {
        this.google_access_token = google_access_token;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public void setTokens(ArrayList<Token> tokens) {
        this.tokens = tokens;
    }

    public void addToken(Token token) {
        this.tokens.add(token);
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void addPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public ArrayList<Conversacion> getConversacionesIniciadas() {
        return conversacionesIniciadas;
    }

    public void setConversacionesIniciadas(ArrayList<Conversacion> conversacionesIniciadas) {
        this.conversacionesIniciadas = conversacionesIniciadas;
    }

    public void addConversacionIniciada(Conversacion conversacion){
        this.conversacionesIniciadas.add(conversacion);
    }

    public ArrayList<Conversacion> getConversacionesRecibidas() {
        return conversacionesRecibidas;
    }

    public void setConversacionesRecibidas(ArrayList<Conversacion> conversacionesRecibidas) {
        this.conversacionesRecibidas = conversacionesRecibidas;
    }

    public void addConversacionRecibida(Conversacion conversacion) {
        this.conversacionesRecibidas.add(conversacion);
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public void addMensaje(Mensaje mensaje) {
        this.mensajes.add(mensaje);
    }

}
