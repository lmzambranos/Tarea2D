// Removed package declaration to match the expected package
package model;
public class Deliverable {

    private PhaseLifeCicle phaseLifeCycle;



    public Deliverable(PhaseLifeCicle phaseLifeCycle) {
     this.phaseLifeCycle = phaseLifeCycle;
    }

   public PhaseLifeCicle getPhaseLifeCycle() {
    return phaseLifeCycle;
   }

   public void setPhaseLifeCycle(PhaseLifeCicle phaseLifeCycle) {
    this.phaseLifeCycle = phaseLifeCycle;
   }

   
}
