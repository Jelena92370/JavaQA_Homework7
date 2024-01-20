package searchengine;

import java.util.HashMap;
import java.util.Map;

public class Product {

    private String name;

    //color
    //type
    //flavour
    //size

    private Map<String, String> properties = new HashMap<>();

    public Product(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        properties.put("color", color);
    }

    public void setType(String type) {
        properties.put("type", type);
    }

    public void setFlavour(String flavour) {
        properties.put("flavour", flavour);
    }

    public void setSize(String size) {
        properties.put("size", size);
    }
    public Map<String, String> getProperties() {
        return properties;
    }

    public String getName() {
return name;
    }
}


