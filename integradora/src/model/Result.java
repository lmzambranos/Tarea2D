package model;

public class Result {
    private String id; //IDproyecto - IDResultado - IDGrupo
    private String date;
    private String group;


    public Result(String id, String date, String group) {
        this.id = id;
        this.date = date;
        this.group = group;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getGroup() {
        return group;
    }


    public void setGroup(String group) {
        this.group = group;
    }

    

 
}
