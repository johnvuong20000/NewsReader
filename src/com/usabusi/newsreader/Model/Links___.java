
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;

public class Links___ {

    private String self;
    private String author;
    private String collection;
    private String replies;
    private String versionHistory;
    private String up;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Links___ withSelf(String self) {
        this.self = self;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Links___ withAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public Links___ withCollection(String collection) {
        this.collection = collection;
        return this;
    }

    public String getReplies() {
        return replies;
    }

    public void setReplies(String replies) {
        this.replies = replies;
    }

    public Links___ withReplies(String replies) {
        this.replies = replies;
        return this;
    }

    public String getVersionHistory() {
        return versionHistory;
    }

    public void setVersionHistory(String versionHistory) {
        this.versionHistory = versionHistory;
    }

    public Links___ withVersionHistory(String versionHistory) {
        this.versionHistory = versionHistory;
        return this;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public Links___ withUp(String up) {
        this.up = up;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Links___ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
