package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.WorkerThread;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzv {

    /* renamed from: a */
    private final Application f39444a;

    /* renamed from: b */
    private final Handler f39445b;

    /* renamed from: c */
    private final zzam f39446c;

    /* renamed from: d */
    private final zzba f39447d;

    /* renamed from: e */
    private final zzn f39448e;

    /* renamed from: f */
    private final zzz f39449f;

    /* renamed from: g */
    private final zzh f39450g;

    @WorkerThread
    /* renamed from: c */
    private final zzbw m55981c(zzbu zzbu) throws zzj {
        JsonWriter jsonWriter;
        JsonReader jsonReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, WebSettings.getDefaultUserAgent(this.f39444a));
            httpURLConnection.setConnectTimeout(SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                String str = zzbu.f39383a;
                if (str != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str);
                }
                Boolean bool = zzbu.f39384b;
                if (bool != null) {
                    jsonWriter.name("is_lat");
                    jsonWriter.value(bool.booleanValue());
                }
                String str2 = zzbu.f39385c;
                if (str2 != null) {
                    jsonWriter.name("adid");
                    jsonWriter.value(str2);
                }
                zzbq zzbq = zzbu.f39386d;
                if (zzbq != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i = zzbq.f39373c;
                    if (i != 1) {
                        jsonWriter.name("os_type");
                        if (i != 0) {
                            zzbp zzbp = zzbp.DEBUG_PARAM_UNKNOWN;
                            if (i - 1 != 0) {
                                jsonWriter.value("ANDROID");
                            } else {
                                jsonWriter.value("UNKNOWN");
                            }
                        } else {
                            throw null;
                        }
                    }
                    String str3 = zzbq.f39371a;
                    if (str3 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str3);
                    }
                    Integer num = zzbq.f39372b;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str4 = zzbu.f39387e;
                if (str4 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str4);
                }
                Boolean bool2 = zzbu.f39388f;
                if (bool2 != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool2.booleanValue());
                }
                Map<String, String> map = zzbu.f39389g;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry next : map.entrySet()) {
                        jsonWriter.name((String) next.getKey());
                        jsonWriter.value((String) next.getValue());
                    }
                    jsonWriter.endObject();
                }
                zzbs zzbs = zzbu.f39390h;
                if (zzbs != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = zzbs.f39378a;
                    if (num2 != null) {
                        jsonWriter.name("width");
                        jsonWriter.value(num2);
                    }
                    Integer num3 = zzbs.f39379b;
                    if (num3 != null) {
                        jsonWriter.name("height");
                        jsonWriter.value(num3);
                    }
                    Double d = zzbs.f39380c;
                    if (d != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d);
                    }
                    List<zzbr> list = zzbs.f39381d;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (zzbr next2 : list) {
                            jsonWriter.beginObject();
                            Integer num4 = next2.f39374a;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = next2.f39375b;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = next2.f39376c;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = next2.f39377d;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                zzbo zzbo = zzbu.f39391i;
                if (zzbo != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str5 = zzbo.f39362a;
                    if (str5 != null) {
                        jsonWriter.name("package_name");
                        jsonWriter.value(str5);
                    }
                    String str6 = zzbo.f39363b;
                    if (str6 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str6);
                    }
                    String str7 = zzbo.f39364c;
                    if (str7 != null) {
                        jsonWriter.name(ClientCookie.VERSION_ATTR);
                        jsonWriter.value(str7);
                    }
                    jsonWriter.endObject();
                }
                zzbt zzbt = zzbu.f39392j;
                if (zzbt != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str8 = zzbt.f39382a;
                    if (str8 != null) {
                        jsonWriter.name(ClientCookie.VERSION_ATTR);
                        jsonWriter.value(str8);
                    }
                    jsonWriter.endObject();
                }
                List<zzbp> list2 = zzbu.f39393k;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    for (zzbp ordinal : list2) {
                        zzbp zzbp2 = zzbp.DEBUG_PARAM_UNKNOWN;
                        int ordinal2 = ordinal.ordinal();
                        if (ordinal2 == 0) {
                            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                        } else if (ordinal2 == 1) {
                            jsonWriter.value("ALWAYS_SHOW");
                        } else if (ordinal2 == 2) {
                            jsonWriter.value("GEO_OVERRIDE_EEA");
                        } else if (ordinal2 == 3) {
                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                        } else if (ordinal2 == 4) {
                            jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzbw a = zzbw.m55960a(new JsonReader(new StringReader(headerField)));
                        a.f39396a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return a;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        jsonReader = new JsonReader(bufferedReader);
                        zzbw a2 = zzbw.m55960a(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return a2;
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    String next3 = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                    StringBuilder sb = new StringBuilder(String.valueOf(next3).length() + 31);
                    sb.append("Http error code - ");
                    sb.append(responseCode);
                    sb.append(".\n");
                    sb.append(next3);
                    throw new IOException(sb.toString());
                }
                throw th;
                throw th;
            } catch (Throwable th2) {
                outputStreamWriter.close();
                throw th2;
            }
        } catch (SocketTimeoutException e) {
            throw new zzj(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzj(2, "Error making request.", e2);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48727a(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        Handler handler = this.f39445b;
        onConsentInfoUpdateSuccessListener.getClass();
        handler.post(new zzu(onConsentInfoUpdateSuccessListener));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo48728b(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        String str;
        try {
            ConsentDebugSettings a = consentRequestParameters.mo60048a();
            if (a == null || !a.mo60043b()) {
                String a2 = zzbx.m55961a(this.f39444a);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 95);
                sb.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                sb.append(a2);
                sb.append("\") to set this as a debug device.");
                Log.i("UserMessagingPlatform", sb.toString());
            }
            zzaa a3 = new zzy(this.f39449f, m55981c(this.f39448e.mo48721d(activity, consentRequestParameters))).mo48729a();
            this.f39446c.mo48677d(a3.f39317a);
            this.f39447d.mo48695a(a3.f39318b);
            this.f39450g.mo48718a().execute(new zzr(this, onConsentInfoUpdateSuccessListener));
        } catch (zzj e) {
            this.f39445b.post(new zzs(onConsentInfoUpdateFailureListener, e));
        } catch (RuntimeException e2) {
            String valueOf = String.valueOf(Log.getStackTraceString(e2));
            if (valueOf.length() != 0) {
                str = "Caught exception when trying to request consent info update: ".concat(valueOf);
            } else {
                str = new String("Caught exception when trying to request consent info update: ");
            }
            this.f39445b.post(new zzt(onConsentInfoUpdateFailureListener, new zzj(1, str)));
        }
    }
}
