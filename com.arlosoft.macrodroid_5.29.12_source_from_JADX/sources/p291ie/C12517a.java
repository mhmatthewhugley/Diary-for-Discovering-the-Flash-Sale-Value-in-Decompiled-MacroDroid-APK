package p291ie;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.LinkedList;
import org.mockito.exceptions.base.MockitoException;

/* renamed from: ie.a */
/* compiled from: IOUtil */
public class C12517a {
    /* renamed from: a */
    public static void m83626a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw new MockitoException("Problems closing stream: " + closeable, e);
            }
        }
    }

    /* renamed from: b */
    public static void m83627b(Closeable closeable) {
        try {
            m83626a(closeable);
        } catch (MockitoException unused) {
        }
    }

    /* renamed from: c */
    public static Collection<String> m83628c(InputStream inputStream) {
        LinkedList linkedList = new LinkedList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return linkedList;
                }
                linkedList.add(readLine);
            } catch (IOException e) {
                throw new MockitoException("Problems reading from: " + inputStream, e);
            }
        }
    }
}
