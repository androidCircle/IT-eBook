package com.cky.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "BOOK".
 */
public class Book {

    private Long id;
    private String book_name;
    private String book_isbn;
    private String book_id;
    private String request_id;
    private String download_status;

    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }

    public Book(Long id, String book_name, String book_isbn, String book_id, String request_id, String download_status) {
        this.id = id;
        this.book_name = book_name;
        this.book_isbn = book_isbn;
        this.book_id = book_id;
        this.request_id = request_id;
        this.download_status = download_status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getDownload_status() {
        return download_status;
    }

    public void setDownload_status(String download_status) {
        this.download_status = download_status;
    }

}