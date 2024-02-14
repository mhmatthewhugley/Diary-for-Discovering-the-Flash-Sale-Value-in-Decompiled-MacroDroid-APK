package p419ve;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ve.a */
/* compiled from: FileUtils */
public class C16771a extends C16772b {
    /* renamed from: b */
    public static void m99479b(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C16773c.m99485d(new BufferedInputStream(fileInputStream), outputStream);
        } finally {
            C16773c.m99483b(fileInputStream);
        }
    }

    /* renamed from: c */
    public static void m99480c(InputStream inputStream, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            C16773c.m99485d(inputStream, bufferedOutputStream);
        } finally {
            C16773c.m99484c(bufferedOutputStream);
        }
    }
}
