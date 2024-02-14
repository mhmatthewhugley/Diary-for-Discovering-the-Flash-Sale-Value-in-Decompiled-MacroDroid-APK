package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();

    /* renamed from: s */
    private static final String f47902s = SafeBrowsingData.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f47903a;
    @SafeParcelable.Field

    /* renamed from: c */
    private DataHolder f47904c;
    @SafeParcelable.Field

    /* renamed from: d */
    private ParcelFileDescriptor f47905d;
    @SafeParcelable.Field

    /* renamed from: f */
    private long f47906f;
    @SafeParcelable.Field

    /* renamed from: g */
    private byte[] f47907g;

    /* renamed from: o */
    private byte[] f47908o;

    /* renamed from: p */
    private File f47909p;

    public SafeBrowsingData() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param String str, @SafeParcelable.Param DataHolder dataHolder, @SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param long j, @SafeParcelable.Param byte[] bArr) {
        this.f47903a = str;
        this.f47904c = dataHolder;
        this.f47905d = parcelFileDescriptor;
        this.f47906f = j;
        this.f47907g = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.FileOutputStream m66560q2() {
        /*
            r5 = this;
            java.io.File r0 = r5.f47909p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch:{ IOException -> 0x002f, all -> 0x0025 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r5.f47905d = r3     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            if (r0 == 0) goto L_0x0020
            r0.delete()
        L_0x0020:
            return r2
        L_0x0021:
            r1 = move-exception
            goto L_0x0029
        L_0x0023:
            goto L_0x0030
        L_0x0025:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.delete()
        L_0x002e:
            throw r1
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.delete()
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.m66560q2():java.io.FileOutputStream");
    }

    /* renamed from: r2 */
    private static void m66561r2(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: l2 */
    public DataHolder mo56066l2() {
        return this.f47904c;
    }

    /* renamed from: m2 */
    public ParcelFileDescriptor mo56067m2() {
        return this.f47905d;
    }

    /* renamed from: n2 */
    public long mo56068n2() {
        return this.f47906f;
    }

    /* renamed from: o2 */
    public String mo56069o2() {
        return this.f47903a;
    }

    /* renamed from: p2 */
    public byte[] mo56070p2() {
        return this.f47907g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f47905d
            r1 = 1
            if (r0 != 0) goto L_0x0031
            byte[] r0 = r3.f47908o
            if (r0 == 0) goto L_0x0031
            java.io.FileOutputStream r0 = r3.m66560q2()
            if (r0 == 0) goto L_0x0031
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.f47908o     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            int r2 = r2.length     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.writeInt(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            byte[] r2 = r3.f47908o     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.write(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            m66561r2(r0)
            r0 = 1
            goto L_0x0032
        L_0x0029:
            r4 = move-exception
            m66561r2(r0)
            throw r4
        L_0x002e:
            m66561r2(r0)
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r5 | r1
        L_0x0036:
            com.google.android.gms.safetynet.zzj.m66572a(r3, r4, r5)
            r4 = 0
            r3.f47905d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }
}
