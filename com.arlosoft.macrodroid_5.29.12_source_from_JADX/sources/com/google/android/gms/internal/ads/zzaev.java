package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaev extends zzaex {

    /* renamed from: b */
    public final long f24176b;

    /* renamed from: c */
    public final List f24177c = new ArrayList();

    /* renamed from: d */
    public final List f24178d = new ArrayList();

    public zzaev(int i, long j) {
        super(i);
        this.f24176b = j;
    }

    @Nullable
    /* renamed from: c */
    public final zzaev mo41415c(int i) {
        int size = this.f24178d.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaev zzaev = (zzaev) this.f24178d.get(i2);
            if (zzaev.f24180a == i) {
                return zzaev;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public final zzaew mo41416d(int i) {
        int size = this.f24177c.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaew zzaew = (zzaew) this.f24177c.get(i2);
            if (zzaew.f24180a == i) {
                return zzaew;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo41417e(zzaev zzaev) {
        this.f24178d.add(zzaev);
    }

    /* renamed from: f */
    public final void mo41418f(zzaew zzaew) {
        this.f24177c.add(zzaew);
    }

    public final String toString() {
        String b = zzaex.m41222b(this.f24180a);
        String arrays = Arrays.toString(this.f24177c.toArray());
        String arrays2 = Arrays.toString(this.f24178d.toArray());
        return b + " leaves: " + arrays + " containers: " + arrays2;
    }
}
