/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaDia21;

/**
 *
 * @author MARIAEDUARDACOSTABAT
 */
import java.util.Random;

public class Dados {
    private static Random random = new Random();

    public static int rolarDado(int faces) {
        return random.nextInt(faces) + 1;
    }
}