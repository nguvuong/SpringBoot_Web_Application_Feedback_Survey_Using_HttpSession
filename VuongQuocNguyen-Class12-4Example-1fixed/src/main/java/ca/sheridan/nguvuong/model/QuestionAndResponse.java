package ca.sheridan.nguvuong.model;

import java.io.Serializable;

public class QuestionAndResponse implements Serializable {
	private String question = "";
	private String response = "";
	public QuestionAndResponse() { }
	public String getQuestion() {return this.question;}
	public String getResponse() { return this.response;}
	public void setQuestion(String q) {this.question = q; }
	public void setResponse(String r) {this.response = r;}
	public String toString(){String qr = this.question + "\n" + this.response;
	return qr; }
}

