package com.arlosoft.macrodroid.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: SmtpServerConfig.kt */
public final class SmtpServerConfig implements Parcelable {
    public static final Parcelable.Creator<SmtpServerConfig> CREATOR = new C4363a();
    private final String password;
    private final String serverAddress;
    private final String serverPort;
    private final boolean startTlsEnabled;
    private final boolean useAuthentication;
    private final String username;

    /* renamed from: com.arlosoft.macrodroid.data.SmtpServerConfig$a */
    /* compiled from: SmtpServerConfig.kt */
    public static final class C4363a implements Parcelable.Creator<SmtpServerConfig> {
        /* renamed from: a */
        public final SmtpServerConfig createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SmtpServerConfig(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final SmtpServerConfig[] newArray(int i) {
            return new SmtpServerConfig[i];
        }
    }

    public SmtpServerConfig(String str, String str2, boolean z, String str3, String str4, boolean z2) {
        C13706o.m87929f(str, "serverAddress");
        C13706o.m87929f(str2, "serverPort");
        C13706o.m87929f(str3, "username");
        C13706o.m87929f(str4, "password");
        this.serverAddress = str;
        this.serverPort = str2;
        this.useAuthentication = z;
        this.username = str3;
        this.password = str4;
        this.startTlsEnabled = z2;
    }

    public static /* synthetic */ SmtpServerConfig copy$default(SmtpServerConfig smtpServerConfig, String str, String str2, boolean z, String str3, String str4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smtpServerConfig.serverAddress;
        }
        if ((i & 2) != 0) {
            str2 = smtpServerConfig.serverPort;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = smtpServerConfig.useAuthentication;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str3 = smtpServerConfig.username;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = smtpServerConfig.password;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z2 = smtpServerConfig.startTlsEnabled;
        }
        return smtpServerConfig.copy(str, str5, z3, str6, str7, z2);
    }

    public final String component1() {
        return this.serverAddress;
    }

    public final String component2() {
        return this.serverPort;
    }

    public final boolean component3() {
        return this.useAuthentication;
    }

    public final String component4() {
        return this.username;
    }

    public final String component5() {
        return this.password;
    }

    public final boolean component6() {
        return this.startTlsEnabled;
    }

    public final SmtpServerConfig copy(String str, String str2, boolean z, String str3, String str4, boolean z2) {
        C13706o.m87929f(str, "serverAddress");
        C13706o.m87929f(str2, "serverPort");
        C13706o.m87929f(str3, "username");
        C13706o.m87929f(str4, "password");
        return new SmtpServerConfig(str, str2, z, str3, str4, z2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmtpServerConfig)) {
            return false;
        }
        SmtpServerConfig smtpServerConfig = (SmtpServerConfig) obj;
        return C13706o.m87924a(this.serverAddress, smtpServerConfig.serverAddress) && C13706o.m87924a(this.serverPort, smtpServerConfig.serverPort) && this.useAuthentication == smtpServerConfig.useAuthentication && C13706o.m87924a(this.username, smtpServerConfig.username) && C13706o.m87924a(this.password, smtpServerConfig.password) && this.startTlsEnabled == smtpServerConfig.startTlsEnabled;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getServerAddress() {
        return this.serverAddress;
    }

    public final String getServerPort() {
        return this.serverPort;
    }

    public final boolean getStartTlsEnabled() {
        return this.startTlsEnabled;
    }

    public final boolean getUseAuthentication() {
        return this.useAuthentication;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = ((this.serverAddress.hashCode() * 31) + this.serverPort.hashCode()) * 31;
        boolean z = this.useAuthentication;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((hashCode + (z ? 1 : 0)) * 31) + this.username.hashCode()) * 31) + this.password.hashCode()) * 31;
        boolean z3 = this.startTlsEnabled;
        if (!z3) {
            z2 = z3;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }

    public final boolean isValid() {
        if (this.serverAddress.length() > 0) {
            if (this.serverPort.length() > 0) {
                if (!this.useAuthentication) {
                    return true;
                }
                if (this.username.length() > 0) {
                    if (this.password.length() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        return "SmtpServerConfig(serverAddress=" + this.serverAddress + ", serverPort=" + this.serverPort + ", useAuthentication=" + this.useAuthentication + ", username=" + this.username + ", password=" + this.password + ", startTlsEnabled=" + this.startTlsEnabled + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.serverAddress);
        parcel.writeString(this.serverPort);
        parcel.writeInt(this.useAuthentication ? 1 : 0);
        parcel.writeString(this.username);
        parcel.writeString(this.password);
        parcel.writeInt(this.startTlsEnabled ? 1 : 0);
    }
}
