/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesegregation.incorrect;

public class Penguin implements Bird{

    @Override
    public void eat() {
        
    }

    @Override
    public void sleep() {
        
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Nao suportado"); 
    }

    
}