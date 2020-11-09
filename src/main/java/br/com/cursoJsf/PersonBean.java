package br.com.cursoJsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;


@ViewScoped
@ManagedBean(name = "personBean")

public class PersonBean {
	
	
	private String password;
	private String text;
	private String name;
	private HtmlCommandButton commandButton;
	
	private List<String> names = new ArrayList<String>();
	
	
	public String addName() {
		names.add(name);
		
		if (names.size() > 3) {
			commandButton.setDisabled(true);
			return "navegationpage?faces-redirect=true";
		}
		
		return "";
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public List<String> getNames() {
		return names;
	}
	
	
	public void setNames(List<String> names) {
		this.names = names;
	}
			
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}
	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}
	
	
		
}
