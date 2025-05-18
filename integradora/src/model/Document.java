package model;

public class Document extends Deliverable {
    private String documentLink;

    public Document(PhaseLifeCicle phaseLifeCycle, String documentLink) {
        super(phaseLifeCycle);
        this.documentLink = documentLink;
    }

    public String getDocumentLink() {
        return documentLink;
    }

    public void setDocumentLink(String documentLink) {
        this.documentLink = documentLink;
    }

    
    
}
