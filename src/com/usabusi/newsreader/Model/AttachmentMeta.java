
package com.usabusi.newsreader;

import java.util.HashMap;
import java.util.Map;
import com.usabusi.newsreader.Sizes;
import com.usabusi.newsreader.ImageMeta;
public class AttachmentMeta {

    private int width;
    private int height;
    private String file;
    private Sizes sizes;
    private ImageMeta imageMeta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public AttachmentMeta withWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public AttachmentMeta withHeight(int height) {
        this.height = height;
        return this;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public AttachmentMeta withFile(String file) {
        this.file = file;
        return this;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public AttachmentMeta withSizes(Sizes sizes) {
        this.sizes = sizes;
        return this;
    }

    public ImageMeta getImageMeta() {
        return imageMeta;
    }

    public void setImageMeta(ImageMeta imageMeta) {
        this.imageMeta = imageMeta;
    }

    public AttachmentMeta withImageMeta(ImageMeta imageMeta) {
        this.imageMeta = imageMeta;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AttachmentMeta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
