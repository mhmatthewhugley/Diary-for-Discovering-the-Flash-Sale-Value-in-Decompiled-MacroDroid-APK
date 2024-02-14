package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public interface zzql {
    /* renamed from: a */
    MediaFormat mo48018a();

    @RequiresApi(21)
    /* renamed from: f */
    void mo48019f(int i, long j);

    /* renamed from: g */
    void mo48020g();

    /* renamed from: h */
    void mo48021h(int i, int i2, int i3, long j, int i4);

    @RequiresApi(23)
    /* renamed from: i */
    void mo48022i(Surface surface);

    /* renamed from: j */
    void mo48023j();

    /* renamed from: k */
    void mo48024k(int i, int i2, zzgf zzgf, long j, int i3);

    /* renamed from: l */
    void mo48025l(int i);

    /* renamed from: m */
    void mo48026m(int i, boolean z);

    /* renamed from: n */
    int mo48027n(MediaCodec.BufferInfo bufferInfo);

    @RequiresApi(19)
    /* renamed from: n0 */
    void mo48028n0(Bundle bundle);

    /* renamed from: q */
    boolean mo48029q();

    @Nullable
    /* renamed from: x */
    ByteBuffer mo48030x(int i);

    @Nullable
    /* renamed from: y */
    ByteBuffer mo48031y(int i);

    int zza();
}
