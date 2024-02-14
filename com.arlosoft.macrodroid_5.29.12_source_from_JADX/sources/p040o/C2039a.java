package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import p037m.C2007e;
import p037m.C2009f;

/* renamed from: o.a */
/* compiled from: DialogUtils */
public class C2039a {

    /* renamed from: o.a$a */
    /* compiled from: DialogUtils */
    static class C2040a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2009f f6283a;

        /* renamed from: c */
        final /* synthetic */ C2009f.C2014d f6284c;

        C2040a(C2009f fVar, C2009f.C2014d dVar) {
            this.f6283a = fVar;
            this.f6284c = dVar;
        }

        public void run() {
            this.f6283a.mo24067r().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f6284c.mo24090j().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f6283a.mo24067r(), 1);
            }
        }
    }

    /* renamed from: o.a$b */
    /* compiled from: DialogUtils */
    static /* synthetic */ class C2041b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6285a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                m.e[] r0 = p037m.C2007e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6285a = r0
                m.e r1 = p037m.C2007e.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6285a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.e r1 = p037m.C2007e.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C2039a.C2041b.<clinit>():void");
        }
    }

    @ColorInt
    /* renamed from: a */
    public static int m8431a(@ColorInt int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: b */
    public static ColorStateList m8432b(Context context, int i) {
        int l = m8442l(context, 16842806);
        if (i == 0) {
            i = l;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m8431a(i, 0.4f), i});
    }

    @ColorInt
    /* renamed from: c */
    public static int m8433c(Context context, @ColorRes int i) {
        return ContextCompat.getColor(context, i);
    }

    @ColorInt
    /* renamed from: d */
    public static int m8434d(Context context) {
        return m8431a(m8437g(m8442l(context, 16842806)) ? ViewCompat.MEASURED_STATE_MASK : -1, 0.3f);
    }

    /* renamed from: e */
    private static int m8435e(C2007e eVar) {
        int i = C2041b.f6285a[eVar.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public static void m8436f(@NonNull DialogInterface dialogInterface, @NonNull C2009f.C2014d dVar) {
        InputMethodManager inputMethodManager;
        C2009f fVar = (C2009f) dialogInterface;
        if (fVar.mo24067r() != null && (inputMethodManager = (InputMethodManager) dVar.mo24090j().getSystemService("input_method")) != null) {
            View currentFocus = fVar.getCurrentFocus();
            IBinder iBinder = null;
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else if (fVar.mo24072t() != null) {
                iBinder = fVar.mo24072t().getWindowToken();
            }
            if (iBinder != null) {
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }
    }

    /* renamed from: g */
    public static boolean m8437g(@ColorInt int i) {
        return 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: h */
    public static <T> boolean m8438h(@NonNull T t, @Nullable T[] tArr) {
        if (!(tArr == null || tArr.length == 0)) {
            for (T equals : tArr) {
                if (equals.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static ColorStateList m8439i(Context context, @AttrRes int i, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            int i2 = peekValue.type;
            if (i2 < 28 || i2 > 31) {
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList2 != null) {
                    obtainStyledAttributes.recycle();
                    return colorStateList2;
                }
                obtainStyledAttributes.recycle();
                return colorStateList;
            }
            ColorStateList b = m8432b(context, peekValue.data);
            obtainStyledAttributes.recycle();
            return b;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public static boolean m8440j(Context context, @AttrRes int i) {
        return m8441k(context, i, false);
    }

    /* renamed from: k */
    public static boolean m8441k(Context context, @AttrRes int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @ColorInt
    /* renamed from: l */
    public static int m8442l(Context context, @AttrRes int i) {
        return m8443m(context, i, 0);
    }

    @ColorInt
    /* renamed from: m */
    public static int m8443m(Context context, @AttrRes int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: n */
    public static int m8444n(Context context, @AttrRes int i) {
        return m8445o(context, i, -1);
    }

    /* renamed from: o */
    private static int m8445o(Context context, @AttrRes int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: p */
    public static Drawable m8446p(Context context, @AttrRes int i) {
        return m8447q(context, i, (Drawable) null);
    }

    /* renamed from: q */
    private static Drawable m8447q(Context context, @AttrRes int i, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    public static C2007e m8448r(Context context, @AttrRes int i, C2007e eVar) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int i2 = obtainStyledAttributes.getInt(0, m8435e(eVar));
            if (i2 == 1) {
                C2007e eVar2 = C2007e.CENTER;
                obtainStyledAttributes.recycle();
                return eVar2;
            } else if (i2 != 2) {
                return C2007e.START;
            } else {
                C2007e eVar3 = C2007e.END;
                obtainStyledAttributes.recycle();
                return eVar3;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    public static String m8449s(Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }

    /* renamed from: t */
    public static void m8450t(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: u */
    public static void m8451u(@NonNull DialogInterface dialogInterface, @NonNull C2009f.C2014d dVar) {
        C2009f fVar = (C2009f) dialogInterface;
        if (fVar.mo24067r() != null) {
            fVar.mo24067r().post(new C2040a(fVar, dVar));
        }
    }
}
