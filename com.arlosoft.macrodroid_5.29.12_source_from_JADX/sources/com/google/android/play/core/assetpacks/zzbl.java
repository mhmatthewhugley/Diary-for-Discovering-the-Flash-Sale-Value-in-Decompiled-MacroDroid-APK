package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbl extends AssetLocation {

    /* renamed from: a */
    private final String f51287a;

    /* renamed from: b */
    private final long f51288b;

    /* renamed from: c */
    private final long f51289c;

    /* renamed from: a */
    public final long mo59567a() {
        return this.f51288b;
    }

    /* renamed from: b */
    public final String mo59568b() {
        return this.f51287a;
    }

    /* renamed from: c */
    public final long mo59569c() {
        return this.f51289c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetLocation) {
            AssetLocation assetLocation = (AssetLocation) obj;
            return this.f51287a.equals(assetLocation.mo59568b()) && this.f51288b == assetLocation.mo59567a() && this.f51289c == assetLocation.mo59569c();
        }
    }

    public final int hashCode() {
        int hashCode = this.f51287a.hashCode();
        long j = this.f51288b;
        long j2 = this.f51289c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.f51287a;
        long j = this.f51288b;
        long j2 = this.f51289c;
        StringBuilder sb = new StringBuilder(str.length() + 76);
        sb.append("AssetLocation{path=");
        sb.append(str);
        sb.append(", offset=");
        sb.append(j);
        sb.append(", size=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
