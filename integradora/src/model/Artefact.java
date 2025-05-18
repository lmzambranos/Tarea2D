package model;

public class Artefact extends Deliverable {
    private ArtefactType artefactType;

    public Artefact(PhaseLifeCicle phaseLifeCycle, ArtefactType artefactType) {
        super(phaseLifeCycle);
        this.artefactType = artefactType;
    }

    public ArtefactType getArtefactType() {
        return artefactType;
    }

    public void setArtefactType(ArtefactType artefactType) {
        this.artefactType = artefactType;
    }

    

    
}
