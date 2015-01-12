
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;
import com.usabusi.newsreader.Meta__;



public class Author_ {

    private int iD;
    private String username;
    private String name;
    private String firstName;
    private String lastName;
    private String nickname;
    private String slug;
    private String uRL;
    private String avatar;
    private String description;
    private String registered;
    private Meta__ meta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public Author_ withID(int iD) {
        this.iD = iD;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Author_ withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author_ withName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Author_ withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author_ withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Author_ withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Author_ withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getURL() {
        return uRL;
    }

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    public Author_ withURL(String uRL) {
        this.uRL = uRL;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Author_ withAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author_ withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public Author_ withRegistered(String registered) {
        this.registered = registered;
        return this;
    }

    public Meta__ getMeta() {
        return meta;
    }

    public void setMeta(Meta__ meta) {
        this.meta = meta;
    }

    public Author_ withMeta(Meta__ meta) {
        this.meta = meta;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Author_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
