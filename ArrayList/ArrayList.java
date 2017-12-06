package hadoop.com;

import java.util.Arrays;

public class ArrayList {
	private Object[] data;
	private int count = 0;
	private int size = 10;
	
	public ArrayList() {
		data = new Object[this.size];
}

//Method to insert an object
	public void insert(Object obj) {
		if(count == data.length) {
			//data.length = (data.length)*2;
			this.reSizeArray();
		}
		data[count++] =obj;
	}
	
//Method to remove an object from an index
	public Object remove(int index) {
		if(index < count) {
			Object obj = data[index];
			int temp = index;
			data[index] = null;

			while (temp < count) {
				data[temp] = data[temp + 1];
				data[temp + 1] = null;
				temp++;
			}

			count--;
			return obj;
		}else {
			throw new ArrayIndexOutOfBoundsException();
			}
	}
	
//
	public Object get(int index) {
		if (index < count) {
			return data[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
//Resizing the ArrayList
	public void reSizeArray() {
		data = Arrays.copyOf(data, data.length * 2);
	}
//Size of ArrayList
	public int size() {
		return count;
	}
}

