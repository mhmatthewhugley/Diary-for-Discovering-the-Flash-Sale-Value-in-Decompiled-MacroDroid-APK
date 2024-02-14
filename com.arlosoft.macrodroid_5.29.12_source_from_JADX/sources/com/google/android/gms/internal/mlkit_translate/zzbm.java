package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzbm implements ValueEncoderContext {

    /* renamed from: a */
    private boolean f43157a = false;

    /* renamed from: b */
    private boolean f43158b = false;

    /* renamed from: c */
    private FieldDescriptor f43159c;

    /* renamed from: d */
    private final zzbi f43160d;

    zzbm(zzbi zzbi) {
        this.f43160d = zzbi;
    }

    /* renamed from: b */
    private final void m61637b() {
        if (!this.f43157a) {
            this.f43157a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52096a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f43157a = false;
        this.f43159c = fieldDescriptor;
        this.f43158b = z;
    }

    @NonNull
    /* renamed from: d */
    public final ValueEncoderContext mo23610d(@Nullable String str) throws IOException {
        m61637b();
        this.f43160d.mo52090g(this.f43159c, str, this.f43158b);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final ValueEncoderContext mo23611f(boolean z) throws IOException {
        m61637b();
        this.f43160d.mo52091h(this.f43159c, z ? 1 : 0, this.f43158b);
        return this;
    }
}
