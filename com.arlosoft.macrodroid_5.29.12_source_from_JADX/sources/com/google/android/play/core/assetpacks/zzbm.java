package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import com.google.android.play.core.assetpacks.model.AssetPackStorageMethod;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbm extends AssetPackLocation {

    /* renamed from: b */
    private final int f51290b;

    /* renamed from: c */
    private final String f51291c;

    /* renamed from: d */
    private final String f51292d;

    zzbm(int i, @Nullable String str, @Nullable String str2) {
        this.f51290b = i;
        this.f51291c = str;
        this.f51292d = str2;
    }

    @Nullable
    /* renamed from: a */
    public final String mo59573a() {
        return this.f51292d;
    }

    @AssetPackStorageMethod
    /* renamed from: b */
    public final int mo59574b() {
        return this.f51290b;
    }

    @Nullable
    /* renamed from: c */
    public final String mo59575c() {
        return this.f51291c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f51292d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f51291c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.play.core.assetpacks.AssetPackLocation
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.play.core.assetpacks.AssetPackLocation r5 = (com.google.android.play.core.assetpacks.AssetPackLocation) r5
            int r1 = r4.f51290b
            int r3 = r5.mo59574b()
            if (r1 != r3) goto L_0x003f
            java.lang.String r1 = r4.f51291c
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo59575c()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo59575c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            java.lang.String r1 = r4.f51292d
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.mo59573a()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.lang.String r5 = r5.mo59573a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzbm.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f51290b ^ 1000003) * 1000003;
        String str = this.f51291c;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        String str2 = this.f51292d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.f51290b;
        String str = this.f51291c;
        String str2 = this.f51292d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
