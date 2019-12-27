class Add{
public int add(int a, int b){
int sum = a+b;
return sum;
}

public float add(float a, float b) {
	return a+b;
}

public String add(String a, String b) {
	String result = a+b;
	return result;
} 
}
class Calculator{
public static void main(String[] args){
	Add add = new Add();
System.out.println(add.add(2,3));
}
}