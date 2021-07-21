package logico;

public abstract class User {
	
	protected String id;
	protected String username;
	protected String password;
	protected String name;		//Person's name and surname
	
	public User(String id, String username, String password, String name) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean validate(String username, String password) {
		/* Given a username and a password, checks if they match the user's.
		 * Returns true if they do; false if they don't. */
		
		boolean matches = false;
		if(this.username.equals(username) && this.password.equals(password)) {
			matches = true;
		}
		return matches;
	}

}
