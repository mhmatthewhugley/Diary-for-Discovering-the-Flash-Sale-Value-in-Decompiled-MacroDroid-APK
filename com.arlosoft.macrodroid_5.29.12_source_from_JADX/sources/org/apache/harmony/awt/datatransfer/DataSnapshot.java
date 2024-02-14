package org.apache.harmony.awt.datatransfer;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataSnapshot implements DataProvider {
    private final String[] fileList;
    private final String html;
    private final String[] nativeFormats;
    private final RawBitmap rawBitmap;
    private final Map<Class<?>, byte[]> serializedObjects = Collections.synchronizedMap(new HashMap());
    private final String text;
    private final String url;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        r1 = r2.getRepresentationClass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DataSnapshot(org.apache.harmony.awt.datatransfer.DataProvider r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String[] r0 = r5.getNativeFormats()
            r4.nativeFormats = r0
            java.lang.String r0 = r5.getText()
            r4.text = r0
            java.lang.String[] r0 = r5.getFileList()
            r4.fileList = r0
            java.lang.String r0 = r5.getURL()
            r4.url = r0
            java.lang.String r0 = r5.getHTML()
            r4.html = r0
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r5.getRawBitmap()
            r4.rawBitmap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r4.serializedObjects = r0
            r0 = 0
        L_0x0033:
            java.lang.String[] r1 = r4.nativeFormats
            int r2 = r1.length
            if (r0 < r2) goto L_0x0039
            return
        L_0x0039:
            r2 = 0
            r1 = r1[r0]     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.awt.datatransfer.DataFlavor r2 = java.awt.datatransfer.SystemFlavorMap.decodeDataFlavor(r1)     // Catch:{ ClassNotFoundException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r2 == 0) goto L_0x0053
            java.lang.Class r1 = r2.getRepresentationClass()
            byte[] r2 = r5.getSerializedObject(r1)
            if (r2 == 0) goto L_0x0053
            java.util.Map<java.lang.Class<?>, byte[]> r3 = r4.serializedObjects
            r3.put(r1, r2)
        L_0x0053:
            int r0 = r0 + 1
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.harmony.awt.datatransfer.DataSnapshot.<init>(org.apache.harmony.awt.datatransfer.DataProvider):void");
    }

    public String[] getFileList() {
        return this.fileList;
    }

    public String getHTML() {
        return this.html;
    }

    public String[] getNativeFormats() {
        return this.nativeFormats;
    }

    public RawBitmap getRawBitmap() {
        return this.rawBitmap;
    }

    public short[] getRawBitmapBuffer16() {
        RawBitmap rawBitmap2 = this.rawBitmap;
        if (rawBitmap2 != null) {
            Object obj = rawBitmap2.buffer;
            if (obj instanceof short[]) {
                return (short[]) obj;
            }
        }
        return null;
    }

    public int[] getRawBitmapBuffer32() {
        RawBitmap rawBitmap2 = this.rawBitmap;
        if (rawBitmap2 != null) {
            Object obj = rawBitmap2.buffer;
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        }
        return null;
    }

    public byte[] getRawBitmapBuffer8() {
        RawBitmap rawBitmap2 = this.rawBitmap;
        if (rawBitmap2 != null) {
            Object obj = rawBitmap2.buffer;
            if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
        }
        return null;
    }

    public int[] getRawBitmapHeader() {
        RawBitmap rawBitmap2 = this.rawBitmap;
        if (rawBitmap2 != null) {
            return rawBitmap2.getHeader();
        }
        return null;
    }

    public byte[] getSerializedObject(Class<?> cls) {
        return this.serializedObjects.get(cls);
    }

    public String getText() {
        return this.text;
    }

    public String getURL() {
        return this.url;
    }

    public boolean isNativeFormatAvailable(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("text/plain")) {
            return this.text != null;
        }
        if (str.equals("application/x-java-file-list")) {
            return this.fileList != null;
        }
        if (str.equals("application/x-java-url")) {
            return this.url != null;
        }
        if (str.equals("text/html")) {
            return this.html != null;
        }
        if (str.equals("image/x-java-image")) {
            return this.rawBitmap != null;
        }
        try {
            return this.serializedObjects.containsKey(SystemFlavorMap.decodeDataFlavor(str).getRepresentationClass());
        } catch (Exception unused) {
            return false;
        }
    }

    public byte[] getSerializedObject(String str) {
        try {
            return getSerializedObject((Class<?>) SystemFlavorMap.decodeDataFlavor(str).getRepresentationClass());
        } catch (Exception unused) {
            return null;
        }
    }
}
