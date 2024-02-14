package p164s4;

import p102h4.C7381f;

/* renamed from: s4.j */
/* compiled from: DownsampleStrategy */
public abstract class C10199j {

    /* renamed from: a */
    public static final C10199j f23308a = new C10204e();

    /* renamed from: b */
    public static final C10199j f23309b;

    /* renamed from: c */
    public static final C10199j f23310c = new C10200a();

    /* renamed from: d */
    public static final C10199j f23311d = new C10201b();

    /* renamed from: e */
    public static final C10199j f23312e = new C10202c();

    /* renamed from: f */
    public static final C10199j f23313f = new C10205f();

    /* renamed from: g */
    public static final C10199j f23314g;

    /* renamed from: h */
    public static final C7381f<C10199j> f23315h;

    /* renamed from: s4.j$a */
    /* compiled from: DownsampleStrategy */
    private static class C10200a extends C10199j {
        C10200a() {
        }

        /* renamed from: a */
        public C10206g mo40804a(int i, int i2, int i3, int i4) {
            return C10206g.QUALITY;
        }

        /* renamed from: b */
        public float mo40805b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: s4.j$b */
    /* compiled from: DownsampleStrategy */
    private static class C10201b extends C10199j {
        C10201b() {
        }

        /* renamed from: a */
        public C10206g mo40804a(int i, int i2, int i3, int i4) {
            return C10206g.MEMORY;
        }

        /* renamed from: b */
        public float mo40805b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: s4.j$c */
    /* compiled from: DownsampleStrategy */
    private static class C10202c extends C10199j {
        C10202c() {
        }

        /* renamed from: a */
        public C10206g mo40804a(int i, int i2, int i3, int i4) {
            return C10206g.QUALITY;
        }

        /* renamed from: b */
        public float mo40805b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C10199j.f23308a.mo40805b(i, i2, i3, i4));
        }
    }

    /* renamed from: s4.j$d */
    /* compiled from: DownsampleStrategy */
    private static class C10203d extends C10199j {
        C10203d() {
        }

        /* renamed from: a */
        public C10206g mo40804a(int i, int i2, int i3, int i4) {
            return C10206g.QUALITY;
        }

        /* renamed from: b */
        public float mo40805b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: s4.j$e */
    /* compiled from: DownsampleStrategy */
    private static class C10204e extends C10199j {
        C10204e() {
        }

        /* renamed from: a */
        public C10206g mo40804a(int i, int i2, int i3, int i4) {
            return C10206g.QUALITY;
        }

        /* renamed from: b */
        public float mo40805b(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: s4.j$f */
    /* compiled from: DownsampleStrategy */
    private static class C10205f extends C10199j {
        C10205f() {
        }

        /* renamed from: a */
        public C10206g mo40804a(int i, int i2, int i3, int i4) {
            return C10206g.QUALITY;
        }

        /* renamed from: b */
        public float mo40805b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: s4.j$g */
    /* compiled from: DownsampleStrategy */
    public enum C10206g {
        MEMORY,
        QUALITY
    }

    static {
        C10203d dVar = new C10203d();
        f23309b = dVar;
        f23314g = dVar;
        f23315h = C7381f.m30485f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract C10206g mo40804a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo40805b(int i, int i2, int i3, int i4);
}
