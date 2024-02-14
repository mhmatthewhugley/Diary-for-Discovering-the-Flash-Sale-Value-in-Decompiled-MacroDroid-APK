package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.ArrayList;

public final class LocalViewChanges {

    /* renamed from: a */
    private final int f54230a;

    /* renamed from: b */
    private final boolean f54231b;

    /* renamed from: c */
    private final ImmutableSortedSet<DocumentKey> f54232c;

    /* renamed from: d */
    private final ImmutableSortedSet<DocumentKey> f54233d;

    /* renamed from: com.google.firebase.firestore.local.LocalViewChanges$1 */
    static /* synthetic */ class C112221 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54234a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.firestore.core.DocumentViewChange$Type[] r0 = com.google.firebase.firestore.core.DocumentViewChange.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54234a = r0
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54234a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.LocalViewChanges.C112221.<clinit>():void");
        }
    }

    public LocalViewChanges(int i, boolean z, ImmutableSortedSet<DocumentKey> immutableSortedSet, ImmutableSortedSet<DocumentKey> immutableSortedSet2) {
        this.f54230a = i;
        this.f54231b = z;
        this.f54232c = immutableSortedSet;
        this.f54233d = immutableSortedSet2;
    }

    /* renamed from: a */
    public static LocalViewChanges m75387a(int i, ViewSnapshot viewSnapshot) {
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(new ArrayList(), DocumentKey.m75845b());
        ImmutableSortedSet immutableSortedSet2 = new ImmutableSortedSet(new ArrayList(), DocumentKey.m75845b());
        for (DocumentViewChange next : viewSnapshot.mo23982d()) {
            int i2 = C112221.f54234a[next.mo23845c().ordinal()];
            if (i2 == 1) {
                immutableSortedSet = immutableSortedSet.mo23560f(next.mo23844b().getKey());
            } else if (i2 == 2) {
                immutableSortedSet2 = immutableSortedSet2.mo23560f(next.mo23844b().getKey());
            }
        }
        return new LocalViewChanges(i, viewSnapshot.mo23990j(), immutableSortedSet, immutableSortedSet2);
    }

    /* renamed from: b */
    public ImmutableSortedSet<DocumentKey> mo62632b() {
        return this.f54232c;
    }

    /* renamed from: c */
    public ImmutableSortedSet<DocumentKey> mo62633c() {
        return this.f54233d;
    }

    /* renamed from: d */
    public int mo62634d() {
        return this.f54230a;
    }

    /* renamed from: e */
    public boolean mo62635e() {
        return this.f54231b;
    }
}
