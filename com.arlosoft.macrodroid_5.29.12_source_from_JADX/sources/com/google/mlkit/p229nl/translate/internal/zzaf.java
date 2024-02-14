package com.google.mlkit.p229nl.translate.internal;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.mlkit_translate.zzat;
import com.google.android.gms.internal.mlkit_translate.zzl;
import com.google.android.gms.internal.mlkit_translate.zznv;
import com.google.android.gms.internal.mlkit_translate.zzqt;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.mlkit.nl.translate.internal.zzaf */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzaf {

    /* renamed from: a */
    private final zzqt f56475a;

    /* renamed from: b */
    private final zzr f56476b;

    /* renamed from: c */
    private final ModelFileHelper f56477c;

    /* renamed from: d */
    private final zzae f56478d;

    public zzaf(zzqt zzqt, zzae zzae, zzr zzr, ModelFileHelper modelFileHelper, byte[] bArr) {
        this.f56475a = zzqt;
        this.f56478d = zzae;
        this.f56476b = zzr;
        this.f56477c = modelFileHelper;
    }

    /* renamed from: c */
    static final String m79191c(String str, String str2) {
        return String.format("fallback_to_pb_%s.pb.bin", new Object[]{m79196h(str, str2)});
    }

    /* renamed from: d */
    static final String m79192d(String str, String str2) {
        return String.format("nmt_rapid_response_%s.pb.bin", new Object[]{m79196h(str, str2)});
    }

    /* renamed from: e */
    static final String m79193e(String str, String str2) {
        return String.format("stt_rapid_response_%s.pb.bin", new Object[]{m79196h(str, str2)});
    }

    @VisibleForTesting
    /* renamed from: f */
    static final void m79194f(File file, String str, @Nullable String str2) throws IOException {
        File file2 = new File(file, str);
        if (!zzl.m61938c(str2)) {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(zzat.m61598d().mo52068e(str2));
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else if (file2.exists()) {
            file2.delete();
            return;
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: g */
    static final void m79195g(File file, String str, String str2) {
        new File(file, m79192d(str, str2)).delete();
        new File(file, m79193e(str, str2)).delete();
        new File(file, m79191c(str, str2)).delete();
    }

    /* renamed from: h */
    private static String m79196h(String str, String str2) {
        return String.format("%s_%s", new Object[]{str, str2});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64660a(String str, String str2) {
        File f = this.f56477c.mo64594f(zzad.m79189f(str, str2), ModelType.TRANSLATE, false);
        String h = m79196h(str, str2);
        try {
            zzd.m79216a(f);
            zzae zzae = this.f56478d;
            m79194f(f, m79192d(str, str2), zzae.f56474a.mo52464f(String.format("nl_translate_rapid_response_nmt_%s", new Object[]{h})));
            zzae zzae2 = this.f56478d;
            m79194f(f, m79191c(str, str2), zzae2.f56474a.mo52464f(String.format("nl_translate_rapid_response_pbmt_%s", new Object[]{h})));
            zzae zzae3 = this.f56478d;
            m79194f(f, m79193e(str, str2), zzae3.f56474a.mo52464f(String.format("nl_translate_rapid_response_stt_%s", new Object[]{h})));
        } catch (IOException unused) {
            zznv zznv = new zznv();
            zznv.mo52361a(str);
            zznv.mo52362b(str2);
            this.f56476b.mo64689a(zznv.mo52363c()).mo64713y();
        }
    }

    /* renamed from: b */
    public final void mo64661b() {
        this.f56475a.mo52463a(zzqt.f44490n);
    }
}
