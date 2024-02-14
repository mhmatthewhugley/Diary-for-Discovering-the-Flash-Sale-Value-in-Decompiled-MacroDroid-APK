package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfx extends zzer {

    /* renamed from: e */
    private final Resources f36510e;

    /* renamed from: f */
    private final String f36511f;
    @Nullable

    /* renamed from: g */
    private Uri f36512g;
    @Nullable

    /* renamed from: h */
    private AssetFileDescriptor f36513h;
    @Nullable

    /* renamed from: i */
    private InputStream f36514i;

    /* renamed from: j */
    private long f36515j;

    /* renamed from: k */
    private boolean f36516k;

    public zzfx(Context context) {
        super(false);
        this.f36510e = context.getResources();
        this.f36511f = context.getPackageName();
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f36512g;
    }

    /* renamed from: d */
    public final void mo43926d() throws zzfw {
        this.f36512g = null;
        try {
            InputStream inputStream = this.f36514i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f36514i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f36513h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f36513h = null;
                if (this.f36516k) {
                    this.f36516k = false;
                    mo45436o();
                }
            } catch (IOException e) {
                throw new zzfw((String) null, e, 2000);
            } catch (Throwable th) {
                this.f36513h = null;
                if (this.f36516k) {
                    this.f36516k = false;
                    mo45436o();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new zzfw((String) null, e2, 2000);
        } catch (Throwable th2) {
            this.f36514i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f36513h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f36513h = null;
                if (this.f36516k) {
                    this.f36516k = false;
                    mo45436o();
                }
                throw th2;
            } catch (IOException e3) {
                throw new zzfw((String) null, e3, 2000);
            } catch (Throwable th3) {
                this.f36513h = null;
                if (this.f36516k) {
                    this.f36516k = false;
                    mo45436o();
                }
                throw th3;
            }
        }
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws zzfw {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f36515j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new zzfw((String) null, e, 2000);
            }
        }
        InputStream inputStream = this.f36514i;
        int i3 = zzen.f34500a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f36515j;
            if (j2 != -1) {
                this.f36515j = j2 - ((long) read);
            }
            mo45439x(read);
            return read;
        } else if (this.f36515j == -1) {
            return -1;
        } else {
            throw new zzfw("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0155  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo43928g(com.google.android.gms.internal.ads.zzfc r18) throws com.google.android.gms.internal.ads.zzfw {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            android.net.Uri r2 = r0.f35396a
            r1.f36512g = r2
            java.lang.String r3 = r2.getScheme()
            java.lang.String r4 = "rawresource"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            r4 = 2005(0x7d5, float:2.81E-42)
            r5 = 1004(0x3ec, float:1.407E-42)
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0099
            java.lang.String r3 = r2.getScheme()
            java.lang.String r8 = "android.resource"
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x0040
            java.util.List r3 = r2.getPathSegments()
            int r3 = r3.size()
            if (r3 != r6) goto L_0x0040
            java.lang.String r3 = r2.getLastPathSegment()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r9 = "\\d+"
            boolean r3 = r3.matches(r9)
            if (r3 == 0) goto L_0x0040
            goto L_0x0099
        L_0x0040:
            java.lang.String r3 = r2.getScheme()
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x0091
            java.lang.String r3 = r2.getPath()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = "/"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L_0x005d
            java.lang.String r3 = r3.substring(r6)
        L_0x005d:
            java.lang.String r5 = r2.getHost()
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x006a
            java.lang.String r5 = ""
            goto L_0x0074
        L_0x006a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = ":"
            java.lang.String r5 = r5.concat(r8)
        L_0x0074:
            android.content.res.Resources r8 = r1.f36510e
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
            java.lang.String r5 = r1.f36511f
            java.lang.String r9 = "raw"
            int r3 = r8.getIdentifier(r3, r9, r5)
            if (r3 == 0) goto L_0x0089
            goto L_0x00a4
        L_0x0089:
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw
            java.lang.String r2 = "Resource not found."
            r0.<init>(r2, r7, r4)
            throw r0
        L_0x0091:
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw
            java.lang.String r2 = "URI must either use scheme rawresource or android.resource"
            r0.<init>(r2, r7, r5)
            throw r0
        L_0x0099:
            java.lang.String r3 = r2.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x016e }
            java.util.Objects.requireNonNull(r3)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x016e }
        L_0x00a4:
            r17.mo45437p(r18)
            android.content.res.Resources r5 = r1.f36510e     // Catch:{ NotFoundException -> 0x0167 }
            android.content.res.AssetFileDescriptor r3 = r5.openRawResourceFd(r3)     // Catch:{ NotFoundException -> 0x0167 }
            r1.f36513h = r3
            if (r3 == 0) goto L_0x0155
            long r8 = r3.getLength()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r3.getFileDescriptor()
            r2.<init>(r5)
            r1.f36514i = r2
            r5 = 2008(0x7d8, float:2.814E-42)
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00d5
            long r13 = r0.f35401f     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 > 0) goto L_0x00cf
            goto L_0x00d5
        L_0x00cf:
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            r0.<init>(r7, r7, r5)     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            throw r0     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
        L_0x00d5:
            long r13 = r3.getStartOffset()     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            long r4 = r0.f35401f     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            long r4 = r4 + r13
            long r4 = r2.skip(r4)     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            long r4 = r4 - r13
            long r13 = r0.f35401f     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x0142
            r13 = 0
            if (r12 != 0) goto L_0x0113
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            long r4 = r2.size()     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x00fb
            r1.f36515j = r10     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            r4 = r10
            goto L_0x011b
        L_0x00fb:
            long r4 = r2.size()     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            long r8 = r2.position()     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            long r4 = r4 - r8
            r1.f36515j = r4     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x010b
            goto L_0x011b
        L_0x010b:
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            throw r0     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
        L_0x0113:
            long r4 = r8 - r4
            r1.f36515j = r4     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x013a
        L_0x011b:
            long r2 = r0.f35402g
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x012b
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0129
            long r2 = java.lang.Math.min(r4, r2)
        L_0x0129:
            r1.f36515j = r2
        L_0x012b:
            r1.f36516k = r6
            r17.mo45438q(r18)
            long r2 = r0.f35402g
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0137
            return r2
        L_0x0137:
            long r2 = r1.f36515j
            return r2
        L_0x013a:
            com.google.android.gms.internal.ads.zzey r0 = new com.google.android.gms.internal.ads.zzey     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            throw r0     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
        L_0x0142:
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
            throw r0     // Catch:{ zzfw -> 0x0153, IOException -> 0x014a }
        L_0x014a:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfw r2 = new com.google.android.gms.internal.ads.zzfw
            r3 = 2000(0x7d0, float:2.803E-42)
            r2.<init>(r7, r0, r3)
            throw r2
        L_0x0153:
            r0 = move-exception
            throw r0
        L_0x0155:
            r3 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Resource is compressed: "
            java.lang.String r2 = r4.concat(r2)
            r0.<init>(r2, r7, r3)
            throw r0
        L_0x0167:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfw r2 = new com.google.android.gms.internal.ads.zzfw
            r2.<init>(r7, r0, r4)
            throw r2
        L_0x016e:
            com.google.android.gms.internal.ads.zzfw r0 = new com.google.android.gms.internal.ads.zzfw
            java.lang.String r2 = "Resource identifier must be an integer."
            r0.<init>(r2, r7, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfx.mo43928g(com.google.android.gms.internal.ads.zzfc):long");
    }
}
