/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaDia21;

/**
 *
 * @author MARIAEDUARDACOSTABAT
 */
import java.util.Scanner;

public class Feiticeiro implements Personagem {
    private int forca;
    private int vida;
    private String arma;

    public Feiticeiro(String nome) {
        this.arma = "Nenhuma";
    }

    @Override
    public void sortearForca() {
        System.out.println("\nAperte ENTER para sortear a Força...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Aguarda o ENTER
        this.forca = (int) (Math.random() * 6) + 7; // Sorteia entre 7 e 12
        System.out.println("Força sorteada: " + this.forca);
    }

    @Override
    public void sortearVida() {
        System.out.println("\nAperte ENTER para sortear a Vida...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Aguarda o ENTER
        this.vida = (int) (Math.random() * 6) + 18; // Sorteia entre 18 e 23
        System.out.println("Vida sorteada: " + this.vida);
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Força: " + this.forca);
        System.out.println("Vida: " + this.vida);
        System.out.println("Arma equipada: " + this.arma);
    }

    @Override
    public int getForca() {
        return this.forca;
    }

    @Override
    public int getVida() {
        return this.vida;
    }


    @Override
    public void receberDano(int dano) {
        this.vida -= dano;
    }

    @Override
    public void usarArma(String tipoArma) {
        if (tipoArma.equals("Varinha magica")) {
            this.forca += 6; // O arco aumenta a força em 6
            this.arma = "Varinha magica";
            System.out.println("Você se equipou com a Varinha magica! Força aumentada em 6.");
        }
    }

    @Override
    public void usarPoção(String tipoPoção) {
        if (tipoPoção.equals("Poção de Vida")) {
            this.vida += 10;
            System.out.println("Você usou uma Poção de Vida! Vida aumentada em 10.");
        } else if (tipoPoção.equals("Poção de Força")) {
            this.forca += 10;
            System.out.println("Você usou uma Poção de Força! Força aumentada em 10.");
        }
    }
}
 