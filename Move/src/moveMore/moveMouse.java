package moveMore;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class moveMouse {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
		  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    try {
	    	Date endDate;
	    	if (args.length == 0) {
	    		endDate= new Date();
	    		endDate.setHours(18);
	    		endDate.setMinutes(00);
	    		endDate.setSeconds(00);
	    	}else {
	    		endDate= formatter.parse(args[0]);
	    	}
	    	
	    	System.out.println(endDate);
	    		
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Random n = new Random();
			Robot r = new Robot();
			while(endDate.after(new Date())) {
				r.delay(5000);
				int x=n.nextInt(screenSize.height);
				int y=n.nextInt(screenSize.width);
				r.mouseMove(x,y);
			} 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
        
	} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
}
}
