package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.internal.p204firebaseauthapi.zzadb;
import com.google.android.gms.internal.p204firebaseauthapi.zzadf;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class zzadb<MessageType extends zzadf<MessageType, BuilderType>, BuilderType extends zzadb<MessageType, BuilderType>> extends zzabl<MessageType, BuilderType> {

    /* renamed from: a */
    private final zzadf f39740a;

    /* renamed from: c */
    protected zzadf f39741c;

    protected zzadb(MessageType messagetype) {
        this.f39740a = messagetype;
        if (!messagetype.mo49082n()) {
            this.f39741c = messagetype.mo49090y();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: c */
    private static void m56414c(Object obj, Object obj2) {
        zzaes.m56608a().mo49150b(obj.getClass()).mo49145f(obj, obj2);
    }

    /* renamed from: d */
    public final zzadb clone() {
        zzadb zzadb = (zzadb) this.f39740a.mo49084t(5, (Object) null, (Object) null);
        zzadb.f39741c = mo49072i();
        return zzadb;
    }

    /* renamed from: e */
    public final zzadb mo49068e(zzadf zzadf) {
        if (!this.f39740a.equals(zzadf)) {
            if (!this.f39741c.mo49082n()) {
                mo49073k();
            }
            m56414c(this.f39741c, zzadf);
        }
        return this;
    }

    /* renamed from: f */
    public final MessageType mo49069f() {
        MessageType g = mo49072i();
        if (g.mo49081m()) {
            return g;
        }
        throw new zzafm(g);
    }

    /* renamed from: g */
    public MessageType mo49072i() {
        if (!this.f39741c.mo49082n()) {
            return this.f39741c;
        }
        this.f39741c.mo49077g();
        return this.f39741c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo49071h() {
        if (!this.f39741c.mo49082n()) {
            mo49073k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49073k() {
        zzadf y = this.f39740a.mo49090y();
        m56414c(y, this.f39741c);
        this.f39741c = y;
    }
}
