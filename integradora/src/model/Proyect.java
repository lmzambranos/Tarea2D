package model;

import java.util.ArrayList;

public class Proyect {
    private String id;
    private int semester;
    private String name;
    private String description;
    private ArrayList<String> keyWords;
    private String statementLink;
    private String company;

    public Proyect(String id, int semester, String name, String description, ArrayList<String> keyWords,
            String statementLink) {
        this.id = id;
        this.semester = semester;
        this.name = name;
        this.description = description;
        this.keyWords = keyWords;
        this.statementLink = statementLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(ArrayList<String> keyWords) {
        this.keyWords = keyWords;
    }

    public String getStatementLink() {
        return statementLink;
    }

    public void setStatementLink(String statementLink) {
        this.statementLink = statementLink;
    }
}
