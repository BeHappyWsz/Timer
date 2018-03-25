package wsz.timer;

import java.util.Timer;

public class Test {
    
	public static void main(String[] args) {
		Timer timer = new Timer();
		Task task = new Task("haha");
		//延迟3秒执行，每2秒执行一次,单位ms
		timer.schedule(task, 3000L,2000L);
		
		try {
			Thread.sleep(7100);
			task.cancel();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
