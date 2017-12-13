package com.concretepage.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "book")
public class Book {
    private String name;
    private String author;
    private String publisher;
    private String isbn;
     
    private Reader reader;

    private List<Book> books = new ArrayList<Book>();
    
    
    
    public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public String getPublisher() {
        return publisher;
    }
 
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
 
    public String getIsbn() {
        return isbn;
    }
 
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher=" + publisher + ", isbn=" + isbn + ", reader="
				+ reader + "]";
	}
 

    
}