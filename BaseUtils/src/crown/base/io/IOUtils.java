package crown.base.io;

import java.io.Closeable;
import crown.base.util.Debug;

public class IOUtils {
	public static void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (Throwable t) {
				Debug.err("IOUtils|close", t);
			} finally {
				closeable = null;
			}
		}
	}
	
}

