package com.google.api.client.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class IOUtils {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static long m72692a(StreamingContent streamingContent) throws IOException {
        ByteCountingOutputStream byteCountingOutputStream = new ByteCountingOutputStream();
        try {
            streamingContent.writeTo(byteCountingOutputStream);
            byteCountingOutputStream.close();
            return byteCountingOutputStream.f52743a;
        } catch (Throwable th) {
            byteCountingOutputStream.close();
            throw th;
        }
    }

    /* renamed from: b */
    public static void m72693b(InputStream inputStream, OutputStream outputStream) throws IOException {
        m72694c(inputStream, outputStream, true);
    }

    /* renamed from: c */
    public static void m72694c(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        try {
            ByteStreams.m72637a(inputStream, outputStream);
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    /* renamed from: d */
    public static <S extends Serializable> S m72695d(InputStream inputStream) throws IOException {
        try {
            S s = (Serializable) new ObjectInputStream(inputStream).readObject();
            inputStream.close();
            return s;
        } catch (ClassNotFoundException e) {
            IOException iOException = new IOException("Failed to deserialize object");
            iOException.initCause(e);
            throw iOException;
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* renamed from: e */
    public static <S extends Serializable> S m72696e(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return m72695d(new ByteArrayInputStream(bArr));
    }

    /* renamed from: f */
    public static void m72697f(Object obj, OutputStream outputStream) throws IOException {
        try {
            new ObjectOutputStream(outputStream).writeObject(obj);
        } finally {
            outputStream.close();
        }
    }

    /* renamed from: g */
    public static byte[] m72698g(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m72697f(obj, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
