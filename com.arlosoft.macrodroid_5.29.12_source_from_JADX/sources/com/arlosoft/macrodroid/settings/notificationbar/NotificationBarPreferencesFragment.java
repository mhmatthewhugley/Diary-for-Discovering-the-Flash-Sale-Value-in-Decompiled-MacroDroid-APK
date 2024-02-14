package com.arlosoft.macrodroid.settings.notificationbar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17543R$xml;
import com.arlosoft.macrodroid.ConfigureNotificationBarActivity;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;
import p478v2.C17483b;
import p478v2.C17484c;
import p478v2.C17485d;
import p478v2.C17486e;
import p478v2.C17487f;
import p478v2.C17488g;
import p478v2.C17489h;

/* compiled from: NotificationBarPreferencesFragment.kt */
public final class NotificationBarPreferencesFragment extends PreferenceFragmentCompat {

    /* renamed from: a */
    public Map<Integer, View> f12965a = new LinkedHashMap();

    /* renamed from: g0 */
    private final void m20330g0() {
        Preference findPreference = findPreference("preferences:configure_notification_button_bar");
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("preferences:force_hide_icon");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (checkBoxPreference != null) {
                checkBoxPreference.setVisible(false);
            }
        } else if (checkBoxPreference != null) {
            checkBoxPreference.setOnPreferenceChangeListener(new C17484c(this));
        }
        Preference findPreference2 = findPreference("preference:oreo_hide_info");
        if (i < 26) {
            if (findPreference2 != null) {
                findPreference2.setVisible(false);
            }
        } else if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new C17489h(this));
        }
        ListPreference listPreference = (ListPreference) findPreference("preferences:notification_priority");
        if (listPreference != null) {
            listPreference.setOnPreferenceClickListener(new C17487f(this));
        }
        if (findPreference != null) {
            findPreference.setOnPreferenceClickListener(new C17486e(this));
        }
        Preference findPreference3 = findPreference("preferences:notification_icon");
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new C17488g(this));
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("preferences:notification_list_macros");
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.setOnPreferenceChangeListener(new C17485d(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public static final boolean m20331h0(NotificationBarPreferencesFragment notificationBarPreferencesFragment, Preference preference, Object obj) {
        C13706o.m87929f(notificationBarPreferencesFragment, "this$0");
        C13706o.m87929f(obj, "newValue");
        if (C13706o.m87924a(obj.toString(), "true")) {
            MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
            Context applicationContext = notificationBarPreferencesFragment.requireActivity().getApplicationContext();
            C13706o.m87928e(applicationContext, "requireActivity().applicationContext");
            aVar.mo24642g(applicationContext);
            return true;
        }
        MacroDroidService.C2296a aVar2 = MacroDroidService.f7040a;
        FragmentActivity requireActivity = notificationBarPreferencesFragment.requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        aVar2.mo24641f(requireActivity);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final boolean m20332i0(NotificationBarPreferencesFragment notificationBarPreferencesFragment, Preference preference) {
        C13706o.m87929f(notificationBarPreferencesFragment, "this$0");
        AlertDialog.Builder builder = new AlertDialog.Builder(notificationBarPreferencesFragment.requireActivity());
        builder.setTitle((int) C17541R$string.hide_notification_oreo);
        builder.setMessage((int) C17541R$string.hide_notification_oreo_info);
        builder.setPositiveButton((int) C17541R$string.notification_access, (DialogInterface.OnClickListener) new C17483b(notificationBarPreferencesFragment));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m20333j0(NotificationBarPreferencesFragment notificationBarPreferencesFragment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(notificationBarPreferencesFragment, "this$0");
        try {
            notificationBarPreferencesFragment.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
        } catch (Exception unused) {
            C15626c.m94876a(notificationBarPreferencesFragment.requireActivity().getApplicationContext(), notificationBarPreferencesFragment.getString(C17541R$string.cannot_launch_notification_settings), 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final boolean m20334m0(NotificationBarPreferencesFragment notificationBarPreferencesFragment, Preference preference) {
        C13706o.m87929f(notificationBarPreferencesFragment, "this$0");
        MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
        FragmentActivity requireActivity = notificationBarPreferencesFragment.requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        aVar.mo24641f(requireActivity);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final boolean m20335n0(NotificationBarPreferencesFragment notificationBarPreferencesFragment, Preference preference) {
        C13706o.m87929f(notificationBarPreferencesFragment, "this$0");
        notificationBarPreferencesFragment.startActivity(new Intent(notificationBarPreferencesFragment.getActivity(), ConfigureNotificationBarActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public static final boolean m20336o0(NotificationBarPreferencesFragment notificationBarPreferencesFragment, Preference preference) {
        C13706o.m87929f(notificationBarPreferencesFragment, "this$0");
        Intent intent = new Intent(notificationBarPreferencesFragment.getActivity(), IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", false);
        notificationBarPreferencesFragment.startActivityForResult(intent, 100);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final boolean m20337p0(NotificationBarPreferencesFragment notificationBarPreferencesFragment, Preference preference, Object obj) {
        C13706o.m87929f(notificationBarPreferencesFragment, "this$0");
        FragmentActivity activity = notificationBarPreferencesFragment.getActivity();
        Boolean bool = (Boolean) obj;
        C13706o.m87926c(bool);
        C5163j2.m20308y5(activity, bool.booleanValue());
        MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
        FragmentActivity requireActivity = notificationBarPreferencesFragment.requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        aVar.mo24644i(requireActivity, false);
        return true;
    }

    /* renamed from: f0 */
    public void mo30139f0() {
        this.f12965a.clear();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100 && intent != null && i2 != 0) {
            String stringExtra = intent.getStringExtra("drawableName");
            C5163j2.m19943C4(getContext(), C4061t1.m15976V(getContext(), stringExtra));
            C5163j2.m19951D4(getContext(), stringExtra);
            MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
            FragmentActivity requireActivity = requireActivity();
            C13706o.m87928e(requireActivity, "requireActivity()");
            aVar.mo24644i(requireActivity, true);
        }
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(C17543R$xml.preferences_notification_bar, str);
        m20330g0();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo30139f0();
    }
}
