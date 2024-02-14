package com.google.android.play.core.assetpacks;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.play.core.internal.zzag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzen {

    /* renamed from: h */
    private static final zzag f51582h = new zzag("SliceMetadataManager");

    /* renamed from: a */
    private final byte[] f51583a = new byte[8192];

    /* renamed from: b */
    private final zzbh f51584b;

    /* renamed from: c */
    private final String f51585c;

    /* renamed from: d */
    private final int f51586d;

    /* renamed from: e */
    private final long f51587e;

    /* renamed from: f */
    private final String f51588f;

    /* renamed from: g */
    private int f51589g;

    zzen(zzbh zzbh, String str, int i, long j, String str2) {
        this.f51584b = zzbh;
        this.f51585c = str;
        this.f51586d = i;
        this.f51587e = j;
        this.f51588f = str2;
        this.f51589g = -1;
    }

    /* renamed from: n */
    private final File m70715n() {
        File C = this.f51584b.mo59624C(this.f51585c, this.f51586d, this.f51587e, this.f51588f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }

    /* renamed from: o */
    private final File m70716o() throws IOException {
        File B = this.f51584b.mo59623B(this.f51585c, this.f51586d, this.f51587e, this.f51588f);
        B.getParentFile().mkdirs();
        B.createNewFile();
        return B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo59758a() throws IOException {
        File B = this.f51584b.mo59623B(this.f51585c, this.f51586d, this.f51587e, this.f51588f);
        if (!B.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(B);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new zzck("Slice checkpoint file corrupt.");
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzem mo59759b() throws IOException {
        File B = this.f51584b.mo59623B(this.f51585c, this.f51586d, this.f51587e, this.f51588f);
        if (B.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(B);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new zzck("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f51589g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new zzbp(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new zzck("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable unused) {
            }
        } else {
            throw new zzck("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo59760c() {
        return new File(m70715n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f51589g)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo59761d(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo59760c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f51583a);
                if (read > 0) {
                    randomAccessFile.write(this.f51583a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo59762e(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo59760c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo59763f(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_3D);
        properties.put("fileOffset", String.valueOf(mo59760c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f51589g));
        FileOutputStream fileOutputStream = new FileOutputStream(m70716o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo59764g(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f51589g));
        FileOutputStream fileOutputStream = new FileOutputStream(m70716o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo59765h(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_2D);
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f51589g));
        FileOutputStream fileOutputStream = new FileOutputStream(m70716o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File A = this.f51584b.mo59622A(this.f51585c, this.f51586d, this.f51587e, this.f51588f);
            if (A.exists()) {
                A.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(A);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
            throw th;
        } catch (Throwable unused2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo59766i(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f51589g));
        FileOutputStream fileOutputStream = new FileOutputStream(m70716o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59767j(byte[] r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f51589g
            r1 = 1
            int r0 = r0 + r1
            r5.f51589g = r0
            java.io.File r0 = new java.io.File
            java.io.File r2 = r5.m70715n()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r5.f51589g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "%s-LFH.dat"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r0.<init>(r2, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0031 }
            r1.write(r6)     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x0031 }
            return
        L_0x002c:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r6     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r6 = move-exception
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "Could not write metadata file."
            r0.<init>((java.lang.String) r1, (java.lang.Exception) r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzen.mo59767j(byte[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo59768k(byte[] bArr, InputStream inputStream) throws IOException {
        this.f51589g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo59760c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f51583a);
            while (read > 0) {
                fileOutputStream.write(this.f51583a, 0, read);
                read = inputStream.read(this.f51583a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo59769l(byte[] bArr, int i, int i2) throws IOException {
        this.f51589g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo59760c());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004a */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59770m() {
        /*
            r6 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r6.f51584b
            java.lang.String r1 = r6.f51585c
            int r2 = r6.f51586d
            long r3 = r6.f51587e
            java.lang.String r5 = r6.f51588f
            java.io.File r0 = r0.mo59623B(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L_0x0016
            return r2
        L_0x0016:
            r1 = 1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004b }
            r3.<init>(r0)     // Catch:{ IOException -> 0x004b }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ all -> 0x0046 }
            r0.<init>()     // Catch:{ all -> 0x0046 }
            r0.load(r3)     // Catch:{ all -> 0x0046 }
            r3.close()     // Catch:{ IOException -> 0x004b }
            java.lang.String r3 = "fileStatus"
            java.lang.String r4 = r0.getProperty(r3)
            if (r4 != 0) goto L_0x0039
            com.google.android.play.core.internal.zzag r0 = f51582h
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "Slice checkpoint file corrupt while checking if extraction finished."
            r0.mo59806b(r3, r1)
            return r2
        L_0x0039:
            java.lang.String r0 = r0.getProperty(r3)
            int r0 = java.lang.Integer.parseInt(r0)
            r3 = 4
            if (r0 != r3) goto L_0x0045
            return r1
        L_0x0045:
            return r2
        L_0x0046:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r3 = f51582h
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "Could not read checkpoint while checking if extraction finished. %s"
            r3.mo59806b(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzen.mo59770m():boolean");
    }
}
