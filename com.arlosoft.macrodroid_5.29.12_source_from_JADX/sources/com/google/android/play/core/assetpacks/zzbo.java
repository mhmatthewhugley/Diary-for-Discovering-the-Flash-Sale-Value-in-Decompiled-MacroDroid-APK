package com.google.android.play.core.assetpacks;

import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbo extends AssetPackStates {

    /* renamed from: a */
    private final long f51302a;

    /* renamed from: b */
    private final Map f51303b;

    zzbo(long j, Map map) {
        this.f51302a = j;
        this.f51303b = map;
    }

    /* renamed from: a */
    public final Map<String, AssetPackState> mo59585a() {
        return this.f51303b;
    }

    /* renamed from: b */
    public final long mo59586b() {
        return this.f51302a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackStates) {
            AssetPackStates assetPackStates = (AssetPackStates) obj;
            return this.f51302a == assetPackStates.mo59586b() && this.f51303b.equals(assetPackStates.mo59585a());
        }
    }

    public final int hashCode() {
        long j = this.f51302a;
        return this.f51303b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f51302a;
        String obj = this.f51303b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
