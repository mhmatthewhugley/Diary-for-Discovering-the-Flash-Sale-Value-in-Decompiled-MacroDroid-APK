package p132m4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: m4.i */
/* compiled from: MemorySizeCalculator */
public final class C7925i {

    /* renamed from: a */
    private final int f19031a;

    /* renamed from: b */
    private final int f19032b;

    /* renamed from: c */
    private final Context f19033c;

    /* renamed from: d */
    private final int f19034d;

    /* renamed from: m4.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C7926a {

        /* renamed from: i */
        static final int f19035i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f19036a;

        /* renamed from: b */
        ActivityManager f19037b;

        /* renamed from: c */
        C7928c f19038c;

        /* renamed from: d */
        float f19039d = 2.0f;

        /* renamed from: e */
        float f19040e = ((float) f19035i);

        /* renamed from: f */
        float f19041f = 0.4f;

        /* renamed from: g */
        float f19042g = 0.33f;

        /* renamed from: h */
        int f19043h = 4194304;

        public C7926a(Context context) {
            this.f19036a = context;
            this.f19037b = (ActivityManager) context.getSystemService("activity");
            this.f19038c = new C7927b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C7925i.m33144e(this.f19037b)) {
                this.f19040e = 0.0f;
            }
        }

        /* renamed from: a */
        public C7925i mo37824a() {
            return new C7925i(this);
        }
    }

    /* renamed from: m4.i$b */
    /* compiled from: MemorySizeCalculator */
    private static final class C7927b implements C7928c {

        /* renamed from: a */
        private final DisplayMetrics f19044a;

        C7927b(DisplayMetrics displayMetrics) {
            this.f19044a = displayMetrics;
        }

        /* renamed from: a */
        public int mo37825a() {
            return this.f19044a.heightPixels;
        }

        /* renamed from: b */
        public int mo37826b() {
            return this.f19044a.widthPixels;
        }
    }

    /* renamed from: m4.i$c */
    /* compiled from: MemorySizeCalculator */
    interface C7928c {
        /* renamed from: a */
        int mo37825a();

        /* renamed from: b */
        int mo37826b();
    }

    C7925i(C7926a aVar) {
        int i;
        this.f19033c = aVar.f19036a;
        if (m33144e(aVar.f19037b)) {
            i = aVar.f19043h / 2;
        } else {
            i = aVar.f19043h;
        }
        this.f19034d = i;
        int c = m33143c(aVar.f19037b, aVar.f19041f, aVar.f19042g);
        float b = (float) (aVar.f19038c.mo37826b() * aVar.f19038c.mo37825a() * 4);
        int round = Math.round(aVar.f19040e * b);
        int round2 = Math.round(b * aVar.f19039d);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f19032b = round2;
            this.f19031a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f19040e;
            float f3 = aVar.f19039d;
            float f4 = f / (f2 + f3);
            this.f19032b = Math.round(f3 * f4);
            this.f19031a = Math.round(f4 * aVar.f19040e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m33145f(this.f19032b));
            sb.append(", pool size: ");
            sb.append(m33145f(this.f19031a));
            sb.append(", byte array size: ");
            sb.append(m33145f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(m33145f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f19037b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m33144e(aVar.f19037b));
        }
    }

    /* renamed from: c */
    private static int m33143c(ActivityManager activityManager, float f, float f2) {
        boolean e = m33144e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: e */
    static boolean m33144e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: f */
    private String m33145f(int i) {
        return Formatter.formatFileSize(this.f19033c, (long) i);
    }

    /* renamed from: a */
    public int mo37821a() {
        return this.f19034d;
    }

    /* renamed from: b */
    public int mo37822b() {
        return this.f19031a;
    }

    /* renamed from: d */
    public int mo37823d() {
        return this.f19032b;
    }
}
