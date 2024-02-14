package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import java.util.HashMap;
import java.util.Map;

final class TargetState {

    /* renamed from: a */
    private int f54681a = 0;

    /* renamed from: b */
    private final Map<DocumentKey, DocumentViewChange.Type> f54682b = new HashMap();

    /* renamed from: c */
    private boolean f54683c = true;

    /* renamed from: d */
    private ByteString f54684d = ByteString.f56619a;

    /* renamed from: e */
    private boolean f54685e = false;

    /* renamed from: com.google.firebase.firestore.remote.TargetState$1 */
    static /* synthetic */ class C112451 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54686a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.firestore.core.DocumentViewChange$Type[] r0 = com.google.firebase.firestore.core.DocumentViewChange.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54686a = r0
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54686a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54686a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.TargetState.C112451.<clinit>():void");
        }
    }

    TargetState() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63105a(DocumentKey documentKey, DocumentViewChange.Type type) {
        this.f54683c = true;
        this.f54682b.put(documentKey, type);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63106b() {
        this.f54683c = false;
        this.f54682b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo63107c() {
        return this.f54683c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo63108d() {
        return this.f54685e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo63109e() {
        return this.f54681a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo63110f() {
        this.f54683c = true;
        this.f54685e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo63111g() {
        this.f54681a++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo63112h() {
        this.f54681a--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo63113i(DocumentKey documentKey) {
        this.f54683c = true;
        this.f54682b.remove(documentKey);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public TargetChange mo63114j() {
        ImmutableSortedSet<DocumentKey> f = DocumentKey.m75847f();
        ImmutableSortedSet<DocumentKey> f2 = DocumentKey.m75847f();
        ImmutableSortedSet<DocumentKey> f3 = DocumentKey.m75847f();
        ImmutableSortedSet<DocumentKey> immutableSortedSet = f;
        ImmutableSortedSet<DocumentKey> immutableSortedSet2 = f2;
        ImmutableSortedSet<DocumentKey> immutableSortedSet3 = f3;
        for (Map.Entry next : this.f54682b.entrySet()) {
            DocumentKey documentKey = (DocumentKey) next.getKey();
            DocumentViewChange.Type type = (DocumentViewChange.Type) next.getValue();
            int i = C112451.f54686a[type.ordinal()];
            if (i == 1) {
                immutableSortedSet = immutableSortedSet.mo23560f(documentKey);
            } else if (i == 2) {
                immutableSortedSet2 = immutableSortedSet2.mo23560f(documentKey);
            } else if (i == 3) {
                immutableSortedSet3 = immutableSortedSet3.mo23560f(documentKey);
            } else {
                throw Assert.m76440a("Encountered invalid change type: %s", type);
            }
        }
        return new TargetChange(this.f54684d, this.f54685e, immutableSortedSet, immutableSortedSet2, immutableSortedSet3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo63115k(ByteString byteString) {
        if (!byteString.isEmpty()) {
            this.f54683c = true;
            this.f54684d = byteString;
        }
    }
}
