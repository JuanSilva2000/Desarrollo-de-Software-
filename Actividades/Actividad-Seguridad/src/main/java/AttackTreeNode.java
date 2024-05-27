import java.util.ArrayList;
import java.util.List;

class AttackTreeNode {
    private String description;
    private int value;
    private double probability;
    private List<AttackTreeNode> children;

    public AttackTreeNode(String description, int value, double probability) {
        this.description = description;
        this.value = value;
        this.probability = probability;
        this.children = new ArrayList<>();
    }

    public void addChild(AttackTreeNode child) {
        children.add(child);
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

    public double getProbability() {
        return probability;
    }

    public List<AttackTreeNode> getChildren() {
        return children;
    }

    public double calculateRisk() {
        double risk = value * probability;
        for (AttackTreeNode child : children) {
            risk += child.calculateRisk();
        }
        return risk;
    }

    public List<String> findCriticalPathDescriptions() {
        List<String> path = new ArrayList<>();
        path.add(description);

        double maxRisk = 0;
        AttackTreeNode criticalNode = null;

        for (AttackTreeNode child : children) {
            double childRisk = child.calculateRisk();
            if (childRisk > maxRisk) {
                maxRisk = childRisk;
                criticalNode = child;
            }
        }

        if (criticalNode != null) {
            path.addAll(criticalNode.findCriticalPathDescriptions());
        }

        return path;
    }

    public void printTree(String prefix, boolean isCritical) {
        System.out.println(prefix + (isCritical ? "-> " : "|- ") + description + " (Value: " + value + ", Probability: " + probability + ")");
        for (AttackTreeNode child : children) {
            child.printTree(prefix + (isCritical ? " " : "| "), isCritical && findCriticalPathDescriptions().contains(child.getDescription()));
        }
    }
}