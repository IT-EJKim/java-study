package application;

public class Listed {

	private String insert;

	public Listed(String insert) {
		this.insert = insert;
	}

	
	
	public String getInsert() {
		return insert;
	}



	public void setInsert(String insert) {
		this.insert = insert;
	}


	
	@Override
	public String toString() {
		return insert;
	}

}
