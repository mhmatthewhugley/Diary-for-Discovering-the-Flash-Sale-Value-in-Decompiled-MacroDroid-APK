package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.IndexRange;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;
import java.util.Arrays;
import java.util.List;

public class IndexedQueryEngine implements QueryEngine {

    /* renamed from: c */
    private static final List<Value.ValueTypeCase> f54169c = Arrays.asList(new Value.ValueTypeCase[]{Value.ValueTypeCase.BOOLEAN_VALUE, Value.ValueTypeCase.ARRAY_VALUE, Value.ValueTypeCase.MAP_VALUE});

    /* renamed from: a */
    private final SQLiteCollectionIndex f54170a;

    /* renamed from: b */
    private LocalDocumentsView f54171b;

    /* renamed from: com.google.firebase.firestore.local.IndexedQueryEngine$1 */
    static /* synthetic */ class C112191 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54172a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.core.Filter$Operator[] r0 = com.google.firebase.firestore.core.Filter.Operator.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54172a = r0
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.EQUAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54172a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54172a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54172a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54172a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.IndexedQueryEngine.C112191.<clinit>():void");
        }
    }

    /* renamed from: c */
    private static IndexRange m75298c(Filter filter) {
        IndexRange.Builder f = IndexRange.m8104a().mo23890f(filter.mo23859b());
        if (filter instanceof FieldFilter) {
            FieldFilter fieldFilter = (FieldFilter) filter;
            Value f2 = fieldFilter.mo23862f();
            int i = C112191.f54172a[fieldFilter.mo23860e().ordinal()];
            if (i == 1) {
                f.mo23891g(f2).mo23889e(f2);
            } else if (i == 2 || i == 3) {
                f.mo23889e(f2);
            } else if (i == 4 || i == 5) {
                f.mo23891g(f2);
            } else {
                throw Assert.m76440a("Unexpected operator in query filter", new Object[0]);
            }
        }
        return f.mo23888d();
    }

    /* renamed from: d */
    private static double m75299d(Filter filter) {
        Assert.m76443d(filter instanceof FieldFilter, "Filter type expected to be FieldFilter", new Object[0]);
        FieldFilter fieldFilter = (FieldFilter) filter;
        Value f = fieldFilter.mo23862f();
        double d = 1.0d;
        if (Values.m75936w(f) || Values.m75935v(f)) {
            return 1.0d;
        }
        double d2 = fieldFilter.mo23860e().equals(Filter.Operator.EQUAL) ? 1.0d : 0.5d;
        if (f54169c.contains(fieldFilter.mo23862f().mo63926q0())) {
            d = 0.5d;
        }
        return d * d2;
    }

    @VisibleForTesting
    @Nullable
    /* renamed from: e */
    static IndexRange m75300e(Query query) {
        Filter filter = null;
        if (!query.mo23917g().isEmpty()) {
            double d = -1.0d;
            for (Filter next : query.mo23917g()) {
                double d2 = m75299d(next);
                if (d2 > d) {
                    filter = next;
                    d = d2;
                }
            }
            Assert.m76443d(filter != null, "Filter should be defined", new Object[0]);
            return m75298c(filter);
        } else if (!query.mo23923l().get(0).mo23906c().equals(FieldPath.f54449c)) {
            return IndexRange.m8104a().mo23890f(query.mo23923l().get(0).mo23906c()).mo23888d();
        } else {
            return null;
        }
    }

    /* renamed from: f */
    private ImmutableSortedMap<DocumentKey, Document> m75301f(Query query) {
        Assert.m76443d(!query.mo23930s(), "matchesCollectionQuery() called with document query.", new Object[0]);
        IndexRange e = m75300e(query);
        if (e != null) {
            return m75302g(query, e);
        }
        Assert.m76443d(query.mo23917g().isEmpty(), "If there are any filters, we should be able to use an index.", new Object[0]);
        return this.f54171b.mo62594i(query, SnapshotVersion.f54468c);
    }

    /* renamed from: g */
    private ImmutableSortedMap<DocumentKey, Document> m75302g(Query query, IndexRange indexRange) {
        ImmutableSortedMap<DocumentKey, Document> a = DocumentCollections.m75842a();
        IndexCursor a2 = this.f54170a.mo62735a(query.mo23924m(), indexRange);
        while (a2.mo62588c()) {
            try {
                Document c = this.f54171b.mo62592c(a2.mo62587b());
                if (query.mo23931t(c)) {
                    a = a.mo23540j(a2.mo62587b(), c);
                }
            } finally {
                a2.close();
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo62579a(LocalDocumentsView localDocumentsView) {
        this.f54171b = localDocumentsView;
    }

    /* renamed from: b */
    public ImmutableSortedMap<DocumentKey, Document> mo62580b(Query query, SnapshotVersion snapshotVersion, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        Assert.m76443d(this.f54171b != null, "setLocalDocumentsView() not called", new Object[0]);
        if (query.mo23930s()) {
            return this.f54171b.mo62594i(query, SnapshotVersion.f54468c);
        }
        return m75301f(query);
    }
}
