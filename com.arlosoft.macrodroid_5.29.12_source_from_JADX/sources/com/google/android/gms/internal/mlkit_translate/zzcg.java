package com.google.android.gms.internal.mlkit_translate;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
abstract class zzcg implements Iterator {

    /* renamed from: a */
    zzch f43175a;

    /* renamed from: c */
    zzch f43176c = null;

    /* renamed from: d */
    int f43177d;

    /* renamed from: f */
    final /* synthetic */ zzci f43178f;

    zzcg(zzci zzci) {
        this.f43178f = zzci;
        this.f43175a = zzci.zze.f43182f;
        this.f43177d = zzci.zzd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzch mo52144a() {
        zzch zzch = this.f43175a;
        zzci zzci = this.f43178f;
        if (zzch == zzci.zze) {
            throw new NoSuchElementException();
        } else if (zzci.zzd == this.f43177d) {
            this.f43175a = zzch.f43182f;
            this.f43176c = zzch;
            return zzch;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f43175a != this.f43178f.zze;
    }

    public final void remove() {
        zzch zzch = this.f43176c;
        if (zzch != null) {
            this.f43178f.mo52159e(zzch, true);
            this.f43176c = null;
            this.f43177d = this.f43178f.zzd;
            return;
        }
        throw new IllegalStateException();
    }
}
