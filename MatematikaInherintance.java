/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class MatematikaInherintance {
    public static void main(String [] args){
        Matematika2 mtk = new Matematika();
        
        System.out.println("Hasil Pertambahan : "+ mtk.Pertambahan (20,10));
        System.out.println("Hasil Pengurangan : "+ mtk.Pengurangan(10,5));
        System.out.println("Hasil Pertambahan : "+ mtk.Perkalian (10,3));
        System.out.println("Hasil Pembagian : "+ mtk.Pembagian (21,2));
        System.out.println("Hasil modulus : "+ mtk.modulus(10,3));
    }
}
