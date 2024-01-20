package searchengine;

import java.util.function.Predicate;

public class StringPredicate implements Predicate<Product> {

    private final String key;
    private final String referenceValue;


    public StringPredicate(String key, String referenceValue) {
        this.key = key;
        this.referenceValue = referenceValue.toLowerCase();

    }

    @Override
    public boolean test(Product product) {
        String propertyValue = product.getProperties().get(key);
        return propertyValue != null && propertyValue.toLowerCase().contains(referenceValue);
    }
}
