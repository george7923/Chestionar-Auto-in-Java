
public class Cursant implements Comparable<Cursant> {
	private  String username;
	private  String password;
	private  String email;
	public Cursant(String user, String pass, String email) {
		username = user;
		password = pass;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public String getPass(){
		return password;
	}
	public String getEmail(){
		return email;
	}

	public String setUsername(String newName){
		return username=newName;
	}

	public String setPassword(String newPass){
		return password=newPass;
	}
	public String setEmail(String newEmail){
		return email=newEmail;
	}

	public String toString(){
		return username+", "+password+", "+email;
	}
	public int compareTo(Cursant o){
		return(username).compareTo(o.getUsername());
	}
	
}
