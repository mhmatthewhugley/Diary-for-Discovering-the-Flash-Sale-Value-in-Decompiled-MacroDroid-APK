package com.google.android.gms.internal.mlkit_common;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgt implements ObjectEncoder {

    /* renamed from: a */
    static final zzgt f42565a = new zzgt();

    /* renamed from: b */
    private static final FieldDescriptor f42566b;

    /* renamed from: c */
    private static final FieldDescriptor f42567c;

    /* renamed from: d */
    private static final FieldDescriptor f42568d;

    /* renamed from: e */
    private static final FieldDescriptor f42569e;

    /* renamed from: f */
    private static final FieldDescriptor f42570f;

    /* renamed from: g */
    private static final FieldDescriptor f42571g;

    /* renamed from: h */
    private static final FieldDescriptor f42572h;

    /* renamed from: i */
    private static final FieldDescriptor f42573i;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42566b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("options");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42567c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("inputLength");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42568d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("outputLength");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42569e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("loadDictionaryErrorCode");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42570f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("translateResultStatusCode");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42571g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a(NotificationCompat.CATEGORY_STATUS);
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42572h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("downloadHttpResponseCode");
        zzbh zzbh8 = new zzbh();
        zzbh8.mo51821a(8);
        f42573i = a8.mo23604b(zzbh8.mo51822b()).mo23603a();
    }

    private zzgt() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkz zzkz = (zzkz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
