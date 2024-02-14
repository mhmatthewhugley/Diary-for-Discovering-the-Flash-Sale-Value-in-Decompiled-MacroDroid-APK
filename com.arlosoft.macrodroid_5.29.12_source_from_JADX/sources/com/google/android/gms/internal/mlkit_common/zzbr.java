package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzbr implements ValueEncoderContext {

    /* renamed from: a */
    private boolean f41996a = false;

    /* renamed from: b */
    private boolean f41997b = false;

    /* renamed from: c */
    private FieldDescriptor f41998c;

    /* renamed from: d */
    private final zzbn f41999d;

    zzbr(zzbn zzbn) {
        this.f41999d = zzbn;
    }

    /* renamed from: b */
    private final void m61226b() {
        if (!this.f41996a) {
            this.f41996a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51836a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f41996a = false;
        this.f41998c = fieldDescriptor;
        this.f41997b = z;
    }

    @NonNull
    /* renamed from: d */
    public final ValueEncoderContext mo23610d(@Nullable String str) throws IOException {
        m61226b();
        this.f41999d.mo51830g(this.f41998c, str, this.f41997b);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final ValueEncoderContext mo23611f(boolean z) throws IOException {
        m61226b();
        this.f41999d.mo51831h(this.f41998c, z ? 1 : 0, this.f41997b);
        return this;
    }
}
