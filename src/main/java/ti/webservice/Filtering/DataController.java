/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.Filtering;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author PAVILON GAMING
 */
@Controller
public class DataController {
    @RequestMapping("/view/alattulis")
    @ResponseBody
    public List<Alattulis> getAlat(){
        
        List<Alattulis> atk = new ArrayList<>();
        
        AlattulisJpaController ctrl = new AlattulisJpaController();
        
        try {
            
            atk = ctrl.findAlattulisEntities();
            
        } catch (Exception e) {
        }
        
        return atk;
    }
    
}
