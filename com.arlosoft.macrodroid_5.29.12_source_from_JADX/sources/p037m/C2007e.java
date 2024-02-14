package p037m;

import androidx.core.view.GravityCompat;

/* renamed from: m.e */
/* compiled from: GravityEnum */
public enum C2007e {
    START,
    CENTER,
    END;
    

    /* renamed from: f */
    private static final boolean f6119f = false;

    /* renamed from: m.e$a */
    /* compiled from: GravityEnum */
    static /* synthetic */ class C2008a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6121a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                m.e[] r0 = p037m.C2007e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6121a = r0
                m.e r1 = p037m.C2007e.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6121a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.e r1 = p037m.C2007e.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6121a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m.e r1 = p037m.C2007e.END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p037m.C2007e.C2008a.<clinit>():void");
        }
    }

    static {
        f6119f = true;
    }

    /* renamed from: b */
    public int mo24057b() {
        int i = C2008a.f6121a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                throw new IllegalStateException("Invalid gravity constant");
            } else if (f6119f) {
                return GravityCompat.END;
            } else {
                return 5;
            }
        } else if (f6119f) {
            return GravityCompat.START;
        } else {
            return 3;
        }
    }

    /* renamed from: d */
    public int mo24058d() {
        int i = C2008a.f6121a[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}
