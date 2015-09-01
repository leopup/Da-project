package manymethods;

public class dang {
	private String secretStuff;
	public void setName (String scrt){
		secretStuff = scrt;
		
	}
	public String stikup(){
		return secretStuff;
	}
	public void saying(){
		System.out.println("Your stash is in ", stikup());
	}

}
