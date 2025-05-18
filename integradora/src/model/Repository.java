package model;

public class Repository extends Deliverable {
    private String gitHubLink;
    private int numFiles;

    
    public Repository(PhaseLifeCicle phaseLifeCycle, String gitHubLink, int numFiles) {
        super(phaseLifeCycle);
        this.gitHubLink = gitHubLink;
        this.numFiles = numFiles;
    }


    public String getGitHubLink() {
        return gitHubLink;
    }


    public void setGitHubLink(String gitHubLink) {
        this.gitHubLink = gitHubLink;
    }


    public int getNumFiles() {
        return numFiles;
    }


    public void setNumFiles(int numFiles) {
        this.numFiles = numFiles;
    }

    
    
    

}
