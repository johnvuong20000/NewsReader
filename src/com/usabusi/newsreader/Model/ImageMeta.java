
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;

public class ImageMeta {

    private float aperture;
    private String credit;
    private String camera;
    private String caption;
    private int createdTimestamp;
    private String copyright;
    private String focalLength;
    private String iso;
    private String shutterSpeed;
    private String title;
    private int orientation;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public float getAperture() {
        return aperture;
    }

    public void setAperture(float aperture) {
        this.aperture = aperture;
    }

    public ImageMeta withAperture(float aperture) {
        this.aperture = aperture;
        return this;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public ImageMeta withCredit(String credit) {
        this.credit = credit;
        return this;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public ImageMeta withCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public ImageMeta withCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public int getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(int createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public ImageMeta withCreatedTimestamp(int createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ImageMeta withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public ImageMeta withFocalLength(String focalLength) {
        this.focalLength = focalLength;
        return this;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public ImageMeta withIso(String iso) {
        this.iso = iso;
        return this;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public ImageMeta withShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageMeta withTitle(String title) {
        this.title = title;
        return this;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public ImageMeta withOrientation(int orientation) {
        this.orientation = orientation;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ImageMeta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
