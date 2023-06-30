package code;
public abstract class Asiento {
    private boolean status;
    private int serie;
    private String tipo;
    public Asiento(){
    }
    public void setSerie(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public boolean getStatus(){
        return status;
    }
    public void cambiarStatus(){
        if(status){
            status = false;
        }else {
            status = true;
        }
    }
    public abstract String getTipo();

}
