package p146p4;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p090f5.C7302a;
import p102h4.C7379d;
import p102h4.C7384g;

/* renamed from: p4.c */
/* compiled from: ByteBufferEncoder */
public class C8074c implements C7379d<ByteBuffer> {
    /* renamed from: c */
    public boolean mo37372a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull C7384g gVar) {
        try {
            C7302a.m30177d(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
