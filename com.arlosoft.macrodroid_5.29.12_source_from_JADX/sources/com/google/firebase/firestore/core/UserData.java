package com.google.firebase.firestore.core;

public class UserData {

    /* renamed from: com.google.firebase.firestore.core.UserData$1 */
    static /* synthetic */ class C19601 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6021a;

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
                com.google.firebase.firestore.core.UserData$Source[] r0 = com.google.firebase.firestore.core.UserData.Source.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6021a = r0
                com.google.firebase.firestore.core.UserData$Source r1 = com.google.firebase.firestore.core.UserData.Source.Set     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6021a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.UserData$Source r1 = com.google.firebase.firestore.core.UserData.Source.MergeSet     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6021a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.UserData$Source r1 = com.google.firebase.firestore.core.UserData.Source.Update     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6021a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.UserData$Source r1 = com.google.firebase.firestore.core.UserData.Source.Argument     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6021a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.core.UserData$Source r1 = com.google.firebase.firestore.core.UserData.Source.ArrayArgument     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.UserData.C19601.<clinit>():void");
        }
    }

    public static class ParseAccumulator {
    }

    public static class ParseContext {
    }

    public static class ParsedSetData {
    }

    public static class ParsedUpdateData {
    }

    public enum Source {
        Set,
        MergeSet,
        Update,
        Argument,
        ArrayArgument
    }

    private UserData() {
    }
}
