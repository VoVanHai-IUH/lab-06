package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "post_comment", schema = "blog", catalog = "")
public class PostComment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "postId", nullable = false)
    private long postId;
    @Basic
    @Column(name = "parentId", nullable = true)
    private Long parentId;
    @Basic
    @Column(name = "userId", nullable = false)
    private long userId;
    @Basic
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Basic
    @Column(name = "published", nullable = false)
    private byte published;
    @Basic
    @Column(name = "createdAt", nullable = false)
    private Timestamp createdAt;
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

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        PostComment that = (PostComment) o;
        return id == that.id && postId == that.postId && userId == that.userId && published == that.published && Objects.equals(parentId, that.parentId) && Objects.equals(title, that.title) && Objects.equals(createdAt, that.createdAt) && Objects.equals(publishedAt, that.publishedAt) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postId, parentId, userId, title, published, createdAt, publishedAt, content);
    }
}
