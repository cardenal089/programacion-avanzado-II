
package mjgarcia.SaludSpringBoot.Controller;

import mjgarcia.SaludSpringBoot.Service.SaludService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/consultaimc")

public class SaludController {
    SaludService saludService=new SaludService();
    
    @GetMapping("/imc")
    public ResponseEntity<?> consultaimc(@RequestParam("peso") double peso, @RequestParam("estatura") double estatura){
        double imc;
        
        imc=saludService.calcularIMC(peso,estatura);

            return ResponseEntity.ok("El índice de masa corporal es: "+imc);
            
        
    }
    
    @GetMapping("/RecomendacionPeso")
    public ResponseEntity<?> consultaPeso(@RequestParam("peso1") String peso1){
        String respeso;
        respeso=saludService.recomendacionPeso(peso1);
        
        return ResponseEntity.ok(respeso);
    
    }
    
    @GetMapping("/RecomiendacionComida")
    public ResponseEntity consultaComida(){
        String rescomida;
        rescomida=saludService.recomiendaComida();
        return ResponseEntity.ok(rescomida);
    }
    
    @GetMapping("/RecomiendaEjercicio")
    public ResponseEntity consultaEjercicio(){
        String resejercicio;
        resejercicio=saludService.recomiendaEjercicio();
        return ResponseEntity.ok(resejercicio);
    }

}
