package p185w4;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p083e4.C7271c;
import p102h4.C7387j;
import p120k4.C7587c;
import p164s4.C10189d;

/* renamed from: w4.f */
/* compiled from: GifDrawableTransformation */
public class C10340f implements C7387j<C10336c> {

    /* renamed from: b */
    private final C7387j<Bitmap> f23527b;

    /* JADX WARNING: type inference failed for: r1v0, types: [h4.j<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10340f(p102h4.C7387j<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p090f5.C7315j.m30204d(r1)
            h4.j r1 = (p102h4.C7387j) r1
            r0.f23527b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p185w4.C10340f.<init>(h4.j):void");
    }

    @NonNull
    /* renamed from: a */
    public C7587c<C10336c> mo37386a(@NonNull Context context, @NonNull C7587c<C10336c> cVar, int i, int i2) {
        C10336c cVar2 = cVar.get();
        C10189d dVar = new C10189d(cVar2.mo40967e(), C7271c.m30011c(context).mo37143f());
        C7587c<Bitmap> a = this.f23527b.mo37386a(context, dVar, i, i2);
        if (!dVar.equals(a)) {
            dVar.recycle();
        }
        cVar2.mo40977m(this.f23527b, a.get());
        return cVar;
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        this.f23527b.mo33009b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10340f) {
            return this.f23527b.equals(((C10340f) obj).f23527b);
        }
        return false;
    }

    public int hashCode() {
        return this.f23527b.hashCode();
    }
}
