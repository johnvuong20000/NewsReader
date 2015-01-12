
package com.usabusi.newsreader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.usabusi.newsreader.Category;

public class Terms {

    private List<Category> category = new ArrayList<Category>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public Terms withCategory(List<Category> category) {
        this.category = category;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Terms withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
