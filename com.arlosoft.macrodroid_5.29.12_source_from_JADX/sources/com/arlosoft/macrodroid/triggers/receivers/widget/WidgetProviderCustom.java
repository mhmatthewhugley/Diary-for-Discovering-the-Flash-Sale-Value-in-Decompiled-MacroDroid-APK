package com.arlosoft.macrodroid.triggers.receivers.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.C6395j0;
import java.util.ArrayList;

public class WidgetProviderCustom extends AppWidgetProvider {
    /* renamed from: a */
    private static void m24070a(Context context, int i, AppWidgetManager appWidgetManager) {
        Context context2 = context;
        int i2 = i;
        Intent intent = new Intent(context2, WidgetPressedService.class);
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        sb.append(WidgetPressedTrigger.m23713n3()[0]);
        sb.append(",");
        sb.append(i2);
        intent.setAction(sb.toString());
        PendingIntent service = PendingIntent.getService(context2, 1000, intent, C6368b1.f14959b | 134217728);
        String W1 = MacroDroidWidgetConfigureActivity.m24055W1(context, i);
        int Y1 = MacroDroidWidgetConfigureActivity.m24057Y1(context, i);
        String a2 = MacroDroidWidgetConfigureActivity.m24059a2(context, i);
        String X1 = MacroDroidWidgetConfigureActivity.m24056X1(context, i);
        String Z1 = MacroDroidWidgetConfigureActivity.m24058Z1(context, i);
        boolean V1 = MacroDroidWidgetConfigureActivity.m24054V1(context, i);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C17535R$layout.custom_widget_layout);
        remoteViews.setViewVisibility(C17532R$id.custom_widget_button_faded, V1 ? 0 : 8);
        if (V1) {
            i3 = 8;
        }
        remoteViews.setViewVisibility(C17532R$id.custom_widget_button, i3);
        C6395j0.m24651c(context, remoteViews, V1 ? C17532R$id.custom_widget_button_faded : C17532R$id.custom_widget_button, W1, X1, Y1, Z1, (Integer) null);
        remoteViews.setTextViewText(C17532R$id.custom_widget_label, a2);
        remoteViews.setOnClickPendingIntent(C17532R$id.custom_widget_button, service);
        remoteViews.setOnClickPendingIntent(C17532R$id.custom_widget_button_faded, service);
        try {
            appWidgetManager.updateAppWidget(i2, remoteViews);
        } catch (Exception e) {
            Exception exc = e;
            C4878b.m18868g("Failed to update custom widget, maybe bitmap is too large?: " + exc.toString());
        }
    }

    /* renamed from: b */
    private void m24071b(Context context, AppWidgetManager appWidgetManager, int[] iArr, Object obj) {
        for (int a : iArr) {
            m24070a(context, a, appWidgetManager);
        }
    }

    /* renamed from: c */
    static void m24072c(Context context, AppWidgetManager appWidgetManager, int i, String str, int i2, String str2, String str3, Uri uri) {
        m24070a(context, i, appWidgetManager);
    }

    /* renamed from: d */
    public static void m24073d(@NonNull Context context, @Nullable Parcelable parcelable, long j, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, WidgetProviderCustom.class));
        for (int i = 0; i < appWidgetIds.length; i++) {
            if (MacroDroidWidgetConfigureActivity.m24060b2(context, appWidgetIds[i]) == j) {
                MacroDroidWidgetConfigureActivity.m24066h2(context, appWidgetIds[i], str);
                MacroDroidWidgetConfigureActivity.m24062d2(context, appWidgetIds[i], str2);
                MacroDroidWidgetConfigureActivity.m24063e2(context, appWidgetIds[i], str3);
                MacroDroidWidgetConfigureActivity.m24065g2(context, appWidgetIds[i], str4);
                MacroDroidWidgetConfigureActivity.m24061c2(context, appWidgetIds[i], z);
                m24070a(context, appWidgetIds[i], instance);
            }
        }
    }

    public void onDeleted(Context context, int[] iArr) {
        for (int U1 : iArr) {
            MacroDroidWidgetConfigureActivity.m24053U1(context, U1);
        }
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent.getExtras() != null) {
            ArrayList<Integer> integerArrayList = intent.getExtras().getIntegerArrayList("widget_ids");
            String stringExtra = intent.getStringExtra("widget_label");
            String stringExtra2 = intent.getStringExtra("resource_name");
            String stringExtra3 = intent.getStringExtra("package_name");
            String stringExtra4 = intent.getStringExtra("image_uri");
            boolean booleanExtra = intent.getBooleanExtra("image_faded", false);
            if (integerArrayList != null) {
                int[] iArr = new int[integerArrayList.size()];
                for (int i = 0; i < integerArrayList.size(); i++) {
                    iArr[i] = integerArrayList.get(i).intValue();
                    MacroDroidWidgetConfigureActivity.m24066h2(context, iArr[i], stringExtra);
                    MacroDroidWidgetConfigureActivity.m24062d2(context, iArr[i], stringExtra2);
                    MacroDroidWidgetConfigureActivity.m24063e2(context, iArr[i], stringExtra3);
                    MacroDroidWidgetConfigureActivity.m24065g2(context, iArr[i], stringExtra4);
                    MacroDroidWidgetConfigureActivity.m24061c2(context, iArr[i], booleanExtra);
                }
                m24071b(context, AppWidgetManager.getInstance(context), iArr, (Object) null);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        m24071b(context, appWidgetManager, iArr, (Object) null);
    }
}
