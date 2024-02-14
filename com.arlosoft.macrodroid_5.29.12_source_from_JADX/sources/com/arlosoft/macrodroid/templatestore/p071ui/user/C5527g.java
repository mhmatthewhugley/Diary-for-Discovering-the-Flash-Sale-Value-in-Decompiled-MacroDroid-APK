package com.arlosoft.macrodroid.templatestore.p071ui.user;

import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.User;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.g */
/* compiled from: UserProvider.kt */
public final class C5527g {

    /* renamed from: a */
    private final Context f13492a;

    public C5527g(Context context) {
        C13706o.m87929f(context, "context");
        this.f13492a = context;
    }

    /* renamed from: a */
    public final void mo30789a() {
        C5163j2.m20095X5(this.f13492a, (User) null);
    }

    /* renamed from: b */
    public final User mo30790b() {
        User h2 = C5163j2.m20169h2(this.f13492a);
        return (h2 == null || h2.isCloudBackupOnly()) ? new User(0, (String) null, (String) null, 0, (String) null, 0, 0, 0, false, true, FrameMetricsAggregator.EVERY_DURATION, (C13695i) null) : h2;
    }
}
