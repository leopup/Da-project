package almost;

public class dang {
	private String secretStuff;
	
	public dang(String name){
		secretStuff=name;
	}
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
