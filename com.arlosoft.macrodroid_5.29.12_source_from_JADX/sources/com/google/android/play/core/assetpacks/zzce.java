package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzce extends zzdg {

    /* renamed from: c */
    final int f51359c;

    /* renamed from: d */
    final long f51360d;

    /* renamed from: e */
    final String f51361e;

    /* renamed from: f */
    final String f51362f;

    /* renamed from: g */
    final int f51363g;

    /* renamed from: h */
    final int f51364h;

    /* renamed from: i */
    final int f51365i;

    /* renamed from: j */
    final long f51366j;
    @AssetPackStatus

    /* renamed from: k */
    final int f51367k;

    /* renamed from: l */
    final InputStream f51368l;

    zzce(int i, String str, int i2, long j, String str2, String str3, int i3, int i4, int i5, long j2, @AssetPackStatus int i6, InputStream inputStream) {
        super(i, str);
        this.f51359c = i2;
        this.f51360d = j;
        this.f51361e = str2;
        this.f51362f = str3;
        this.f51363g = i3;
        this.f51364h = i4;
        this.f51365i = i5;
        this.f51366j = j2;
        this.f51367k = i6;
        this.f51368l = inputStream;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo59697a() {
        return this.f51364h + 1 == this.f51365i;
    }
}
