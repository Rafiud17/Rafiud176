/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author hp
 */
public class tugas {
    public static void main(String[] args) {
        String objSatu = new String();
        String objDua  = new String();
        
        boolean bolSatu = objSatu.equals(objDua);
        boolean bolDua  = (objSatu == objDua);
        
        System.out.println("Tugas perbedaan Equals dan '==' ");
        System.out.println(" ");
        
        
        System.out.println("apabila Menggunakan method equal():" + bolSatu);
        System.out.println("Menggunakan operator == : " + bolDua);
    }

}


