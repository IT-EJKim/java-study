package application;

public class Listed {
	
	// 입력된 게 todo에 저장되서 
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
	// 숫자 매기기부터 다시하기
	public String toString() {
		int num = 0;
		for (int i = 0; i <= 100; i++) {
			num += i;
		}
		return num + insert + "\n";
	}

//	public void add(Listed listed) {
//		// TODO Auto-generated method stub
//		
//	}
}
