package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzack implements zzbp {
    public static final Parcelable.Creator<zzack> CREATOR = new zzacj();

    /* renamed from: a */
    public final String f23923a;

    /* renamed from: c */
    public final String f23924c;

    protected zzack(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23923a = readString;
        this.f23924c = parcel.readString();
    }

    public zzack(String str, String str2) {
        this.f23923a = str;
        this.f23924c = str2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41259Q1(com.google.android.gms.internal.ads.zzbk r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f23923a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L_0x0036;
                case 79833656: goto L_0x002c;
                case 428414940: goto L_0x0022;
                case 1746739798: goto L_0x0018;
                case 1939198791: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0064
            if (r0 == r5) goto L_0x005e
            if (r0 == r4) goto L_0x0058
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004c
            return
        L_0x004c:
            java.lang.String r0 = r6.f23924c
            r7.mo42718y(r0)
            return
        L_0x0052:
            java.lang.String r0 = r6.f23924c
            r7.mo42712s(r0)
            return
        L_0x0058:
            java.lang.String r0 = r6.f23924c
            r7.mo42713t(r0)
            return
        L_0x005e:
            java.lang.String r0 = r6.f23924c
            r7.mo42714u(r0)
            return
        L_0x0064:
            java.lang.String r0 = r6.f23924c
            r7.mo42705H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzack.mo41259Q1(com.google.android.gms.internal.ads.zzbk):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzack zzack = (zzack) obj;
            return this.f23923a.equals(zzack.f23923a) && this.f23924c.equals(zzack.f23924c);
        }
    }

    public final int hashCode() {
        return ((this.f23923a.hashCode() + 527) * 31) + this.f23924c.hashCode();
    }

    public final String toString() {
        String str = this.f23923a;
        String str2 = this.f23924c;
        return "VC: " + str + "=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23923a);
        parcel.writeString(this.f23924c);
    }
}
