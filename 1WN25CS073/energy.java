abstract class EnergySource {
    String sourceName;
    double energyGenerated;

    EnergySource(String sourceName, double energyGenerated) {
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Energy Source: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
        System.out.println("---------------------------");
    }
}

class SolarEnergy extends EnergySource {

    SolarEnergy(double energyGenerated) {
        super("Solar Energy", energyGenerated);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {

    WindEnergy(double energyGenerated) {
        super("Wind Energy", energyGenerated);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

class Main {
    public static void main(String args[]) {

        EnergySource s = new SolarEnergy(4000);
        EnergySource w = new WindEnergy(6000);

        s.displayDetails();
        w.displayDetails();
    }
}
