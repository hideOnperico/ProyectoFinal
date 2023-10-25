package co.edu.unbosque.model;

public class SuperastroDTO {
	
	private int num;
	private String zodiacSymbol;
	
	public SuperastroDTO() {
		// TODO Auto-generated constructor stub
	}

	public SuperastroDTO(int num, String zodiacSymbol) {
		super();
		this.num = num;
		this.zodiacSymbol = zodiacSymbol;
	}

	@Override
	public String toString() {
		return "SuperastroDTO [num=" + num + ", zodiacSymbol=" + zodiacSymbol + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getZodiacSymbol() {
		return zodiacSymbol;
	}

	public void setZodiacSymbol(String zodiacSymbol) {
		this.zodiacSymbol = zodiacSymbol;
	}
	
	

}
