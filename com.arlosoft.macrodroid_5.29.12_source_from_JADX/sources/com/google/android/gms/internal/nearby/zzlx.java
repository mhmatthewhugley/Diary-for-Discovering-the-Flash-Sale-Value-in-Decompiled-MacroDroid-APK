package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzlx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlx> CREATOR = new zzlu();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public byte[] f44885a = new byte[0];
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public ParcelFileDescriptor f44886c;

    private zzlx() {
    }

    @VisibleForTesting
    /* renamed from: o2 */
    static byte[] m62709o2(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr);
            m62710p2(dataInputStream);
            return bArr;
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from parcel file descriptor", e);
        } catch (Throwable th) {
            m62710p2(dataInputStream);
            throw th;
        }
    }

    /* renamed from: p2 */
    private static void m62710p2(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlx) {
            return Arrays.equals(this.f44885a, ((zzlx) obj).f44885a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44885a);
    }

    /* renamed from: n2 */
    public final byte[] mo52911n2() {
        return this.f44885a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r5 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        m62710p2(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094 A[Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076, FileNotFoundException -> 0x005c, IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076, all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095 A[Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076, FileNotFoundException -> 0x005c, IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076, all -> 0x00b8 }, ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:4:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ParcelByteArray"
            byte[] r1 = r7.f44885a
            r2 = 0
            if (r1 == 0) goto L_0x00c0
            android.os.ParcelFileDescriptor r3 = r7.f44886c
            if (r3 != 0) goto L_0x00c0
            java.io.File r3 = com.google.android.gms.internal.nearby.zzmd.m62748b()     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            if (r3 == 0) goto L_0x006e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076 }
            java.lang.String r5 = "teleporter"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076 }
            r4.append(r5)     // Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076 }
            java.lang.String r5 = ".tmp"
            java.io.File r3 = java.io.File.createTempFile(r4, r5, r3)     // Catch:{ IOException -> 0x0065, IllegalStateException -> 0x0095, all -> 0x0076 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x005c }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x005c }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.open(r3, r5)     // Catch:{ FileNotFoundException -> 0x005c }
            r3.delete()     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            android.util.Pair r3 = android.util.Pair.create(r4, r5)     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            java.lang.Object r5 = r3.first     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            r4.<init>(r5)     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            r5.<init>(r4)     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            int r4 = r1.length     // Catch:{ IllegalStateException -> 0x005a, IOException -> 0x0058 }
            r5.writeInt(r4)     // Catch:{ IllegalStateException -> 0x005a, IOException -> 0x0058 }
            r5.write(r1)     // Catch:{ IllegalStateException -> 0x005a, IOException -> 0x0058 }
            java.lang.Object r1 = r3.second     // Catch:{ IllegalStateException -> 0x005a, IOException -> 0x0058 }
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1     // Catch:{ IllegalStateException -> 0x005a, IOException -> 0x0058 }
            m62710p2(r5)
            goto L_0x00b5
        L_0x0058:
            r1 = move-exception
            goto L_0x007a
        L_0x005a:
            r1 = move-exception
            goto L_0x0097
        L_0x005c:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            java.lang.String r4 = "Temporary file is somehow already deleted"
            r3.<init>(r4, r1)     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            throw r3     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
        L_0x0065:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            java.lang.String r4 = "Could not create temporary file"
            r3.<init>(r4, r1)     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            throw r3     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
        L_0x006e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            java.lang.String r3 = "Must set temp dir before writing this object to a parcel"
            r1.<init>(r3)     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
            throw r1     // Catch:{ IllegalStateException -> 0x0095, IOException -> 0x0078, all -> 0x0076 }
        L_0x0076:
            r8 = move-exception
            goto L_0x00ba
        L_0x0078:
            r1 = move-exception
            r5 = r2
        L_0x007a:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r3.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = "Could not write into unlinked file. "
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            r3.append(r1)     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00b8 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b8 }
            if (r5 == 0) goto L_0x00b4
            goto L_0x00b1
        L_0x0095:
            r1 = move-exception
            r5 = r2
        L_0x0097:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r3.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = "Could not create unlinked file. "
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            r3.append(r1)     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00b8 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b8 }
            if (r5 == 0) goto L_0x00b4
        L_0x00b1:
            m62710p2(r5)
        L_0x00b4:
            r1 = r2
        L_0x00b5:
            r7.f44886c = r1
            goto L_0x00c0
        L_0x00b8:
            r8 = move-exception
            r2 = r5
        L_0x00ba:
            if (r2 == 0) goto L_0x00bf
            m62710p2(r2)
        L_0x00bf:
            throw r8
        L_0x00c0:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.m4563a(r8)
            android.os.ParcelFileDescriptor r1 = r7.f44886c
            r3 = 1
            r9 = r9 | r3
            r4 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.m4584v(r8, r3, r1, r9, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.m4564b(r8, r0)
            r7.f44886c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzlx.writeToParcel(android.os.Parcel, int):void");
    }

    @SafeParcelable.Constructor
    zzlx(@SafeParcelable.Param @Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.f44886c = parcelFileDescriptor;
    }

    /* synthetic */ zzlx(zzlw zzlw) {
    }
}
