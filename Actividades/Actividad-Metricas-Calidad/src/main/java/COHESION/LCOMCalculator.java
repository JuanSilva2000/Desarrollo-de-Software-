package COHESION;
import java.util.*;

public class LCOMCalculator {
    public static class ClassInfo {
        List<String> methods = new ArrayList<>();
        Map<String, Set<String>> methodAttributes = new HashMap<>();
        Set<String> attributes = new HashSet<>();

        public void addMethod(String methodName, Set<String> attrs) {
            if(methodName.isEmpty()){
                throw new IllegalArgumentException("methodName can't be empty");
            }

            if(attrs.isEmpty()){
                throw new IllegalArgumentException("attrs can't be empty");
            }

            methods.add(methodName);
            methodAttributes.put(methodName, attrs);
            attributes.addAll(attrs);
        }

        public int getLCOM(){
            int p = 0, q = 0;
            List<String> methods = this.methods;
            for (int i = 0; i < methods.size(); i++) {
                for (int j = i + 1; j < methods.size(); j++) {
                    String method1 = methods.get(i);
                    String method2 = methods.get(j);
                    Set<String> attrs1 = this.methodAttributes.get(method1);
                    Set<String> attrs2 = this.methodAttributes.get(method2);
                    // Calculamos si comparten atributos
                    Set<String> intersection = new HashSet<>(attrs1);
                    intersection.retainAll(attrs2);
                    if (intersection.isEmpty()) {
                        p++; // No comparten atributos
                    } else {
                        q++; // Comparten al menos un atributo
                    }
                }
            }
            return p - q;
        }
    }
    public static void main(String[] args) {
        ClassInfo classInfo = new ClassInfo();
        // Simulación de entrada de métodos y sus accesos a atributos
        classInfo.addMethod("method1", new HashSet<>(Arrays.asList("attr1", "attr2")));
        classInfo.addMethod("method2", new HashSet<>(Arrays.asList("attr2")));
        classInfo.addMethod("method3", new HashSet<>(Arrays.asList("attr3")));
        //Añadiendo cinco metodos extras para ver como varia el LCOM
        classInfo.addMethod("method4", new HashSet<>(Arrays.asList("attr2","attr8")));
        classInfo.addMethod("method5", new HashSet<>(Arrays.asList("attr3", "attr4")));
        classInfo.addMethod("method6", new HashSet<>(Arrays.asList("attr2", "attr5")));
        classInfo.addMethod("method7", new HashSet<>(Arrays.asList("attr6", "attr7")));
        classInfo.addMethod("method8", new HashSet<>(Arrays.asList("attr4", "attr8")));

        int lcom = classInfo.getLCOM();
        System.out.println("LCOM = " + lcom);
    }
}
