package p164s4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p102h4.C7380e;
import p126l4.C7669d;

/* renamed from: s4.h */
/* compiled from: CenterInside */
public class C10193h extends C10190e {

    /* renamed from: b */
    private static final byte[] f23302b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C7380e.f18044a);

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f23302b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo40792c(@NonNull C7669d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        return C10222u.m40211c(dVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C10193h;
    }

    public int hashCode() {
        return -670243078;
    }
}
