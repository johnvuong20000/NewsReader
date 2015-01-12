
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;
import com.usabusi.newsreader.Links_;

public class Meta_ {

    private Links_ links;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Links_ getLinks() {
        return links;
    }

    public void setLinks(Links_ links) {
        this.links = links;
    }

    public Meta_ withLinks(Links_ links) {
        this.links = links;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Meta_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
