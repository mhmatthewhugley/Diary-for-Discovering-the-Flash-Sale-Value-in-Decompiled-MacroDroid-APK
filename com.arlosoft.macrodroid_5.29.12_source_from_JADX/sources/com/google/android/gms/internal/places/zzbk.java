package com.google.android.gms.internal.places;

import java.io.IOException;

public class zzbk extends IOException {
    private zzck zzje = null;

    public zzbk(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzbk m63362a() {
        return new zzbk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzbk m63363b() {
        return new zzbk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzbk m63364c() {
        return new zzbk("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static zzbj m63365d() {
        return new zzbj("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static zzbk m63366e() {
        return new zzbk("Failed to parse the message.");
    }

    /* renamed from: f */
    static zzbk m63367f() {
        return new zzbk("Protocol message had invalid UTF-8.");
    }

    /* renamed from: g */
    public final zzbk mo53476g(zzck zzck) {
        this.zzje = zzck;
        return this;
    }
}
