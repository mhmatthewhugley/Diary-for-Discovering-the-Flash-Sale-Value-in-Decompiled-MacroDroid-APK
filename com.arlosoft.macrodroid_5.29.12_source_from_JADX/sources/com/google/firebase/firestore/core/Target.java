package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import java.util.List;

public final class Target {
    @Nullable

    /* renamed from: a */
    private String f5991a;

    /* renamed from: b */
    private final List<OrderBy> f5992b;

    /* renamed from: c */
    private final List<Filter> f5993c;

    /* renamed from: d */
    private final ResourcePath f5994d;
    @Nullable

    /* renamed from: e */
    private final String f5995e;

    /* renamed from: f */
    private final long f5996f;
    @Nullable

    /* renamed from: g */
    private final Bound f5997g;
    @Nullable

    /* renamed from: h */
    private final Bound f5998h;

    public Target(ResourcePath resourcePath, @Nullable String str, List<Filter> list, List<OrderBy> list2, long j, @Nullable Bound bound, @Nullable Bound bound2) {
        this.f5994d = resourcePath;
        this.f5995e = str;
        this.f5992b = list2;
        this.f5993c = list;
        this.f5996f = j;
        this.f5997g = bound;
        this.f5998h = bound2;
    }

    /* renamed from: a */
    public String mo23952a() {
        String str = this.f5991a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo23959g().mo62797e());
        if (this.f5995e != null) {
            sb.append("|cg:");
            sb.append(this.f5995e);
        }
        sb.append("|f:");
        for (Filter a : mo23955d()) {
            sb.append(a.mo23858a());
        }
        sb.append("|ob:");
        for (OrderBy next : mo23958f()) {
            sb.append(next.mo23906c().mo62797e());
            sb.append(next.mo23905b().equals(OrderBy.Direction.ASCENDING) ? "asc" : "desc");
        }
        if (mo23962i()) {
            sb.append("|l:");
            sb.append(mo23956e());
        }
        if (this.f5997g != null) {
            sb.append("|lb:");
            sb.append(this.f5997g.mo23810a());
        }
        if (this.f5998h != null) {
            sb.append("|ub:");
            sb.append(this.f5998h.mo23810a());
        }
        String sb2 = sb.toString();
        this.f5991a = sb2;
        return sb2;
    }

    @Nullable
    /* renamed from: b */
    public String mo23953b() {
        return this.f5995e;
    }

    @Nullable
    /* renamed from: c */
    public Bound mo23954c() {
        return this.f5998h;
    }

    /* renamed from: d */
    public List<Filter> mo23955d() {
        return this.f5993c;
    }

    /* renamed from: e */
    public long mo23956e() {
        return this.f5996f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Target.class != obj.getClass()) {
            return false;
        }
        Target target = (Target) obj;
        String str = this.f5995e;
        if (str == null ? target.f5995e != null : !str.equals(target.f5995e)) {
            return false;
        }
        if (this.f5996f != target.f5996f || !this.f5992b.equals(target.f5992b) || !this.f5993c.equals(target.f5993c) || !this.f5994d.equals(target.f5994d)) {
            return false;
        }
        Bound bound = this.f5997g;
        if (bound == null ? target.f5997g != null : !bound.equals(target.f5997g)) {
            return false;
        }
        Bound bound2 = this.f5998h;
        Bound bound3 = target.f5998h;
        if (bound2 != null) {
            return bound2.equals(bound3);
        }
        if (bound3 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<OrderBy> mo23958f() {
        return this.f5992b;
    }

    /* renamed from: g */
    public ResourcePath mo23959g() {
        return this.f5994d;
    }

    @Nullable
    /* renamed from: h */
    public Bound mo23960h() {
        return this.f5997g;
    }

    public int hashCode() {
        int hashCode = this.f5992b.hashCode() * 31;
        String str = this.f5995e;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f5996f;
        int hashCode3 = (((((((hashCode + hashCode2) * 31) + this.f5993c.hashCode()) * 31) + this.f5994d.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Bound bound = this.f5997g;
        int hashCode4 = (hashCode3 + (bound != null ? bound.hashCode() : 0)) * 31;
        Bound bound2 = this.f5998h;
        if (bound2 != null) {
            i = bound2.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public boolean mo23962i() {
        return this.f5996f != -1;
    }

    /* renamed from: j */
    public boolean mo23963j() {
        return DocumentKey.m75851m(this.f5994d) && this.f5995e == null && this.f5993c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f5994d.mo62797e());
        if (this.f5995e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f5995e);
        }
        if (!this.f5993c.isEmpty()) {
            sb.append(" where ");
            for (int i = 0; i < this.f5993c.size(); i++) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f5993c.get(i).toString());
            }
        }
        if (!this.f5992b.isEmpty()) {
            sb.append(" order by ");
            for (int i2 = 0; i2 < this.f5992b.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f5992b.get(i2));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
