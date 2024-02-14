package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.nearby.connection.Payload;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzmd {
    @Nullable

    /* renamed from: a */
    private static File f44902a;

    @Nullable
    /* renamed from: a */
    static Payload m62747a(Context context, zzmb zzmb) {
        byte[] bArr;
        long zzb = zzmb.zzb();
        int zza = zzmb.zza();
        if (zza == 1) {
            zzlx o2 = zzmb.mo52935o2();
            if (o2 != null) {
                bArr = o2.mo52911n2();
            } else {
                bArr = zzmb.mo52928D2();
            }
            return Payload.m66304h((byte[]) zzsg.m62985c(bArr, "Payload bytes cannot be null if type is BYTES."), zzb);
        } else if (zza == 2) {
            String p2 = zzmb.mo52936p2();
            Uri l2 = zzmb.mo52932l2();
            if (p2 == null || l2 == null) {
                ParcelFileDescriptor m2 = zzmb.mo52933m2();
                zzsg.m62985c(m2, "Data ParcelFileDescriptor cannot be null for type FILE");
                return Payload.m66305i(Payload.File.m66317e(m2), zzb);
            }
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l2, "r");
                if (openFileDescriptor != null) {
                    return Payload.m66305i(Payload.File.m66316d(new File(p2), openFileDescriptor, zzmb.mo52929a(), l2), zzb);
                }
                Log.w("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", new Object[]{l2}));
                return null;
            } catch (SecurityException e) {
                Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[]{l2, p2}), e);
                return null;
            } catch (FileNotFoundException e2) {
                Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[]{l2, p2}), e2);
                return null;
            }
        } else if (zza != 3) {
            Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", new Object[]{Long.valueOf(zzmb.zzb()), Integer.valueOf(zzmb.zza())}));
            return null;
        } else {
            ParcelFileDescriptor m22 = zzmb.mo52933m2();
            zzsg.m62985c(m22, "Data ParcelFileDescriptor cannot be null for type STREAM");
            return Payload.m66306j(Payload.Stream.m66321b(m22), zzb);
        }
    }

    @Nullable
    /* renamed from: b */
    static File m62748b() {
        return f44902a;
    }

    /* renamed from: c */
    public static void m62749c(File file) {
        if (file == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            f44902a = file;
        }
    }
}
