
package com.usabusi.newsreader;

import android.text.Html;

import java.util.HashMap;
import java.util.Map;
import com.usabusi.newsreader.Author;
import com.usabusi.newsreader.Meta_;
import com.usabusi.newsreader.FeaturedImage;
import com.usabusi.newsreader.Terms;

public class WPPostsData {
    private int iD;
    private String title;
    private String status;
    private String type;
    private Author author;
    private String content;
    private int parent;
    private String link;
    private String date;
    private String modified;
    private String format;
    private String slug;
    private String guid;
    private String excerpt;
    private int menuOrder;
    private String commentStatus;
    private String pingStatus;
    private boolean sticky;
    private String dateTz;
    private String dateGmt;
    private String modifiedTz;
    private String modifiedGmt;
    private Meta_ meta;
    private FeaturedImage featuredImage;
    private Terms terms;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
//        String myTitle= Html.fromHtml(title)
//        return myTitle;
            return title;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public WPPostsData withID(int iD) {
        this.iD = iD;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WPPostsData withTitle(String title) {
        //String myTitle= Html.fromHtml(title).toString();
        //String myTitle= HtmlEntities.decode(title);
        this.title = title;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WPPostsData withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WPPostsData withType(String type) {
        this.type = type;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public WPPostsData withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WPPostsData withContent(String content) {
        this.content = content;
        return this;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public WPPostsData withParent(int parent) {
        this.parent = parent;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public WPPostsData withLink(String link) {
        this.link = link;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public WPPostsData withDate(String date) {
        this.date = date;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public WPPostsData withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public WPPostsData withFormat(String format) {
        this.format = format;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public WPPostsData withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public WPPostsData withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public WPPostsData withExcerpt(String excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public WPPostsData withMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
        return this;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public WPPostsData withCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
        return this;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public WPPostsData withPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
        return this;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public WPPostsData withSticky(boolean sticky) {
        this.sticky = sticky;
        return this;
    }

    public String getDateTz() {
        return dateTz;
    }

    public void setDateTz(String dateTz) {
        this.dateTz = dateTz;
    }

    public WPPostsData withDateTz(String dateTz) {
        this.dateTz = dateTz;
        return this;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public WPPostsData withDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
        return this;
    }

    public String getModifiedTz() {
        return modifiedTz;
    }

    public void setModifiedTz(String modifiedTz) {
        this.modifiedTz = modifiedTz;
    }

    public WPPostsData withModifiedTz(String modifiedTz) {
        this.modifiedTz = modifiedTz;
        return this;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public WPPostsData withModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
        return this;
    }

    public Meta_ getMeta() {
        return meta;
    }

    public void setMeta(Meta_ meta) {
        this.meta = meta;
    }

    public WPPostsData withMeta(Meta_ meta) {
        this.meta = meta;
        return this;
    }

    public FeaturedImage getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(FeaturedImage featuredImage) {
        this.featuredImage = featuredImage;
    }

    public WPPostsData withFeaturedImage(FeaturedImage featuredImage) {
        this.featuredImage = featuredImage;
        return this;
    }

    public Terms getTerms() {
        return terms;
    }

    public void setTerms(Terms terms) {
        this.terms = terms;
    }

    public WPPostsData withTerms(Terms terms) {
        this.terms = terms;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public WPPostsData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
