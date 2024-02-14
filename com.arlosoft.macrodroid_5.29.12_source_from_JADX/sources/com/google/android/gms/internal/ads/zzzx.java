package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzx {

    /* renamed from: c */
    private static final Pattern f39063c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f39064a = -1;

    /* renamed from: b */
    public int f39065b = -1;

    /* renamed from: c */
    private final boolean m55579c(String str) {
        Matcher matcher = f39063c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = zzen.f34500a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f39064a = parseInt;
            this.f39065b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo48471a() {
        return (this.f39064a == -1 || this.f39065b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo48472b(zzbq zzbq) {
        for (int i = 0; i < zzbq.mo42875a(); i++) {
            zzbp b = zzbq.mo42876b(i);
            if (b instanceof zzacw) {
                zzacw zzacw = (zzacw) b;
                if ("iTunSMPB".equals(zzacw.f23948d) && m55579c(zzacw.f23949f)) {
                    return true;
                }
            } else if (b instanceof zzadf) {
                zzadf zzadf = (zzadf) b;
                if ("com.apple.iTunes".equals(zzadf.f23989c) && "iTunSMPB".equals(zzadf.f23990d) && m55579c(zzadf.f23991f)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
