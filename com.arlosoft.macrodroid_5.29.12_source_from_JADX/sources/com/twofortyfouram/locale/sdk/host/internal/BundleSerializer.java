package com.twofortyfouram.locale.sdk.host.internal;

public final class BundleSerializer {
    private static final int CONTROL_CODE_CONTINUE = 1;
    private static final int CONTROL_CODE_END = 0;
    private static final int TYPE_BUNDLE = 1;
    private static final int TYPE_SERIALIZABLE = 0;
    private static final int VERSION_1 = 1;

    private BundleSerializer() {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[SYNTHETIC, Splitter:B:34:0x0097] */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle deserializeFromByteArray(@androidx.annotation.NonNull byte[] r6) throws java.lang.ClassNotFoundException {
        /*
            java.lang.String r0 = "IOException when closing ObjectInputStream"
            java.lang.String r1 = "bytesToDeserialize"
            p276h8.C12406a.m83260d(r6, r1)
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x008c }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x008c }
            r3.<init>(r6)     // Catch:{ IOException -> 0x008c }
            r2.<init>(r3)     // Catch:{ IOException -> 0x008c }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r6.<init>()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            int r1 = r2.readInt()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r3 = 0
            r4 = 1
            if (r1 != r4) goto L_0x0070
        L_0x001f:
            int r1 = r2.readInt()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            if (r4 != r1) goto L_0x0065
            int r1 = r2.readInt()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            if (r1 == 0) goto L_0x0055
            if (r1 != r4) goto L_0x0041
            java.lang.Object r1 = r2.readObject()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.Object r5 = r2.readObject()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            byte[] r5 = (byte[]) r5     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            android.os.Bundle r5 = deserializeFromByteArray(r5)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r6.putBundle(r1, r5)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            goto L_0x001f
        L_0x0041:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.String r5 = "Type %d unrecognized"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r4[r3] = r1     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.String r1 = p285i8.C12447a.m83390g(r5, r4)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            throw r6     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
        L_0x0055:
            java.lang.Object r1 = r2.readObject()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.Object r5 = r2.readObject()     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.io.Serializable r5 = (java.io.Serializable) r5     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r6.putSerializable(r1, r5)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            goto L_0x001f
        L_0x0065:
            r2.close()     // Catch:{ IOException -> 0x0069 }
            return r6
        L_0x0069:
            r6 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r6)
            throw r1
        L_0x0070:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.String r5 = "Version %d unrecognized"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r4[r3] = r1     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            java.lang.String r1 = p285i8.C12447a.m83390g(r5, r4)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
            throw r6     // Catch:{ IOException -> 0x0087, all -> 0x0084 }
        L_0x0084:
            r6 = move-exception
            r1 = r2
            goto L_0x0095
        L_0x0087:
            r6 = move-exception
            r1 = r2
            goto L_0x008d
        L_0x008a:
            r6 = move-exception
            goto L_0x0095
        L_0x008c:
            r6 = move-exception
        L_0x008d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "IOException when deserializing"
            r2.<init>(r3, r6)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ all -> 0x008a }
        L_0x0095:
            if (r1 == 0) goto L_0x00a2
            r1.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00a2
        L_0x009b:
            r6 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r6)
            throw r1
        L_0x00a2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twofortyfouram.locale.sdk.host.internal.BundleSerializer.deserializeFromByteArray(byte[]):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb A[SYNTHETIC, Splitter:B:47:0x00bb] */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] serializeToByteArray(@androidx.annotation.NonNull android.os.Bundle r11) throws java.io.NotSerializableException, java.lang.Exception {
        /*
            java.lang.String r0 = "IOException when closing ObjectOutputStream"
            java.lang.String r1 = "bundleToSerialize"
            p276h8.C12406a.m83260d(r11, r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ NotSerializableException -> 0x00b7, IOException -> 0x00ae }
            r3.<init>(r1)     // Catch:{ NotSerializableException -> 0x00b7, IOException -> 0x00ae }
            r2 = 1
            r3.writeInt(r2)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.util.TreeSet r4 = new java.util.TreeSet     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            k8.b r5 = new k8.b     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r5.<init>()     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r4.<init>(r5)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.util.Set r5 = r11.keySet()     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r4.addAll(r5)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            int r5 = r4.size()     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r6 = 0
            if (r5 != 0) goto L_0x0032
            r3.writeInt(r6)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            goto L_0x0035
        L_0x0032:
            r3.writeInt(r2)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
        L_0x0035:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r7 = 0
        L_0x003a:
            boolean r8 = r4.hasNext()     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            if (r8 == 0) goto L_0x0094
            java.lang.Object r8 = r4.next()     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.lang.Object r9 = r11.get(r8)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            boolean r10 = r9 instanceof android.os.Bundle     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            if (r10 == 0) goto L_0x005e
            r3.writeInt(r2)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r3.writeObject(r8)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            byte[] r8 = serializeToByteArray(r9)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r3.writeObject(r8)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            goto L_0x0089
        L_0x005e:
            boolean r10 = r9 instanceof java.io.Serializable     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            if (r10 != 0) goto L_0x007c
            if (r9 != 0) goto L_0x0065
            goto L_0x007c
        L_0x0065:
            java.io.NotSerializableException r1 = new java.io.NotSerializableException     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = "Key \"%s\"'s value %s isn't Serializable.  Only primitives or objects implementing Serializable can be stored.  Parcelable is not stable for long-term storage."
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r5[r6] = r8     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.lang.Object r11 = r11.get(r8)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r5[r2] = r11     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.lang.String r11 = p285i8.C12447a.m83390g(r4, r5)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r1.<init>(r11)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            throw r1     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
        L_0x007c:
            r3.writeInt(r6)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r3.writeObject(r8)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            java.lang.Object r8 = r11.get(r8)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            r3.writeObject(r8)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
        L_0x0089:
            int r7 = r7 + r2
            if (r7 != r5) goto L_0x0090
            r3.writeInt(r6)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            goto L_0x003a
        L_0x0090:
            r3.writeInt(r2)     // Catch:{ NotSerializableException -> 0x00a9, IOException -> 0x00a6, all -> 0x00a3 }
            goto L_0x003a
        L_0x0094:
            r3.close()     // Catch:{ IOException -> 0x009c }
            byte[] r11 = r1.toByteArray()
            return r11
        L_0x009c:
            r11 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r11)
            throw r1
        L_0x00a3:
            r11 = move-exception
            r2 = r3
            goto L_0x00b9
        L_0x00a6:
            r11 = move-exception
            r2 = r3
            goto L_0x00af
        L_0x00a9:
            r11 = move-exception
            r2 = r3
            goto L_0x00b8
        L_0x00ac:
            r11 = move-exception
            goto L_0x00b9
        L_0x00ae:
            r11 = move-exception
        L_0x00af:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = "IOException when serializing to byte[]"
            r1.<init>(r3, r11)     // Catch:{ all -> 0x00ac }
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00b7:
            r11 = move-exception
        L_0x00b8:
            throw r11     // Catch:{ all -> 0x00ac }
        L_0x00b9:
            if (r2 == 0) goto L_0x00c6
            r2.close()     // Catch:{ IOException -> 0x00bf }
            goto L_0x00c6
        L_0x00bf:
            r11 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r11)
            throw r1
        L_0x00c6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twofortyfouram.locale.sdk.host.internal.BundleSerializer.serializeToByteArray(android.os.Bundle):byte[]");
    }
}
