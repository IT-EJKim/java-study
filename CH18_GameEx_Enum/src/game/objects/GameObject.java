package game.objects;

public enum GameObject {
	
	가위, 바위, 보;
	
	private int[][] comparison = {
//			  가위 바위 보
	/*가위(0)*/{0, -1, 1},  /*비김 0, 짐 -1, 이김 1*/
	/*바위(1)*/{1, 0, -1},
	/*보(2)*/ {-1, 1, 0}
	};
	
	// 상대의 가위(0) 바위(1) 보(2) 와 비교해서 결과 리턴
	public int compare(GameObject ob) {  // 상대의 가위바위보를 매개변수로 입력받음
		return comparison[this.ordinal()][ob.ordinal()]; // enum끼리 비교해서 인덱스 번호로 비교
	}

}
