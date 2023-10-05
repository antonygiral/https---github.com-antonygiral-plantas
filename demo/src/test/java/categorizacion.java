public class inteaciones {
    private boolean clientes;
    private boolean chat;
    private boolean tiket;


    public interaciones (boolean clientes, boolean chat, boolean tiket ){
        this.clientes=clientes;
        this.chat=chat;
        this.tiket=tiket;
    
    }


     /*get */
     public boolean getclientes(){
        return clientes;
    }
    public boolean getchat(){
        return chat;
    }

    public boolean getiket(){
        return tiket;
    }

    public void setclientes (boolean clientes, boolean chat, boolean tiket){

        this.clientes=clientes;
        this.chat=chat;
        this.tiket=tiket;
    }

    
}