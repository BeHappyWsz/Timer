package wsz.timer;

import java.util.Date;
import java.util.TimerTask;

public class Task extends TimerTask{

	private String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(new Date().getTime() +" "+name);
	}

}
