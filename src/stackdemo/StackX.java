package stackdemo;

/*
 * �������ڷ�װ��ջ����Լ��йص�ջ����
 */
public class StackX {

    private char[] stackArray;
    private int maxSize;
    private int top;

    public StackX(int s) {
	super();
	
	maxSize = s;
	stackArray = new char[maxSize];
	top = -1;
    }

    public void push(char j) {
	// TODO Auto-generated method stub
	stackArray[++top] = j;
    }

    public char pop() {
	// TODO Auto-generated method stub
	return stackArray[top--];
    }

    public char peek() {
	// TODO Auto-generated method stub
	return stackArray[top];
    }

    public boolean isEmpty() {
	return (top == -1);
    }

}
