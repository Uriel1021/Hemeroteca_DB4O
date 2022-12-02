public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String correo;
    private String contrasenia;
    private String tipoUsuario;
    private int status;
    private String adscripcion;

    public Usuario() {
    }

    public int getIdUsuario() {return idUsuario;}
    public String getNombre() {return nombre;}
    public String getApPaterno() {return apPaterno;}
    public String getApMaterno() {return apMaterno;}
    public String getCorreo() {return correo;}
    public String getContrasenia() {return contrasenia;}
    public String getTipoUsuario() {return tipoUsuario;}

    public int getStatus() {return status;}
    public String getAdscripcion() {return adscripcion;}

    public Usuario(int idUsuario, String nombre, String apPaterno, String apMaterno, String correo, String contrasenia, String tipoUsuario, int status, String adscripcion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.tipoUsuario = tipoUsuario;
        this.status = status;
        this.adscripcion = adscripcion;
    }
}
