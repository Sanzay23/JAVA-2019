DUE DATE : 16/12/2021 Submitted : 16/12/21


IMPLEMENTATION OF ABSTRACT CLASS

	AbstractClass.java
	abstract class AbstractClass
			{
			abstract void help();
			}

	AbsDemo.java
	class AbsDemo extends AbstractClass{
	public void help(){
	System.out.println("Abclass methode overide....");
	}
	public static void main(String[] args) {
		AbstractClass abClass = new AbsDemo();
		abClass.help();
	}
}
