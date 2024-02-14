package com.google.firebase.firestore;

import androidx.annotation.Nullable;

public class DocumentChange {

    /* renamed from: a */
    private final Type f5623a;

    /* renamed from: b */
    private final QueryDocumentSnapshot f5624b;

    /* renamed from: c */
    private final int f5625c;

    /* renamed from: d */
    private final int f5626d;

    /* renamed from: com.google.firebase.firestore.DocumentChange$1 */
    static /* synthetic */ class C19461 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5627a;

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
                f5627a = r0
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5627a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.METADATA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5627a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.MODIFIED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5627a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.DocumentChange.C19461.<clinit>():void");
        }
    }

    public enum Type {
        ADDED,
        MODIFIED,
        REMOVED
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DocumentChange)) {
            return false;
        }
        DocumentChange documentChange = (DocumentChange) obj;
        if (!this.f5623a.equals(documentChange.f5623a) || !this.f5624b.equals(documentChange.f5624b) || this.f5625c != documentChange.f5625c || this.f5626d != documentChange.f5626d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f5623a.hashCode() * 31) + this.f5624b.hashCode()) * 31) + this.f5625c) * 31) + this.f5626d;
    }
}
