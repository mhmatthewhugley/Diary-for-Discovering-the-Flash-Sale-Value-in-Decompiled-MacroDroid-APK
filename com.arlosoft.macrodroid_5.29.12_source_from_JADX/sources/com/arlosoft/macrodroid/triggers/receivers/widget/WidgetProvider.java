package com.arlosoft.macrodroid.triggers.receivers.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.utils.C6368b1;

public abstract class WidgetProvider extends AppWidgetProvider {

    /* renamed from: a */
    int f14398a;

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            Intent intent = new Intent(context, WidgetPressedService.class);
            intent.setAction(WidgetPressedTrigger.m23713n3()[this.f14398a + 1]);
            PendingIntent service = PendingIntent.getService(context, 1000, intent, 134217728 | C6368b1.f14959b);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C17535R$layout.widgetlayout);
            remoteViews.setOnClickPendingIntent(C17532R$id.widget_button, service);
            int i2 = this.f14398a;
            if (i2 == 0) {
                remoteViews.setImageViewResource(C17532R$id.widget_button, C17530R$drawable.green_widget);
            } else if (i2 == 1) {
                remoteViews.setImageViewResource(C17532R$id.widget_button, C17530R$drawable.blue_widget);
            } else if (i2 == 2) {
                remoteViews.setImageViewResource(C17532R$id.widget_button, C17530R$drawable.red_widget);
            } else if (i2 == 3) {
                remoteViews.setImageViewResource(C17532R$id.widget_button, C17530R$drawable.yellow_widget);
            }
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }
}
