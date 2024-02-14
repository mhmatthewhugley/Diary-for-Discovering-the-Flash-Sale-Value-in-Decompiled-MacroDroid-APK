package com.arlosoft.macrodroid.uiinteraction;

import android.app.IntentService;
import android.content.Intent;
import android.view.WindowManager;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.action.services.C3447a;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.utils.C6363a1;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* compiled from: ReplayUiInteractionsService.kt */
public final class ReplayUiInteractionsService extends IntentService {

    /* renamed from: a */
    private C3447a f14827a;

    /* renamed from: c */
    private WindowManager f14828c;

    public ReplayUiInteractionsService() {
        super("ReplayUiInteractionsService");
    }

    public void onCreate() {
        super.onCreate();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, C6363a1.m24607a(), 24, -3);
        Object systemService = getSystemService("window");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f14828c = (WindowManager) systemService;
        this.f14827a = new C3447a(this, "Replaying Touch Events", C17530R$drawable.play_translucent);
        WindowManager windowManager = this.f14828c;
        C3447a aVar = null;
        if (windowManager == null) {
            C13706o.m87945v("windowManager");
            windowManager = null;
        }
        C3447a aVar2 = this.f14827a;
        if (aVar2 == null) {
            C13706o.m87945v("hudView");
        } else {
            aVar = aVar2;
        }
        windowManager.addView(aVar, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        List<UiInteraction> parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("interactionsList") : null;
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C13614t.m87748j();
        }
        long j = 0;
        for (UiInteraction uiInteraction : parcelableArrayListExtra) {
            if (j != 0) {
                Thread.sleep(uiInteraction.getTimestamp() - j);
            } else {
                Thread.sleep(2000);
            }
            startService(new Intent(this, UIInteractionAccessibilityService.class));
            j = uiInteraction.getTimestamp();
        }
    }
}
