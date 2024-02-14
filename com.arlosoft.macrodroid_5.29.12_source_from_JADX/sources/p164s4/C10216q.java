package p164s4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p090f5.C7315j;
import p120k4.C7586b;
import p120k4.C7587c;

/* renamed from: s4.q */
/* compiled from: LazyBitmapDrawableResource */
public final class C10216q implements C7587c<BitmapDrawable>, C7586b {

    /* renamed from: a */
    private final Resources f23340a;

    /* renamed from: c */
    private final C7587c<Bitmap> f23341c;

    private C10216q(@NonNull Resources resources, @NonNull C7587c<Bitmap> cVar) {
        this.f23340a = (Resources) C7315j.m30204d(resources);
        this.f23341c = (C7587c) C7315j.m30204d(cVar);
    }

    @Nullable
    /* renamed from: d */
    public static C7587c<BitmapDrawable> m40191d(@NonNull Resources resources, @Nullable C7587c<Bitmap> cVar) {
        if (cVar == null) {
            return null;
        }
        return new C10216q(resources, cVar);
    }

    /* renamed from: a */
    public void mo37659a() {
        C7587c<Bitmap> cVar = this.f23341c;
        if (cVar instanceof C7586b) {
            ((C7586b) cVar).mo37659a();
        }
    }

    @NonNull
    /* renamed from: b */
    public Class<BitmapDrawable> mo33103b() {
        return BitmapDrawable.class;
    }

    @NonNull
    /* renamed from: c */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f23340a, this.f23341c.get());
    }

    public int getSize() {
        return this.f23341c.getSize();
    }

    public void recycle() {
        this.f23341c.recycle();
    }
}
