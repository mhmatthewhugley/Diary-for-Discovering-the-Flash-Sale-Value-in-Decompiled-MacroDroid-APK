package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaav {
    /* renamed from: a */
    public static int m40953a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    @Nullable
    /* renamed from: b */
    public static zzbq m40954b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] I = zzen.m49134I(str, "=");
            if (I.length != 2) {
                zzdw.m48255e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (I[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaci.m41046a(new zzef(Base64.decode(I[1], 0))));
                } catch (RuntimeException e) {
                    zzdw.m48256f("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzady(I[0], I[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq((List) arrayList);
    }

    /* renamed from: c */
    public static zzaas m40955c(zzef zzef, boolean z, boolean z2) throws zzbu {
        if (z) {
            m40956d(3, zzef, false);
        }
        String F = zzef.mo45222F((int) zzef.mo45249y(), zzfsk.f36339c);
        long y = zzef.mo45249y();
        String[] strArr = new String[((int) y)];
        int length = F.length() + 15;
        for (int i = 0; ((long) i) < y; i++) {
            String F2 = zzef.mo45222F((int) zzef.mo45249y(), zzfsk.f36339c);
            strArr[i] = F2;
            length = length + 4 + F2.length();
        }
        if (!z2 || (zzef.mo45243s() & 1) != 0) {
            return new zzaas(F, strArr, length + 1);
        }
        throw zzbu.m44135a("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: d */
    public static boolean m40956d(int i, zzef zzef, boolean z) throws zzbu {
        if (zzef.mo45233i() < 7) {
            if (z) {
                return false;
            }
            int i2 = zzef.mo45233i();
            throw zzbu.m44135a("too short header: " + i2, (Throwable) null);
        } else if (zzef.mo45243s() != i) {
            if (z) {
                return false;
            }
            throw zzbu.m44135a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), (Throwable) null);
        } else if (zzef.mo45243s() == 118 && zzef.mo45243s() == 111 && zzef.mo45243s() == 114 && zzef.mo45243s() == 98 && zzef.mo45243s() == 105 && zzef.mo45243s() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzbu.m44135a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
