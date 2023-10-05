public class categorias{
    private boolean clientes;
    private boolean seguimiento;
    private boolean plantas;
    private boolean interaciones;

    public interaciones (boolean clientes, boolean seguimiento, boolean plantas, boolean inteaciones){
        this.clientes=clientes;
        this.seguimiento=seguimiento;
        this.plantas=plantas;
        this.interaciones=interaciones;
    }


     /*get */
    public boolean getclientes(){
        return clientes;
    }
    public boolean getseguimiento(){
        return seguimiento;
    }

    public boolean getplantas(){
        return plantas;
    }
    public boolean getinteraciones(){
        return interaciones;
    }

    public void setclientes (boolean clientes, boolean seguimiento, boolean plantas, boolean inteaciones){
       
        this.clientes=clientes;
        this.seguimiento=seguimiento;
        this.plantas=plantas;
        this.interaciones=interaciones;
    }

    
}