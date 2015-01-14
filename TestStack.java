
public class TestStack {
	public static void main(String[] args) {
	
		StackInt s = new StackInt();
		s.push(3);
		s.push(1);
		s.push(5);
		s.push(2);
		s.push(1);
		
		for(int i = 0; i < 5; i++){
			
		System.out.println("Min: "+s.getMin());
		System.out.println("Pop: "+s.pup());	
		
		}
		
		
		
	System.out.println("-----------Stack--------");
	StackInt test = new StackInt();
	test.push(1);
	test.push(2);
	test.push(3);
	test.push(4);
	
	//System.out.println(test.toString());
	System.out.println("last nuber is: "+ test.peek());
	System.out.println("Get size" + test.getSize());
	
	test.pup();
	//System.out.println("Contains: " + test.contains(4));
	
	System.out.println("-----------Queue--------");
	QueueInt test2 = new QueueInt();
	test2.push(2);
	test2.push(4);
	test2.push(6);

	test2.pop();
	System.out.println("last nuber is: "+ test2.peek() );
	System.out.println("Get size queue:  " + test2.getSize());
	System.out.println("Contains queue: " + test2.contains(2));
	
	
	
	
}
}