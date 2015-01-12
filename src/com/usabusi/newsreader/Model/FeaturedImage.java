
package com.usabusi.newsreader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.usabusi.newsreader.Author_;
import com.usabusi.newsreader.Meta___;
import com.usabusi.newsreader.AttachmentMeta;
public class FeaturedImage {

    private int iD;
    private String title;
    private String status;
    private String type;
    private Author_ author;
    private String content;
    private int parent;
    private String link;
    private String date;
    private String modified;
    private String format;
    private String slug;
    private String guid;
    private Object excerpt;
    private int menuOrder;
    private String commentStatus;
    private String pingStatus;
    private boolean sticky;
    private String dateTz;
    private String dateGmt;
    private String modifiedTz;
    private String modifiedGmt;
    private Meta___ meta;
    private List<Object> terms = new ArrayList<Object>();
    private String source;
    private boolean isImage;
    private AttachmentMeta attachmentMeta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public FeaturedImage withID(int iD) {
        this.iD = iD;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FeaturedImage withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FeaturedImage withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FeaturedImage withType(String type) {
        this.type = type;
        return this;
    }

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public FeaturedImage withAuthor(Author_ author) {
        this.author = author;
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FeaturedImage withContent(String content) {
        this.content = content;
        return this;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public FeaturedImage withParent(int parent) {
        this.parent = parent;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public FeaturedImage withLink(String link) {
        this.link = link;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public FeaturedImage withDate(String date) {
        this.date = date;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public FeaturedImage withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public FeaturedImage withFormat(String format) {
        this.format = format;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public FeaturedImage withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public FeaturedImage withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public Object getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Object excerpt) {
        this.excerpt = excerpt;
    }

    public FeaturedImage withExcerpt(Object excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public FeaturedImage withMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
        return this;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public FeaturedImage withCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
        return this;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public FeaturedImage withPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
        return this;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public FeaturedImage withSticky(boolean sticky) {
        this.sticky = sticky;
        return this;
    }

    public String getDateTz() {
        return dateTz;
    }

    public void setDateTz(String dateTz) {
        this.dateTz = dateTz;
    }

    public FeaturedImage withDateTz(String dateTz) {
        this.dateTz = dateTz;
        return this;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public FeaturedImage withDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
        return this;
    }

    public String getModifiedTz() {
        return modifiedTz;
    }

    public void setModifiedTz(String modifiedTz) {
        this.modifiedTz = modifiedTz;
    }

    public FeaturedImage withModifiedTz(String modifiedTz) {
        this.modifiedTz = modifiedTz;
        return this;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public FeaturedImage withModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
        return this;
    }

    public Meta___ getMeta() {
        return meta;
    }

    public void setMeta(Meta___ meta) {
        this.meta = meta;
    }

    public FeaturedImage withMeta(Meta___ meta) {
        this.meta = meta;
        return this;
    }

    public List<Object> getTerms() {
        return terms;
    }

    public void setTerms(List<Object> terms) {
        this.terms = terms;
    }

    public FeaturedImage withTerms(List<Object> terms) {
        this.terms = terms;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public FeaturedImage withSource(String source) {
        this.source = source;
        return this;
    }

    public boolean isIsImage() {
        return isImage;
    }

    public void setIsImage(boolean isImage) {
        this.isImage = isImage;
    }

    public FeaturedImage withIsImage(boolean isImage) {
        this.isImage = isImage;
        return this;
    }

    public AttachmentMeta getAttachmentMeta() {
        return attachmentMeta;
    }

    public void setAttachmentMeta(AttachmentMeta attachmentMeta) {
        this.attachmentMeta = attachmentMeta;
    }

    public FeaturedImage withAttachmentMeta(AttachmentMeta attachmentMeta) {
        this.attachmentMeta = attachmentMeta;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public FeaturedImage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
