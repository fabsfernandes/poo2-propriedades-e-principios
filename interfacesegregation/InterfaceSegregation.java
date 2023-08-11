package interfacesegregation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabiola
 */
public class InterfaceSegregation {
    
    public InterfaceSegregation() {
        doIncorrectImplementation();
        doCorrectImplementation();
    }
    

    public void doIncorrectImplementation() {
        /**
         * Crow e Penguin classes implementam a interface Bird
         */
        interfacesegregation.incorrect.Crow crow = new interfacesegregation.incorrect.Crow();
        interfacesegregation.incorrect.Penguin penguin = new interfacesegregation.incorrect.Penguin();
        
        /**
         * The implemented methods work fine with Crow as a crow can eat, sleep and fly
         */
        crow.eat();
        crow.sleep();
        crow.fly();
        
         /**
         * The implemented methods  do not work with Penguin as a penguin can eat, sleep but cannot fly.
         * There is no use fly() for the Penguin, still it is forced to implement the fly()
         */
        penguin.eat();
        penguin.sleep();
        penguin.fly();
    }
    
    public void doCorrectImplementation() {
        /**
         * Adicione aqui seu código refatorado com referências a métodos e classes contidas no pacote openclosed.correct
         */
    }
    
    public static void main(String [] args) {
        InterfaceSegregation is = new InterfaceSegregation();
    }
    
}
