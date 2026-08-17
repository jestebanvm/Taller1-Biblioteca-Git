package com.mycompany.taller1.biblioteca.git;

public class Material {
    private String code;
    private String title;
    private String yearpublication;
    public Material(String code,String title,String aniopublic){
        this.code=code;
        this.title=title;
        this.yearpublication=yearpublication;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getyearPublication(){
        return yearpublication;
    }
    public void setYearpublication(String yearpublication) {
        this.yearpublication = yearpublication;
    }
}
