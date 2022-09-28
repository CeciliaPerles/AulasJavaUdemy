package desafio;

public class Quarto {
		
	private String name;
	private String email;
	private int room;
	
	public Quarto(String name, String email, int room) {
	
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public Quarto(String name2, double price) {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
}
