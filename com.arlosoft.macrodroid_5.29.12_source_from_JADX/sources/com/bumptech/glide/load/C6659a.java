package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p126l4.C7667b;
import p164s4.C10217r;

/* renamed from: com.bumptech.glide.load.a */
/* compiled from: ImageHeaderParserUtils */
public final class C6659a {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m25236a(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C7667b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10217r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int a = list.get(i).mo32976a(inputStream, bVar);
                if (a != -1) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    /* renamed from: b */
    public static ImageHeaderParser.ImageType m25237b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C7667b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10217r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                ImageHeaderParser.ImageType c = list.get(i).mo32978c(inputStream);
                if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                    inputStream.reset();
                    return c;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    /* renamed from: c */
    public static ImageHeaderParser.ImageType m25238c(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType b = list.get(i).mo32977b(byteBuffer);
            if (b != ImageHeaderParser.ImageType.UNKNOWN) {
                return b;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
