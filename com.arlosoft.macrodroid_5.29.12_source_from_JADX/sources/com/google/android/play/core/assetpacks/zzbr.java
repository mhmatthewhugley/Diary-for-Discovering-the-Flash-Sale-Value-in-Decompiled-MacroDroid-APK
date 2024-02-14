package com.google.android.play.core.assetpacks;

import javax.mail.UIDFolder;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbr {
    /* renamed from: a */
    static int m70624a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: b */
    static long m70625b(byte[] bArr, int i) {
        return ((long) ((m70624a(bArr, i + 2) << 16) | m70624a(bArr, i))) & UIDFolder.MAXUID;
    }
}
