package io.wanken.bookstore.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "book", schema = "book")
public class BookEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "book_name")
    private String bookName;
    @Basic
    @Column(name = "publisher")
    private String publisher;
    @Basic
    @Column(name = "author")
    private String author;
    @Basic
    @Column(name = "published_date")
    private Timestamp publishedDate;
    @Basic
    @Column(name = "book_edition")
    private String bookEdition;
    @Basic
    @Column(name = "cover")
    private String cover;
    @Basic
    @Column(name = "page_size")
    private int pageSize;
    @Basic
    @Column(name = "isbn")
    private String isbn;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Timestamp publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return pageSize == that.pageSize && Objects.equals(id, that.id) && Objects.equals(bookName, that.bookName) && Objects.equals(publisher, that.publisher) && Objects.equals(author, that.author) && Objects.equals(publishedDate, that.publishedDate) && Objects.equals(bookEdition, that.bookEdition) && Objects.equals(cover, that.cover) && Objects.equals(isbn, that.isbn) && Objects.equals(price, that.price) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, publisher, author, publishedDate, bookEdition, cover, pageSize, isbn, price, createTime, updateTime);
    }
}
