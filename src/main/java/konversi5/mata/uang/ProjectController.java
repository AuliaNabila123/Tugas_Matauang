/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi5.mata.uang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import konversi5.mata.uang.konversiMataUang;
        
/**
 *
 * @author LENOVO
 */

@Controller
@ResponseBody
public class ProjectController {
    konversiMataUang logic=new konversiMataUang();
    
    @RequestMapping("/THBkeIDR")
    public String tampilkanMataUang() {
        int KonversiTHBkeIDR = logic.getKonversiTHBkeIDR(50);
        String view = "Hasil Konversi Baht ke Rupiah = " + KonversiTHBkeIDR;
        
        return view;
    }
    
    @RequestMapping("/PENkeIDR")
    public String tampilkanmataUang() {
        int KonversiPENkeIDR = logic.getKonversiPENkeIDR(50);
        String view = "Hasil Konversi Peru ke Rupiah = " + KonversiPENkeIDR;
        
        return view;
    }
    
    @RequestMapping("/SARkeIDR")
    public String tampilkanmatauang() {
        int KonversiSARkeIDR = logic.getKonversiSARkeIDR(50);
        String view = "Hasil Konversi Riyal Saudi ke Rupiah = " + KonversiSARkeIDR;
        
        return view;
    }
    
    @RequestMapping("/CNYkeIDR")
    public String Tampilkanmatauang() {
        int KonversiCNYkeIDR = logic.getKonversiCNYkeIDR(50);
        String view = "Hasil Konversi Riyal Chinese Yuan ke Rupiah = " + KonversiCNYkeIDR;
        
        return view;
    }
    
    @RequestMapping("/INRkeIDR")
    public String TampilkanMataUang() {
        int KonversiINRkeIDR = logic.getKonversiINRkeIDR(50);
        String view = "Hasil Konversi Riyal Rupee India ke Rupiah = " + KonversiINRkeIDR;
        
        return view;
    }
    
    @RequestMapping("/JPYkeIDR")
    public String TampilkanataUang() {
        int KonversiJPYkeIDR = logic.getKonversiJPYkeIDR(50);
        String view = "Hasil Konversi Riyal Yen Jepang ke Rupiah = " + KonversiJPYkeIDR;
        
        return view;
    }
}
