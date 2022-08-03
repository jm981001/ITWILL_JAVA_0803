package static_;

class Road {
	// 멤버변수, 필드, 속성
	int[] arr;
	
	// 기능 (메서드)
	public int sum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += this.arr[i];
		}
		return sum;
	}
}

class Bridge {
	// 멤버변수, 필드, 속성
	int index;
	int total;
	// 소요시간(total)이 가장 적게 걸리는 다리를 리턴 해주는 메서드
		public static Bridge min(Bridge[] bridges) {
			Bridge minBridge = bridges[0];
			
			for(int i = 1; i < bridges.length; i++) {
				if(minBridge.total > bridges[i].total) {
					minBridge = bridges[i];
				}
			}
			return minBridge;
		}
	}


public class Test1 {

	public static void main(String[] args) {
	
		Road north = new Road();
		north.arr = new int[] {70, 80, 60, 20, 30, 50, 10, 80, 77, 89};
		
		Road south = new Road();
		south.arr = new int[] {70, 60, 40, 50, 55, 65, 23, 44, 37, 88};
		
		Bridge bridge1 = new Bridge();
		Bridge bridge2 = new Bridge();
		Bridge bridge3 = new Bridge();
		bridge1.index = 2;
		bridge2.index = 4;
		bridge3.index = 6;
		
		bridge1.total = north.sum(0, 2) + south.sum(2, 9);
		bridge2.total = north.sum(0, 4) + south.sum(4, 9);
		bridge3.total = north.sum(0, 6) + south.sum(6, 9);
		
		System.out.println(bridge1.total);
		System.out.println(bridge2.total);
		System.out.println(bridge3.total);
		
		Bridge[] bridges = {bridge1, bridge2, bridge3};
		
		Bridge min = Bridge.min(bridges);
		System.out.println("다리번호: " + min.index);
		System.out.println("최소시간: " + min.total);
		
		
		
	}

}