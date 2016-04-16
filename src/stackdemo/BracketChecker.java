package stackdemo;

/*
 * 本类通过检查一个字符串中左右括号是否匹配的问题，加深对栈的理解
 * */
public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
	super();
	this.input = input;
    }

    public void check() {
	// TODO Auto-generated method stub
	int stackSize = input.length();
	StackX theStack = new StackX(stackSize);
	for (int j = 0; j < input.length(); j++) {
	    char ch = input.charAt(j);
	    switch (ch) {
	    case '{':
	    case '[':
	    case '(':
		theStack.push(ch);
		break;
	    case '}':
	    case ']':
	    case ')':
		if (!theStack.isEmpty()) {
		    char chx = theStack.pop();
		    if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
			    || (ch == ')' && chx != '(')) {
			System.out.println("Error: " + ch + " at " + j);
		    }
		} else {
		    System.out.println("Error: " + ch + " at " + j);
		}
	    default:
		break;
	    }
	}
	if (!theStack.isEmpty()) {
	    System.out.println("Error: missing right delimiter");
	}
    }

}
