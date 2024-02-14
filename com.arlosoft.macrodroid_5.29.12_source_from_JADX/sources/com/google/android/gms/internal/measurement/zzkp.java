package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class zzkp extends IOException {
    public zzkp(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzko m60546a() {
        return new zzko("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static zzkp m60547b() {
        return new zzkp("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static zzkp m60548c() {
        return new zzkp("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static zzkp m60549d() {
        return new zzkp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static zzkp m60550e() {
        return new zzkp("Failed to parse the message.");
    }

    /* renamed from: f */
    static zzkp m60551f() {
        return new zzkp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
