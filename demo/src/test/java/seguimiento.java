public class seguimiento  {
    private String salud ;
    private String crecimiento;
    private String fechaRiego;
    private String abonado;
    private String transplante;
    private String otros;

    public seguimiento (String salud , String crecimiento, String fechaRiego, String abonado, String transplante, String otros) {
        this.salud =salud ;
        this.crecimiento = crecimiento;
        this.fechaRiego = fechaRiego;
        this.abonado = abonado;
        this.transplante = transplante;
        this.otros = otros;
    }
    
    /*get */
    public String getsalud (){
        return idoseguimiento s;
    }

    public String getcrecimiento(){
        return crecimiento;
    }

    public String getfechaRiego(){
        return fechaRiego;
    }

    public String getabonado(){
        return abonado
    public String gettransplante(){
        return transplante;
    }
    public String getfechaRiego(){
        return otros;
    }


    /*set */

    public void setseguimiento s(String salud , String crecimiento, String fechaRiego, String abonado, String transplante, String otros){
        this.salud =salud ;
        this.crecimiento = crecimiento;
        this.fechaRiego = fechaRiego;
        this.abonado = abonado;
        this.transplante = transplante;
        this.otros = otros;
    }
}
