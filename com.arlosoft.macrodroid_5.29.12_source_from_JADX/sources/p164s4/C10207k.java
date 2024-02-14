package p164s4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C6659a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p090f5.C7311f;
import p090f5.C7315j;
import p090f5.C7316k;
import p102h4.C7377b;
import p102h4.C7381f;
import p102h4.C7384g;
import p120k4.C7587c;
import p126l4.C7667b;
import p126l4.C7669d;
import p164s4.C10199j;

/* renamed from: s4.k */
/* compiled from: Downsampler */
public final class C10207k {

    /* renamed from: f */
    public static final C7381f<C7377b> f23319f = C7381f.m30485f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C7377b.f18038d);
    @Deprecated

    /* renamed from: g */
    public static final C7381f<C10199j> f23320g = C10199j.f23315h;

    /* renamed from: h */
    public static final C7381f<Boolean> f23321h;

    /* renamed from: i */
    public static final C7381f<Boolean> f23322i;

    /* renamed from: j */
    private static final Set<String> f23323j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k */
    private static final C10209b f23324k = new C10208a();

    /* renamed from: l */
    private static final Set<ImageHeaderParser.ImageType> f23325l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m */
    private static final Queue<BitmapFactory.Options> f23326m = C7316k.m30210e(0);

    /* renamed from: a */
    private final C7669d f23327a;

    /* renamed from: b */
    private final DisplayMetrics f23328b;

    /* renamed from: c */
    private final C7667b f23329c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f23330d;

    /* renamed from: e */
    private final C10215p f23331e = C10215p.m40188a();

    /* renamed from: s4.k$a */
    /* compiled from: Downsampler */
    class C10208a implements C10209b {
        C10208a() {
        }

        /* renamed from: a */
        public void mo40810a(C7669d dVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo40811b() {
        }
    }

    /* renamed from: s4.k$b */
    /* compiled from: Downsampler */
    public interface C10209b {
        /* renamed from: a */
        void mo40810a(C7669d dVar, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo40811b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f23321h = C7381f.m30485f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f23322i = C7381f.m30485f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C10207k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C7669d dVar, C7667b bVar) {
        this.f23330d = list;
        this.f23328b = (DisplayMetrics) C7315j.m30204d(displayMetrics);
        this.f23327a = (C7669d) C7315j.m30204d(dVar);
        this.f23329c = (C7667b) C7315j.m30204d(bVar);
    }

    /* renamed from: a */
    private static int m40150a(double d) {
        int j = m40157j(d);
        int t = m40165t(((double) j) * d);
        return m40165t((d / ((double) (((float) t) / ((float) j)))) * ((double) t));
    }

    /* renamed from: b */
    private void m40151b(InputStream inputStream, C7377b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f23331e.mo40813c(i, i2, options, bVar, z, z2)) {
            if (bVar != C7377b.PREFER_ARGB_8888) {
                boolean z3 = false;
                try {
                    z3 = C6659a.m25237b(this.f23330d, inputStream, this.f23329c).hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine whether the image has alpha or not from header, format ");
                        sb.append(bVar);
                    }
                }
                Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    /* renamed from: c */
    private static void m40152c(ImageHeaderParser.ImageType imageType, InputStream inputStream, C10209b bVar, C7669d dVar, C10199j jVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        double d;
        ImageHeaderParser.ImageType imageType2 = imageType;
        C10199j jVar2 = jVar;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 <= 0 || i12 <= 0) {
            String str = "x";
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i13);
                sb.append(str);
                sb.append(i14);
                sb.append("]");
                return;
            }
            return;
        }
        if (i10 == 90 || i10 == 270) {
            f = jVar2.mo40805b(i12, i11, i13, i14);
        } else {
            f = jVar2.mo40805b(i11, i12, i13, i14);
        }
        if (f > 0.0f) {
            C10199j.C10206g a = jVar2.mo40804a(i11, i12, i13, i14);
            if (a != null) {
                float f2 = (float) i11;
                float f3 = (float) i12;
                String str2 = "Downsampler";
                String str3 = "x";
                int t = i11 / m40165t((double) (f * f2));
                int t2 = i12 / m40165t((double) (f * f3));
                C10199j.C10206g gVar = C10199j.C10206g.MEMORY;
                if (a == gVar) {
                    i6 = Math.max(t, t2);
                } else {
                    i6 = Math.min(t, t2);
                }
                int i15 = Build.VERSION.SDK_INT;
                String str4 = "], target: [";
                if (i15 > 23 || !f23323j.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i6));
                    i7 = (a != gVar || ((float) max) >= 1.0f / f) ? max : max << 1;
                } else {
                    i7 = 1;
                }
                options2.inSampleSize = i7;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i7, 8);
                    i8 = (int) Math.ceil((double) (f2 / min));
                    i9 = (int) Math.ceil((double) (f3 / min));
                    int i16 = i7 / 8;
                    if (i16 > 0) {
                        i8 /= i16;
                        i9 /= i16;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f4 = (float) i7;
                        i8 = (int) Math.floor((double) (f2 / f4));
                        d = Math.floor((double) (f3 / f4));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        if (i15 >= 24) {
                            float f5 = (float) i7;
                            i8 = Math.round(f2 / f5);
                            i9 = Math.round(f3 / f5);
                        } else {
                            float f6 = (float) i7;
                            i8 = (int) Math.floor((double) (f2 / f6));
                            d = Math.floor((double) (f3 / f6));
                        }
                    } else if (i11 % i7 == 0 && i12 % i7 == 0) {
                        i8 = i11 / i7;
                        i9 = i12 / i7;
                    } else {
                        int[] k = m40158k(inputStream, options2, bVar, dVar);
                        i8 = k[0];
                        i9 = k[1];
                    }
                    i9 = (int) d;
                }
                double b = (double) jVar2.mo40805b(i8, i9, i13, i14);
                options2.inTargetDensity = m40150a(b);
                options2.inDensity = m40157j(b);
                if (m40160o(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str2, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i11);
                    String str5 = str3;
                    sb2.append(str5);
                    sb2.append(i12);
                    sb2.append(str4);
                    sb2.append(i13);
                    sb2.append(str5);
                    sb2.append(i14);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i8);
                    sb2.append(str5);
                    sb2.append(i9);
                    sb2.append("], exact scale factor: ");
                    sb2.append(f);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i7);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        String str6 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + f + " from: " + jVar2 + ", source: [" + i11 + str6 + i12 + "], target: [" + i13 + str6 + i14 + "]");
    }

    /* renamed from: f */
    private Bitmap m40153f(InputStream inputStream, BitmapFactory.Options options, C10199j jVar, C7377b bVar, boolean z, int i, int i2, boolean z2, C10209b bVar2) throws IOException {
        int i3;
        int i4;
        int i5;
        InputStream inputStream2 = inputStream;
        BitmapFactory.Options options2 = options;
        C10209b bVar3 = bVar2;
        long b = C7311f.m30188b();
        int[] k = m40158k(inputStream2, options2, bVar3, this.f23327a);
        int i6 = k[0];
        int i7 = k[1];
        String str = options2.outMimeType;
        boolean z3 = (i6 == -1 || i7 == -1) ? false : z;
        int a = C6659a.m25236a(this.f23330d, inputStream2, this.f23329c);
        int g = C10222u.m40215g(a);
        boolean j = C10222u.m40218j(a);
        int i8 = i;
        int i9 = i2;
        int i10 = i8 == Integer.MIN_VALUE ? i6 : i8;
        int i11 = i9 == Integer.MIN_VALUE ? i7 : i9;
        ImageHeaderParser.ImageType b2 = C6659a.m25237b(this.f23330d, inputStream2, this.f23329c);
        ImageHeaderParser.ImageType imageType = b2;
        m40152c(b2, inputStream, bVar2, this.f23327a, jVar, g, i6, i7, i10, i11, options);
        String str2 = str;
        int i12 = a;
        int i13 = i7;
        int i14 = i6;
        C10209b bVar4 = bVar3;
        BitmapFactory.Options options3 = options2;
        m40151b(inputStream, bVar, z3, j, options, i10, i11);
        int i15 = options3.inSampleSize;
        if (m40167v(imageType)) {
            if (i14 < 0 || i13 < 0 || !z2) {
                float f = m40160o(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                int i16 = options3.inSampleSize;
                float f2 = (float) i16;
                i5 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f);
                i4 = Math.round(((float) ((int) Math.ceil((double) (((float) i13) / f2)))) * f);
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i4);
                    sb.append("] for source [");
                    sb.append(i14);
                    sb.append("x");
                    sb.append(i13);
                    sb.append("], sampleSize: ");
                    sb.append(i16);
                    sb.append(", targetDensity: ");
                    sb.append(options3.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options3.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f);
                }
            } else {
                i5 = i10;
                i4 = i11;
            }
            if (i5 > 0 && i4 > 0) {
                m40166u(options3, this.f23327a, i5, i4);
            }
        }
        Bitmap g2 = m40154g(inputStream, options3, bVar4, this.f23327a);
        bVar4.mo40810a(this.f23327a, g2);
        if (Log.isLoggable("Downsampler", 2)) {
            i3 = i12;
            m40161p(i14, i13, str2, options, g2, i, i2, b);
        } else {
            i3 = i12;
        }
        Bitmap bitmap = null;
        if (g2 != null) {
            g2.setDensity(this.f23328b.densityDpi);
            bitmap = C10222u.m40219k(this.f23327a, g2, i3);
            if (!g2.equals(bitmap)) {
                this.f23327a.mo37692c(g2);
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0056 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m40154g(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, p164s4.C10207k.C10209b r7, p126l4.C7669d r8) throws java.io.IOException {
        /*
            boolean r0 = r6.inJustDecodeBounds
            if (r0 == 0) goto L_0x000a
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r5.mark(r0)
            goto L_0x000d
        L_0x000a:
            r7.mo40811b()
        L_0x000d:
            int r0 = r6.outWidth
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = p164s4.C10222u.m40214f()
            r3.lock()
            r3 = 0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch:{ IllegalArgumentException -> 0x0030 }
            java.util.concurrent.locks.Lock r8 = p164s4.C10222u.m40214f()
            r8.unlock()
            boolean r6 = r6.inJustDecodeBounds
            if (r6 == 0) goto L_0x002d
            r5.reset()
        L_0x002d:
            return r7
        L_0x002e:
            r5 = move-exception
            goto L_0x0058
        L_0x0030:
            r4 = move-exception
            java.io.IOException r0 = m40162q(r4, r0, r1, r2, r6)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x002e }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0057
            r5.reset()     // Catch:{ IOException -> 0x0056 }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ IOException -> 0x0056 }
            r8.mo37692c(r1)     // Catch:{ IOException -> 0x0056 }
            r6.inBitmap = r3     // Catch:{ IOException -> 0x0056 }
            android.graphics.Bitmap r5 = m40154g(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0056 }
            java.util.concurrent.locks.Lock r6 = p164s4.C10222u.m40214f()
            r6.unlock()
            return r5
        L_0x0056:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0057:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0058:
            java.util.concurrent.locks.Lock r6 = p164s4.C10222u.m40214f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164s4.C10207k.m40154g(java.io.InputStream, android.graphics.BitmapFactory$Options, s4.k$b, l4.d):android.graphics.Bitmap");
    }

    @Nullable
    /* renamed from: h */
    private static String m40155h(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: i */
    private static synchronized BitmapFactory.Options m40156i() {
        BitmapFactory.Options poll;
        synchronized (C10207k.class) {
            Queue<BitmapFactory.Options> queue = f23326m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m40164s(poll);
            }
        }
        return poll;
    }

    /* renamed from: j */
    private static int m40157j(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: k */
    private static int[] m40158k(InputStream inputStream, BitmapFactory.Options options, C10209b bVar, C7669d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        m40154g(inputStream, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: l */
    private static String m40159l(BitmapFactory.Options options) {
        return m40155h(options.inBitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m40160o(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164s4.C10207k.m40160o(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: p */
    private static void m40161p(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m40155h(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m40159l(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(C7311f.m30187a(j));
    }

    /* renamed from: q */
    private static IOException m40162q(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m40159l(options), illegalArgumentException);
    }

    /* renamed from: r */
    private static void m40163r(BitmapFactory.Options options) {
        m40164s(options);
        Queue<BitmapFactory.Options> queue = f23326m;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: s */
    private static void m40164s(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: t */
    private static int m40165t(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: u */
    private static void m40166u(BitmapFactory.Options options, C7669d dVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.mo37694e(i, i2, config);
    }

    /* renamed from: v */
    private boolean m40167v(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: d */
    public C7587c<Bitmap> mo40806d(InputStream inputStream, int i, int i2, C7384g gVar) throws IOException {
        return mo40807e(inputStream, i, i2, gVar, f23324k);
    }

    /* renamed from: e */
    public C7587c<Bitmap> mo40807e(InputStream inputStream, int i, int i2, C7384g gVar, C10209b bVar) throws IOException {
        C7384g gVar2 = gVar;
        C7315j.m30201a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f23329c.mo37684c(65536, byte[].class);
        BitmapFactory.Options i3 = m40156i();
        i3.inTempStorage = bArr;
        C7377b bVar2 = (C7377b) gVar2.mo37379c(f23319f);
        C10199j jVar = (C10199j) gVar2.mo37379c(C10199j.f23315h);
        boolean booleanValue = ((Boolean) gVar2.mo37379c(f23321h)).booleanValue();
        C7381f fVar = f23322i;
        try {
            return C10189d.m40094d(m40153f(inputStream, i3, jVar, bVar2, gVar2.mo37379c(fVar) != null && ((Boolean) gVar2.mo37379c(fVar)).booleanValue(), i, i2, booleanValue, bVar), this.f23327a);
        } finally {
            m40163r(i3);
            this.f23329c.put(bArr);
        }
    }

    /* renamed from: m */
    public boolean mo40808m(InputStream inputStream) {
        return true;
    }

    /* renamed from: n */
    public boolean mo40809n(ByteBuffer byteBuffer) {
        return true;
    }
}
