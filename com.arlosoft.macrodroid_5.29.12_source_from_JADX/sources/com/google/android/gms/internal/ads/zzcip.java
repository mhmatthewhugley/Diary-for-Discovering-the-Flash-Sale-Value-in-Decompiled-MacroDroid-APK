package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzcip {
    @VisibleForTesting

    /* renamed from: a */
    protected static final AtomicInteger f28540a = new AtomicInteger(0);
    @VisibleForTesting

    /* renamed from: c */
    protected static final AtomicInteger f28541c = new AtomicInteger(0);

    /* renamed from: Z */
    public static int m45389Z() {
        return f28540a.get();
    }

    /* renamed from: b0 */
    public static int m45390b0() {
        return f28541c.get();
    }

    /* renamed from: F */
    public abstract long mo43699F();

    /* renamed from: G */
    public abstract long mo43700G();

    /* renamed from: H */
    public abstract void mo43701H(Uri[] uriArr, String str);

    /* renamed from: I */
    public abstract void mo43702I(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    /* renamed from: J */
    public abstract void mo43703J();

    /* renamed from: K */
    public abstract void mo43704K(long j);

    /* renamed from: L */
    public abstract void mo43705L(int i);

    /* renamed from: M */
    public abstract void mo43706M(int i);

    /* renamed from: N */
    public abstract void mo43707N(zzcio zzcio);

    /* renamed from: P */
    public abstract void mo43708P(int i);

    /* renamed from: Q */
    public abstract void mo43709Q(int i);

    /* renamed from: R */
    public abstract void mo43710R(boolean z);

    /* renamed from: S */
    public abstract void mo43711S(boolean z);

    /* renamed from: T */
    public abstract void mo43712T(int i);

    /* renamed from: U */
    public abstract void mo43713U(Surface surface, boolean z) throws IOException;

    /* renamed from: V */
    public abstract void mo43714V(float f, boolean z) throws IOException;

    /* renamed from: W */
    public abstract void mo43715W();

    /* renamed from: X */
    public abstract boolean mo43716X();

    /* renamed from: Y */
    public abstract int mo43717Y();

    /* renamed from: a0 */
    public abstract int mo43718a0();

    /* renamed from: c0 */
    public abstract long mo43719c0();

    /* renamed from: d0 */
    public abstract long mo43720d0();

    /* renamed from: e0 */
    public abstract long mo43721e0();

    /* renamed from: f0 */
    public abstract long mo43722f0();

    /* renamed from: g0 */
    public abstract long mo43723g0();
}
