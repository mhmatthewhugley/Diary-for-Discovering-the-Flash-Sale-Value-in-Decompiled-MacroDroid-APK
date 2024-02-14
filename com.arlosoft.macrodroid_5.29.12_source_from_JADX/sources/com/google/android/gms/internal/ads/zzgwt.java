package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzgwt implements Iterator, Closeable, zzalr {

    /* renamed from: p */
    private static final zzalq f37382p = new zzgws("eof ");

    /* renamed from: s */
    private static final zzgxa f37383s = zzgxa.m53636b(zzgwt.class);

    /* renamed from: a */
    protected zzaln f37384a;

    /* renamed from: c */
    protected zzgwu f37385c;

    /* renamed from: d */
    zzalq f37386d = null;

    /* renamed from: f */
    long f37387f = 0;

    /* renamed from: g */
    long f37388g = 0;

    /* renamed from: o */
    private final List f37389o = new ArrayList();

    public void close() throws IOException {
    }

    /* renamed from: e */
    public final zzalq next() {
        zzalq a;
        zzalq zzalq = this.f37386d;
        if (zzalq == null || zzalq == f37382p) {
            zzgwu zzgwu = this.f37385c;
            if (zzgwu == null || this.f37387f >= this.f37388g) {
                this.f37386d = f37382p;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzgwu) {
                    this.f37385c.mo43876n(this.f37387f);
                    a = this.f37384a.mo41631a(this.f37385c, this);
                    this.f37387f = this.f37385c.zzb();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f37386d = null;
            return zzalq;
        }
    }

    /* renamed from: g */
    public final List mo47579g() {
        return (this.f37385c == null || this.f37386d == f37382p) ? this.f37389o : new zzgwz(this.f37389o, this);
    }

    /* renamed from: h */
    public final void mo47580h(zzgwu zzgwu, long j, zzaln zzaln) throws IOException {
        this.f37385c = zzgwu;
        this.f37387f = zzgwu.zzb();
        zzgwu.mo43876n(zzgwu.zzb() + j);
        this.f37388g = zzgwu.zzb();
        this.f37384a = zzaln;
    }

    public final boolean hasNext() {
        zzalq zzalq = this.f37386d;
        if (zzalq == f37382p) {
            return false;
        }
        if (zzalq != null) {
            return true;
        }
        try {
            this.f37386d = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f37386d = f37382p;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f37389o.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzalq) this.f37389o.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
