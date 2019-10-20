package lesson4.Quiz;

class MyClass {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass(new MyClass());//calls constructor of myClass
		a.anotherMethod();
	}

	void myMethod() {
		System.out.println("hello");
		System.out.println("finally mymethod in execuited");
	}
}

class AnotherClass {
	MyClass m;

	AnotherClass(MyClass m) {
		this.m = m;
		anotherMethod();
		System.out.println("Another method in Another class is called");
	}

	void anotherMethod() {
		m.myMethod();
		System.out.println("AgainAnother method calls Another mymethod is called");
	}
}
