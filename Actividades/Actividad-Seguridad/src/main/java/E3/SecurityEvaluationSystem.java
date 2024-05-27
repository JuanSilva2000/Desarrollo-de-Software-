package E3;

public class SecurityEvaluationSystem {
    public static void main(String[] args) throws InterruptedException {
        SecurityEvaluator evaluator = new SecurityEvaluator();
        evaluator.addResource(new Resource("Database", 0.9));
        evaluator.addResource(new Resource("File Server", 0.7));
        evaluator.startEvaluation();

        // Ejecutar el sistema de evaluación por 30 segundos
        Thread.sleep(30000);
        evaluator.stopEvaluation();
    }
}
