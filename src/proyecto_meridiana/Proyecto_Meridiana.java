/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_meridiana;

/**
 *
 * @author JHPAT<sanhool@live.com.mx>
 */
public class Proyecto_Meridiana {

    public static void ingredientes_extra(){
   
        System.out.println("***Ingredientes Extra***");
        System.out.println(" ");
        System.out.println("Champiñones == 1");
        System.out.println("Tocino ======= 2");
        System.out.println("Chorizo ====== 3");
        System.out.println("Piña ========= 4");
        System.out.println("Aceitunas ==== 5");
        System.out.println(" ");
      
        
        
}

    public static void pizzas(){
        System.out.println("***Especialidades***");
        System.out.println(" ");
        System.out.println("Mixta ======== 1");
        System.out.println("Hawaiana ===== 2");
        System.out.println("Mexicana ===== 3");
        System.out.println("Vegetariana == 4");
        System.out.println("Atún ========= 5");
        System.out.println("Camarones ==== 6");
        System.out.println("Especial ===== 7");
        System.out.println("Pizza 4 Ingredientes ===== 8");
        System.out.println(" ");
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu ventana_1 = new Menu();
        ventana_1.setVisible(true);
        ingredientes_extra();
        pizzas();
    }
    
}
