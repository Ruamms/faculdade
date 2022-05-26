package Modelo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Acesso {

    private String dataAcesso, horaAcesso, nomeUsuario;
    private int id;

    public Acesso() {

        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        dataAcesso = sdf2.format(new Date());
        horaAcesso = sdf.format(new Date().getTime());
    }

    public String getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(String dataAcesso) {
        this.dataAcesso = dataAcesso;
    }

    public String getHoraAcesso() {
        return horaAcesso;
    }

    public void setHoraAcesso(String horaAcesso) {
        this.horaAcesso = horaAcesso;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
