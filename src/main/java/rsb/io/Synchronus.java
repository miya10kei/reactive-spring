package rsb.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.function.Consumer;
import org.springframework.util.FileCopyUtils;

public class Synchronus implements Reader {

    @Override
    public void read(File file, Consumer<Byte> consumer, Runnable f) throws IOException {
        try (var in = new FileInputStream(file)) {
            var data = new byte[FileCopyUtils.BUFFER_SIZE];
            int res;
            while ((res = in.read(data, 0, data.length)) != -1) {
                consumer.accept(Bytes.from);
            }
        }

    }
}
