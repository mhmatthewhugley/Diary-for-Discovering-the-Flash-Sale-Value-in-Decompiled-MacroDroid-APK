package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zza extends SplitInstallSessionState {

    /* renamed from: a */
    private final int f51865a;

    /* renamed from: b */
    private final int f51866b;

    /* renamed from: c */
    private final int f51867c;

    /* renamed from: d */
    private final long f51868d;

    /* renamed from: e */
    private final long f51869e;

    /* renamed from: f */
    private final List f51870f;

    /* renamed from: g */
    private final List f51871g;

    /* renamed from: h */
    private final PendingIntent f51872h;

    /* renamed from: i */
    private final List f51873i;

    zza(int i, int i2, int i3, long j, long j2, @Nullable List list, @Nullable List list2, @Nullable PendingIntent pendingIntent, @Nullable List list3) {
        this.f51865a = i;
        this.f51866b = i2;
        this.f51867c = i3;
        this.f51868d = j;
        this.f51869e = j2;
        this.f51870f = list;
        this.f51871g = list2;
        this.f51872h = pendingIntent;
        this.f51873i = list3;
    }

    /* renamed from: a */
    public final long mo59964a() {
        return this.f51868d;
    }

    @SplitInstallErrorCode
    /* renamed from: c */
    public final int mo59965c() {
        return this.f51867c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r1 = r7.f51870f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r1 = r7.f51871g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r1 = r7.f51872h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        r1 = r7.f51873i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.splitinstall.SplitInstallSessionState
            r2 = 0
            if (r1 == 0) goto L_0x008d
            com.google.android.play.core.splitinstall.SplitInstallSessionState r8 = (com.google.android.play.core.splitinstall.SplitInstallSessionState) r8
            int r1 = r7.f51865a
            int r3 = r8.mo59970h()
            if (r1 != r3) goto L_0x008d
            int r1 = r7.f51866b
            int r3 = r8.mo59971i()
            if (r1 != r3) goto L_0x008d
            int r1 = r7.f51867c
            int r3 = r8.mo59965c()
            if (r1 != r3) goto L_0x008d
            long r3 = r7.f51868d
            long r5 = r8.mo59964a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x008d
            long r3 = r7.f51869e
            long r5 = r8.mo59972j()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x008d
            java.util.List r1 = r7.f51870f
            if (r1 != 0) goto L_0x0042
            java.util.List r1 = r8.mo59974l()
            if (r1 != 0) goto L_0x008d
            goto L_0x004c
        L_0x0042:
            java.util.List r3 = r8.mo59974l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
        L_0x004c:
            java.util.List r1 = r7.f51871g
            if (r1 != 0) goto L_0x0057
            java.util.List r1 = r8.mo59973k()
            if (r1 != 0) goto L_0x008d
            goto L_0x0061
        L_0x0057:
            java.util.List r3 = r8.mo59973k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
        L_0x0061:
            android.app.PendingIntent r1 = r7.f51872h
            if (r1 != 0) goto L_0x006c
            android.app.PendingIntent r1 = r8.mo59969g()
            if (r1 != 0) goto L_0x008d
            goto L_0x0076
        L_0x006c:
            android.app.PendingIntent r3 = r8.mo59969g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
        L_0x0076:
            java.util.List r1 = r7.f51873i
            if (r1 != 0) goto L_0x0081
            java.util.List r8 = r8.mo59975m()
            if (r8 != 0) goto L_0x008d
            goto L_0x008c
        L_0x0081:
            java.util.List r8 = r8.mo59975m()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r0
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.zza.equals(java.lang.Object):boolean");
    }

    @Deprecated
    @Nullable
    /* renamed from: g */
    public final PendingIntent mo59969g() {
        return this.f51872h;
    }

    /* renamed from: h */
    public final int mo59970h() {
        return this.f51865a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.f51865a;
        int i5 = this.f51866b;
        int i6 = this.f51867c;
        long j = this.f51868d;
        long j2 = this.f51869e;
        int i7 = (((((((((i4 ^ 1000003) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List list = this.f51870f;
        int i8 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i9 = (i7 ^ i) * 1000003;
        List list2 = this.f51871g;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.hashCode();
        }
        int i10 = (i9 ^ i2) * 1000003;
        PendingIntent pendingIntent = this.f51872h;
        if (pendingIntent == null) {
            i3 = 0;
        } else {
            i3 = pendingIntent.hashCode();
        }
        int i11 = (i10 ^ i3) * 1000003;
        List list3 = this.f51873i;
        if (list3 != null) {
            i8 = list3.hashCode();
        }
        return i11 ^ i8;
    }

    @SplitInstallSessionStatus
    /* renamed from: i */
    public final int mo59971i() {
        return this.f51866b;
    }

    /* renamed from: j */
    public final long mo59972j() {
        return this.f51869e;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: k */
    public final List mo59973k() {
        return this.f51871g;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: l */
    public final List mo59974l() {
        return this.f51870f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public final List mo59975m() {
        return this.f51873i;
    }

    public final String toString() {
        int i = this.f51865a;
        int i2 = this.f51866b;
        int i3 = this.f51867c;
        long j = this.f51868d;
        long j2 = this.f51869e;
        String valueOf = String.valueOf(this.f51870f);
        String valueOf2 = String.valueOf(this.f51871g);
        String valueOf3 = String.valueOf(this.f51872h);
        String valueOf4 = String.valueOf(this.f51873i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
