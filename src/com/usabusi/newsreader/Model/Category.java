
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;
import com.usabusi.newsreader.Meta____;
public class Category {

    private int iD;
    private String name;
    private String slug;
    private String description;
    private Object parent;
    private int count;
    private String link;
    private Meta____ meta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public Category withID(int iD) {
        this.iD = iD;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category withName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Category withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category withDescription(String description) {
        this.description = description;
        return this;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public Category withParent(Object parent) {
        this.parent = parent;
        return this;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Category withCount(int count) {
        this.count = count;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Category withLink(String link) {
        this.link = link;
        return this;
    }

    public Meta____ getMeta() {
        return meta;
    }

    public void setMeta(Meta____ meta) {
        this.meta = meta;
    }

    public Category withMeta(Meta____ meta) {
        this.meta = meta;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Category withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
