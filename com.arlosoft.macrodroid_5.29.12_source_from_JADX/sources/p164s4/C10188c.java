package p164s4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p102h4.C7378c;
import p102h4.C7381f;
import p102h4.C7384g;
import p102h4.C7386i;
import p126l4.C7667b;

/* renamed from: s4.c */
/* compiled from: BitmapEncoder */
public class C10188c implements C7386i<Bitmap> {

    /* renamed from: b */
    public static final C7381f<Integer> f23295b = C7381f.m30485f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C7381f<Bitmap.CompressFormat> f23296c = C7381f.m30484e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    @Nullable

    /* renamed from: a */
    private final C7667b f23297a;

    public C10188c(@NonNull C7667b bVar) {
        this.f23297a = bVar;
    }

    /* renamed from: d */
    private Bitmap.CompressFormat m40090d(Bitmap bitmap, C7384g gVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) gVar.mo37379c(f23296c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @NonNull
    /* renamed from: b */
    public C7378c mo37385b(@NonNull C7384g gVar) {
        return C7378c.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:36|37)|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00af */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[SYNTHETIC, Splitter:B:36:0x00ac] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo37372a(@androidx.annotation.NonNull p120k4.C7587c<android.graphics.Bitmap> r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull p102h4.C7384g r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.m40090d(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p096g5.C7347b.m30356c(r4, r2, r3, r1)
            long r2 = p090f5.C7311f.m30188b()     // Catch:{ all -> 0x00b0 }
            h4.f<java.lang.Integer> r4 = f23295b     // Catch:{ all -> 0x00b0 }
            java.lang.Object r4 = r11.mo37379c(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00b0 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00b0 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0058 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0058 }
            l4.b r10 = r8.f23297a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            if (r10 == 0) goto L_0x0045
            i4.c r10 = new i4.c     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            l4.b r6 = r8.f23297a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r6 = r10
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0058 }
            r6.close()     // Catch:{ IOException -> 0x0058 }
            r5 = 1
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0051:
            r9 = move-exception
            r6 = r7
            goto L_0x00aa
        L_0x0054:
            r6 = r7
            goto L_0x0058
        L_0x0056:
            r9 = move-exception
            goto L_0x00aa
        L_0x0058:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0060
            goto L_0x004d
        L_0x0060:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00b0 }
            if (r10 == 0) goto L_0x00a6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r10.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "Compressed with type: "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            r10.append(r1)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = " of size "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            int r0 = p090f5.C7316k.m30212g(r9)     // Catch:{ all -> 0x00b0 }
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = " in "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            double r0 = p090f5.C7311f.m30187a(r2)     // Catch:{ all -> 0x00b0 }
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = ", options format: "
            r10.append(r0)     // Catch:{ all -> 0x00b0 }
            h4.f<android.graphics.Bitmap$CompressFormat> r0 = f23296c     // Catch:{ all -> 0x00b0 }
            java.lang.Object r11 = r11.mo37379c(r0)     // Catch:{ all -> 0x00b0 }
            r10.append(r11)     // Catch:{ all -> 0x00b0 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00b0 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00b0 }
            r10.append(r9)     // Catch:{ all -> 0x00b0 }
        L_0x00a6:
            p096g5.C7347b.m30357d()
            return r5
        L_0x00aa:
            if (r6 == 0) goto L_0x00af
            r6.close()     // Catch:{ IOException -> 0x00af }
        L_0x00af:
            throw r9     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r9 = move-exception
            p096g5.C7347b.m30357d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p164s4.C10188c.mo37372a(k4.c, java.io.File, h4.g):boolean");
    }
}
