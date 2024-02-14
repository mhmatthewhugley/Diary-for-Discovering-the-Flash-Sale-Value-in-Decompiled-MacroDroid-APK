package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzqm {
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084 A[Catch:{ IOException | XmlPullParserException -> 0x008d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map m62212a(android.content.Context r8, int r9) {
        /*
            java.lang.String r0 = "DefaultsXmlParser"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            if (r8 != 0) goto L_0x0013
            java.lang.String r8 = "Could not find the resources of the current context while trying to set defaults from an XML."
            android.util.Log.e(r0, r8)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            return r1
        L_0x0013:
            android.content.res.XmlResourceParser r8 = r8.getXml(r9)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            int r9 = r8.getEventType()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L_0x001f:
            r6 = 1
            if (r9 == r6) goto L_0x0095
            r7 = 2
            if (r9 != r7) goto L_0x002b
            java.lang.String r5 = r8.getName()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            goto L_0x0088
        L_0x002b:
            r7 = 3
            if (r9 != r7) goto L_0x004c
            java.lang.String r9 = r8.getName()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            java.lang.String r5 = "entry"
            boolean r9 = r9.equals(r5)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            if (r9 == 0) goto L_0x004a
            if (r3 == 0) goto L_0x0044
            if (r4 == 0) goto L_0x0044
            r1.put(r3, r4)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
        L_0x0041:
            r3 = r2
            r4 = r3
            goto L_0x004a
        L_0x0044:
            java.lang.String r9 = "An entry in the defaults XML has an invalid key and/or value tag."
            android.util.Log.w(r0, r9)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            goto L_0x0041
        L_0x004a:
            r5 = r2
            goto L_0x0088
        L_0x004c:
            r7 = 4
            if (r9 != r7) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            int r9 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            r7 = 106079(0x19e5f, float:1.48648E-40)
            if (r9 == r7) goto L_0x006a
            r7 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r9 == r7) goto L_0x0060
            goto L_0x0074
        L_0x0060:
            java.lang.String r9 = "value"
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x0074
            r9 = 1
            goto L_0x0075
        L_0x006a:
            java.lang.String r9 = "key"
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x0074
            r9 = 0
            goto L_0x0075
        L_0x0074:
            r9 = -1
        L_0x0075:
            if (r9 == 0) goto L_0x0084
            if (r9 == r6) goto L_0x007f
            java.lang.String r9 = "Encountered an unexpected tag while parsing the defaults XML."
            android.util.Log.w(r0, r9)     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            goto L_0x0088
        L_0x007f:
            java.lang.String r4 = r8.getText()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            goto L_0x0088
        L_0x0084:
            java.lang.String r3 = r8.getText()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
        L_0x0088:
            int r9 = r8.next()     // Catch:{ XmlPullParserException -> 0x008f, IOException -> 0x008d }
            goto L_0x001f
        L_0x008d:
            r8 = move-exception
            goto L_0x0090
        L_0x008f:
            r8 = move-exception
        L_0x0090:
            java.lang.String r9 = "Encountered an error while parsing the defaults XML file."
            android.util.Log.e(r0, r9, r8)
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzqm.m62212a(android.content.Context, int):java.util.Map");
    }
}
