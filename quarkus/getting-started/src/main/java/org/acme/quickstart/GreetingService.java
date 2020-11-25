package src.main.java.org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    private String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");

    public String greeting(String name) {
        return "hasta luego " + name + " from " + hostname;
    }

}