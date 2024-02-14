package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;

/* renamed from: androidx.browser.trusted.c */
/* compiled from: TrustedWebActivityDisplayMode */
public final /* synthetic */ class C0308c {
    @NonNull
    /* renamed from: a */
    public static TrustedWebActivityDisplayMode m380a(@NonNull Bundle bundle) {
        if (bundle.getInt(TrustedWebActivityDisplayMode.KEY_ID) != 1) {
            return new TrustedWebActivityDisplayMode.DefaultMode();
        }
        return TrustedWebActivityDisplayMode.ImmersiveMode.fromBundle(bundle);
    }
}
