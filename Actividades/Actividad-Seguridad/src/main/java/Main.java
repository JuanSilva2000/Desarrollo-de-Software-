import java.util.List;

public class Main {
    public static void main (String args[]){
        // Crear nodos del árbol de ataque
        AttackTreeNode rootNode = new AttackTreeNode("virus infects a file", 5, 0.6);
        AttackTreeNode node1 = new AttackTreeNode("virus run as an administrator", 8, 0.3);
        AttackTreeNode node2 = new AttackTreeNode("virus run as a normal user", 4, 0.7);

        rootNode.addChild(node1);
        rootNode.addChild(node2);

        // Crear hijos para node1
        AttackTreeNode node1_1 = new AttackTreeNode("virus exploits root hole", 7, 0.2);
        AttackTreeNode node1_2 = new AttackTreeNode("virus run by an admin", 3, 0.8);

        node1.addChild(node1_1);
        node1.addChild(node1_2);

        // Crear hijos para node2
        AttackTreeNode node2_1 = new AttackTreeNode("Other infected programs", 6, 0.4);
        AttackTreeNode node2_2 = new AttackTreeNode("User downloads and runs infected naked binary", 4, 0.6);

        node2.addChild(node2_1);
        node2.addChild(node2_2);

        // Crear hijos para node1_2
        AttackTreeNode node1_2_1 = new AttackTreeNode("Other infected programs", 4, 0.5);
        AttackTreeNode node1_2_2 = new AttackTreeNode("Virus infects install package", 6, 0.3);
        AttackTreeNode node1_2_3 = new AttackTreeNode("Admin downloads and runs infected naked binary", 8, 0.2);

        node1_2.addChild(node1_2_1);
        node1_2.addChild(node1_2_2);
        node1_2.addChild(node1_2_3);

        // Crear el árbol de ataque y calcular riesgos
        AttackTree arbolAtaque = new AttackTree(rootNode);
        System.out.println("Riesgo total: " + arbolAtaque.calculateTotalRisk());

        List<String> criticalPath = arbolAtaque.findCriticalPathDescriptions();
        System.out.print("Critical Path: ");
        for (String description : criticalPath) {
            System.out.print(description + " -> ");
        }
        System.out.println("end");

    }
}
