package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbn extends AssetPackState {

    /* renamed from: a */
    private final String f51293a;

    /* renamed from: b */
    private final int f51294b;

    /* renamed from: c */
    private final int f51295c;

    /* renamed from: d */
    private final long f51296d;

    /* renamed from: e */
    private final long f51297e;

    /* renamed from: f */
    private final int f51298f;

    /* renamed from: g */
    private final int f51299g;

    /* renamed from: h */
    private final String f51300h;

    /* renamed from: i */
    private final String f51301i;

    zzbn(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.f51293a = str;
        this.f51294b = i;
        this.f51295c = i2;
        this.f51296d = j;
        this.f51297e = j2;
        this.f51298f = i3;
        this.f51299g = i4;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f51300h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.f51301i = str3;
    }

    /* renamed from: a */
    public final long mo59576a() {
        return this.f51296d;
    }

    @AssetPackErrorCode
    /* renamed from: b */
    public final int mo59577b() {
        return this.f51295c;
    }

    /* renamed from: c */
    public final String mo59578c() {
        return this.f51293a;
    }

    @AssetPackStatus
    /* renamed from: d */
    public final int mo59579d() {
        return this.f51294b;
    }

    /* renamed from: e */
    public final long mo59580e() {
        return this.f51297e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f51293a.equals(assetPackState.mo59578c()) && this.f51294b == assetPackState.mo59579d() && this.f51295c == assetPackState.mo59577b() && this.f51296d == assetPackState.mo59576a() && this.f51297e == assetPackState.mo59580e() && this.f51298f == assetPackState.mo59581f() && this.f51299g == assetPackState.mo59582g() && this.f51300h.equals(assetPackState.mo59583j()) && this.f51301i.equals(assetPackState.mo59584k());
        }
    }

    /* renamed from: f */
    public final int mo59581f() {
        return this.f51298f;
    }

    /* renamed from: g */
    public final int mo59582g() {
        return this.f51299g;
    }

    public final int hashCode() {
        int hashCode = this.f51293a.hashCode();
        int i = this.f51294b;
        int i2 = this.f51295c;
        long j = this.f51296d;
        long j2 = this.f51297e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f51298f) * 1000003) ^ this.f51299g) * 1000003) ^ this.f51300h.hashCode()) * 1000003) ^ this.f51301i.hashCode();
    }

    /* renamed from: j */
    public final String mo59583j() {
        return this.f51300h;
    }

    /* renamed from: k */
    public final String mo59584k() {
        return this.f51301i;
    }

    public final String toString() {
        String str = this.f51293a;
        int i = this.f51294b;
        int i2 = this.f51295c;
        long j = this.f51296d;
        long j2 = this.f51297e;
        int i3 = this.f51298f;
        int i4 = this.f51299g;
        String str2 = this.f51300h;
        String str3 = this.f51301i;
        StringBuilder sb = new StringBuilder(str.length() + 261 + str2.length() + str3.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", availableVersionTag=");
        sb.append(str2);
        sb.append(", installedVersionTag=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
