

class SyncClass {

	public synchronized void display(int n, int t) {
	
	
		for (int i = n; i <= t; i++) {
	
			System.out.println(i);
	
			try {
        
                		Thread.sleep(400);
            
            		} catch (Exception e) {
              
                		System.out.println(e);}
 
		}
 
 	}
}




class X extends Thread {

	SyncClass obj;



	X(SyncClass obj) {
		this.obj = obj;
    	}
    	

	public void run() {
	        obj.display(1, 5);
    	}
    	
}




class Y extends Thread {
    
	SyncClass obj;

    
    
    	Y(SyncClass obj) {
        	this.obj = obj;
    	}


    	public void run() {
        	obj.display(6, 10);
    	}
    
}




class ThreadSync {

	public static void main(String args[]) {
	
	
        	SyncClass obj = new SyncClass();
        	X objX = new X(obj);
        	Y objY = new Y(obj);
        	objX.start();
        	objY.start();
    
    
	}
    
}
