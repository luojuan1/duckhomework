package duck;

public class DuckSimulator {
	public static void main(String[] args){ 
         Duck mallard = new MallardDuck(); 
		        //mallard.performQuack(); 
		        //ָ��QuackBehavior�ľ���ʵ�ֲ��ܵ���performQuack()���� 
	     mallard.setQuackBehavior(new Squeak()); 
		 mallard.performQuack(); 
		    } 

}
