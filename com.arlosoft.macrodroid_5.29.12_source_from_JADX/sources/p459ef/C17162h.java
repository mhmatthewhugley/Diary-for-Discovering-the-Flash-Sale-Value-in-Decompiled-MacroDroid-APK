package p459ef;

import androidx.core.location.LocationRequestCompat;
import p473rx.internal.util.C17391g;

/* renamed from: ef.h */
/* compiled from: Subscriber */
public abstract class C17162h<T> implements C17156d<T>, C17163i {

    /* renamed from: a */
    private final C17391g f68709a;

    /* renamed from: c */
    private final C17162h<?> f68710c;

    /* renamed from: d */
    private C17157e f68711d;

    /* renamed from: f */
    private long f68712f;

    protected C17162h() {
        this((C17162h<?>) null, false);
    }

    /* renamed from: c */
    private void m100649c(long j) {
        long j2 = this.f68712f;
        if (j2 == Long.MIN_VALUE) {
            this.f68712f = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.f68712f = LocationRequestCompat.PASSIVE_INTERVAL;
        } else {
            this.f68712f = j3;
        }
    }

    /* renamed from: a */
    public final void mo80448a(C17163i iVar) {
        this.f68709a.mo80709a(iVar);
    }

    /* renamed from: b */
    public final boolean mo80449b() {
        return this.f68709a.mo80449b();
    }

    /* renamed from: d */
    public final void mo80450d() {
        this.f68709a.mo80450d();
    }

    /* renamed from: e */
    public void mo80451e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo80452f(long j) {
        if (j >= 0) {
            synchronized (this) {
                C17157e eVar = this.f68711d;
                if (eVar != null) {
                    eVar.request(j);
                } else {
                    m100649c(j);
                }
            }
        } else {
            throw new IllegalArgumentException("number requested cannot be negative: " + j);
        }
    }

    /* renamed from: g */
    public void mo80453g(C17157e eVar) {
        long j;
        C17162h<?> hVar;
        boolean z;
        synchronized (this) {
            j = this.f68712f;
            this.f68711d = eVar;
            hVar = this.f68710c;
            z = hVar != null && j == Long.MIN_VALUE;
        }
        if (z) {
            hVar.mo80453g(eVar);
        } else if (j == Long.MIN_VALUE) {
            eVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
        } else {
            eVar.request(j);
        }
    }

    protected C17162h(C17162h<?> hVar) {
        this(hVar, true);
    }

    protected C17162h(C17162h<?> hVar, boolean z) {
        this.f68712f = Long.MIN_VALUE;
        this.f68710c = hVar;
        this.f68709a = (!z || hVar == null) ? new C17391g() : hVar.f68709a;
    }
}
