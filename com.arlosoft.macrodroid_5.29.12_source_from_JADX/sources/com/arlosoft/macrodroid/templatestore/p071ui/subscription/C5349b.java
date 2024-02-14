package com.arlosoft.macrodroid.templatestore.p071ui.subscription;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros.C5373e;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.users.C5390e;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.b */
/* compiled from: MySubscriptionsActivity.kt */
final class C5349b extends FragmentStateAdapter {

    /* renamed from: a */
    private final MySubscriptionsActivity f13204a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5349b(MySubscriptionsActivity mySubscriptionsActivity) {
        super((FragmentActivity) mySubscriptionsActivity);
        C13706o.m87929f(mySubscriptionsActivity, "activity");
        this.f13204a = mySubscriptionsActivity;
    }

    /* renamed from: B */
    public final String mo30538B(int i) {
        if (i == 0) {
            String string = this.f13204a.getString(C17541R$string.list_macros);
            C13706o.m87928e(string, "activity.getString(R.string.list_macros)");
            return string;
        }
        String string2 = this.f13204a.getString(C17541R$string.subscription_type_users);
        C13706o.m87928e(string2, "activity.getString(R.str….subscription_type_users)");
        return string2;
    }

    public Fragment createFragment(int i) {
        if (i == 0) {
            return C5373e.f13237s.mo30559a();
        }
        return C5390e.f13263s.mo30579a();
    }

    public int getItemCount() {
        return 2;
    }
}
