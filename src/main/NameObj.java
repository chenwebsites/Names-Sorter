package main;

public class NameObj {

	private String givenName;
	private String lastName;

	public NameObj() {
		// TODO Auto-generated constructor stub
	}

	public NameObj(String givenName, String lastName) {
		super();
		this.givenName = givenName;
		this.lastName = lastName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return givenName + " " + lastName;
	}

}
