package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.os.Bundle;
import android.os.Handler;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* compiled from: HelperSystemCommands.kt */
public final class HelperSystemCommands {

    /* renamed from: a */
    public static final HelperSystemCommands f14941a = new HelperSystemCommands();

    /* renamed from: b */
    private static int f14942b;

    /* renamed from: com.arlosoft.macrodroid.utils.HelperSystemCommands$a */
    /* compiled from: HelperSystemCommands.kt */
    public interface C6360a {
        /* renamed from: a */
        void mo26545a(List<? extends WifiConfiguration> list);
    }

    private HelperSystemCommands() {
    }

    /* renamed from: b */
    public static final void m24579b(Context context, C6360a aVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "wifiNetworksHandler");
        Intent intent = new Intent("com.arlosoft.macrodroid.helper.COMMAND");
        intent.putExtra("request_id", f14941a.mo32410a());
        intent.putExtra("command_type", "get_wifi_networks");
        context.sendOrderedBroadcast(intent, (String) null, new HelperSystemCommands$getWifiNetworks$1(aVar), new Handler(), -1, (String) null, (Bundle) null);
    }

    /* renamed from: c */
    public static final void m24580c(Context context, int i) {
        C13706o.m87929f(context, "context");
        Intent intent = new Intent("com.arlosoft.macrodroid.helper.COMMAND");
        intent.putExtra("request_id", f14941a.mo32410a());
        intent.putExtra("command_type", "set_camera_enabled_state");
        intent.putExtra("set_camera_enabled_state_value", i);
        context.sendBroadcast(intent);
    }

    /* renamed from: d */
    public static final int m24581d(Context context, String str, int i, boolean z, String str2) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "shellScript");
        C13706o.m87929f(str2, "macroName");
        int a = f14941a.mo32410a();
        Intent intent = new Intent("com.arlosoft.macrodroid.helper.COMMAND");
        intent.putExtra("request_id", a);
        intent.putExtra("command_type", "shell_script");
        intent.putExtra("shell_command", str);
        intent.putExtra("shell_timeout_seconds", i);
        intent.putExtra("shell_use_root", z);
        intent.putExtra("macro_name", str2);
        context.sendBroadcast(intent);
        return a;
    }

    /* renamed from: e */
    public static final void m24582e(Context context, String str, String str2, String str3, String str4) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "settingType");
        C13706o.m87929f(str2, "valueType");
        C13706o.m87929f(str3, "settingKey");
        C13706o.m87929f(str4, "value");
        Intent intent = new Intent("com.arlosoft.macrodroid.helper.COMMAND");
        intent.putExtra("request_id", f14941a.mo32410a());
        intent.putExtra("command_type", "set_system_setting");
        intent.putExtra("setting_type", str);
        intent.putExtra("setting_value_type", str2);
        intent.putExtra("setting_key", str3);
        intent.putExtra("setting_value", str4);
        context.sendBroadcast(intent);
    }

    /* renamed from: f */
    public static final void m24583f(Context context, String str, String str2) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "ssid");
        C13706o.m87929f(str2, "macroName");
        Intent intent = new Intent("com.arlosoft.macrodroid.helper.COMMAND");
        intent.putExtra("request_id", f14941a.mo32410a());
        intent.putExtra("command_type", "set_wifi");
        intent.putExtra("macro_name", str2);
        intent.putExtra("wifi_state", 3);
        intent.putExtra("network_ssid", str);
        context.sendBroadcast(intent);
    }

    /* renamed from: g */
    public static final void m24584g(Context context, boolean z, String str) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "macroName");
        Intent intent = new Intent("com.arlosoft.macrodroid.helper.COMMAND");
        intent.putExtra("request_id", f14941a.mo32410a());
        intent.putExtra("command_type", "set_wifi");
        intent.putExtra("macro_name", str);
        intent.putExtra("wifi_state", z ? 1 : 0);
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public final int mo32410a() {
        int i = f14942b;
        f14942b = i + 1;
        return i;
    }
}
