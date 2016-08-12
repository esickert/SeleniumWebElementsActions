package webElementsActionsPackage;

import java.util.*;

public class ExtraStuffActionsTest {

	public ExtraStuffActionsTest() {  //this is a constructor
		// TODO Auto-generated constructor stub
	}

//*****************************************************************************
/**
* I don't understand this so Ive disabled it. It works but I don't know why.
*/	
	public static void toSleep()	{
		
/*		Timer t = new Timer();
		t.schedule(new TimerTask() {
			int i;
			@Override
				public void run() {
				i++;
				System.out.println(i);
	}
}, 0, 1000); */
		
		for(int i = 1; i< 5; i++) {
			try {
				//sending the actual Thread of execution to sleep X milliseconds
				Thread.sleep(1000);
			} catch(InterruptedException ie) {}
			System.out.print(i + " ");
		}
		System.out.println("secs");
	}
//*****************************************************************************
}
