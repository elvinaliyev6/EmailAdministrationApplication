/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailappl;

/**
 *
 * @author Elvin Aliyev
 */
public class EmailApp {
    public static void main(String[] args) {
        Email em1=new Email("John", "Smith");
        
        System.out.println(em1.showInfo());;
        
        
    }
}
