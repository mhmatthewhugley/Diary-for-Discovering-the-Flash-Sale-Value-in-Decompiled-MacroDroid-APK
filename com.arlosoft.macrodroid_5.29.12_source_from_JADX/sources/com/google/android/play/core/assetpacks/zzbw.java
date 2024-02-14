package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.mail.UIDFolder;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbw extends FilterInputStream {

    /* renamed from: a */
    private final zzds f51317a = new zzds();

    /* renamed from: c */
    private byte[] f51318c = new byte[4096];

    /* renamed from: d */
    private long f51319d;

    /* renamed from: f */
    private boolean f51320f = false;

    /* renamed from: g */
    private boolean f51321g = false;

    zzbw(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: g */
    private final int m70627g(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: h */
    private final boolean m70628h(int i) throws IOException {
        int g = m70627g(this.f51318c, 0, i);
        if (g != i) {
            int i2 = i - g;
            if (m70627g(this.f51318c, g, i2) != i2) {
                this.f51317a.mo59743b(this.f51318c, 0, g);
                return false;
            }
        }
        this.f51317a.mo59743b(this.f51318c, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo59688b() {
        return this.f51319d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzet mo59689c() throws IOException {
        byte[] bArr;
        if (this.f51319d > 0) {
            do {
                bArr = this.f51318c;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f51320f || this.f51321g) {
            return new zzbq((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!m70628h(30)) {
            this.f51320f = true;
            return this.f51317a.mo59744c();
        }
        zzet c = this.f51317a.mo59744c();
        if (c.mo59681d()) {
            this.f51321g = true;
            return c;
        } else if (c.mo59679b() != UIDFolder.MAXUID) {
            int a = this.f51317a.mo59742a() - 30;
            long j = (long) a;
            int length = this.f51318c.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f51318c = Arrays.copyOf(this.f51318c, length);
            }
            if (!m70628h(a)) {
                this.f51320f = true;
                return this.f51317a.mo59744c();
            }
            zzet c2 = this.f51317a.mo59744c();
            this.f51319d = c2.mo59679b();
            return c2;
        } else {
            throw new zzck("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo59690e() {
        return this.f51321g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo59691f() {
        return this.f51320f;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f51319d;
        if (j <= 0 || this.f51320f) {
            return -1;
        }
        int g = m70627g(bArr, i, (int) Math.min(j, (long) i2));
        this.f51319d -= (long) g;
        if (g != 0) {
            return g;
        }
        this.f51320f = true;
        return 0;
    }
}
