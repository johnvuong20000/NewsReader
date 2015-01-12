
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;
import com.usabusi.newsreader.Links;

public class Meta {

    private Links links;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Meta withLinks(Links links) {
        this.links = links;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Meta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
