package crown.base.util;

import java.io.FileOutputStream;
import java.io.PrintStream;
import crown.base.err.ThrowableInfo;

public class Debug {
	public static void info(String txt, String file) {
		p2f(TimeUtils.now() + " " + txt, file);
	}
	
	public static void err(String txt, Throwable t, String file) {
		p2f(TimeUtils.now() + " " + txt + " |" + new ThrowableInfo(t), file);
	}
	
	@SuppressWarnings("resource")
	public static void p2f(String txt, String file) {
		try {
			FileOutputStream f = new FileOutputStream(file, true);
			new PrintStream(f).println(txt);
		} catch (Throwable t) {
			err("CrownBase|Debug|log", t);
		}
	}
	
	public static void p(String txt) {
		p(txt, System.out);
	}
	
	public static void p(String txt, PrintStream out) {
		if(out != null) {
			out.println(txt);
		}
	}
	
	public static void err(String txt, Throwable t, PrintStream out) {
		if(out != null) {
			out.println(TimeUtils.now() + " " + txt + " |" + new ThrowableInfo(t));
		}
	}
	
	public static void err(String txt, Throwable t) {
		err(txt, t, System.err);
	}
	
	public static void main(String [] args) {
		err("yy", new RuntimeException("xxxx"), "d:/xx.txt");
	}
}
