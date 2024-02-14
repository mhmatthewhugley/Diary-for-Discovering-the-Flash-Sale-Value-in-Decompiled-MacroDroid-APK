package p305k8;

/* renamed from: k8.c */
/* compiled from: BundlePrinter */
public final class C13418c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m85854a(@androidx.annotation.Nullable android.os.Bundle r10) {
        /*
            boolean r0 = p305k8.C13419d.m85856b(r10)
            if (r0 == 0) goto L_0x0009
            java.lang.String r10 = "bad"
            return r10
        L_0x0009:
            java.lang.String r0 = "null"
            if (r10 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.util.Set r1 = r10.keySet()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x001b
            java.lang.String r10 = "empty"
            return r10
        L_0x001b:
            java.util.TreeSet r1 = new java.util.TreeSet
            k8.b r2 = new k8.b
            r2.<init>()
            r1.<init>(r2)
            java.util.Set r2 = r10.keySet()
            r1.addAll(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x004c
            java.lang.String r4 = ", "
            r2.append(r4)
        L_0x004c:
            if (r3 != 0) goto L_0x0050
            r4 = r0
            goto L_0x0051
        L_0x0050:
            r4 = r3
        L_0x0051:
            r5 = 0
            java.lang.Object r3 = r10.get(r3)
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x00a7
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L_0x0065
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = m85854a(r3)
            goto L_0x00a7
        L_0x0065:
            java.lang.Class r5 = r3.getClass()
            boolean r8 = r5.isArray()
            if (r8 == 0) goto L_0x00a3
            java.lang.Class r8 = r5.getComponentType()
            boolean r8 = r8.isPrimitive()
            if (r8 == 0) goto L_0x008d
            java.lang.Class<java.util.Arrays> r8 = java.util.Arrays.class
            java.lang.Class[] r9 = new java.lang.Class[r6]
            r9[r7] = r5
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r7] = r3
            java.lang.String r3 = "toString"
            java.lang.Object r3 = p315l8.C15601a.m94819b(r8, r3, r9, r5)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00a7
        L_0x008d:
            java.lang.Class<java.util.Arrays> r5 = java.util.Arrays.class
            java.lang.Class[] r8 = new java.lang.Class[r6]
            java.lang.Class<java.lang.Object[]> r9 = java.lang.Object[].class
            r8[r7] = r9
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r7] = r3
            java.lang.String r3 = "deepToString"
            java.lang.Object r3 = p315l8.C15601a.m94819b(r5, r3, r8, r9)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r5 = r3.toString()
        L_0x00a7:
            java.util.Locale r3 = java.util.Locale.US
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r4
            r8[r6] = r5
            java.lang.String r4 = "{%s = %s}"
            java.lang.String r3 = java.lang.String.format(r3, r4, r8)
            r2.append(r3)
            goto L_0x0035
        L_0x00bb:
            java.lang.String r10 = r2.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p305k8.C13418c.m85854a(android.os.Bundle):java.lang.String");
    }
}
