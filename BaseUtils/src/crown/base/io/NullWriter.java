package crown.base.io;

import java.io.Writer;

public class NullWriter extends Writer {
	public void close() {}

	public void flush() {}

	public void write(char[] cbuf, int off, int len) {}
}
