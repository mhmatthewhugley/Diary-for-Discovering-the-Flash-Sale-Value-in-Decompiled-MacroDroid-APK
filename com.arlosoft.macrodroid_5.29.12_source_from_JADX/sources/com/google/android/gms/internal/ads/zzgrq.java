package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzgrq extends IOException {
    private zzgso zza = null;
    private boolean zzb;

    public zzgrq(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static zzgrp m53032a() {
        return new zzgrp("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static zzgrq m53033b() {
        return new zzgrq("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static zzgrq m53034c() {
        return new zzgrq("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static zzgrq m53035d() {
        return new zzgrq("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static zzgrq m53036e() {
        return new zzgrq("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static zzgrq m53037f() {
        return new zzgrq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static zzgrq m53038g() {
        return new zzgrq("Failed to parse the message.");
    }

    /* renamed from: i */
    static zzgrq m53039i() {
        return new zzgrq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    static zzgrq m53040j() {
        return new zzgrq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final zzgrq mo47365h(zzgso zzgso) {
        this.zza = zzgso;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo47366k() {
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo47367l() {
        return this.zzb;
    }

    public zzgrq(String str) {
        super(str);
    }
}
