package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzev extends zzer {
    @Nullable

    /* renamed from: e */
    private zzfc f34991e;
    @Nullable

    /* renamed from: f */
    private byte[] f34992f;

    /* renamed from: g */
    private int f34993g;

    /* renamed from: h */
    private int f34994h;

    public zzev() {
        super(false);
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        zzfc zzfc = this.f34991e;
        if (zzfc != null) {
            return zzfc.f35396a;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo43926d() {
        if (this.f34992f != null) {
            this.f34992f = null;
            mo45436o();
        }
        this.f34991e = null;
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f34994h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(zzen.m49166h(this.f34992f), this.f34993g, bArr, i, min);
        this.f34993g += min;
        this.f34994h -= min;
        mo45439x(min);
        return min;
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws IOException {
        mo45437p(zzfc);
        this.f34991e = zzfc;
        Uri uri = zzfc.f35396a;
        String scheme = uri.getScheme();
        zzdd.m47211e(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] H = zzen.m49133H(uri.getSchemeSpecificPart(), ",");
        if (H.length == 2) {
            String str = H[1];
            if (H[0].contains(";base64")) {
                try {
                    this.f34992f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw zzbu.m44136b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.f34992f = zzen.m49127B(URLDecoder.decode(str, zzfsk.f36337a.name()));
            }
            long j = zzfc.f35401f;
            int length = this.f34992f.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.f34993g = i;
                int i2 = length - i;
                this.f34994h = i2;
                long j2 = zzfc.f35402g;
                if (j2 != -1) {
                    this.f34994h = (int) Math.min((long) i2, j2);
                }
                mo45438q(zzfc);
                long j3 = zzfc.f35402g;
                return j3 != -1 ? j3 : (long) this.f34994h;
            }
            this.f34992f = null;
            throw new zzey(2008);
        }
        throw zzbu.m44136b("Unexpected URI format: ".concat(String.valueOf(uri)), (Throwable) null);
    }
}
