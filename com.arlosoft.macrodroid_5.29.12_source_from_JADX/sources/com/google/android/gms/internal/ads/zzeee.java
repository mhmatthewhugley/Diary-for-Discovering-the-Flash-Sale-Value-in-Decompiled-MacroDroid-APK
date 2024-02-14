package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzeee implements zzfyn {

    /* renamed from: a */
    public final /* synthetic */ zzeek f33790a;

    public /* synthetic */ zzeee(zzeek zzeek) {
        this.f33790a = zzeek;
    }

    /* renamed from: a */
    public final zzfzp mo20417a(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzchc.f28456a.execute(new zzffd((InputStream) obj, createPipe[1]));
        return zzfzg.m51414i(parcelFileDescriptor);
    }
}
