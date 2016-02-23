package implementing.list.interfacE;

import java.util.Arrays;

public class MyList {
	private Object[] objects = null;
	private int size = 0;

	public MyList() {
		objects = new Object[10];
	}
	
	public void addObject(Object obj) {
		if((objects.length - size) < 5){
			incrementObjectArraySize();
		}
		objects[size++] = obj;
	}
	
	public Object getObject(final int index){
		if(index < size){
			return objects[index];
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public Object removeObject(final int index){
		if(index < size){
			Object object = objects[index];
			objects[index] = null;
			int tmp = index;
			while (tmp < size) {
				objects[tmp] = objects[tmp + 1];
				objects[tmp + 1] = null;
				tmp++;
			}
			size--;
			return object;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	private void incrementObjectArraySize() {
		objects = Arrays.copyOf(objects, (objects.length + (objects.length/2)));
		System.out.println("New length: "+objects.length);
	}
	
	public static void main(String[] args) {
		MyList myLists = new MyList();
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		myLists.addObject("aaaaaa");
		System.out.println(myLists);
	}
}
