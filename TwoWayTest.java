class Increament extends Thread{
	public void run(){
		for(int i = 0; i < 10; i ++){
			System.out.println(i+1);
			try{
				sleep(500);
			}catch(Exception e){}
		}
	}
}

class Decreament implements Runnable{
	public void run(){
		for(int i = 10; i > 0; i --){
			System.out.println(i);
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}

class TwoWayTest{
	public static void main(String args[]){
		Increament inc = new Increament();
		Thread dec = new Thread(new Decreament());
		
		inc.setPriority(10);
		dec.setPriority(9);
		
		inc.start();
		dec.start();
	}
}