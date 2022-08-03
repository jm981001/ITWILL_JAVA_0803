package static_;

public class Ex1 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Hero h3 = new Hero();
		
		h1.job = "궁수";
		h2.job = "전사";
		h3.job = "도적";
		
		// -------- h1 접속 -----------
		Item i = new Item();
		i.kind = "활";
		
		// 궁수가 활을 주워가지고 0번째 인벤토리에다가 저장
		h1.setItem(i, 0);
		h1.showItems();
		
		// 인벤토리에 있는 활을 공유창고 0번째 자리에다가 저장
		Item i2 = h1.getItem(0);
		h1.setSaredItem(i2, 0);
		// -------- h1 접속종료 -----------
		
		// -------- h2 접속 -------------
		h2.showItems();
		h2.showSaredItems();
		
		// -------- h3 접속 -------------
		h3.showItems();
		h3.showSaredItems();
		
	}

}

class Hero {
	
	static Item[] 공유창고 = new Item[10];
	Item[] 개인창고 = new Item[10];
	
	String job;
	int demage;
	int hp;
	int mp;
	
	// ----- 개인 창고에 대한 get/set/print -----
	public void setItem(Item item, int index) {
		개인창고[index] = item;
	}
	
	public Item getItem(int index) {
		Item item = 개인창고[index];
		개인창고[index] = null;
		return item;
	}
	
	public void showItems() {
		
		System.out.println("----- 개인창고 정보 -----");
		for(Item item : 개인창고) {
			String str = item == null ? null : item.kind;
			System.out.print(str + " ");
//			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		
	}
	
	// ----- 공유 창고에 대한 get/set/print -----
	public void setSaredItem(Item item, int index) {
		공유창고[index] = item;
	}
	
	public Item getSaredItem(int index) {
		Item item = 공유창고[index];
		공유창고[index] = null;
		return item;
	}
	
	public void showSaredItems() {
		
		System.out.println("----- 공유창고 정보 -----");
		for(Item item : 공유창고) {
			String str = item == null ? null : item.kind;
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		
	}
	
	
	public void skill1() {}
	public void skill2() {}
	public void skill3() {}
	
}

class Item {
	String kind;
	int price;
}


