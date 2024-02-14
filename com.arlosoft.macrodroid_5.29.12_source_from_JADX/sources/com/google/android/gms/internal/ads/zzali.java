package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzali extends zzakd {

    /* renamed from: D */
    private final Object f24945D = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: E */
    private final zzaki f24946E;

    public zzali(int i, String str, zzaki zzaki, @Nullable zzakh zzakh) {
        super(i, str, zzakh);
        this.f24946E = zzaki;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo20328r(String str) {
        zzaki zzaki;
        synchronized (this.f24945D) {
            zzaki = this.f24946E;
        }
        zzaki.mo20329a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final zzakj mo20330j(zzajz zzajz) {
        String str;
        try {
            byte[] bArr = zzajz.f24867b;
            Map map = zzajz.f24868c;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzajz.f24867b);
        }
        return zzakj.m41656b(str, zzala.m41691b(zzajz));
    }
}
