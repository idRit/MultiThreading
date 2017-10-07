class HiPriority implements Runnable{
	public void run(){
		try{
			Thread.sleep(500);
		}catch(Exception e){}
		System.out.println("This has High Priority!");
	}
}

class LoPriority implements Runnable{
	public void run(){
		try{
			Thread.sleep(550);
		}catch(Exception e){}
		System.out.println("This has Low Priority!");
	}
}

class PriorityTest{
	public static void main(String args[]){
		Thread hi = new Thread(new HiPriority());
		Thread lo = new Thread(new LoPriority());
		
		hi.setPriority(10);
		lo.setPriority(1);
		
		lo.start();
		hi.start();
	}
}