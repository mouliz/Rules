package com.concretepage.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Readers {
	
@XmlElement(name = "reader", type=Reader.class)
private List<Reader> reader = new ArrayList<Reader>();

public Readers() {

}



public Readers(List<Reader> reader) {
	super();
	this.reader = reader;
}



public List<Reader> getReader() {
	return reader;
}

public void setReader(List<Reader> reader) {
	this.reader = reader;
}



	
}
