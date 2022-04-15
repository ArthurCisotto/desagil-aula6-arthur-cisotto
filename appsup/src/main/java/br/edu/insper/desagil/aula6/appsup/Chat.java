package br.edu.insper.desagil.aula6.appsup;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	private List<Message> messages;

	public Chat() {
		this.messages = new ArrayList<>();
	}

	public void post(Message message) {
		messages.add(message);
	}

	public String renderAll() {
		String s = "<main>";
		for (Message message : messages) {
			s += message.render();
		}
		return s + "</main>";
	}
}
