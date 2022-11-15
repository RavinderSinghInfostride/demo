package PojoClasses;

import java.util.ArrayList;

public class Medications {
    private ArrayList<String> aceInhibitors;
    private ArrayList<Anticoagulants> anticoagulants;
    private ArrayList<BetaBlocker> betaBlockers;

    public ArrayList<String> getAceInhibitors() {
        return aceInhibitors;
    }

    public void setAceInhibitors(ArrayList<String> aceInhibitors) {
        this.aceInhibitors = aceInhibitors;
    }

    public ArrayList<Anticoagulants> getAnticoagulants() {
        return anticoagulants;
    }

    public void setAnticoagulants(ArrayList<Anticoagulants> anticoagulants) {
        this.anticoagulants = anticoagulants;
    }

    public ArrayList<BetaBlocker> getBetaBlockers() {
        return betaBlockers;
    }

    public void setBetaBlockers(ArrayList<BetaBlocker> betaBlockers) {
        this.betaBlockers = betaBlockers;
    }

    public Medications(ArrayList<String> aceInhibitors) {
        this.aceInhibitors = aceInhibitors;
    }

    @Override
    public String toString() {
        return "Medications{" +
                "aceInhibitors=" + this.aceInhibitors +
                ", anticoagulants=" + this.anticoagulants +
                ", betaBlockers=" + this.betaBlockers +
                '}';
    }
}
