package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class Query {

    /* renamed from: k */
    private static final OrderBy f5948k;

    /* renamed from: l */
    private static final OrderBy f5949l;

    /* renamed from: a */
    private final List<OrderBy> f5950a;

    /* renamed from: b */
    private List<OrderBy> f5951b;
    @Nullable

    /* renamed from: c */
    private Target f5952c;

    /* renamed from: d */
    private final List<Filter> f5953d;

    /* renamed from: e */
    private final ResourcePath f5954e;
    @Nullable

    /* renamed from: f */
    private final String f5955f;

    /* renamed from: g */
    private final long f5956g;

    /* renamed from: h */
    private final LimitType f5957h;
    @Nullable

    /* renamed from: i */
    private final Bound f5958i;
    @Nullable

    /* renamed from: j */
    private final Bound f5959j;

    public enum LimitType {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    private static class QueryComparator implements Comparator<Document> {

        /* renamed from: a */
        private final List<OrderBy> f5963a;

        QueryComparator(List<OrderBy> list) {
            boolean z;
            Iterator<OrderBy> it = list.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    OrderBy next = it.next();
                    if (z || next.mo23906c().equals(FieldPath.f54449c)) {
                        z = true;
                    }
                }
            }
            if (z) {
                this.f5963a = list;
                return;
            }
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }

        /* renamed from: a */
        public int compare(Document document, Document document2) {
            for (OrderBy a : this.f5963a) {
                int a2 = a.mo23904a(document, document2);
                if (a2 != 0) {
                    return a2;
                }
            }
            return 0;
        }
    }

    static {
        OrderBy.Direction direction = OrderBy.Direction.ASCENDING;
        FieldPath fieldPath = FieldPath.f54449c;
        f5948k = OrderBy.m8134d(direction, fieldPath);
        f5949l = OrderBy.m8134d(OrderBy.Direction.DESCENDING, fieldPath);
    }

    public Query(ResourcePath resourcePath, @Nullable String str, List<Filter> list, List<OrderBy> list2, long j, LimitType limitType, @Nullable Bound bound, @Nullable Bound bound2) {
        this.f5954e = resourcePath;
        this.f5955f = str;
        this.f5950a = list2;
        this.f5953d = list;
        this.f5956g = j;
        this.f5957h = limitType;
        this.f5958i = bound;
        this.f5959j = bound2;
    }

    /* renamed from: b */
    public static Query m8139b(ResourcePath resourcePath) {
        return new Query(resourcePath, (String) null);
    }

    /* renamed from: v */
    private boolean m8140v(Document document) {
        Bound bound = this.f5958i;
        if (bound != null && !bound.mo23813d(mo23923l(), document)) {
            return false;
        }
        Bound bound2 = this.f5959j;
        if (bound2 == null || !bound2.mo23813d(mo23923l(), document)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private boolean m8141w(Document document) {
        for (Filter c : this.f5953d) {
            if (!c.mo23807c(document)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    private boolean m8142x(Document document) {
        for (OrderBy next : this.f5950a) {
            if (!next.mo23906c().equals(FieldPath.f54449c) && document.mo62823f(next.f5944b) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    private boolean m8143y(Document document) {
        ResourcePath k = document.getKey().mo62832k();
        if (this.f5955f != null) {
            if (!document.getKey().mo62833l(this.f5955f) || !this.f5954e.mo62806m(k)) {
                return false;
            }
            return true;
        } else if (DocumentKey.m75851m(this.f5954e)) {
            return this.f5954e.equals(k);
        } else {
            if (!this.f5954e.mo62806m(k) || this.f5954e.mo62807n() != k.mo62807n() - 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public Query mo23911a(ResourcePath resourcePath) {
        return new Query(resourcePath, (String) null, this.f5953d, this.f5950a, this.f5956g, this.f5957h, this.f5958i, this.f5959j);
    }

    /* renamed from: c */
    public Comparator<Document> mo23912c() {
        return new QueryComparator(mo23923l());
    }

    @Nullable
    /* renamed from: d */
    public String mo23913d() {
        return this.f5955f;
    }

    @Nullable
    /* renamed from: e */
    public Bound mo23914e() {
        return this.f5959j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Query.class != obj.getClass()) {
            return false;
        }
        Query query = (Query) obj;
        if (this.f5957h != query.f5957h) {
            return false;
        }
        return mo23934z().equals(query.mo23934z());
    }

    /* renamed from: f */
    public List<OrderBy> mo23916f() {
        return this.f5950a;
    }

    /* renamed from: g */
    public List<Filter> mo23917g() {
        return this.f5953d;
    }

    /* renamed from: h */
    public FieldPath mo23918h() {
        if (this.f5950a.isEmpty()) {
            return null;
        }
        return this.f5950a.get(0).mo23906c();
    }

    public int hashCode() {
        return (mo23934z().hashCode() * 31) + this.f5957h.hashCode();
    }

    /* renamed from: i */
    public long mo23920i() {
        Assert.m76443d(mo23926o(), "Called getLimitToFirst when no limit was set", new Object[0]);
        return this.f5956g;
    }

    /* renamed from: j */
    public long mo23921j() {
        Assert.m76443d(mo23927p(), "Called getLimitToLast when no limit was set", new Object[0]);
        return this.f5956g;
    }

    /* renamed from: k */
    public LimitType mo23922k() {
        Assert.m76443d(mo23927p() || mo23926o(), "Called getLimitType when no limit was set", new Object[0]);
        return this.f5957h;
    }

    /* renamed from: l */
    public List<OrderBy> mo23923l() {
        OrderBy.Direction direction;
        if (this.f5951b == null) {
            FieldPath q = mo23928q();
            FieldPath h = mo23918h();
            boolean z = false;
            if (q == null || h != null) {
                ArrayList arrayList = new ArrayList();
                for (OrderBy next : this.f5950a) {
                    arrayList.add(next);
                    if (next.mo23906c().equals(FieldPath.f54449c)) {
                        z = true;
                    }
                }
                if (!z) {
                    if (this.f5950a.size() > 0) {
                        List<OrderBy> list = this.f5950a;
                        direction = list.get(list.size() - 1).mo23905b();
                    } else {
                        direction = OrderBy.Direction.ASCENDING;
                    }
                    arrayList.add(direction.equals(OrderBy.Direction.ASCENDING) ? f5948k : f5949l);
                }
                this.f5951b = arrayList;
            } else if (q.mo62849v()) {
                this.f5951b = Collections.singletonList(f5948k);
            } else {
                this.f5951b = Arrays.asList(new OrderBy[]{OrderBy.m8134d(OrderBy.Direction.ASCENDING, q), f5948k});
            }
        }
        return this.f5951b;
    }

    /* renamed from: m */
    public ResourcePath mo23924m() {
        return this.f5954e;
    }

    @Nullable
    /* renamed from: n */
    public Bound mo23925n() {
        return this.f5958i;
    }

    /* renamed from: o */
    public boolean mo23926o() {
        return this.f5957h == LimitType.LIMIT_TO_FIRST && this.f5956g != -1;
    }

    /* renamed from: p */
    public boolean mo23927p() {
        return this.f5957h == LimitType.LIMIT_TO_LAST && this.f5956g != -1;
    }

    @Nullable
    /* renamed from: q */
    public FieldPath mo23928q() {
        for (Filter next : this.f5953d) {
            if (next instanceof FieldFilter) {
                FieldFilter fieldFilter = (FieldFilter) next;
                if (fieldFilter.mo23863g()) {
                    return fieldFilter.mo23859b();
                }
            }
        }
        return null;
    }

    /* renamed from: r */
    public boolean mo23929r() {
        return this.f5955f != null;
    }

    /* renamed from: s */
    public boolean mo23930s() {
        return DocumentKey.m75851m(this.f5954e) && this.f5955f == null && this.f5953d.isEmpty();
    }

    /* renamed from: t */
    public boolean mo23931t(Document document) {
        return document.mo62822e() && m8143y(document) && m8142x(document) && m8141w(document) && m8140v(document);
    }

    public String toString() {
        return "Query(target=" + mo23934z().toString() + ";limitType=" + this.f5957h.toString() + ")";
    }

    /* renamed from: u */
    public boolean mo23933u() {
        if (this.f5953d.isEmpty() && this.f5956g == -1 && this.f5958i == null && this.f5959j == null) {
            if (mo23916f().isEmpty()) {
                return true;
            }
            if (mo23916f().size() != 1 || !mo23918h().mo62849v()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public Target mo23934z() {
        if (this.f5952c == null) {
            if (this.f5957h == LimitType.LIMIT_TO_FIRST) {
                this.f5952c = new Target(mo23924m(), mo23913d(), mo23917g(), mo23923l(), this.f5956g, mo23925n(), mo23914e());
            } else {
                ArrayList arrayList = new ArrayList();
                for (OrderBy next : mo23923l()) {
                    OrderBy.Direction b = next.mo23905b();
                    OrderBy.Direction direction = OrderBy.Direction.DESCENDING;
                    if (b == direction) {
                        direction = OrderBy.Direction.ASCENDING;
                    }
                    arrayList.add(OrderBy.m8134d(direction, next.mo23906c()));
                }
                Bound bound = this.f5959j;
                Bound bound2 = null;
                Bound bound3 = bound != null ? new Bound(bound.mo23811b(), !this.f5959j.mo23812c()) : null;
                Bound bound4 = this.f5958i;
                if (bound4 != null) {
                    bound2 = new Bound(bound4.mo23811b(), !this.f5958i.mo23812c());
                }
                this.f5952c = new Target(mo23924m(), mo23913d(), mo23917g(), arrayList, this.f5956g, bound3, bound2);
            }
        }
        return this.f5952c;
    }

    public Query(ResourcePath resourcePath, @Nullable String str) {
        this(resourcePath, str, Collections.emptyList(), Collections.emptyList(), -1, LimitType.LIMIT_TO_FIRST, (Bound) null, (Bound) null);
    }
}
