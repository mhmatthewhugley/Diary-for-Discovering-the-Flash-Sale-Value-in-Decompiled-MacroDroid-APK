package com.arlosoft.macrodroid.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: WifiCellInfo.kt */
public final class WifiCellInfo implements Parcelable {
    public static final C4365a CREATOR = new C4365a((C13695i) null);
    private final String bssid;
    private final String displayName;
    private final String ssid;

    /* renamed from: com.arlosoft.macrodroid.data.WifiCellInfo$a */
    /* compiled from: WifiCellInfo.kt */
    public static final class C4365a implements Parcelable.Creator<WifiCellInfo> {
        private C4365a() {
        }

        public /* synthetic */ C4365a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public WifiCellInfo createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new WifiCellInfo(parcel);
        }

        /* renamed from: b */
        public WifiCellInfo[] newArray(int i) {
            return new WifiCellInfo[i];
        }
    }

    public WifiCellInfo(String str, String str2, String str3) {
        C13706o.m87929f(str, "ssid");
        C13706o.m87929f(str3, "displayName");
        this.ssid = str;
        this.bssid = str2;
        this.displayName = str3;
    }

    public static /* synthetic */ WifiCellInfo copy$default(WifiCellInfo wifiCellInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wifiCellInfo.ssid;
        }
        if ((i & 2) != 0) {
            str2 = wifiCellInfo.bssid;
        }
        if ((i & 4) != 0) {
            str3 = wifiCellInfo.displayName;
        }
        return wifiCellInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.ssid;
    }

    public final String component2() {
        return this.bssid;
    }

    public final String component3() {
        return this.displayName;
    }

    public final WifiCellInfo copy(String str, String str2, String str3) {
        C13706o.m87929f(str, "ssid");
        C13706o.m87929f(str3, "displayName");
        return new WifiCellInfo(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiCellInfo)) {
            return false;
        }
        WifiCellInfo wifiCellInfo = (WifiCellInfo) obj;
        return C13706o.m87924a(this.ssid, wifiCellInfo.ssid) && C13706o.m87924a(this.bssid, wifiCellInfo.bssid) && C13706o.m87924a(this.displayName, wifiCellInfo.displayName);
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        int hashCode = this.ssid.hashCode() * 31;
        String str = this.bssid;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.displayName.hashCode();
    }

    public String toString() {
        return "WifiCellInfo(ssid=" + this.ssid + ", bssid=" + this.bssid + ", displayName=" + this.displayName + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "parcel");
        parcel.writeString(this.ssid);
        parcel.writeString(this.bssid);
        parcel.writeString(this.displayName);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WifiCellInfo(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000e
            r0 = r1
        L_0x000e:
            java.lang.String r2 = r4.readString()
            java.lang.String r4 = r4.readString()
            if (r4 != 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = r4
        L_0x001a:
            r3.<init>(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.data.WifiCellInfo.<init>(android.os.Parcel):void");
    }
}
