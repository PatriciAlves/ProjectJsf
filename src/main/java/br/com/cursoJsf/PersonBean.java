package br.com.cursoJsf;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import br.com.dao.DaoGeneric;
import br.com.entities.Person;


@ViewScoped
@ManagedBean(name = "personBean")

public class PersonBean {
	
	private Person person = new Person();
	private DaoGeneric<Person> daoGeneric = new DaoGeneric<Person>();
	
	public String save() {
		
		daoGeneric.save(person);
		person = new Person();
		return"";
		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public DaoGeneric<Person> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Person> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	
		
}
