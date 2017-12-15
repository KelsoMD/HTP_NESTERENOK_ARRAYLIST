package by.htp.homework4;

public class MyAL {
	int[] myAL;
	int size;

	public MyAL() {
		myAL = new int[0];
	}

	public MyAL(int x) {
		myAL = new int[x];
	}

	public int myALsize() {
		return myAL.length;
	}

	public boolean myALEmpty() {
		boolean res = false;
		if (myAL.length == 0) {
			res = true;
		}
		return res;
	}

	public boolean myALContains(int x) {
		boolean res = false;
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] == x) {
				res = true;
			}
		}
		return res;
	}

	public int myALindexOF(int x) {
		int res = -1;
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] == x) {
				res = i;
				break;
			}
		}
		return res;
	}

	public int myALlastIndexOF(int x) {
		int res = -1;
		for (int i = myAL.length - 1; i >= 0; i--) {
			if (myAL[i] == x) {
				res = i;
				break;
			}
		}
		return res;
	}

	public int myALget(int index) {
		if (index > myAL.length - 1) {
			System.out.println("Out of bounds!!!");
			return -1;
		}
		int res = myAL[index];
		return res;
	}

	public void myALset(int index, int value) {
		if (index > myAL.length - 1) {
			System.out.println("Out of bounds!!!");
		}
		myAL[index] = value;
	}

	public void myALadd(int value) {
		int[] temp = new int[myAL.length + 1];
		for (int i = 0; i < myAL.length; i++) {
			temp[i] = myAL[i];
		}
		temp[myAL.length] = value;
		myAL = temp;
	}

	public void myALadd(int index, int value) {
		int[] temp = new int[myAL.length + 1];
		if (index == 0) {
			for (int i = 1; i < myAL.length + 1; i++) {
				temp[i] = myAL[i];
			}
			temp[0] = value;
			myAL = temp;
		} else {
			for (int i = 0; i < index; i++) {
				temp[i] = myAL[i];
			}
			temp[index] = value;
			for (int i = index + 1; i < myAL.length; i++) {
				temp[i] = myAL[i];
			}
			myAL = temp;
		}
	}

	public void myALremoveByIndex(int index) {
		int[] temp = new int[myAL.length - 1];

		if (index == 0) {
			for (int i = 0; i < temp.length; i++) {
				temp[i] = myAL[i + 1];
			}
			myAL = temp;
		} else {
			for (int i = 0; i < index; i++) {
				temp[i] = myAL[i];
			}
			for (int i = index; i < temp.length; i++) {
				temp[i] = myAL[i + 1];
			}
		}
		myAL = temp;
	}

	public void myALremoveByValue(int value) {
		int[] temp = new int[myAL.length - 1];
		int index = this.myALindexOF(value);
		if (index == -1) {
			System.out.println("There is no such value. Sorry!");
			return;
		}
		if (index == 0) {
			for (int i = 0; i < temp.length; i++) {
				temp[i] = myAL[i + 1];
			}
			myAL = temp;
		} else {
			for (int i = 0; i < index; i++) {
				temp[i] = myAL[i];
			}
			for (int i = index; i < temp.length; i++) {
				temp[i] = myAL[i + 1];
			}
		}
		myAL = temp;
	}

	public void myALclear() {
		myAL = new int[0];
	}

	public void myALremoveRange(int fromIndex, int toIndex) {
		int[] temp = new int[myAL.length - (toIndex - fromIndex+1)];
		for (int i = 0; i < fromIndex-1; i++) {
			temp[i] = myAL[i];
		}
		int j = 0;
		for (int i = toIndex; i < myAL.length; i++) {
			temp[fromIndex-1+j] = myAL[i];
			j++;
		}
		myAL = temp;
	}

	public void setLength(int length) {
		myAL = new int[length];
	}

	public void printmyAL() {
		if (myAL.length == 0) {
			System.out.println("myAL is empty!");
		} else {
			for (int i = 0; i < myAL.length; i++) {
				System.out.print(myAL[i] + " ");
			}
			System.out.println();
		}
	}

	public void sortALAscend() {
		int bubble = 0;
		int flag = 1;
		while (flag != 0) {
			flag = 0;
			for (int i = 1; i < myAL.length; i++) {
				if (myAL[i - 1] > myAL[i]) {
					flag++;
					bubble = myAL[i];
					myAL[i] = myAL[i - 1];
					myAL[i - 1] = bubble;
				}
			}
		}
	}

	public void sortALDescend() {
		int bubble = 0;
		int flag = 1;
		while (flag != 0) {
			flag = 0;
			for (int i = 1; i < myAL.length; i++) {
				if (myAL[i - 1] < myAL[i]) {
					flag++;
					bubble = myAL[i];
					myAL[i] = myAL[i - 1];
					myAL[i - 1] = bubble;
				}
			}
		}
	}

	public void fillWithInt() {
		for (int i = 0; i < myAL.length; i++) {
			myAL[i] = (int) (Math.random() * 100);
		}
	}

	public void swapmyAL() {
		int j = myAL.length - 1;
		int[] temp = new int[myAL.length];
		for (int i = 0; i < myAL.length; i++) {
			temp[j] = myAL[i];
			j--;
		}
		myAL = temp;
	}

	public int returnOddResidual() {
		int residual = 0;
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] % 2 != 0 && myAL[i] != 0) {
				residual = residual - myAL[i];
			}
		}
		return residual;
	}

	public int oddNumber() {
		int odd = 0;
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] % 2 != 0 && myAL[i] != 0) {
				odd++;
			}
		}
		return odd;
	}

	public int evenNumber() {
		int even = 0;
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] % 2 == 0 && myAL[i] != 0) {
				even++;
			}
		}
		return even;
	}

	public int evenMax() {
		int max = myAL[0];
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] % 2 == 0 && myAL[i] != 0 && myAL[i] > max) {
				max = myAL[i];
			}
		}
		return max;
	}

	public int evenMin() {
		int min = 1;
		for (int j = 0; j < myAL.length; j++) {
			if (myAL[j] != 0 && myAL[j] % 2 != 0) {
				continue;
			} else {
				min = myAL[j];
				break;
			}
		}
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] % 2 == 0 && myAL[i] != 0 && myAL[i] < min) {
				min = myAL[i];
			}
		}
		return min;
	}

	public int oddMax() {
		int max = myAL[0];
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] % 2 != 0 && myAL[i] != 0 && myAL[i] > max) {
				max = myAL[i];
			}
		}
		return max;
	}

	public int oddMin() {
		int min = 1;
		for (int j = 0; j < myAL.length; j++) {
			if (myAL[j] % 2 == 0 && myAL[j] != 0) {
				continue;
			} else {
				min = myAL[j];
				break;
			}
		}
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] % 2 != 0 && myAL[i] != 0 && myAL[i] < min) {
				min = myAL[i];
			}
		}
		return min;
	}

	public void myALremoveByDevisible(int value) {
		int count = 0;
		for (int i = 0; i < myAL.length; i++) {
			if (myAL[i] != 0 && myAL[i] % 3 == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			int index = 0;
			for (int j = 0; j < myAL.length; j++) {
				if (myAL[j] != 0 && myAL[j] % 3 == 0) {
					index = j;
					break;
				}
			}
			this.myALremoveByIndex(index);
		}
	}
}