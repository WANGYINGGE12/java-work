package lianxi;

public abstract class A {
	String name;
	int stic;
	A(String name,int stic){
		this.name=name;
		this.stic=stic;
	}
	abstract void cry();
	String getAname() {
		return name;
	}

}
