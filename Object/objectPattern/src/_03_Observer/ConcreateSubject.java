package _03_Observer;

import java.util.*;


public class ConcreateSubject implements Subject {
	// 감시자를 담을 리스트
	List<Observer> observer = new ArrayList<>();
	
	
	@Override
	public void registerObserver(Observer o) {
		observer.add(o);
		System.out.println(o+"구독완료");
	}

	@Override
	public void removeObserver(Observer o) {
		observer.remove(o);
		System.out.println(o+"구독 취소");
	}
	
	
	
	// 감시자에게 이벤트 송신
	@Override
	public void notifyObserver() {
		for(Observer o : observer) {
			o.update();
		}
	}

}
