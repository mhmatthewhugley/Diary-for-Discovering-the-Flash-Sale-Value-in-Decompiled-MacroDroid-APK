package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzcn extends OutputStream {

    /* renamed from: a */
    private final zzds f51408a = new zzds();

    /* renamed from: c */
    private final File f51409c;

    /* renamed from: d */
    private final zzen f51410d;

    /* renamed from: f */
    private long f51411f;

    /* renamed from: g */
    private long f51412g;

    /* renamed from: o */
    private FileOutputStream f51413o;

    /* renamed from: p */
    private zzet f51414p;

    zzcn(File file, zzen zzen) {
        this.f51409c = file;
        this.f51410d = zzen;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.f51411f == 0 && this.f51412g == 0) {
                int b = this.f51408a.mo59743b(bArr, i, i2);
                if (b != -1) {
                    i += b;
                    i2 -= b;
                    zzet c = this.f51408a.mo59744c();
                    this.f51414p = c;
                    if (c.mo59681d()) {
                        this.f51411f = 0;
                        this.f51410d.mo59769l(this.f51414p.mo59684f(), 0, this.f51414p.mo59684f().length);
                        this.f51412g = (long) this.f51414p.mo59684f().length;
                    } else if (!this.f51414p.mo59774h() || this.f51414p.mo59773g()) {
                        byte[] f = this.f51414p.mo59684f();
                        this.f51410d.mo59769l(f, 0, f.length);
                        this.f51411f = this.f51414p.mo59679b();
                    } else {
                        this.f51410d.mo59767j(this.f51414p.mo59684f());
                        File file = new File(this.f51409c, this.f51414p.mo59680c());
                        file.getParentFile().mkdirs();
                        this.f51411f = this.f51414p.mo59679b();
                        this.f51413o = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f51414p.mo59773g()) {
                if (this.f51414p.mo59681d()) {
                    this.f51410d.mo59762e(this.f51412g, bArr, i, i2);
                    this.f51412g += (long) i2;
                    i3 = i2;
                } else if (this.f51414p.mo59774h()) {
                    i3 = (int) Math.min((long) i2, this.f51411f);
                    this.f51413o.write(bArr, i, i3);
                    long j = this.f51411f - ((long) i3);
                    this.f51411f = j;
                    if (j == 0) {
                        this.f51413o.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f51411f);
                    int length = this.f51414p.mo59684f().length;
                    this.f51410d.mo59762e((((long) length) + this.f51414p.mo59679b()) - this.f51411f, bArr, i, i3);
                    this.f51411f -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
