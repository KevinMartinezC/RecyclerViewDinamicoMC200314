package edu.udb.recyclerviewdinamico;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Turismo implements Serializable {
    private int id;
    @SerializedName("name")
    private String teamName;
    @SerializedName("Departamento")
    private String departamento;
    @SerializedName("img")
    private String imgLogo;
    @SerializedName("description")
    private String description;
    public Turismo(int id, String teamName,
                 String departamento, String imgLogo, String description) {
        this.setId(id);
        this.setTeamName(teamName);
        this.setDepartamento(departamento);
        this.setImgLogo(imgLogo);
        this.setDescription(description);
    }
    public Turismo(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getImgLogo() {
        return imgLogo;
    }
    public void setImgLogo(String imgLogo) {
        this.imgLogo = imgLogo;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
