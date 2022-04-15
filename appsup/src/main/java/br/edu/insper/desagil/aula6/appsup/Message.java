package br.edu.insper.desagil.aula6.appsup;

public class Message {
	
	String user;
	String text;
	
	public Message(String user, String text) {
		this.user = user;
		this.text = text;
	}

	public String getUser() {
		return user;
	}

	public String getText() {
		return text;
	}

	public String render() {
		return "<p><strong>" + user + ":</strong> " + text + "</p>";
	}
}
