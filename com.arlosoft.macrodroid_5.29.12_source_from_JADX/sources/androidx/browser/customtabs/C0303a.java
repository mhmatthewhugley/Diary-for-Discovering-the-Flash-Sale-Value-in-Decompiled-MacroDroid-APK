package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;

/* renamed from: androidx.browser.customtabs.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0303a implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ CustomTabsService.C02991 f332a;

    /* renamed from: b */
    public final /* synthetic */ CustomTabsSessionToken f333b;

    public /* synthetic */ C0303a(CustomTabsService.C02991 r1, CustomTabsSessionToken customTabsSessionToken) {
        this.f332a = r1;
        this.f333b = customTabsSessionToken;
    }

    public final void binderDied() {
        this.f332a.lambda$newSessionInternal$0(this.f333b);
    }
}
