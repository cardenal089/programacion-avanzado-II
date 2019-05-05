package mjgarcia.SaludSpringBoot.Service;

import mjgarcia.SaludSpringBoot.Entity.SaludEntity;
import mjgarcia.SaludSpringBoot.DTO.SaludDTO;
import org.springframework.stereotype.Service;

@Service
public class SaludService {

    public double calcularIMC(double peso, double estatura) {
        SaludEntity saludEntity=new SaludEntity();
        saludEntity.setPeso(peso);
        saludEntity.setEstatura(estatura);
        
        saludEntity.CalculaIMC();

        SaludDTO dtosalud= new SaludDTO();
        dtosalud=EntitySaludToDtoSalud(saludEntity);
 
        return dtosalud.getIndice();
    }
    
    public String recomendacionPeso(String peso1){

        SaludEntity saludEntity=new SaludEntity();
        saludEntity.setPeso1(peso1);
        saludEntity.RecomendacionPeso();
        
        SaludDTO consultapeso=new SaludDTO();
        consultapeso=EntitySaludToDtoConsultaPeso(saludEntity);
        
        return consultapeso.getRespeso();
    }
    public String recomiendaComida(){
        SaludEntity saludEntity=new SaludEntity();
        saludEntity.RecomiendaComida();
        SaludDTO consultacomida=new SaludDTO();
        consultacomida=EntitySaludToDtoConsultaComida(saludEntity);
        
        return consultacomida.getRescomida();
        
    }
    public String recomiendaEjercicio(){
        SaludEntity saludEntity=new SaludEntity();
        saludEntity.RecomiendaEjercicio();
        SaludDTO consultaejercicio=new SaludDTO();
        consultaejercicio=EntitySaludToDtoConsultaEjercicio(saludEntity);
        return consultaejercicio.getResejercicio();
    }
    


    
    public SaludDTO EntitySaludToDtoSalud(SaludEntity saludEntity){
        SaludDTO dtosalud=new SaludDTO();
        dtosalud.setPeso(saludEntity.getPeso());
        dtosalud.setEstatura(saludEntity.getEstatura());
        dtosalud.setIndice(saludEntity.getIndice());
        return dtosalud;
        
    }
    
        public SaludDTO EntitySaludToDtoConsultaPeso(SaludEntity saludEntity){
            SaludDTO consultapeso=new SaludDTO();
            consultapeso.setPeso(saludEntity.getPeso());
            consultapeso.setRespeso(saludEntity.getRespeso());
            return consultapeso;
        
        }
        
        public SaludDTO EntitySaludToDtoConsultaComida(SaludEntity saludEntity){
            SaludDTO consultacomida=new SaludDTO();
            consultacomida.setRescomida(saludEntity.getRescomida());
            return consultacomida;
        }
        public SaludDTO EntitySaludToDtoConsultaEjercicio(SaludEntity saludEntity) {
            SaludDTO consultaejercicio=new SaludDTO();
            consultaejercicio.setResejercicio(saludEntity.getResejercicio());
            return consultaejercicio;
    }
                
              
}
