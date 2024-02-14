package p174u4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p090f5.C7315j;
import p120k4.C7586b;
import p120k4.C7587c;
import p185w4.C10336c;

/* renamed from: u4.b */
/* compiled from: DrawableResource */
public abstract class C10293b<T extends Drawable> implements C7587c<T>, C7586b {

    /* renamed from: a */
    protected final T f23450a;

    public C10293b(T t) {
        this.f23450a = (Drawable) C7315j.m30204d(t);
    }

    /* renamed from: a */
    public void mo37659a() {
        T t = this.f23450a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C10336c) {
            ((C10336c) t).mo40967e().prepareToDraw();
        }
    }

    @NonNull
    /* renamed from: c */
    public final T get() {
        Drawable.ConstantState constantState = this.f23450a.getConstantState();
        if (constantState == null) {
            return this.f23450a;
        }
        return constantState.newDrawable();
    }
}
