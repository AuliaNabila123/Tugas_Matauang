/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi5.mata.uang;

/**
 *
 * @author LENOVO
 */

public class konversiMataUang {
   public int getKonversiTHBkeIDR( int THB) {
       int IDR = THB*434;
       return IDR;    
    }
   
   public int getKonversiPENkeIDR( int PEN) {
       int IDR = PEN*355;
       return IDR;
   }
    
   public int getKonversiSARkeIDR( int SAR) {
       int IDR = SAR*380;
       return IDR;
   }
   
   public int getKonversiCNYkeIDR( int CNY) {
       int IDR = CNY*223;
       return IDR;
   }
   
   public int getKonversiINRkeIDR( int INR) {
       int IDR = INR*192;
       return IDR;
   }
   
   public int getKonversiJPYkeIDR( int JPY) {
       int IDR = JPY*125;
       return IDR;
   }
}
