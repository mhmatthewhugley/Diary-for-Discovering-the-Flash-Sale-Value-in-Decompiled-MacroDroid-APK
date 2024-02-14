package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhl implements ObjectEncoder {

    /* renamed from: a */
    static final zzhl f43674a = new zzhl();

    /* renamed from: b */
    private static final FieldDescriptor f43675b;

    /* renamed from: c */
    private static final FieldDescriptor f43676c;

    /* renamed from: d */
    private static final FieldDescriptor f43677d;

    /* renamed from: e */
    private static final FieldDescriptor f43678e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelInfo");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43675b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("initialDownloadConditions");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43676c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("updateDownloadConditions");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43677d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("isModelUpdateEnabled");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43678e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzhl() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43675b, ((zzlu) obj).mo52290a());
        objectEncoderContext.mo23608e(f43676c, (Object) null);
        objectEncoderContext.mo23608e(f43677d, (Object) null);
        objectEncoderContext.mo23608e(f43678e, (Object) null);
    }
}
