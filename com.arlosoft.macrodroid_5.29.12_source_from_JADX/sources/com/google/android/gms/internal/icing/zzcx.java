package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public class zzcx<MessageType extends zzda<MessageType, BuilderType>, BuilderType extends zzcx<MessageType, BuilderType>> extends zzbr<MessageType, BuilderType> {

    /* renamed from: a */
    private final MessageType f40872a;

    /* renamed from: c */
    protected MessageType f40873c;

    /* renamed from: d */
    protected boolean f40874d = false;

    protected zzcx(MessageType messagetype) {
        this.f40872a = messagetype;
        this.f40873c = (zzda) messagetype.mo50166d(4, (Object) null, (Object) null);
    }

    /* renamed from: d */
    private static final void m58785d(MessageType messagetype, MessageType messagetype2) {
        zzem.m58920a().mo50362b(messagetype.getClass()).mo50357b(messagetype, messagetype2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzbr mo50180c(zzbs zzbs) {
        mo50307n((zzda) zzbs);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo50302e() {
        MessageType messagetype = (zzda) this.f40873c.mo50166d(4, (Object) null, (Object) null);
        m58785d(messagetype, this.f40873c);
        this.f40873c = messagetype;
    }

    /* renamed from: g */
    public final BuilderType clone() {
        BuilderType buildertype = (zzcx) this.f40872a.mo50166d(5, (Object) null, (Object) null);
        buildertype.mo50307n(mo50305j());
        return buildertype;
    }

    /* renamed from: h */
    public MessageType mo50305j() {
        if (this.f40874d) {
            return this.f40873c;
        }
        MessageType messagetype = this.f40873c;
        zzem.m58920a().mo50362b(messagetype.getClass()).mo50359d(messagetype);
        this.f40874d = true;
        return this.f40873c;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzee mo50306k() {
        return this.f40872a;
    }

    /* renamed from: n */
    public final BuilderType mo50307n(MessageType messagetype) {
        if (this.f40874d) {
            mo50302e();
            this.f40874d = false;
        }
        m58785d(this.f40873c, messagetype);
        return this;
    }
}
