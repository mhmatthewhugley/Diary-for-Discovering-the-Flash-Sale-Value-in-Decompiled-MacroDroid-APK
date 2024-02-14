package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzls implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InputStream f44874a;

    /* renamed from: c */
    final /* synthetic */ OutputStream f44875c;

    /* renamed from: d */
    final /* synthetic */ long f44876d;

    /* renamed from: f */
    final /* synthetic */ OutputStream f44877f;

    /* renamed from: g */
    final /* synthetic */ zzlt f44878g;

    zzls(zzlt zzlt, InputStream inputStream, OutputStream outputStream, long j, OutputStream outputStream2) {
        this.f44878g = zzlt;
        this.f44874a = inputStream;
        this.f44875c = outputStream;
        this.f44876d = j;
        this.f44877f = outputStream2;
    }

    public final void run() {
        this.f44878g.f44880b = this.f44874a;
        boolean z = true;
        try {
            IOUtils.m4891d(this.f44874a, this.f44875c, false, 65536);
            IOUtils.m4889b(this.f44874a);
            zzlt.m62699b(this.f44878g, this.f44877f, false, this.f44876d);
        } catch (IOException e) {
            if (!this.f44878g.f44881c) {
                Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", new Object[]{Long.valueOf(this.f44876d)}), e);
            } else {
                String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", new Object[]{Long.valueOf(this.f44876d)});
            }
            IOUtils.m4889b(this.f44874a);
            zzlt.m62699b(this.f44878g, this.f44877f, true, this.f44876d);
        } catch (Throwable th) {
            th = th;
            IOUtils.m4889b(this.f44874a);
            zzlt.m62699b(this.f44878g, this.f44877f, z, this.f44876d);
            IOUtils.m4889b(this.f44875c);
            this.f44878g.f44880b = null;
            throw th;
        }
        IOUtils.m4889b(this.f44875c);
        this.f44878g.f44880b = null;
    }
}
