package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class zzc {
    @Nullable

    /* renamed from: a */
    private Object f3750a;

    /* renamed from: b */
    private boolean f3751b = false;

    /* renamed from: c */
    final /* synthetic */ BaseGmsClient f3752c;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.f3752c = baseGmsClient;
        this.f3750a = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21782a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo21783b();

    /* renamed from: c */
    public final void mo21797c() {
        Object obj;
        synchronized (this) {
            obj = this.f3750a;
            if (this.f3751b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo21782a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f3751b = true;
        }
        mo21799e();
    }

    /* renamed from: d */
    public final void mo21798d() {
        synchronized (this) {
            this.f3750a = null;
        }
    }

    /* renamed from: e */
    public final void mo21799e() {
        mo21798d();
        synchronized (this.f3752c.f3581I) {
            this.f3752c.f3581I.remove(this);
        }
    }
}
