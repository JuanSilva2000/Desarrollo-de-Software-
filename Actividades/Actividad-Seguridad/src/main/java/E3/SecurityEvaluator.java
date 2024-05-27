package E3;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class SecurityEvaluator {
    private List<Resource> resources;
    private double totalRisk;
    private ScheduledExecutorService scheduler;

    public SecurityEvaluator() {
        resources = new ArrayList<>();
        scheduler = Executors.newScheduledThreadPool(1);
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void removeResource(Resource resource) {
        resources.remove(resource);
    }

    public void startEvaluation() {
        scheduler.scheduleAtFixedRate(this::evaluateRisks, 0, 10, TimeUnit.SECONDS);
    }

    public void stopEvaluation() {
        scheduler.shutdown();
    }

    private void evaluateRisks() {
        totalRisk = 0;
        for (Resource resource : resources) {
            totalRisk += resource.getSensitivityLevel(); // Simplificación para el ejemplo
        }
        System.out.println("Total Risk: " + totalRisk);
    }
}