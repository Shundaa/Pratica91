/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Pratica91 {
        public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        System.out.println(System.getProperty("os.name"));
        System.out.println(rt.availableProcessors());
        System.out.println(rt.totalMemory()/1048576);
        System.out.println(rt.freeMemory()/1048576);
        System.out.println(rt.maxMemory()/1048576);

    }
}
