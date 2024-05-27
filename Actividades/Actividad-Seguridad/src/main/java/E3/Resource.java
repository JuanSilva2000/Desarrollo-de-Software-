package E3;

class Resource {
    private String name;
    private double sensitivityLevel;

    public Resource(String name, double sensitivityLevel) {
        this.name = name;
        this.sensitivityLevel = sensitivityLevel;
    }

    public String getName() {
        return name;
    }

    public double getSensitivityLevel() {
        return sensitivityLevel;
    }
}