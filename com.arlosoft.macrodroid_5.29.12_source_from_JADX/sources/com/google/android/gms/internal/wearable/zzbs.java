package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzbs;
import com.google.android.gms.internal.wearable.zzbv;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class zzbs<MessageType extends zzbv<MessageType, BuilderType>, BuilderType extends zzbs<MessageType, BuilderType>> extends zzaf<MessageType, BuilderType> {

    /* renamed from: a */
    private final zzbv f45627a;

    /* renamed from: c */
    protected zzbv f45628c;

    /* renamed from: d */
    protected boolean f45629d = false;

    protected zzbs(MessageType messagetype) {
        this.f45627a = messagetype;
        this.f45628c = (zzbv) messagetype.mo53945f(4, (Object) null, (Object) null);
    }

    /* renamed from: d */
    private static final void m64181d(zzbv zzbv, zzbv zzbv2) {
        zzdk.m64336a().mo54003b(zzbv.getClass()).mo54001f(zzbv, zzbv2);
    }

    /* renamed from: G */
    public final /* synthetic */ zzdc mo53934G() {
        return this.f45627a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ zzaf mo53795c(zzag zzag) {
        mo53936f((zzbv) zzag);
        return this;
    }

    /* renamed from: e */
    public final zzbs clone() {
        zzbs zzbs = (zzbs) this.f45627a.mo53945f(5, (Object) null, (Object) null);
        zzbs.mo53936f(mo53940w());
        return zzbs;
    }

    /* renamed from: f */
    public final zzbs mo53936f(zzbv zzbv) {
        if (this.f45629d) {
            mo53939k();
            this.f45629d = false;
        }
        m64181d(this.f45628c, zzbv);
        return this;
    }

    /* renamed from: g */
    public final MessageType mo53937g() {
        MessageType h = mo53940w();
        if (h.mo53948p()) {
            return h;
        }
        throw new zzed(h);
    }

    /* renamed from: h */
    public MessageType mo53940w() {
        if (this.f45629d) {
            return this.f45628c;
        }
        zzbv zzbv = this.f45628c;
        zzdk.m64336a().mo54003b(zzbv.getClass()).mo53999d(zzbv);
        this.f45629d = true;
        return this.f45628c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo53939k() {
        zzbv zzbv = (zzbv) this.f45628c.mo53945f(4, (Object) null, (Object) null);
        m64181d(zzbv, this.f45628c);
        this.f45628c = zzbv;
    }
}
