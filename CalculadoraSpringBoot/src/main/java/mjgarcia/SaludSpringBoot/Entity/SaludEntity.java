package mjgarcia.SaludSpringBoot.Entity;

import java.util.Calendar;
public class SaludEntity {
    private double peso;
    private double estatura;
    private double indice;
    private String respeso;
    private String resejercicio;
    private String rescomida;
    private String peso1;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public String getRespeso() {
        return respeso;
    }

    public void setRespeso(String respeso) {
        this.respeso = respeso;
    }

    public String getResejercicio() {
        return resejercicio;
    }

    public void setResejercicio(String resejercicio) {
        this.resejercicio = resejercicio;
    }

    

    public String getRescomida() {
        return rescomida;
    }

    public void setRescomida(String rescomida) {
        this.rescomida = rescomida;
    }

    public String getPeso1() {
        return peso1;
    }

    public void setPeso1(String peso1) {
        this.peso1 = peso1;
    }
  
    public void  CalculaIMC(){
        indice= peso/(estatura*estatura);
        
    }
    
    public void RecomendacionPeso(){
        double operacion=Double.parseDouble(peso1);

        if (operacion<50) {
            respeso="\"Debe hacer una dieta hipercalórica, es decir, debe pautarse una ingesta de \"\n" +
"           + \"calorías superior al gasto calórico de la persona, consumir frutas frescas, frutas desecadas,\"\n" +
"           + \" frutos secos, aceite de oliva virgen extra\"";
        } else if (operacion>=50 && operacion<70) {
            respeso="Debe tomar jugos naturales, comer al menos 5 raciones de fruta diario, incluir cereales y proteínas para mantener el peso";
        } else if (operacion>=70 && operacion<90) {
            respeso="Debe tomar abundante agua durante el día, comer muchas frutas y verduras, evitar las grasas y los dulces en exceso";
        } else {
            respeso="Debe tomar abundante agua durante el día, comer muchas frutas y verduras, no comer grasas ni dulces, lo más recomendable es visitar el médico para iniciar un tratamiento";
        }

    }
    
    public void RecomiendaComida(){
        
        if(Calendar.DAY_OF_WEEK==1){
            rescomida="hoy lunes debe comer frijoles";
        }else if(Calendar.DAY_OF_WEEK==2){
            rescomida="Hoy martes debe comer arroz chino";
        }else if(Calendar.DAY_OF_WEEK==3){
            rescomida="Hoy miercoles debe comer sólo vegetales";
        }else if(Calendar.DAY_OF_WEEK==4){
            rescomida="Hoy jueves debe comer espaguetis";
        }else if(Calendar.DAY_OF_WEEK==5){
            rescomida="Hoy viernes debe comer frutas";
        }else if(Calendar.DAY_OF_WEEK==6){
            rescomida="Hoy sábado debe comer lentejas";
        }else if(Calendar.DAY_OF_WEEK==7){
            rescomida="Hoy domingo debe comer helado";
        }
    }
    
    public void RecomiendaEjercicio(){
        if(Calendar.DAY_OF_WEEK==1){
            resejercicio="hoy lunes debe jugar futbol";
        }else if(Calendar.DAY_OF_WEEK==2){
            resejercicio="Hoy martes debe jugar tennis";
        }else if(Calendar.DAY_OF_WEEK==3){
            resejercicio="Hoy miercoles debe hacer cardio";
        }else if(Calendar.DAY_OF_WEEK==4){
            resejercicio="Hoy jueves debe trotar";
        }else if(Calendar.DAY_OF_WEEK==5){
            resejercicio="Hoy viernes debe correr";
        }else if(Calendar.DAY_OF_WEEK==6){
            resejercicio="Hoy sábado debe jugar tennis";
        }else if(Calendar.DAY_OF_WEEK==7){
            resejercicio="Hoy domingo debe jugar tennis";
        }
    }
       
}
