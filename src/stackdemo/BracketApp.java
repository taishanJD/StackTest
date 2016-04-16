package stackdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketApp {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	String input;
	while(true) {
	    System.out.println("Input string containing delimiters:");
	    System.out.flush();
	    input = getString();
	    if(input.equals("")) {
		break;
	    }
	    BracketChecker theCheck = new BracketChecker(input);
	    theCheck.check();
	}
    }

    /*
     * 从键盘读取输入信息
     * */
    public static String getString() throws IOException {
	// TODO Auto-generated method stub
	BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
	String s = bufr.readLine();
	return s;
    }
    
    

}
