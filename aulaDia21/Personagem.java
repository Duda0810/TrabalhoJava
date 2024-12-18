/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aulaDia21;

/**
 *
 * @author MARIAEDUARDACOSTABAT
 */
public interface Personagem {
    void sortearForca();
    void sortearVida();
    void mostrarAtributos();
    int getForca();
    int getVida();
    void receberDano(int dano);
    void usarArma(String tipoArma);
    void usarPoção(String tipoPoção);
}
