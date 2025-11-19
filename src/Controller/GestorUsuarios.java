/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;

/**
 *
 * @author Usuario
 */
public class GestorUsuarios {
    private Usuario[] usuarios;
    private int count;

    public GestorUsuarios() {
        this.usuarios = new Usuario[20];
        this.count = 0;
    }
    
    public void agregarUsuario(String pUsername, String pPassword, String pRole){
        this.usuarios[this.count] = new Usuario(pUsername, pPassword, pRole);
        this.count++;
    }
    
    public Usuario validarUsuario(String pUsername, String pPassword){
        for(int i = 0; i < this.count; i++){
            if(this.usuarios[i].getUsername().equals(pUsername) && this.usuarios[i].getPassword().equals(pPassword)){
                return this.usuarios[i];
            }
        }
        return null;
    }
}
