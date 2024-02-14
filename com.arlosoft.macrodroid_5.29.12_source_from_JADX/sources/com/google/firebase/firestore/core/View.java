package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.LimboDocumentChange;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class View {

    /* renamed from: a */
    private final Query f6028a;

    /* renamed from: b */
    private ViewSnapshot.SyncState f6029b = ViewSnapshot.SyncState.NONE;

    /* renamed from: c */
    private boolean f6030c;

    /* renamed from: d */
    private DocumentSet f6031d;

    /* renamed from: e */
    private ImmutableSortedSet<DocumentKey> f6032e;

    /* renamed from: f */
    private ImmutableSortedSet<DocumentKey> f6033f;

    /* renamed from: g */
    private ImmutableSortedSet<DocumentKey> f6034g;

    /* renamed from: com.google.firebase.firestore.core.View$1 */
    static /* synthetic */ class C19611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6035a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.firebase.firestore.core.DocumentViewChange$Type[] r0 = com.google.firebase.firestore.core.DocumentViewChange.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6035a = r0
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6035a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6035a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.METADATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6035a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.View.C19611.<clinit>():void");
        }
    }

    public static class DocumentChanges {

        /* renamed from: a */
        final DocumentSet f6036a;

        /* renamed from: b */
        final DocumentViewChangeSet f6037b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean f6038c;

        /* renamed from: d */
        final ImmutableSortedSet<DocumentKey> f6039d;

        /* synthetic */ DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet immutableSortedSet, boolean z, C19611 r5) {
            this(documentSet, documentViewChangeSet, immutableSortedSet, z);
        }

        /* renamed from: b */
        public boolean mo23976b() {
            return this.f6038c;
        }

        private DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet<DocumentKey> immutableSortedSet, boolean z) {
            this.f6036a = documentSet;
            this.f6037b = documentViewChangeSet;
            this.f6039d = immutableSortedSet;
            this.f6038c = z;
        }
    }

    public View(Query query, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        this.f6028a = query;
        this.f6031d = DocumentSet.m75856d(query.mo23912c());
        this.f6032e = immutableSortedSet;
        this.f6033f = DocumentKey.m75847f();
        this.f6034g = DocumentKey.m75847f();
    }

    /* renamed from: d */
    private void m8248d(TargetChange targetChange) {
        if (targetChange != null) {
            Iterator<DocumentKey> it = targetChange.mo63098b().iterator();
            while (it.hasNext()) {
                this.f6032e = this.f6032e.mo23560f(it.next());
            }
            Iterator<DocumentKey> it2 = targetChange.mo63099c().iterator();
            while (it2.hasNext()) {
                DocumentKey next = it2.next();
                Assert.m76443d(this.f6032e.contains(next), "Modified document %s not found in view.", next);
            }
            Iterator<DocumentKey> it3 = targetChange.mo63100d().iterator();
            while (it3.hasNext()) {
                this.f6032e = this.f6032e.mo23563i(it3.next());
            }
            this.f6030c = targetChange.mo63103f();
        }
    }

    /* renamed from: e */
    private static int m8249e(DocumentViewChange documentViewChange) {
        int i = C19611.f6035a[documentViewChange.mo23845c().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 3)) {
                if (i == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + documentViewChange.mo23845c());
            }
        }
        return i2;
    }

    /* renamed from: j */
    static /* synthetic */ int m8250j(View view, DocumentViewChange documentViewChange, DocumentViewChange documentViewChange2) {
        int e = Util.m76522e(m8249e(documentViewChange), m8249e(documentViewChange2));
        documentViewChange.mo23845c().compareTo(documentViewChange2.mo23845c());
        if (e != 0) {
            return e;
        }
        return view.f6028a.mo23912c().compare(documentViewChange.mo23844b(), documentViewChange2.mo23844b());
    }

    /* renamed from: k */
    private boolean m8251k(DocumentKey documentKey) {
        Document f;
        if (!this.f6032e.contains(documentKey) && (f = this.f6031d.mo62838f(documentKey)) != null && !f.mo62819b()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m8252l(Document document, Document document2) {
        return document.mo62819b() && document2.mo62818a() && !document2.mo62819b();
    }

    /* renamed from: m */
    private List<LimboDocumentChange> m8253m() {
        if (!this.f6030c) {
            return Collections.emptyList();
        }
        ImmutableSortedSet<DocumentKey> immutableSortedSet = this.f6033f;
        this.f6033f = DocumentKey.m75847f();
        Iterator<Document> it = this.f6031d.iterator();
        while (it.hasNext()) {
            Document next = it.next();
            if (m8251k(next.getKey())) {
                this.f6033f = this.f6033f.mo23560f(next.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(immutableSortedSet.size() + this.f6033f.size());
        Iterator<DocumentKey> it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            DocumentKey next2 = it2.next();
            if (!this.f6033f.contains(next2)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.REMOVED, next2));
            }
        }
        Iterator<DocumentKey> it3 = this.f6033f.iterator();
        while (it3.hasNext()) {
            DocumentKey next3 = it3.next();
            if (!immutableSortedSet.contains(next3)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.ADDED, next3));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public ViewChange mo23969a(DocumentChanges documentChanges) {
        return mo23970b(documentChanges, (TargetChange) null);
    }

    /* renamed from: b */
    public ViewChange mo23970b(DocumentChanges documentChanges, TargetChange targetChange) {
        DocumentChanges documentChanges2 = documentChanges;
        Assert.m76443d(!documentChanges.f6038c, "Cannot apply changes that need a refill", new Object[0]);
        DocumentSet documentSet = this.f6031d;
        this.f6031d = documentChanges2.f6036a;
        this.f6034g = documentChanges2.f6039d;
        List<DocumentViewChange> b = documentChanges2.f6037b.mo23850b();
        Collections.sort(b, View$$Lambda$1.m8263a(this));
        m8248d(targetChange);
        List<LimboDocumentChange> m = m8253m();
        ViewSnapshot.SyncState syncState = this.f6033f.size() == 0 && this.f6030c ? ViewSnapshot.SyncState.SYNCED : ViewSnapshot.SyncState.LOCAL;
        boolean z = syncState != this.f6029b;
        this.f6029b = syncState;
        ViewSnapshot viewSnapshot = null;
        if (b.size() != 0 || z) {
            viewSnapshot = new ViewSnapshot(this.f6028a, documentChanges2.f6036a, documentSet, b, syncState == ViewSnapshot.SyncState.LOCAL, documentChanges2.f6039d, z, false);
        }
        return new ViewChange(viewSnapshot, m);
    }

    /* renamed from: c */
    public ViewChange mo23971c(OnlineState onlineState) {
        if (!this.f6030c || onlineState != OnlineState.OFFLINE) {
            return new ViewChange((ViewSnapshot) null, Collections.emptyList());
        }
        this.f6030c = false;
        return mo23969a(new DocumentChanges(this.f6031d, new DocumentViewChangeSet(), this.f6034g, false, (C19611) null));
    }

    /* renamed from: f */
    public DocumentChanges mo23972f(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        return mo23973g(immutableSortedMap, (DocumentChanges) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        if (r0.f6028a.mo23912c().compare(r6, r4) > 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        if (r0.f6028a.mo23912c().compare(r6, r7) < 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0125, code lost:
        if (r7 == null) goto L_0x0114;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0153 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.firestore.core.View.DocumentChanges mo23973g(com.google.firebase.database.collection.ImmutableSortedMap<com.google.firebase.firestore.model.DocumentKey, com.google.firebase.firestore.model.Document> r19, @androidx.annotation.Nullable com.google.firebase.firestore.core.View.DocumentChanges r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            if (r1 == 0) goto L_0x0009
            com.google.firebase.firestore.core.DocumentViewChangeSet r2 = r1.f6037b
            goto L_0x000e
        L_0x0009:
            com.google.firebase.firestore.core.DocumentViewChangeSet r2 = new com.google.firebase.firestore.core.DocumentViewChangeSet
            r2.<init>()
        L_0x000e:
            r5 = r2
            if (r1 == 0) goto L_0x0014
            com.google.firebase.firestore.model.DocumentSet r2 = r1.f6036a
            goto L_0x0016
        L_0x0014:
            com.google.firebase.firestore.model.DocumentSet r2 = r0.f6031d
        L_0x0016:
            if (r1 == 0) goto L_0x001b
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r3 = r1.f6039d
            goto L_0x001d
        L_0x001b:
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r3 = r0.f6034g
        L_0x001d:
            com.google.firebase.firestore.core.Query r4 = r0.f6028a
            boolean r4 = r4.mo23926o()
            if (r4 == 0) goto L_0x0039
            int r4 = r2.size()
            long r7 = (long) r4
            com.google.firebase.firestore.core.Query r4 = r0.f6028a
            long r9 = r4.mo23920i()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
            com.google.firebase.firestore.model.Document r4 = r2.mo62841i()
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            com.google.firebase.firestore.core.Query r7 = r0.f6028a
            boolean r7 = r7.mo23927p()
            if (r7 == 0) goto L_0x0056
            int r7 = r2.size()
            long r7 = (long) r7
            com.google.firebase.firestore.core.Query r9 = r0.f6028a
            long r9 = r9.mo23921j()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0056
            com.google.firebase.firestore.model.Document r7 = r2.mo62839h()
            goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            java.util.Iterator r8 = r19.iterator()
            r11 = r2
            r10 = 0
        L_0x005d:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0157
            java.lang.Object r12 = r8.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r14 = r12.getKey()
            com.google.firebase.firestore.model.DocumentKey r14 = (com.google.firebase.firestore.model.DocumentKey) r14
            com.google.firebase.firestore.model.Document r15 = r2.mo62838f(r14)
            com.google.firebase.firestore.core.Query r6 = r0.f6028a
            java.lang.Object r16 = r12.getValue()
            r13 = r16
            com.google.firebase.firestore.model.Document r13 = (com.google.firebase.firestore.model.Document) r13
            boolean r6 = r6.mo23931t(r13)
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r12.getValue()
            com.google.firebase.firestore.model.Document r6 = (com.google.firebase.firestore.model.Document) r6
            goto L_0x008b
        L_0x008a:
            r6 = 0
        L_0x008b:
            if (r15 == 0) goto L_0x009b
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r12 = r0.f6034g
            com.google.firebase.firestore.model.DocumentKey r13 = r15.getKey()
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x009b
            r12 = 1
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            if (r6 == 0) goto L_0x00b8
            boolean r13 = r6.mo62819b()
            if (r13 != 0) goto L_0x00b6
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r13 = r0.f6034g
            com.google.firebase.firestore.model.DocumentKey r9 = r6.getKey()
            boolean r9 = r13.contains(r9)
            if (r9 == 0) goto L_0x00b8
            boolean r9 = r6.mo62818a()
            if (r9 == 0) goto L_0x00b8
        L_0x00b6:
            r9 = 1
            goto L_0x00b9
        L_0x00b8:
            r9 = 0
        L_0x00b9:
            if (r15 == 0) goto L_0x0105
            if (r6 == 0) goto L_0x0105
            com.google.firebase.firestore.model.ObjectValue r13 = r15.getData()
            r17 = r2
            com.google.firebase.firestore.model.ObjectValue r2 = r6.getData()
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00f9
            boolean r2 = r0.m8252l(r15, r6)
            if (r2 != 0) goto L_0x0129
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.MODIFIED
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.m8047a(r2, r6)
            r5.mo23849a(r2)
            if (r4 == 0) goto L_0x00ea
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            java.util.Comparator r2 = r2.mo23912c()
            int r2 = r2.compare(r6, r4)
            if (r2 > 0) goto L_0x0127
        L_0x00ea:
            if (r7 == 0) goto L_0x0114
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            java.util.Comparator r2 = r2.mo23912c()
            int r2 = r2.compare(r6, r7)
            if (r2 >= 0) goto L_0x0114
            goto L_0x0127
        L_0x00f9:
            if (r12 == r9) goto L_0x0129
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.METADATA
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.m8047a(r2, r6)
            r5.mo23849a(r2)
            goto L_0x0114
        L_0x0105:
            r17 = r2
            if (r15 != 0) goto L_0x0116
            if (r6 == 0) goto L_0x0116
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.m8047a(r2, r6)
            r5.mo23849a(r2)
        L_0x0114:
            r13 = 1
            goto L_0x012a
        L_0x0116:
            if (r15 == 0) goto L_0x0129
            if (r6 != 0) goto L_0x0129
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.m8047a(r2, r15)
            r5.mo23849a(r2)
            if (r4 != 0) goto L_0x0127
            if (r7 == 0) goto L_0x0114
        L_0x0127:
            r10 = 1
            goto L_0x0114
        L_0x0129:
            r13 = 0
        L_0x012a:
            if (r13 == 0) goto L_0x0153
            if (r6 == 0) goto L_0x014a
            com.google.firebase.firestore.model.DocumentSet r11 = r11.mo62836c(r6)
            boolean r2 = r6.mo62819b()
            if (r2 == 0) goto L_0x0141
            com.google.firebase.firestore.model.DocumentKey r2 = r6.getKey()
            com.google.firebase.database.collection.ImmutableSortedSet r2 = r3.mo23560f(r2)
            goto L_0x0152
        L_0x0141:
            com.google.firebase.firestore.model.DocumentKey r2 = r6.getKey()
            com.google.firebase.database.collection.ImmutableSortedSet r2 = r3.mo23563i(r2)
            goto L_0x0152
        L_0x014a:
            com.google.firebase.firestore.model.DocumentSet r11 = r11.mo62844k(r14)
            com.google.firebase.database.collection.ImmutableSortedSet r2 = r3.mo23563i(r14)
        L_0x0152:
            r3 = r2
        L_0x0153:
            r2 = r17
            goto L_0x005d
        L_0x0157:
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            boolean r2 = r2.mo23926o()
            if (r2 != 0) goto L_0x016b
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            boolean r2 = r2.mo23927p()
            if (r2 == 0) goto L_0x0168
            goto L_0x016b
        L_0x0168:
            r6 = r3
            r4 = r11
            goto L_0x01b9
        L_0x016b:
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            boolean r2 = r2.mo23926o()
            if (r2 == 0) goto L_0x017a
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            long r6 = r2.mo23920i()
            goto L_0x0180
        L_0x017a:
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            long r6 = r2.mo23921j()
        L_0x0180:
            int r2 = r11.size()
            long r8 = (long) r2
        L_0x0185:
            long r8 = r8 - r6
            r6 = 0
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0168
            com.google.firebase.firestore.core.Query r2 = r0.f6028a
            boolean r2 = r2.mo23926o()
            if (r2 == 0) goto L_0x0199
            com.google.firebase.firestore.model.Document r2 = r11.mo62841i()
            goto L_0x019d
        L_0x0199:
            com.google.firebase.firestore.model.Document r2 = r11.mo62839h()
        L_0x019d:
            com.google.firebase.firestore.model.DocumentKey r4 = r2.getKey()
            com.google.firebase.firestore.model.DocumentSet r11 = r11.mo62844k(r4)
            com.google.firebase.firestore.model.DocumentKey r4 = r2.getKey()
            com.google.firebase.database.collection.ImmutableSortedSet r3 = r3.mo23563i(r4)
            com.google.firebase.firestore.core.DocumentViewChange$Type r4 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.m8047a(r4, r2)
            r5.mo23849a(r2)
            r6 = 1
            goto L_0x0185
        L_0x01b9:
            if (r10 == 0) goto L_0x01c1
            if (r1 != 0) goto L_0x01be
            goto L_0x01c1
        L_0x01be:
            r1 = 0
            r13 = 0
            goto L_0x01c3
        L_0x01c1:
            r1 = 0
            r13 = 1
        L_0x01c3:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "View was refilled using docs that themselves needed refilling."
            com.google.firebase.firestore.util.Assert.m76443d(r13, r2, r1)
            com.google.firebase.firestore.core.View$DocumentChanges r1 = new com.google.firebase.firestore.core.View$DocumentChanges
            r8 = 0
            r3 = r1
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.View.mo23973g(com.google.firebase.database.collection.ImmutableSortedMap, com.google.firebase.firestore.core.View$DocumentChanges):com.google.firebase.firestore.core.View$DocumentChanges");
    }

    /* renamed from: h */
    public ViewSnapshot.SyncState mo23974h() {
        return this.f6029b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ImmutableSortedSet<DocumentKey> mo23975i() {
        return this.f6032e;
    }
}
