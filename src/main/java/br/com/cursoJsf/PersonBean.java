package br.com.cursoJsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "personBean")
public class PersonBean {
				
	private String name;
	private String lastName;
	private String fullName;
	
	public String showName() {
		fullName = name + " "+lastName;
		return "";
	}
			
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
		
}
