package practice1;

public class GoodDog {
private int size;
public int getsize(){
	return size;
}
public void setSize(int s){
	size = s;
}
void bark(){
	if(size > 60){
		System.out.println("big dog");
	}
	else if(size > 14){
		System.out.println("middle dog");
	} else
	{System.out.println("puppy");
}
}
}