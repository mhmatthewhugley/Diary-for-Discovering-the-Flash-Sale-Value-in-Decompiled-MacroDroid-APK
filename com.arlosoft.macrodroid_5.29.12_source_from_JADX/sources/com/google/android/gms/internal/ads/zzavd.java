package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzavd {

    /* renamed from: c */
    public static final zzaxm f25731c = new zzavc();

    /* renamed from: d */
    private static final Pattern f25732d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f25733a = -1;

    /* renamed from: b */
    public int f25734b = -1;

    /* renamed from: a */
    public final boolean mo42110a() {
        return (this.f25733a == -1 || this.f25734b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo42111b(zzaxh zzaxh) {
        for (int i = 0; i < zzaxh.mo42168a(); i++) {
            zzaxg b = zzaxh.mo42169b(i);
            if (b instanceof zzaxl) {
                zzaxl zzaxl = (zzaxl) b;
                String str = zzaxl.f26174d;
                String str2 = zzaxl.f26175f;
                if (!"iTunSMPB".equals(str)) {
                    continue;
                } else {
                    Matcher matcher = f25732d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f25733a = parseInt;
                                this.f25734b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
