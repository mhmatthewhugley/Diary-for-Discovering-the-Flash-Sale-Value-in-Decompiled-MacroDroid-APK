package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzbo implements ObjectEncoder {

    /* renamed from: a */
    public static final /* synthetic */ zzbo f41987a = new zzbo();

    private /* synthetic */ zzbo() {
    }

    /* renamed from: a */
    public final void mo19314a(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        int i = zzbp.f41989e;
        throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
    }
}
