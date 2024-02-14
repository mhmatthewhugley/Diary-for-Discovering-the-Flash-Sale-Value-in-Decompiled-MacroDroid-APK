package p095g4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* renamed from: g4.a */
/* compiled from: GifDecoder */
public interface C7333a {

    /* renamed from: g4.a$a */
    /* compiled from: GifDecoder */
    public interface C7334a {
        /* renamed from: a */
        void mo37307a(@NonNull Bitmap bitmap);

        @NonNull
        /* renamed from: b */
        byte[] mo37308b(int i);

        @NonNull
        /* renamed from: c */
        Bitmap mo37309c(int i, int i2, @NonNull Bitmap.Config config);

        @NonNull
        /* renamed from: d */
        int[] mo37310d(int i);

        /* renamed from: e */
        void mo37311e(@NonNull byte[] bArr);

        /* renamed from: f */
        void mo37312f(@NonNull int[] iArr);
    }

    /* renamed from: a */
    int mo37297a();

    @Nullable
    /* renamed from: b */
    Bitmap mo37298b();

    /* renamed from: c */
    void mo37299c();

    void clear();

    /* renamed from: d */
    int mo37301d();

    /* renamed from: e */
    void mo37302e(@NonNull Bitmap.Config config);

    /* renamed from: f */
    int mo37303f();

    /* renamed from: g */
    void mo37304g();

    @NonNull
    ByteBuffer getData();

    /* renamed from: h */
    int mo37306h();
}
