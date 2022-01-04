/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi5.mata.uang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author LENOVO
 */
@Controller
public class kalkulator {
    @ResponseBody
    @RequestMapping("/tambah")
    public String Tambah () {
        int a = 4;
        int b = 5;
        int c = a+b;
        
        return "hasil" + c;
    }
    
}
