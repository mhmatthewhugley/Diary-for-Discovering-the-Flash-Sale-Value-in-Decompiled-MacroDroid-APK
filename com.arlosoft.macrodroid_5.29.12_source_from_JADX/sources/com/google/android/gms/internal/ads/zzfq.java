package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzfq extends zzey {
    public final zzfc zzb;
    public final int zzc;

    public zzfq(zzfc zzfc, int i, int i2) {
        super(m50767b(2008, 1));
        this.zzb = zzfc;
        this.zzc = 1;
    }

    /* renamed from: a */
    public static zzfq m50766a(IOException iOException, zzfc zzfc, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfse.m50915a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new zzfp(iOException, zzfc);
        }
        return new zzfq(iOException, zzfc, i2, i);
    }

    /* renamed from: b */
    private static int m50767b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzfq(IOException iOException, zzfc zzfc, int i, int i2) {
        super((Throwable) iOException, m50767b(i, i2));
        this.zzb = zzfc;
        this.zzc = i2;
    }

    public zzfq(String str, zzfc zzfc, int i, int i2) {
        super(str, m50767b(i, i2));
        this.zzb = zzfc;
        this.zzc = i2;
    }

    public zzfq(String str, @Nullable IOException iOException, zzfc zzfc, int i, int i2) {
        super(str, iOException, m50767b(i, i2));
        this.zzb = zzfc;
        this.zzc = i2;
    }
}
