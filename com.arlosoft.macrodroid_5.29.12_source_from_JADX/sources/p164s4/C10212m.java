package p164s4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p083e4.C7271c;
import p102h4.C7387j;
import p120k4.C7587c;
import p126l4.C7669d;

/* renamed from: s4.m */
/* compiled from: DrawableTransformation */
public class C10212m implements C7387j<Drawable> {

    /* renamed from: b */
    private final C7387j<Bitmap> f23333b;

    /* renamed from: c */
    private final boolean f23334c;

    public C10212m(C7387j<Bitmap> jVar, boolean z) {
        this.f23333b = jVar;
        this.f23334c = z;
    }

    /* renamed from: d */
    private C7587c<Drawable> m40179d(Context context, C7587c<Bitmap> cVar) {
        return C10216q.m40191d(context.getResources(), cVar);
    }

    @NonNull
    /* renamed from: a */
    public C7587c<Drawable> mo37386a(@NonNull Context context, @NonNull C7587c<Drawable> cVar, int i, int i2) {
        C7669d f = C7271c.m30011c(context).mo37143f();
        Drawable drawable = cVar.get();
        C7587c<Bitmap> a = C10210l.m40176a(f, drawable, i, i2);
        if (a != null) {
            C7587c<Bitmap> a2 = this.f23333b.mo37386a(context, a, i, i2);
            if (!a2.equals(a)) {
                return m40179d(context, a2);
            }
            a2.recycle();
            return cVar;
        } else if (!this.f23334c) {
            return cVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        this.f23333b.mo33009b(messageDigest);
    }

    /* renamed from: c */
    public C7387j<BitmapDrawable> mo40812c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10212m) {
            return this.f23333b.equals(((C10212m) obj).f23333b);
        }
        return false;
    }

    public int hashCode() {
        return this.f23333b.hashCode();
    }
}
