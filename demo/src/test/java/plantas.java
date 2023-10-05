public class Planta {
    private int idplanta;
    private String nombrecomun;
    private String nombrecientifico;
    private String tipo;
    private String requerimientosluz;
    private String requerimientosagua;

    public Planta(int idplanta, String nombrecomun, String nombrecientifico, String tipo, String requerimientosluz, String requerimientosagua) {
        this.idplanta=idplanta;
        this.nombrecomun = nombrecomun;
        this.nombrecientifico = nombrecientifico;
        this.tipo = tipo;
        this.requerimientosluz = requerimientosluz;
        this.requerimientosagua = requerimientosagua;
    }
    
    /*get */
    public int getidplanta(){
        return idoplantas;
    }

    public String getnombrecomun(){
        return nombrecomun;
    }

    public String getnombrecientifico(){
        return nombrecientifico;
    }

    public String gettipo(){
        return tipo
    public String getrequerimientosluz(){
        return requerimientosluz;
    }
    public String getnombrecientifico(){
        return requerimientosagua;
    }


    /*set */

    public void setplantas(int idplanta, String nombrecomun, String nombrecientifico, String tipo, String requerimientosluz, String requerimientosagua){
        this.idplanta=idplanta;
        this.nombrecomun = nombrecomun;
        this.nombrecientifico = nombrecientifico;
        this.tipo = tipo;
        this.requerimientosluz = requerimientosluz;
        this.requerimientosagua = requerimientosagua;
    }
}
