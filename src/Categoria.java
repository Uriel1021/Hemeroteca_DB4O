public class Categoria {
    private int idTema;
    private String Tema;

    public Categoria() {
    }

    public int getIdTema() {return idTema;}
    public String getTema() {return Tema;}
    public Categoria(int idTema, String tema) {
        this.idTema = idTema;
        Tema = tema;
    }
}
