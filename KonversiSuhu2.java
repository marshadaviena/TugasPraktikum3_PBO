/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class KonversiSuhu2 extends KonversiSuhu{
  public int fahrenheitToReamur(int fahrenheit); {
       int suhuCelcius = (fahrenheit - 32) * 5 / 9;
       return suhuCelcius * 4/ 5;
   }

}
