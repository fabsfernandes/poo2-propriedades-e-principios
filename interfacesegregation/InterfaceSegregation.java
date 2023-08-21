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
         * Crow e Penguin são classes que implementam a interface Bird
         */
        interfacesegregation.incorrect.Crow crow = new interfacesegregation.incorrect.Crow();
        interfacesegregation.incorrect.Penguin penguin = new interfacesegregation.incorrect.Penguin();
        
        /**
         * Os métodos da interface funcionam bem para corvos (Crow), já que eles podem comer, dormir e voar
         */
        crow.eat();
        crow.sleep();
        crow.fly();
        
         /**
         * Os métodos comer (eat) e dormir (sleep) da interface funcionam bem para pinguins (Penguin).
         * Porém, não há uso do método voar (fly) para pinguins. Entretanto, aqui há a obrigação de se implementar esse método
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
