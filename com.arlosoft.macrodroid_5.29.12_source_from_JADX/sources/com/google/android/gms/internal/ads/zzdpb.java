package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdpb {

    /* renamed from: h */
    public static final zzdpb f32689h = new zzdpb(new zzdoz());
    @Nullable

    /* renamed from: a */
    private final zzbnf f32690a;
    @Nullable

    /* renamed from: b */
    private final zzbnc f32691b;
    @Nullable

    /* renamed from: c */
    private final zzbns f32692c;
    @Nullable

    /* renamed from: d */
    private final zzbnp f32693d;
    @Nullable

    /* renamed from: e */
    private final zzbsl f32694e;

    /* renamed from: f */
    private final SimpleArrayMap f32695f;

    /* renamed from: g */
    private final SimpleArrayMap f32696g;

    private zzdpb(zzdoz zzdoz) {
        this.f32690a = zzdoz.f32679a;
        this.f32691b = zzdoz.f32680b;
        this.f32692c = zzdoz.f32681c;
        this.f32695f = new SimpleArrayMap(zzdoz.f32684f);
        this.f32696g = new SimpleArrayMap(zzdoz.f32685g);
        this.f32693d = zzdoz.f32682d;
        this.f32694e = zzdoz.f32683e;
    }

    @Nullable
    /* renamed from: a */
    public final zzbnc mo44862a() {
        return this.f32691b;
    }

    @Nullable
    /* renamed from: b */
    public final zzbnf mo44863b() {
        return this.f32690a;
    }

    @Nullable
    /* renamed from: c */
    public final zzbni mo44864c(String str) {
        return (zzbni) this.f32696g.get(str);
    }

    @Nullable
    /* renamed from: d */
    public final zzbnl mo44865d(String str) {
        return (zzbnl) this.f32695f.get(str);
    }

    @Nullable
    /* renamed from: e */
    public final zzbnp mo44866e() {
        return this.f32693d;
    }

    @Nullable
    /* renamed from: f */
    public final zzbns mo44867f() {
        return this.f32692c;
    }

    @Nullable
    /* renamed from: g */
    public final zzbsl mo44868g() {
        return this.f32694e;
    }

    /* renamed from: h */
    public final ArrayList mo44869h() {
        ArrayList arrayList = new ArrayList(this.f32695f.size());
        for (int i = 0; i < this.f32695f.size(); i++) {
            arrayList.add((String) this.f32695f.keyAt(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final ArrayList mo44870i() {
        ArrayList arrayList = new ArrayList();
        if (this.f32692c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f32690a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f32691b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f32695f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f32694e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
