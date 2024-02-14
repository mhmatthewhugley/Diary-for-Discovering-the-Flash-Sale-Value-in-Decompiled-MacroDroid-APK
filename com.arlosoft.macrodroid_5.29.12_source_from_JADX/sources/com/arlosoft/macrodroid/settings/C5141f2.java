package com.arlosoft.macrodroid.settings;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.CheckBoxPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.C17543R$xml;
import com.arlosoft.macrodroid.DonateActivity;
import com.arlosoft.macrodroid.accessibility.KeepAccessibilityServicesRunningActivity;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.SpeakTextAction;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.C4072w0;
import com.arlosoft.macrodroid.common.EncryptedEditTextPreference;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.privacy.PrivacyActivity;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsActivity;
import com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger;
import com.arlosoft.macrodroid.triggers.FlipDeviceTrigger;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.ProximityTrigger;
import com.arlosoft.macrodroid.triggers.ShakeDeviceTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity;
import com.arlosoft.macrodroid.utils.C6383g0;
import com.arlosoft.macrodroid.utils.C6417p1;
import com.google.android.gms.common.AccountPicker;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import p134n0.C7960a;
import p148q0.C8151a;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.settings.f2 */
/* compiled from: PreferencesFragment */
public class C5141f2 extends PreferenceFragmentCompat {

    /* renamed from: a */
    private TextToSpeech f12911a;

    /* renamed from: c */
    private TextToSpeech f12912c;

    /* renamed from: d */
    private String f12913d;

    /* renamed from: com.arlosoft.macrodroid.settings.f2$a */
    /* compiled from: PreferencesFragment */
    class C5142a implements Preference.OnPreferenceChangeListener {
        C5142a() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            C5163j2.m20173h6(C5141f2.this.getContext(), ((Boolean) obj).booleanValue());
            List<Macro> z = C4934n.m18998M().mo29710z();
            ArrayList<Trigger> arrayList = new ArrayList<>();
            for (Macro triggerList : z) {
                Iterator<Trigger> it = triggerList.getTriggerList().iterator();
                while (it.hasNext()) {
                    Trigger next = it.next();
                    if ((next instanceof IncomingSMSTrigger) && next.mo27822G1()) {
                        next.mo31543T2();
                        arrayList.add(next);
                    }
                }
            }
            for (Trigger V2 : arrayList) {
                V2.mo31544V2();
            }
            return true;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.f2$b */
    /* compiled from: PreferencesFragment */
    class C5143b extends Thread {

        /* renamed from: a */
        final /* synthetic */ Preference f12915a;

        C5143b(Preference preference) {
            this.f12915a = preference;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m19920b() {
            C15626c.makeText(C5141f2.this.getActivity().getApplicationContext(), C17541R$string.helper_file_removed, 0).show();
        }

        public void run() {
            if (C4061t1.m16030y0(C5141f2.this.getActivity())) {
                C5141f2.this.getActivity().runOnUiThread(new C5151g2(this));
                C5141f2.this.getPreferenceScreen().removePreference(this.f12915a);
                C5163j2.m20074U5(C5141f2.this.getActivity(), -1);
                return;
            }
            C8151a.m33873n(new RuntimeException("Failed to remove helper file"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.f2$c */
    /* compiled from: PreferencesFragment */
    class C5144c implements Preference.OnPreferenceClickListener {
        C5144c() {
        }

        public boolean onPreferenceClick(Preference preference) {
            AccountPicker.AccountChooserOptions.Builder b = new AccountPicker.AccountChooserOptions.Builder().mo21125b(Arrays.asList(new String[]{"com.google"}));
            String Q = C5163j2.m20040Q(C5141f2.this.requireContext());
            if (Q != null) {
                b.mo21126c(new Account(Q, "com.google"));
            }
            C5141f2.this.startActivityForResult(AccountPicker.m3476b(b.mo21124a()), 1);
            return true;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.f2$d */
    /* compiled from: PreferencesFragment */
    class C5145d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12918a;

        /* renamed from: c */
        final /* synthetic */ EditText f12919c;

        /* renamed from: d */
        final /* synthetic */ EditText f12920d;

        C5145d(Button button, EditText editText, EditText editText2) {
            this.f12918a = button;
            this.f12919c = editText;
            this.f12920d = editText2;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12918a.setEnabled(this.f12919c.getText().length() > 3 && this.f12919c.getText().toString().equals(this.f12920d.getText().toString()));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.f2$e */
    /* compiled from: PreferencesFragment */
    class C5146e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12922a;

        /* renamed from: c */
        final /* synthetic */ EditText f12923c;

        /* renamed from: d */
        final /* synthetic */ EditText f12924d;

        C5146e(Button button, EditText editText, EditText editText2) {
            this.f12922a = button;
            this.f12923c = editText;
            this.f12924d = editText2;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12922a.setEnabled(this.f12923c.getText().length() > 3 && this.f12923c.getText().toString().equals(this.f12924d.getText().toString()));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.f2$f */
    /* compiled from: PreferencesFragment */
    private class C5147f implements Comparable<C5147f> {

        /* renamed from: a */
        public String f12926a;

        /* renamed from: c */
        public String f12927c;

        public C5147f(String str, String str2) {
            this.f12926a = str;
            this.f12927c = str2;
        }

        /* renamed from: b */
        public int compareTo(C5147f fVar) {
            return this.f12926a.compareTo(fVar.f12926a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public /* synthetic */ void m19796A1(EncryptedEditTextPreference encryptedEditTextPreference, EditText editText) {
        editText.setInputType(129);
        encryptedEditTextPreference.setSummaryProvider(new C5204w1(this, editText));
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void m19797A2(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.speech.tts.engine.INSTALL_TTS_DATA");
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static /* synthetic */ void m19799B2(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static /* synthetic */ boolean m19801C1(EncryptedEditTextPreference encryptedEditTextPreference, Preference preference, Object obj) {
        if (obj.toString().equals("true")) {
            encryptedEditTextPreference.setVisible(true);
        } else {
            encryptedEditTextPreference.setVisible(false);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m19802C2(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("com.android.settings.TTS_SETTINGS");
            intent.setFlags(268435456);
            requireActivity().startActivity(intent);
        } catch (Exception e) {
            C4878b.m18868g("Could not open TTS settings: " + e.toString());
            C15626c.makeText(requireContext(), C17541R$string.error, 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public /* synthetic */ boolean m19804D1(Preference preference) {
        Intent intent = new Intent();
        if (((PowerManager) getActivity().getSystemService("power")).isIgnoringBatteryOptimizations(getActivity().getPackageName())) {
            intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        } else {
            intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + getActivity().getPackageName()));
        }
        try {
            startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            C15626c.makeText(getActivity().getApplicationContext(), C17541R$string.not_supported, 0).show();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static /* synthetic */ void m19805D2(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public /* synthetic */ boolean m19807E1(Preference preference) {
        Intent launchIntentForPackage = requireActivity().getPackageManager().getLaunchIntentForPackage("com.arlosoft.macrodroid.helper");
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
            return false;
        }
        C4878b.m18868g("Could not launch helper app, no launch intent found");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void m19808E2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle((int) C17541R$string.language_to_speak);
        builder.setMessage((int) C17541R$string.speak_text_language_missing_info);
        builder.setNeutralButton((int) C17541R$string.open_text_to_speech_settings, (DialogInterface.OnClickListener) new C5170l0(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C5192s1.f12991a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ boolean m19810F1(Preference preference) {
        startActivity(new Intent(getActivity(), EditModesActivity.class));
        return true;
    }

    /* renamed from: F2 */
    public static void m19811F2() {
        List<Macro> z = C4934n.m18998M().mo29710z();
        for (Macro next : z) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if ((next2 instanceof ShakeDeviceTrigger) && next2.mo27822G1() && next.isEnabled()) {
                    next2.mo31543T2();
                }
            }
        }
        for (Macro next3 : z) {
            Iterator<Trigger> it2 = next3.getTriggerList().iterator();
            while (it2.hasNext()) {
                Trigger next4 = it2.next();
                if ((next4 instanceof ShakeDeviceTrigger) && next4.mo27822G1() && next3.isEnabled()) {
                    next4.mo31544V2();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ boolean m19813G1(Preference preference, Object obj) {
        C5163j2.m20088W5(getContext(), (String) obj);
        ArrayList<Action> arrayList = new ArrayList<>();
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Action> it = next.getActions().iterator();
            while (it.hasNext()) {
                Action next2 = it.next();
                if ((next2 instanceof SpeakTextAction) && next.isEnabled() && next2.mo27822G1()) {
                    next2.mo24691T2();
                    arrayList.add(next2);
                }
            }
        }
        for (Action W2 : arrayList) {
            W2.mo24696W2();
        }
        return true;
    }

    /* renamed from: G2 */
    private String m19814G2(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(ProxyConfig.MATCH_ALL_SCHEMES);
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public /* synthetic */ CharSequence m19816H1(EditText editText, Preference preference) {
        return m19814G2(editText.getText().toString().length());
    }

    /* renamed from: H2 */
    private void m19817H2(boolean z) {
        requireActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.arlosoft.macrodroid", "com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidOnOffTileService"), z ? 1 : 2, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public /* synthetic */ void m19819I1(EditTextPreference editTextPreference, EditText editText) {
        editText.setInputType(129);
        editTextPreference.setSummaryProvider(new C5207x1(this, editText));
    }

    /* renamed from: I2 */
    private void m19820I2(int i, ListPreference listPreference) {
        int i2;
        String[] strArr;
        String str;
        if (ContextCompat.checkSelfPermission(getActivity(), "android.permission.CAMERA") == 0) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            try {
                Camera open = Camera.open(i);
                Camera.Size h1 = C5163j2.m20168h1(getActivity(), open, cameraInfo);
                open.release();
                str = h1.width + "," + h1.height;
            } catch (Exception unused) {
                str = "";
            }
            List<String> r = C5163j2.m20246r(getActivity(), i);
            strArr = new String[r.size()];
            i2 = 0;
            for (int i3 = 0; i3 < r.size(); i3++) {
                strArr[i3] = r.get(i3);
                if (str.equals(strArr[i3])) {
                    i2 = i3;
                }
            }
        } else {
            strArr = new String[0];
            i2 = 0;
        }
        if (strArr.length == 0) {
            strArr = new String[]{getString(C17541R$string.no_options_found)};
        }
        listPreference.setEntries((CharSequence[]) strArr);
        listPreference.setEntryValues((CharSequence[]) strArr);
        try {
            listPreference.setValueIndex(i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            C8151a.m33873n(new RuntimeException("setupCameraResolutions failed: " + e.getMessage()));
            listPreference.setValueIndex(0);
        }
    }

    /* renamed from: J2 */
    private void m19823J2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle((int) C17541R$string.no_speech_data_files);
        builder.setMessage((int) C17541R$string.no_speech_info);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5117a0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C5154h1.f12935a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public /* synthetic */ boolean m19825K1(Preference preference) {
        m19826K2();
        return true;
    }

    /* renamed from: K2 */
    private void m19826K2() {
        new Handler().postDelayed(new C5211y1(this), 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ boolean m19829M1(String[] strArr, Preference preference, Object obj) {
        if (strArr[0].equals("None Available") || !((String) obj).endsWith("(*)")) {
            return true;
        }
        m19823J2();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m19831N1(ListPreference listPreference, int i) {
        String[] strArr;
        String[] strArr2;
        ListPreference listPreference2 = listPreference;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Locale c2 = C5163j2.m20129c2(MacroDroidApplication.m14845u());
            Locale[] localeArr = C5163j2.f12950b;
            Arrays.sort(localeArr, C5214z1.f13023a);
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i2 < localeArr.length) {
                TextToSpeech textToSpeech = this.f12911a;
                if (textToSpeech != null) {
                    if (textToSpeech.isLanguageAvailable(localeArr[i2]) != -2) {
                        String displayName = localeArr[i2].getDisplayName();
                        StringBuilder sb = new StringBuilder();
                        int i6 = i3 + 1;
                        sb.append(localeArr[i2].getLanguage());
                        sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                        sb.append(localeArr[i2].getCountry());
                        arrayList2.add(sb.toString());
                        if (this.f12911a.isLanguageAvailable(localeArr[i2]) == -1) {
                            arrayList.add(displayName + "(*)");
                        } else {
                            arrayList.add(displayName);
                        }
                        i3 = i6;
                    }
                    if (c2 != null && c2.getLanguage().equals(localeArr[i2].getLanguage())) {
                        if (c2.getLanguage().equals("en")) {
                            if ((!c2.getCountry().toLowerCase().equals("gb") && !c2.getCountry().toLowerCase().equals("")) || !localeArr[i2].getCountry().toLowerCase().equals("gb")) {
                                if (!c2.getCountry().toLowerCase().equals("in") || !localeArr[i2].getCountry().toLowerCase().equals("in")) {
                                    if (!c2.getCountry().toLowerCase().equals("au") || !localeArr[i2].getCountry().toLowerCase().equals("au")) {
                                        if (!c2.getCountry().toLowerCase().equals("gb")) {
                                            if (!c2.getCountry().toLowerCase().equals("in")) {
                                                if (!localeArr[i2].getCountry().toLowerCase().equals("us")) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i5 = i2;
                        } else if (c2.getLanguage().equals("es")) {
                            if ((!c2.getCountry().toLowerCase().equals("es") && !TextUtils.isEmpty(c2.getCountry())) || !localeArr[i2].getCountry().toLowerCase().equals("es")) {
                                if (c2.getCountry().toLowerCase().equals("mx") && localeArr[i2].getCountry().toLowerCase().equals("mx")) {
                                }
                            }
                        } else if (c2.getLanguage().equals("pt")) {
                            if (!c2.getCountry().toLowerCase().equals("br") || !localeArr[i2].getCountry().toLowerCase().equals("br")) {
                                if (c2.getCountry().isEmpty()) {
                                    if (!localeArr[i2].getCountry().isEmpty()) {
                                    }
                                }
                            }
                        }
                        i4 = i3;
                    }
                }
                i2++;
                ListPreference listPreference3 = listPreference;
            }
            if (arrayList.size() == 0) {
                arrayList.add("None Available");
                arrayList2.add("");
            }
            if (arrayList.size() > 0) {
                strArr2 = new String[arrayList.size()];
                strArr = new String[arrayList2.size()];
                arrayList.toArray(strArr2);
                arrayList2.toArray(strArr);
            } else {
                strArr2 = new String[]{"No Languages Found"};
                strArr = new String[]{""};
            }
            ListPreference listPreference4 = listPreference;
            listPreference4.setEntries((CharSequence[]) strArr2);
            listPreference4.setEntryValues((CharSequence[]) strArr);
            listPreference4.setEnabled(true);
            try {
                listPreference4.setValueIndex(i4);
            } catch (ArrayIndexOutOfBoundsException unused) {
                try {
                    listPreference4.setValueIndex(i5);
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    listPreference4.setValueIndex(0);
                }
            }
            listPreference4.setOnPreferenceChangeListener(new C5182p0(this, strArr2));
        } catch (IllegalArgumentException unused3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static /* synthetic */ boolean m19833O1(Preference preference, Object obj) {
        File file = new File(Environment.getExternalStorageDirectory(), "MacroDroid/Photos/.nomedia");
        if (obj.toString().equals("false")) {
            if (file.exists()) {
                return true;
            }
            file.mkdirs();
            return true;
        } else if (!file.exists()) {
            return true;
        } else {
            file.delete();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ boolean m19835P1(Preference preference) {
        startActivity(new Intent(getActivity(), KeepAccessibilityServicesRunningActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static /* synthetic */ boolean m19837Q1(Preference preference, Object obj) {
        File file = new File(Environment.getExternalStorageDirectory(), "MacroDroid/Recordings");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(Environment.getExternalStorageDirectory() + "/" + "MacroDroid/Recordings", ".nomedia");
        if (((Boolean) obj).booleanValue()) {
            if (file2.exists()) {
                return true;
            }
            try {
                file2.createNewFile();
                return true;
            } catch (Exception unused) {
                return true;
            }
        } else if (!file2.exists()) {
            return true;
        } else {
            file2.delete();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public /* synthetic */ boolean m19839R1(Preference preference) {
        FlipDeviceTrigger.m22180p3(getActivity());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ boolean m19841S1(Preference preference) {
        Intent intent = new Intent(getActivity(), LocationChooserActivity.class);
        intent.putExtra("title", getString(C17541R$string.weather_location));
        try {
            String x2 = C5163j2.m20297x2(requireActivity());
            String substring = x2.substring(x2.indexOf("lat=") + 4, x2.indexOf("&lon="));
            String substring2 = x2.substring(x2.indexOf("&lon=") + 5);
            intent.putExtra("lat", Double.valueOf(substring));
            intent.putExtra("lon", Double.valueOf(substring2));
        } catch (Exception unused) {
        }
        startActivityForResult(intent, 2);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ boolean m19843T1(Preference preference, Object obj) {
        getActivity().sendBroadcast(new Intent("WeatberUpdateRateIntent"));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ boolean m19846U1(Preference preference) {
        Intent intent = new Intent(getActivity(), LocationChooserActivity.class);
        intent.putExtra("title", getString(C17541R$string.sunrise_sunset_location));
        try {
            String e2 = C5163j2.m20145e2(requireActivity());
            String substring = e2.substring(0, e2.indexOf(","));
            String substring2 = e2.substring(e2.indexOf(",") + 1);
            intent.putExtra("lat", Double.valueOf(substring));
            intent.putExtra("lon", Double.valueOf(substring2));
        } catch (Exception unused) {
        }
        startActivityForResult(intent, 3);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ void m19849V1(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        intent.addFlags(268435456);
        try {
            getActivity().startActivityForResult(intent, 0);
        } catch (Exception unused) {
            C15626c.m94876a(getActivity().getApplicationContext(), getString(C17541R$string.cannot_launch_accessibility_settings), 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ boolean m19852W1(Preference preference, Object obj) {
        if (obj instanceof Boolean) {
            C5163j2.m20146e3(getActivity(), ((Boolean) obj).booleanValue());
        }
        List<Macro> I = C4934n.m18998M().mo29679I();
        for (Macro triggerList : I) {
            Iterator<Trigger> it = triggerList.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                if (next instanceof ApplicationLaunchedTrigger) {
                    next.mo31543T2();
                }
            }
        }
        for (Macro triggerList2 : I) {
            Iterator<Trigger> it2 = triggerList2.getTriggerList().iterator();
            while (it2.hasNext()) {
                Trigger next2 = it2.next();
                if (next2 instanceof ApplicationLaunchedTrigger) {
                    next2.mo31544V2();
                }
            }
        }
        if (((Boolean) obj).booleanValue()) {
            boolean z = false;
            try {
                ApplicationInfo applicationInfo = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), 0);
                if (((AppOpsManager) getContext().getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) == 0) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (!z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle((int) C17541R$string.usage_access_required);
                builder.setMessage((int) C17541R$string.usage_access_required_description);
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5203w0(this));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
                builder.show();
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static /* synthetic */ boolean m19855X1(Preference preference, Object obj) {
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if ((next2 instanceof ProximityTrigger) && next.isEnabled()) {
                    next2.mo31543T2();
                    next2.mo31544V2();
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ boolean m19856Y1(String[] strArr, C5147f[] fVarArr, Preference preference, Object obj) {
        Configuration configuration = getActivity().getResources().getConfiguration();
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = 0;
                break;
            } else if (strArr[i].equals(obj)) {
                break;
            } else {
                i++;
            }
        }
        if (i == 0) {
            C5163j2.m20058S3(getActivity(), (String) null);
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
                if (!TextUtils.isEmpty(adjustedDefault.get(0).getDisplayCountry()) || adjustedDefault.size() <= 1) {
                    configuration.locale = Locale.getDefault();
                } else {
                    configuration.locale = adjustedDefault.get(1);
                }
            } else {
                configuration.locale = Locale.getDefault();
            }
        } else {
            String str = fVarArr[i - 1].f12927c;
            if (str.startsWith("zh")) {
                str = "zh";
            }
            C5163j2.m20058S3(getActivity(), str);
            configuration.locale = Locale.forLanguageTag(str);
        }
        Locale.setDefault(configuration.locale);
        getActivity().getApplicationContext().getResources().updateConfiguration(configuration, getActivity().getApplicationContext().getResources().getDisplayMetrics());
        MacroDroidApplication.f9883I.mo27307f(configuration.locale);
        MacroDroidApplication.m14845u().mo27287n();
        C5163j2.m20258s3(getActivity(), (List<String>) null);
        requireActivity().recreate();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ boolean m19859Z1(Preference preference) {
        startActivity(new Intent(getActivity(), DonateActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ boolean m19862b2(Preference preference) {
        C7960a.m33246i(getActivity(), (C7960a.C7961a) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ boolean m19871f2(Preference preference, Object obj) {
        getActivity().sendBroadcast(new Intent("CellTowerUpdateRateIntent"));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ boolean m19874g2(Preference preference, Object obj) {
        if (getActivity() == null) {
            return true;
        }
        getActivity().sendBroadcast(new Intent("ActivityRecognitionUpdateRateIntent"));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ boolean m19876h2(Preference preference, Object obj) {
        getActivity().sendBroadcast(new Intent("WifiBackgroundScanRateIntent"));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ boolean m19879i2(Preference preference, Object obj) {
        getActivity().sendBroadcast(new Intent("LightSensorBackgroundScanRateIntent"));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ boolean m19881j2(Preference preference, Object obj) {
        getActivity().sendBroadcast(new Intent("LocUpdateRateIntent"));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ boolean m19883k2(Preference preference) {
        if (ContextCompat.checkSelfPermission(getActivity(), "android.permission.CAMERA") == 0) {
            return true;
        }
        requestPermissions(new String[]{"android.permission.CAMERA"}, 11);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ boolean m19884l2(ListPreference listPreference, Preference preference, Object obj) {
        int intValue = Integer.valueOf(obj.toString()).intValue();
        C5163j2.m19982H4(requireContext(), intValue);
        listPreference.setSummary(getString(intValue == C4023j0.f10422a ? C17541R$string.magic_text_curly_brackets : C17541R$string.magic_text_square_brackets));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ boolean m19886m2(Preference preference) {
        m19915y1();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ boolean m19889n2(Preference preference) {
        C4072w0.m16081e(getActivity());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ boolean m19892o2(Preference preference, Preference preference2) {
        new C5143b(preference).start();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ boolean m19895p2(Preference preference) {
        startActivity(new Intent(getActivity(), PrivacyActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ boolean m19898q2(Preference preference) {
        C6417p1.m24714a(requireContext());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ boolean m19901r2(Preference preference) {
        startActivity(new Intent(getActivity(), QuickSettingsActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ boolean m19903s2(Preference preference) {
        startActivity(new Intent(getActivity(), QuickSettingsActivity.class));
        return true;
    }

    /* renamed from: t1 */
    private void m19904t1() {
        PackageManager packageManager = getActivity().getPackageManager();
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("preferences:picture_quality_screen");
        if (preferenceScreen == null) {
            return;
        }
        if (!packageManager.hasSystemFeature("android.hardware.camera")) {
            getPreferenceScreen().removePreference(preferenceScreen);
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
            Camera.getCameraInfo(i3, cameraInfo);
            int i4 = cameraInfo.facing;
            if (i4 == 0) {
                i = i3;
            } else if (i4 == 1) {
                i2 = i3;
            }
        }
        ListPreference listPreference = (ListPreference) findPreference("preferences:rear_camera_resolution");
        ListPreference listPreference2 = (ListPreference) findPreference("preferences:front_camera_resolution");
        if (i == -1) {
            preferenceScreen.removePreference(listPreference);
        } else {
            m19820I2(i, listPreference);
        }
        if (i2 == -1) {
            preferenceScreen.removePreference(listPreference2);
        } else {
            m19820I2(i2, listPreference2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ boolean m19905t2(Preference preference) {
        C15626c.makeText(requireContext(), C17541R$string.restore_all_help_cards_done_popup, 0).show();
        C5163j2.m20126c(requireContext());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ boolean m19907u2(Preference preference) {
        startActivity(new Intent(getActivity(), EditCategoriesActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ boolean m19909v2(Preference preference) {
        startActivity(new Intent(getActivity(), EditNotificationChannelsActivity.class));
        return true;
    }

    /* renamed from: w1 */
    private void m19910w1() {
        Preference findPreference = findPreference("preferences:gmail_account");
        if (findPreference != null) {
            try {
                String Q = C5163j2.m20040Q(requireContext());
                if (Q == null) {
                    startActivityForResult(AccountPicker.m3476b(new AccountPicker.AccountChooserOptions.Builder().mo21125b(Arrays.asList(new String[]{"com.google"})).mo21124a()), 1);
                } else {
                    findPreference.setSummary((CharSequence) new String[]{Q}[0]);
                }
            } catch (Exception unused) {
                C15626c.makeText(getActivity(), C17541R$string.macrodroid_error, 0).show();
            }
            findPreference.setOnPreferenceClickListener(new C5144c());
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("preferences:email_use_password");
        EncryptedEditTextPreference encryptedEditTextPreference = (EncryptedEditTextPreference) findPreference("preferences:email_password");
        if (encryptedEditTextPreference != null) {
            encryptedEditTextPreference.setVisible(checkBoxPreference.isChecked());
            encryptedEditTextPreference.setOnBindEditTextListener(new C5121b0(this, encryptedEditTextPreference));
            checkBoxPreference.setOnPreferenceChangeListener(new C5129d0(encryptedEditTextPreference));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static /* synthetic */ void m19911w2(ViewGroup viewGroup, ViewGroup viewGroup2, TextView textView, TextView textView2, Spinner spinner, CompoundButton compoundButton, boolean z) {
        int i = 0;
        viewGroup.setVisibility(z ? 0 : 8);
        viewGroup2.setVisibility(z ? 0 : 8);
        textView.setVisibility(z ? 0 : 8);
        textView2.setVisibility(z ? 0 : 8);
        if (!z) {
            i = 8;
        }
        spinner.setVisibility(i);
    }

    /* renamed from: x1 */
    private void m19912x1() {
        Preference findPreference = findPreference("preferences:ignore_battery_optimisations");
        if (findPreference != null) {
            if (Build.VERSION.SDK_INT < 23) {
                findPreference.setVisible(false);
            } else {
                if (getActivity().getPackageManager().queryIntentActivities(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"), 0).size() == 0) {
                    findPreference.setVisible(false);
                }
                findPreference.setOnPreferenceClickListener(new C5168k1(this));
            }
        }
        Preference findPreference2 = findPreference("preferences:helper_file");
        if (findPreference2 != null) {
            String e = C4031k.m15905e();
            if (e != null) {
                findPreference2.setSummary((CharSequence) String.format(getString(C17541R$string.helper_file_version_is_installed), new Object[]{e}));
                findPreference2.setOnPreferenceClickListener(new C5183p1(this));
            } else {
                findPreference2.setVisible(false);
            }
        }
        Preference findPreference3 = findPreference("preferences:keep_accessibility_running");
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new C5136e1(this));
        }
        ListPreference listPreference = (ListPreference) findPreference("preferences:dark_mode");
        if (listPreference != null) {
            listPreference.setOnPreferenceChangeListener(C5197u0.f12998a);
        }
        ListPreference listPreference2 = (ListPreference) findPreference("preferences:magic_text_default_brackets");
        if (listPreference2 != null) {
            listPreference2.setSummary(getString(Integer.valueOf(listPreference2.getValue()).intValue() == C4023j0.f10422a ? C17541R$string.magic_text_curly_brackets : C17541R$string.magic_text_square_brackets));
            listPreference2.setOnPreferenceChangeListener(new C5176n0(this, listPreference2));
        }
        Preference findPreference4 = findPreference("preferences:quick_settings_tiles");
        if (findPreference4 != null) {
            if (Build.VERSION.SDK_INT < 24) {
                findPreference4.setVisible(false);
            } else {
                findPreference4.setOnPreferenceClickListener(new C5174m1(this));
            }
        }
        if (findPreference4 != null) {
            if (Build.VERSION.SDK_INT < 24) {
                findPreference4.setVisible(false);
            } else {
                findPreference4.setOnPreferenceClickListener(new C5198u1(this));
            }
        }
        Preference findPreference5 = findPreference("preferences:restore_all_help_info_cards");
        if (findPreference5 != null) {
            findPreference5.setOnPreferenceClickListener(new C5118a1(this));
        }
        Preference findPreference6 = findPreference("preferences:edit_categories");
        if (findPreference6 != null) {
            findPreference6.setOnPreferenceClickListener(new C5122b1(this));
        }
        Preference findPreference7 = findPreference("preferences:notification_channels");
        if (findPreference7 != null) {
            if (Build.VERSION.SDK_INT < 26) {
                findPreference7.setVisible(false);
            } else {
                findPreference7.setOnPreferenceClickListener(new C5186q1(this));
            }
        }
        Preference findPreference8 = findPreference("preferences:edit_custom_modes");
        if (findPreference8 != null) {
            findPreference8.setOnPreferenceClickListener(new C5177n1(this));
        }
        ListPreference listPreference3 = (ListPreference) findPreference("preferences:texttospeech_engine");
        if (listPreference3 != null) {
            TextToSpeech textToSpeech = new TextToSpeech(getContext().getApplicationContext(), (TextToSpeech.OnInitListener) null);
            this.f12912c = textToSpeech;
            List<TextToSpeech.EngineInfo> engines = textToSpeech.getEngines();
            int size = engines.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[engines.size()];
            String g2 = C5163j2.m20161g2(getContext());
            if (g2 == null) {
                g2 = this.f12912c.getDefaultEngine();
            }
            int i = 0;
            for (int i2 = 0; i2 < engines.size(); i2++) {
                strArr[i2] = engines.get(i2).label;
                strArr2[i2] = engines.get(i2).name;
                if (TextUtils.equals(g2, strArr2[i2])) {
                    i = i2;
                }
            }
            listPreference3.setEntries((CharSequence[]) strArr);
            listPreference3.setEntryValues((CharSequence[]) strArr2);
            if (size > 0) {
                listPreference3.setValueIndex(i);
            }
            listPreference3.setOnPreferenceChangeListener(new C5139f0(this));
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("preferences:use_inbox_incoming_sms");
        if (checkBoxPreference != null) {
            checkBoxPreference.setOnPreferenceChangeListener(new C5142a());
        }
        EditTextPreference editTextPreference = (EditTextPreference) findPreference("preferences:smtp_password");
        if (editTextPreference != null) {
            editTextPreference.setOnBindEditTextListener(new C5137e2(this, editTextPreference));
        }
        EditTextPreference editTextPreference2 = (EditTextPreference) findPreference("preferences:power_button_toggle_timeout");
        if (editTextPreference2 != null) {
            editTextPreference2.setOnBindEditTextListener(C5125c0.f12866a);
        }
        ListPreference listPreference4 = (ListPreference) findPreference("preferences:spoken_langugage");
        if (listPreference4 != null) {
            listPreference4.setOnPreferenceClickListener(new C5213z0(this));
            listPreference4.setEnabled(false);
            this.f12911a = new TextToSpeech(MacroDroidApplication.m14845u(), new C5119a2(this, listPreference4));
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("preferences:photos_in_gallery");
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.setOnPreferenceChangeListener(C5188r0.f12986a);
        }
        Preference findPreference9 = findPreference("preferences:hidden_microphone_recording");
        if (findPreference9 != null) {
            findPreference9.setOnPreferenceChangeListener(C5191s0.f12990a);
        }
        Preference findPreference10 = findPreference("preferences:flip_device_screen_off");
        if (findPreference10 != null) {
            findPreference10.setOnPreferenceClickListener(new C5150g1(this));
        }
        Preference findPreference11 = findPreference("preferences:weather_location");
        if (findPreference11 != null) {
            findPreference11.setOnPreferenceClickListener(new C5130d1(this));
        }
        ListPreference listPreference5 = (ListPreference) findPreference("preferences:weather_update_rate");
        if (listPreference5 != null) {
            listPreference5.setOnPreferenceChangeListener(new C5157i0(this));
        }
        Preference findPreference12 = findPreference("preferences:sunrise_sunset_location");
        if (findPreference12 != null) {
            findPreference12.setOnPreferenceClickListener(new C5140f1(this));
        }
        if (Build.VERSION.SDK_INT != 21) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("preference:trigger_options_screen");
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) findPreference("preferences:app_launched_screen");
            if (!(preferenceGroup == null || preferenceGroup2 == null)) {
                preferenceGroup.removePreference(preferenceGroup2);
            }
        } else {
            CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) findPreference("preferences:api_22_app_launched_trigger");
            if (checkBoxPreference3 != null) {
                checkBoxPreference3.setOnPreferenceChangeListener(new C5149g0(this));
            }
        }
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) findPreference("preferences:proximity_sensor_screen_off");
        if (checkBoxPreference4 != null) {
            checkBoxPreference4.setOnPreferenceChangeListener(C5200v0.f13006a);
        }
        ListPreference listPreference6 = (ListPreference) findPreference("preferences:force_language");
        if (listPreference6 != null) {
            String[] stringArray = getResources().getStringArray(C17525R$array.languages);
            String[] stringArray2 = getResources().getStringArray(C17525R$array.languages_codes);
            int length = stringArray.length;
            C5147f[] fVarArr = new C5147f[length];
            for (int i3 = 0; i3 < stringArray.length; i3++) {
                fVarArr[i3] = new C5147f(stringArray[i3], stringArray2[i3]);
            }
            Arrays.sort(fVarArr);
            String[] strArr3 = new String[(length + 1)];
            strArr3[0] = getString(C17541R$string.system_default);
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                strArr3[i5] = fVarArr[i4].f12926a;
                i4 = i5;
            }
            listPreference6.setEntries((CharSequence[]) strArr3);
            listPreference6.setEntryValues((CharSequence[]) strArr3);
            listPreference6.setOnPreferenceChangeListener(new C5185q0(this, strArr3, fVarArr));
            if (listPreference6.getValue() == null) {
                listPreference6.setValueIndex(0);
            }
        }
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) findPreference("auto_translate_templates");
        if (checkBoxPreference5 != null) {
            Locale F0 = C5163j2.m19963F0(getActivity());
            if (!F0.getLanguage().startsWith("es") || !F0.getLanguage().startsWith("ja")) {
                checkBoxPreference5.setSummary((int) C17541R$string.auto_translate_foreign_templates_to_english);
            }
        }
        Preference findPreference13 = findPreference("preferences:donate");
        if (findPreference13 != null) {
            findPreference13.setOnPreferenceClickListener(new C5171l1(this));
        }
        Preference findPreference14 = findPreference("preferences:twitter");
        if (findPreference14 != null) {
            findPreference14.setOnPreferenceClickListener(new C5180o1(this));
        }
        Preference findPreference15 = findPreference("preferences:facebook");
        if (findPreference15 != null) {
            findPreference15.setVisible(false);
        }
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra("LaunchFacebook", false);
        boolean booleanExtra2 = getActivity().getIntent().getBooleanExtra("LaunchTwitter", false);
        if (!booleanExtra && booleanExtra2) {
            C7960a.m33246i(getActivity(), (C7960a.C7961a) null);
        }
        ListPreference listPreference7 = (ListPreference) findPreference("preferences:shake_sensitivity");
        if (listPreference7 != null) {
            listPreference7.setOnPreferenceChangeListener(C5194t0.f12993a);
        }
        ListPreference listPreference8 = (ListPreference) findPreference("preferences:shake_detect_frequency");
        if (listPreference8 != null) {
            listPreference8.setOnPreferenceChangeListener(C5210y0.f13018a);
        }
        Preference findPreference16 = findPreference("preferences:shake_screen_off");
        if (findPreference16 != null) {
            findPreference16.setOnPreferenceChangeListener(C5206x0.f13013a);
        }
        ListPreference listPreference9 = (ListPreference) findPreference("preferences:cell_tower_update_rate");
        if (listPreference9 != null) {
            listPreference9.setOnPreferenceChangeListener(new C5153h0(this));
        }
        ListPreference listPreference10 = (ListPreference) findPreference("preferences:activity_recognition_update_rate");
        if (listPreference10 != null) {
            listPreference10.setOnPreferenceChangeListener(new C5167k0(this));
        }
        ListPreference listPreference11 = (ListPreference) findPreference("preferences:wifi_background_scan_rate");
        if (listPreference11 != null) {
            listPreference11.setOnPreferenceChangeListener(new C5135e0(this));
        }
        ListPreference listPreference12 = (ListPreference) findPreference("preferences:light_sensor_bg_update_rate");
        if (listPreference12 != null) {
            listPreference12.setOnPreferenceChangeListener(new C5173m0(this));
        }
        ListPreference listPreference13 = (ListPreference) findPreference("preferences:location_update_rate_seconds");
        if (listPreference13 != null) {
            listPreference13.setOnPreferenceChangeListener(new C5161j0(this));
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("preferences:picture_quality_screen");
        if (preferenceScreen != null) {
            preferenceScreen.setOnPreferenceClickListener(new C5162j1(this));
        }
        String str = this.f12913d;
        if (str != null && str.equals("preferences:picture_quality_screen")) {
            try {
                m19904t1();
            } catch (RuntimeException e2) {
                C8151a.m33873n(new RuntimeException("PreferencesFragment: Runtime exception calling configureCameraOptions: " + e2.getMessage()));
            }
        }
        Preference findPreference17 = findPreference("preferences:password_protect");
        if (findPreference17 != null) {
            findPreference17.setOnPreferenceClickListener(new C5158i1(this));
        }
        Preference findPreference18 = findPreference("preferences:pebble_install_watchapp");
        if (findPreference18 != null) {
            if (!C4031k.m15911k()) {
                getPreferenceScreen().removePreference(findPreference18);
            }
            findPreference18.setOnPreferenceClickListener(new C5189r1(this));
        }
        Preference findPreference19 = findPreference("preferences:remove_helper_file");
        if (findPreference19 != null) {
            findPreference19.setOnPreferenceClickListener(new C5201v1(this, findPreference19));
        }
        if (!C4061t1.m15979Y() && findPreference19 != null) {
            getPreferenceScreen().removePreference(findPreference19);
        }
        Preference findPreference20 = findPreference("preferences:privacy_policy");
        if (findPreference20 != null) {
            findPreference20.setOnPreferenceClickListener(new C5195t1(this));
        }
        Preference findPreference21 = findPreference("preferences:export_preferences");
        if (findPreference21 != null) {
            getPreferenceScreen().removePreference(findPreference21);
        }
        Preference findPreference22 = findPreference("preferences:uninstall");
        if (findPreference22 != null) {
            findPreference22.setOnPreferenceClickListener(new C5126c1(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void m19913x2(SwitchCompat switchCompat, EditText editText, Button button, SwitchCompat switchCompat2, int[] iArr, Spinner spinner, AppCompatDialog appCompatDialog, View view) {
        if (switchCompat.isChecked()) {
            C5163j2.m20073U4(getActivity(), editText.getText().toString());
        } else {
            C5163j2.m20073U4(getActivity(), "");
            button.requestFocus();
        }
        C5163j2.m20218n3(getActivity(), switchCompat2.isChecked());
        if (switchCompat2.isChecked()) {
            BiometricPromptCompat.Companion.init((Runnable) null);
        }
        C5163j2.m20080V4(getActivity(), iArr[spinner.getSelectedItemPosition()]);
        m19817H2(!switchCompat.isChecked());
        appCompatDialog.cancel();
    }

    /* renamed from: y1 */
    private void m19915y1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(getActivity(), C17542R$style.Theme_App_Dialog_Settings);
        appCompatDialog.setContentView((int) C17535R$layout.password_entry_dialog);
        appCompatDialog.setTitle((int) C17541R$string.configure_password);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.password_entry_dialog_password);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.password_entry_dialog_confirm);
        SwitchCompat switchCompat = (SwitchCompat) appCompatDialog.findViewById(C17532R$id.password_entry_dialog_switch);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.password_entry_passwords_layout);
        ViewGroup viewGroup2 = (ViewGroup) appCompatDialog.findViewById(2131362057);
        SwitchCompat switchCompat2 = (SwitchCompat) appCompatDialog.findViewById(C17532R$id.enable_biometrics_switch);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.password_warning_text);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.passwordDelaySpinner);
        int[] intArray = requireContext().getResources().getIntArray(C17525R$array.password_protection_delay_values_seconds);
        int g1 = C5163j2.m20160g1(requireContext());
        TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.passwordDelayLabel);
        int i = 0;
        while (true) {
            if (i >= intArray.length) {
                i = 0;
                break;
            } else if (g1 == intArray[i]) {
                break;
            } else {
                i++;
            }
        }
        spinner.setSelection(i);
        int[] iArr = intArray;
        Spinner spinner2 = spinner;
        C5131d2 d2Var = r3;
        TextView textView3 = textView2;
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        TextView textView4 = textView;
        C5131d2 d2Var2 = new C5131d2(viewGroup, viewGroup2, textView, textView3, spinner2);
        switchCompat.setOnCheckedChangeListener(d2Var);
        String f1 = C5163j2.m20152f1(getActivity());
        boolean z = !TextUtils.isEmpty(f1);
        if (z) {
            switchCompat.setChecked(true);
            editText.setText(f1);
            editText2.setText(f1);
            button.setEnabled(true);
        } else {
            switchCompat.setChecked(false);
            button.setEnabled(false);
        }
        viewGroup.setVisibility(z ? 0 : 8);
        viewGroup2.setVisibility(z ? 0 : 8);
        textView4.setVisibility(z ? 0 : 8);
        textView3.setVisibility(z ? 0 : 8);
        Spinner spinner3 = spinner2;
        spinner3.setVisibility(z ? 0 : 8);
        switchCompat2.setChecked(C5163j2.m20222o(getActivity()));
        button.setOnClickListener(new C5127c2(this, switchCompat, editText, button2, switchCompat2, iArr, spinner3, appCompatDialog2));
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button2.setOnClickListener(new C5123b2(appCompatDialog3));
        editText.addTextChangedListener(new C5145d(button, editText, editText2));
        editText2.addTextChangedListener(new C5146e(button, editText, editText2));
        appCompatDialog3.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public /* synthetic */ CharSequence m19917z1(EditText editText, Preference preference) {
        return m19814G2(editText.getText().toString().length());
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ boolean m19918z2(Preference preference, Preference preference2, Object obj) {
        String str = (String) obj;
        preference.setSummary((CharSequence) str);
        C6383g0.m24633d(getActivity()).mo32430i(str);
        return true;
    }

    public Fragment getCallbackFragment() {
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            Preference findPreference = findPreference("preferences:gmail_account");
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("authAccount");
                C6383g0.m24633d(getActivity()).mo32430i(stringExtra);
                if (stringExtra != null) {
                    C5163j2.m20002K3(requireContext(), stringExtra);
                    findPreference.setSummary((CharSequence) stringExtra);
                }
            } else {
                String Q = C5163j2.m20040Q(getActivity());
                if (Q != null) {
                    C5163j2.m20002K3(requireContext(), Q);
                    findPreference.setSummary((CharSequence) Q);
                }
            }
            Account[] accountsByType = AccountManager.get(getActivity()).getAccountsByType("com.google");
            String[] strArr = new String[accountsByType.length];
            for (int i3 = 0; i3 < accountsByType.length; i3++) {
                strArr[i3] = accountsByType[i3].name;
            }
            findPreference.setOnPreferenceChangeListener(new C5179o0(this, findPreference));
        } else if (i == 2) {
            if (i2 == -1) {
                double doubleExtra = intent.getDoubleExtra("Latitude", 0.0d);
                double doubleExtra2 = intent.getDoubleExtra("Longitude", 0.0d);
                FragmentActivity requireActivity = requireActivity();
                C5163j2.m20205l6(requireActivity, "lat=" + doubleExtra + "&lon=" + doubleExtra2);
            }
        } else if (i == 3 && i2 == -1) {
            double doubleExtra3 = intent.getDoubleExtra("Latitude", 0.0d);
            double doubleExtra4 = intent.getDoubleExtra("Longitude", 0.0d);
            Context context = getContext();
            C5163j2.m20067T5(context, doubleExtra3 + "," + doubleExtra4);
        }
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        int i;
        this.f12913d = str;
        if (str == null || !str.equals("preferences:screen_gmail_settings")) {
            setPreferencesFromResource(C17543R$xml.preferences, str);
            m19912x1();
        } else {
            setPreferencesFromResource(C17543R$xml.preferences_gmail_settings, str);
            m19910w1();
        }
        Bundle arguments = getArguments();
        if (arguments != null && (i = arguments.getInt("shortcut", 0)) > 0) {
            if (i == 2) {
                setPreferenceScreen((PreferenceScreen) findPreference("preferences:screen_smtp_settings"));
            } else if (i == 3) {
                setPreferenceScreen((PreferenceScreen) findPreference("preferences:media_button_v2_trigger"));
            } else if (i == 4) {
                setPreferenceScreen((PreferenceScreen) findPreference("preferences:screen_speak_text_action"));
            } else if (i == 5) {
                setPreferenceScreen((PreferenceScreen) findPreference("preferences:read_screen_contents_trigger"));
            }
        }
    }

    public void onDestroy() {
        TextToSpeech textToSpeech = this.f12911a;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.f12911a = null;
        }
        TextToSpeech textToSpeech2 = this.f12912c;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
            this.f12912c = null;
        }
        super.onDestroy();
    }

    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof PreferenceFragmentCompat.OnPreferenceStartScreenCallback) {
            ((PreferenceFragmentCompat.OnPreferenceStartScreenCallback) parentFragment).onPreferenceStartScreen(this, preferenceScreen);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 10) {
            if (i == 11 && iArr[0] == 0) {
                m19904t1();
            }
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr[0] == 0) {
            m19910w1();
        }
    }
}
