package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Post {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "authorId", nullable = false)
    private long authorId;
    @Basic
    @Column(name = "parentId", nullable = true)
    private Long parentId;
    @Basic
    @Column(name = "title", nullable = false, length = 75)
    private String title;
    @Basic
    @Column(name = "metaTitle", nullable = true, length = 100)
    private String metaTitle;
    @Basic
    @Column(name = "summary", nullable = true, length = -1)
    private Object summary;
    @Basic
    @Column(name = "published", nullable = false)
    private byte published;
    @Basic
    @Column(name = "createdAt", nullable = false)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updatedAt", nullable = true)
    private Timestamp updatedAt;
    @Basic
    @Column(name = "publishedAt", nullable = true)
    private Timestamp publishedAt;
    @Basic
    @Column(name = "content", nullable = true, length = -1)
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public Object getSummary() {
        return summary;
    }

    public void setSummary(Object summary) {
        this.summary = summary;
    }

    public byte getPublished() {
        return published;
    }

    public void setPublished(byte published) {
        this.published = published;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id && authorId == post.authorId && published == post.published && Objects.equals(parentId, post.parentId) && Objects.equals(title, post.title) && Objects.equals(metaTitle, post.metaTitle) && Objects.equals(summary, post.summary) && Objects.equals(createdAt, post.createdAt) && Objects.equals(updatedAt, post.updatedAt) && Objects.equals(publishedAt, post.publishedAt) && Objects.equals(content, post.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authorId, parentId, title, metaTitle, summary, published, createdAt, updatedAt, publishedAt, content);
    }
}
