
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;
import com.usabusi.newsreader.Thumbnail;
import com.usabusi.newsreader.Medium;

public class Sizes {

    private Thumbnail thumbnail;
    private Medium medium;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Sizes withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Sizes withMedium(Medium medium) {
        this.medium = medium;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Sizes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
