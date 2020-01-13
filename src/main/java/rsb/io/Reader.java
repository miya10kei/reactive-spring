package rsb.io;

import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;

public interface Reader {

    void read(File file, Consumer<Byte> consumer, Runnable f) throws IOException;
}
