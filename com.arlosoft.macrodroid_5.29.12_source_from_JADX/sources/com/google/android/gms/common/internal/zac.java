package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p007os.ConfigurationCompat;
import com.google.android.gms.base.C1733R;
import com.google.android.gms.common.C1738R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zac {

    /* renamed from: a */
    private static final SimpleArrayMap f3698a = new SimpleArrayMap();
    @Nullable

    /* renamed from: b */
    private static Locale f3699b;

    /* renamed from: a */
    public static String m4621a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.m4929a(context).mo21961d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m4622b(Context context) {
        return context.getResources().getString(C1733R.string.common_google_play_services_notification_channel_name);
    }

    @NonNull
    /* renamed from: c */
    public static String m4623c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C1733R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C1733R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C1733R.string.common_google_play_services_enable_button);
    }

    @NonNull
    /* renamed from: d */
    public static String m4624d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m4621a(context);
        if (i == 1) {
            return resources.getString(C1733R.string.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C1733R.string.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m4628h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m4628h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C1733R.string.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m4628h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m4628h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m4628h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C1733R.string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C1738R.string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (DeviceProperties.m4881g(context)) {
            return resources.getString(C1733R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C1733R.string.common_google_play_services_update_text, new Object[]{a});
        }
    }

    @NonNull
    /* renamed from: e */
    public static String m4625e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m4628h(context, "common_google_play_services_resolution_required_text", m4621a(context));
        }
        return m4624d(context, i);
    }

    @NonNull
    /* renamed from: f */
    public static String m4626f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m4629i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m4627g(context, i);
        }
        return str == null ? context.getResources().getString(C1733R.string.common_google_play_services_notification_ticker) : str;
    }

    @Nullable
    /* renamed from: g */
    public static String m4627g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C1733R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C1733R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C1733R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m4629i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m4629i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m4629i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m4629i(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    /* renamed from: h */
    private static String m4628h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m4629i(context, str);
        if (i == null) {
            i = resources.getString(C1738R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    @Nullable
    /* renamed from: i */
    private static String m4629i(Context context, String str) {
        SimpleArrayMap simpleArrayMap = f3698a;
        synchronized (simpleArrayMap) {
            Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(f3699b)) {
                simpleArrayMap.clear();
                f3699b = locale;
            }
            String str2 = (String) simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources f = GooglePlayServicesUtil.m3558f(context);
            if (f == null) {
                return null;
            }
            int identifier = f.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = f.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }
}
