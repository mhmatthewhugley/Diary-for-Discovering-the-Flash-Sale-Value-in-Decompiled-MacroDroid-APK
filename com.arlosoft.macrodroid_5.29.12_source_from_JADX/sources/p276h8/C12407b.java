package p276h8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* renamed from: h8.b */
/* compiled from: BundleAssertions */
public final class C12407b {
    /* renamed from: a */
    public static void m83262a(@NonNull Bundle bundle, @Nullable String str) throws AssertionError {
        C12406a.m83260d(bundle, "bundle");
        if (!bundle.containsKey(str)) {
            throw new AssertionError(m83266e("Required extra %s is missing", str));
        }
    }

    /* renamed from: b */
    public static void m83263b(@NonNull Bundle bundle, @Nullable String str) throws AssertionError {
        C12406a.m83260d(bundle, "bundle");
        m83262a(bundle, str);
        if (bundle.get(str) != null && "foo".equals(bundle.getString(str, "foo")) && "bar".equals(bundle.getString(str, "bar"))) {
            throw new AssertionError(m83266e("Extra %s is the wrong type", str));
        }
    }

    /* renamed from: c */
    public static void m83264c(@NonNull Bundle bundle, @Nullable String str, boolean z, boolean z2) throws AssertionError {
        C12406a.m83260d(bundle, "bundle");
        m83263b(bundle, str);
        String string = bundle.getString(str);
        if (!z && string == null) {
            throw new AssertionError(m83266e("%s cannot map to null", str));
        } else if (!z2 && string != null && string.length() == 0) {
            throw new AssertionError(m83266e("%s cannot map to empty string", str));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x009a */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2 A[SYNTHETIC, Splitter:B:40:0x00a2] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m83265d(@androidx.annotation.NonNull android.os.Bundle r8) {
        /*
            java.lang.String r0 = "Internal failure"
            java.lang.String r1 = "bundle"
            p276h8.C12406a.m83260d(r8, r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x009a }
            r3.<init>(r1)     // Catch:{ IOException -> 0x009a }
            java.util.Set r1 = r8.keySet()     // Catch:{ all -> 0x0095 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0095 }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0095 }
            java.lang.Object r4 = r8.get(r2)     // Catch:{ all -> 0x0095 }
            boolean r5 = r4 instanceof android.os.Bundle     // Catch:{ all -> 0x0095 }
            if (r5 == 0) goto L_0x0034
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch:{ all -> 0x0095 }
            m83265d(r4)     // Catch:{ all -> 0x0095 }
            goto L_0x001a
        L_0x0034:
            boolean r5 = r4 instanceof java.io.Serializable     // Catch:{ all -> 0x0095 }
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0071
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x0061 }
            r5.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.Object r4 = r8.get(r2)     // Catch:{ IOException -> 0x0051 }
            r3.writeObject(r4)     // Catch:{ IOException -> 0x0051 }
            goto L_0x001a
        L_0x0051:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "Object associated with key %s couldn't be serialized"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0095 }
            r4[r7] = r2     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = m83266e(r1, r4)     // Catch:{ all -> 0x0095 }
            r8.<init>(r1)     // Catch:{ all -> 0x0095 }
            throw r8     // Catch:{ all -> 0x0095 }
        L_0x0061:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "Object associated with key %s is not available to the Android ClassLoader"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0095 }
            r4[r7] = r2     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = m83266e(r1, r4)     // Catch:{ all -> 0x0095 }
            r8.<init>(r1)     // Catch:{ all -> 0x0095 }
            throw r8     // Catch:{ all -> 0x0095 }
        L_0x0071:
            if (r4 != 0) goto L_0x0074
            goto L_0x001a
        L_0x0074:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = "Key \"%s\"'s value %s isn't Serializable.  Only primitives or objects implementing Serializable can be stored.  Parcelable is not stable for long-term storage."
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0095 }
            r5[r7] = r2     // Catch:{ all -> 0x0095 }
            java.lang.Object r8 = r8.get(r2)     // Catch:{ all -> 0x0095 }
            r5[r6] = r8     // Catch:{ all -> 0x0095 }
            java.lang.String r8 = m83266e(r4, r5)     // Catch:{ all -> 0x0095 }
            r1.<init>(r8)     // Catch:{ all -> 0x0095 }
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x008b:
            r3.close()     // Catch:{ IOException -> 0x008f }
            return
        L_0x008f:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r0)
            throw r8
        L_0x0095:
            r8 = move-exception
            r2 = r3
            goto L_0x00a0
        L_0x0098:
            r8 = move-exception
            goto L_0x00a0
        L_0x009a:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0098 }
            r8.<init>()     // Catch:{ all -> 0x0098 }
            throw r8     // Catch:{ all -> 0x0098 }
        L_0x00a0:
            if (r2 == 0) goto L_0x00ac
            r2.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00ac
        L_0x00a6:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r0)
            throw r8
        L_0x00ac:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p276h8.C12407b.m83265d(android.os.Bundle):void");
    }

    @NonNull
    /* renamed from: e */
    private static String m83266e(@NonNull String str, @NonNull Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
