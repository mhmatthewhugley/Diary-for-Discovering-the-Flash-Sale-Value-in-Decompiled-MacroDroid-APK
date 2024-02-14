package p039n;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import p037m.C2007e;

/* renamed from: n.c */
/* compiled from: ThemeSingleton */
public class C2038c {

    /* renamed from: w */
    private static C2038c f6260w;

    /* renamed from: a */
    public boolean f6261a = false;
    @ColorInt

    /* renamed from: b */
    public int f6262b = 0;
    @ColorInt

    /* renamed from: c */
    public int f6263c = 0;

    /* renamed from: d */
    public ColorStateList f6264d = null;

    /* renamed from: e */
    public ColorStateList f6265e = null;

    /* renamed from: f */
    public ColorStateList f6266f = null;
    @ColorInt

    /* renamed from: g */
    public int f6267g = 0;
    @ColorInt

    /* renamed from: h */
    public int f6268h = 0;

    /* renamed from: i */
    public Drawable f6269i = null;
    @ColorInt

    /* renamed from: j */
    public int f6270j = 0;
    @ColorInt

    /* renamed from: k */
    public int f6271k = 0;

    /* renamed from: l */
    public ColorStateList f6272l = null;
    @DrawableRes

    /* renamed from: m */
    public int f6273m = 0;
    @DrawableRes

    /* renamed from: n */
    public int f6274n = 0;
    @DrawableRes

    /* renamed from: o */
    public int f6275o = 0;
    @DrawableRes

    /* renamed from: p */
    public int f6276p = 0;
    @DrawableRes

    /* renamed from: q */
    public int f6277q = 0;

    /* renamed from: r */
    public C2007e f6278r;

    /* renamed from: s */
    public C2007e f6279s;

    /* renamed from: t */
    public C2007e f6280t;

    /* renamed from: u */
    public C2007e f6281u;

    /* renamed from: v */
    public C2007e f6282v;

    public C2038c() {
        C2007e eVar = C2007e.START;
        this.f6278r = eVar;
        this.f6279s = eVar;
        this.f6280t = C2007e.END;
        this.f6281u = eVar;
        this.f6282v = eVar;
    }

    /* renamed from: a */
    public static C2038c m8429a() {
        return m8430b(true);
    }

    /* renamed from: b */
    public static C2038c m8430b(boolean z) {
        if (f6260w == null && z) {
            f6260w = new C2038c();
        }
        return f6260w;
    }
}
