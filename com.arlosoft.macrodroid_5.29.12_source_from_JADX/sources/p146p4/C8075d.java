package p146p4;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p083e4.C7275g;
import p084e5.C7284c;
import p090f5.C7302a;
import p102h4.C7376a;
import p102h4.C7384g;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: p4.d */
/* compiled from: ByteBufferFileLoader */
public class C8075d implements C8105n<File, ByteBuffer> {

    /* renamed from: p4.d$a */
    /* compiled from: ByteBufferFileLoader */
    private static final class C8076a implements C7401d<ByteBuffer> {

        /* renamed from: a */
        private final File f19667a;

        C8076a(File file) {
            this.f19667a = file;
        }

        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo37430a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public void mo37435b() {
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: d */
        public C7376a mo37438d() {
            return C7376a.LOCAL;
        }

        /* renamed from: f */
        public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super ByteBuffer> aVar) {
            try {
                aVar.mo33008e(C7302a.m30174a(this.f19667a));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo33006c(e);
            }
        }
    }

    /* renamed from: p4.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C8077b implements C8107o<File, ByteBuffer> {
        @NonNull
        /* renamed from: a */
        public C8105n<File, ByteBuffer> mo38078a(@NonNull C8113r rVar) {
            return new C8075d();
        }
    }

    /* renamed from: c */
    public C8105n.C8106a<ByteBuffer> mo38074b(@NonNull File file, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(file), new C8076a(file));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull File file) {
        return true;
    }
}
