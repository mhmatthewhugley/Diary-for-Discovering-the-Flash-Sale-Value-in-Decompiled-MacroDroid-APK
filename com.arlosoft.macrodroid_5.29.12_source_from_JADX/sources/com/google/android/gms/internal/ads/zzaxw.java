package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaxw {

    /* renamed from: a */
    private final zzauz[] f26196a;

    /* renamed from: b */
    private final zzava f26197b;

    /* renamed from: c */
    private zzauz f26198c;

    public zzaxw(zzauz[] zzauzArr, zzava zzava) {
        this.f26196a = zzauzArr;
        this.f26197b = zzava;
    }

    /* renamed from: a */
    public final void mo42200a() {
        if (this.f26198c != null) {
            this.f26198c = null;
        }
    }

    /* renamed from: b */
    public final zzauz mo42201b(zzauy zzauy, Uri uri) throws IOException, InterruptedException {
        zzauz zzauz = this.f26198c;
        if (zzauz != null) {
            return zzauz;
        }
        zzauz[] zzauzArr = this.f26196a;
        int length = zzauzArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzauz zzauz2 = zzauzArr[i];
            try {
                if (zzauz2.mo42105f(zzauy)) {
                    this.f26198c = zzauz2;
                    zzauy.mo42097e();
                    break;
                }
                zzauy.mo42097e();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzauy.mo42097e();
                throw th;
            }
        }
        zzauz zzauz3 = this.f26198c;
        if (zzauz3 != null) {
            zzauz3.mo42104e(this.f26197b);
            return this.f26198c;
        }
        String k = zzbar.m42995k(this.f26196a);
        throw new zzayu("None of the available extractors (" + k + ") could read the stream.", uri);
    }
}
