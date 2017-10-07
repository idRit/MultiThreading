class Odd implements Runnable{
	
	public void run(){
		
		for(int i = 1; i < 20; i++){
			if( (i % 2) != 0 ){
				System.out.println(i);
			}
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){}
		}
	
    }

}

class Even implements Runnable{
	
	public void run(){
		
		for(int i = 1; i <= 20; i++){
			if( (i % 2) == 0 ){
				System.out.println(i);
			}
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){}
		}
	
    }

}

class MainTest{
	
	public static void main(String args[]){
		
		Thread odd = new Thread(new Odd());
		odd.setName("Odd");
		
		Thread even = new Thread(new Even());
		even.setName("Even");
		
		odd.setPriority(1);
		even.setPriority(2);
		
		odd.start();
		even.start();
	
	}
	
}
		