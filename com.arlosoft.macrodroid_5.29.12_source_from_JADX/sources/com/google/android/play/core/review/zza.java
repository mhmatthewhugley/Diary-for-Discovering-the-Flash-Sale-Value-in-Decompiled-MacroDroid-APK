package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zza extends ReviewInfo {

    /* renamed from: a */
    private final PendingIntent f51744a;

    /* renamed from: c */
    private final boolean f51745c;

    zza(PendingIntent pendingIntent, boolean z) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f51744a = pendingIntent;
        this.f51745c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo59923a() {
        return this.f51744a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo59924b() {
        return this.f51745c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            return this.f51744a.equals(reviewInfo.mo59923a()) && this.f51745c == reviewInfo.mo59924b();
        }
    }

    public final int hashCode() {
        return ((this.f51744a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f51745c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f51744a.toString();
        boolean z = this.f51745c;
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(obj);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
