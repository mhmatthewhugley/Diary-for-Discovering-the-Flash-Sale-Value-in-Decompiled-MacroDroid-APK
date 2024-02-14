package com.arlosoft.macrodroid.settings.notificationbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p478v2.C17482a;

/* compiled from: NotificationBarPreferencesActivity.kt */
public final class NotificationBarPreferencesActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    public Map<Integer, View> f12964o = new LinkedHashMap();

    /* renamed from: S1 */
    private final void m20320S1() {
        if (C5163j2.m20309y6(this)) {
            ((CardView) mo30138R1(C17532R$id.infoCardView)).setVisibility(8);
            return;
        }
        ((CardView) mo30138R1(C17532R$id.infoCardView)).setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.notification_bar_primary));
        ((TextView) mo30138R1(C17532R$id.infoCardTitle)).setText(C17541R$string.notification_bar_options);
        ((TextView) mo30138R1(C17532R$id.infoCardDetail)).setText(C17541R$string.notification_bar_options_info_card);
        ((Button) mo30138R1(C17532R$id.infoCardGotIt)).setOnClickListener(new C17482a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m20321T1(NotificationBarPreferencesActivity notificationBarPreferencesActivity, View view) {
        C13706o.m87929f(notificationBarPreferencesActivity, "this$0");
        C5163j2.m20036P2(notificationBarPreferencesActivity.getApplicationContext());
        ((CardView) notificationBarPreferencesActivity.mo30138R1(C17532R$id.infoCardView)).setVisibility(8);
    }

    /* renamed from: R1 */
    public View mo30138R1(int i) {
        Map<Integer, View> map = this.f12964o;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_notification_bar_preferences);
        setTitle(C17541R$string.notification_bar_options);
        m20320S1();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
