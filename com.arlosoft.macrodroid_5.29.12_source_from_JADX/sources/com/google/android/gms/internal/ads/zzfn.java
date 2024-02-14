package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfn extends zzer {
    @Nullable

    /* renamed from: e */
    private RandomAccessFile f36136e;
    @Nullable

    /* renamed from: f */
    private Uri f36137f;

    /* renamed from: g */
    private long f36138g;

    /* renamed from: h */
    private boolean f36139h;

    public zzfn() {
        super(false);
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f36137f;
    }

    /* renamed from: d */
    public final void mo43926d() throws zzfm {
        this.f36137f = null;
        try {
            RandomAccessFile randomAccessFile = this.f36136e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f36136e = null;
            if (this.f36139h) {
                this.f36139h = false;
                mo45436o();
            }
        } catch (IOException e) {
            throw new zzfm(e, 2000);
        } catch (Throwable th) {
            this.f36136e = null;
            if (this.f36139h) {
                this.f36139h = false;
                mo45436o();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws zzfm {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f36138g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f36136e;
            int i3 = zzen.f34500a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f36138g -= (long) read;
                mo45439x(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzfm(e, 2000);
        }
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws zzfm {
        Uri uri = zzfc.f35396a;
        this.f36137f = uri;
        mo45437p(zzfc);
        int i = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f36136e = randomAccessFile;
            try {
                randomAccessFile.seek(zzfc.f35401f);
                long j = zzfc.f35402g;
                if (j == -1) {
                    j = this.f36136e.length() - zzfc.f35401f;
                }
                this.f36138g = j;
                if (j >= 0) {
                    this.f36139h = true;
                    mo45438q(zzfc);
                    return this.f36138g;
                }
                throw new zzfm((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new zzfm(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzfm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            if (zzen.f34500a < 21 || !zzfl.m50450b(e2.getCause())) {
                i = SamsungIrisUnlockModule.IRIS_REQUEST_IR_PREVIEW_ENABLE;
            }
            throw new zzfm(e2, i);
        } catch (SecurityException e3) {
            throw new zzfm(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzfm(e4, 2000);
        }
    }
}
