DUE DATE  : 16/12/21

WAP TO FIND SUM AND DIFFERENCE OF TWO NUMBERS USING COMMAND LINES ARGUMENTS

class SumDiff{
	public static void main(String[] args){
	int a,b;
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	int sum = a+b;
	int diff = a-b;
	System.out.println("The sum is :"+sum);
	System.out.println("The difference is :"+diff);
	}
}
