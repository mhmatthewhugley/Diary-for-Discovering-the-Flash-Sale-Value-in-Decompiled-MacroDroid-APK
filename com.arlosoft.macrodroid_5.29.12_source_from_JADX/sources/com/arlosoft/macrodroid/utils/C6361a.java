package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.utils.a */
/* compiled from: ActivityUtils */
public class C6361a {
    /* renamed from: a */
    public static Context m24594a(Context context, Activity activity) {
        Locale c = MacroDroidApplication.f9883I.mo27304c();
        if (c == null) {
            return context;
        }
        Locale.setDefault(c);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(c);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        activity.applyOverrideConfiguration(configuration);
        return createConfigurationContext;
    }
}
