class sample implements test {
	
	public void show1() {
		System.out.println("main");
	}
   
    public void show(){ 
      System.out.println("interface"); 
    }
 
    public static void main(String[] args)
    {
        test t = new sample();
        t.show();
       // t.show1();
        test.dis();
        
    }
}