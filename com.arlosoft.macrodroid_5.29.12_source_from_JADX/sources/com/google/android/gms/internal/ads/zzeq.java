package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeq extends zzer {

    /* renamed from: e */
    private final AssetManager f34692e;
    @Nullable

    /* renamed from: f */
    private Uri f34693f;
    @Nullable

    /* renamed from: g */
    private InputStream f34694g;

    /* renamed from: h */
    private long f34695h;

    /* renamed from: i */
    private boolean f34696i;

    public zzeq(Context context) {
        super(false);
        this.f34692e = context.getAssets();
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f34693f;
    }

    /* renamed from: d */
    public final void mo43926d() throws zzep {
        this.f34693f = null;
        try {
            InputStream inputStream = this.f34694g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f34694g = null;
            if (this.f34696i) {
                this.f34696i = false;
                mo45436o();
            }
        } catch (IOException e) {
            throw new zzep(e, 2000);
        } catch (Throwable th) {
            this.f34694g = null;
            if (this.f34696i) {
                this.f34696i = false;
                mo45436o();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws zzep {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f34695h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new zzep(e, 2000);
            }
        }
        InputStream inputStream = this.f34694g;
        int i3 = zzen.f34500a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f34695h;
        if (j2 != -1) {
            this.f34695h = j2 - ((long) read);
        }
        mo45439x(read);
        return read;
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws zzep {
        try {
            Uri uri = zzfc.f35396a;
            this.f34693f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo45437p(zzfc);
            InputStream open = this.f34692e.open(path, 1);
            this.f34694g = open;
            if (open.skip(zzfc.f35401f) >= zzfc.f35401f) {
                long j = zzfc.f35402g;
                if (j != -1) {
                    this.f34695h = j;
                } else {
                    long available = (long) this.f34694g.available();
                    this.f34695h = available;
                    if (available == 2147483647L) {
                        this.f34695h = -1;
                    }
                }
                this.f34696i = true;
                mo45438q(zzfc);
                return this.f34695h;
            }
            throw new zzep((Throwable) null, 2008);
        } catch (zzep e) {
            throw e;
        } catch (IOException e2) {
            throw new zzep(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : SamsungIrisUnlockModule.IRIS_REQUEST_IR_PREVIEW_ENABLE);
        }
    }
}
