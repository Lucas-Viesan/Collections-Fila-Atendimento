package model;

public class Cliente {
  private String firstName;
  private String senha;
	
	
 public Cliente(String firstName, String senha) {
	 this.firstName = firstName;
	 this.senha = senha;
 }


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getSenha() {
	return senha;
}


public void setSenha(String senha) {
	this.senha = senha;
}
 
 
 
}
