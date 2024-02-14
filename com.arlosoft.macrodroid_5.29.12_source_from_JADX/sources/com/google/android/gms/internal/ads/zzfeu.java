package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfeu {

    /* renamed from: a */
    private final Pattern f35665a;

    @VisibleForTesting
    public zzfeu() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzay.m1924c().mo42663b(zzbjc.f27031W5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f35665a = pattern;
    }

    @Nullable
    /* renamed from: a */
    public final String mo45632a(@Nullable String str) {
        Pattern pattern = this.f35665a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
