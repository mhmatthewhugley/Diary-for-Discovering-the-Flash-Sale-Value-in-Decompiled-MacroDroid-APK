package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class zzadn extends IOException {
    private zzaek zza = null;

    public zzadn(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static zzadm m56465a() {
        return new zzadm("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static zzadn m56466b() {
        return new zzadn("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static zzadn m56467c() {
        return new zzadn("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static zzadn m56468d() {
        return new zzadn("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static zzadn m56469e() {
        return new zzadn("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static zzadn m56470f() {
        return new zzadn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static zzadn m56471g() {
        return new zzadn("Failed to parse the message.");
    }

    /* renamed from: i */
    static zzadn m56472i() {
        return new zzadn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final zzadn mo49099h(zzaek zzaek) {
        this.zza = zzaek;
        return this;
    }

    public zzadn(String str) {
        super(str);
    }
}
