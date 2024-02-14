package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzcs implements DataApi.GetFdForAssetResult {

    /* renamed from: a */
    private final Status f48221a;

    /* renamed from: c */
    private volatile ParcelFileDescriptor f48222c;

    /* renamed from: d */
    private volatile InputStream f48223d;

    /* renamed from: f */
    private volatile boolean f48224f = false;

    public zzcs(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.f48221a = status;
        this.f48222c = parcelFileDescriptor;
    }

    public final Status getStatus() {
        return this.f48221a;
    }

    public final void release() {
        if (this.f48222c != null) {
            if (!this.f48224f) {
                try {
                    if (this.f48223d != null) {
                        this.f48223d.close();
                    } else {
                        this.f48222c.close();
                    }
                    this.f48224f = true;
                    this.f48222c = null;
                    this.f48223d = null;
                } catch (IOException unused) {
                }
            } else {
                throw new IllegalStateException("releasing an already released result.");
            }
        }
    }
}
