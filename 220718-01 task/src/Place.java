
public class Place {
	private String name;
	private String num;
	private String adress;
	
	public Place(String name, String num, String adress) {
		super();
		this.name = name;
		this.num = num;
		this.adress = adress;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "Place [name=" + name + ", num=" + num + ", adress=" + adress + "]\n";
	}
	
}
