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

public class WidgetProviderBar extends AppWidgetProvider {
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int updateAppWidget : iArr) {
            Intent intent = new Intent(context, WidgetPressedService.class);
            intent.setAction(WidgetPressedTrigger.m23713n3()[1]);
            int i = C6368b1.f14959b;
            PendingIntent service = PendingIntent.getService(context, 1000, intent, i | 134217728);
            Intent intent2 = new Intent(context, WidgetPressedService.class);
            intent2.setAction(WidgetPressedTrigger.m23713n3()[2]);
            PendingIntent service2 = PendingIntent.getService(context, 1000, intent2, i | 134217728);
            Intent intent3 = new Intent(context, WidgetPressedService.class);
            intent3.setAction(WidgetPressedTrigger.m23713n3()[4]);
            PendingIntent service3 = PendingIntent.getService(context, 1000, intent3, i | 134217728);
            Intent intent4 = new Intent(context, WidgetPressedService.class);
            intent4.setAction(WidgetPressedTrigger.m23713n3()[3]);
            PendingIntent service4 = PendingIntent.getService(context, 1000, intent4, i | 134217728);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C17535R$layout.widget_button_bar);
            remoteViews.setOnClickPendingIntent(C17532R$id.widget_button_1, service);
            remoteViews.setOnClickPendingIntent(C17532R$id.widget_button_2, service2);
            remoteViews.setOnClickPendingIntent(C17532R$id.widget_button_3, service3);
            remoteViews.setOnClickPendingIntent(C17532R$id.widget_button_4, service4);
            remoteViews.setImageViewResource(C17532R$id.widget_button_1, C17530R$drawable.green_widget);
            remoteViews.setImageViewResource(C17532R$id.widget_button_2, C17530R$drawable.blue_widget);
            remoteViews.setImageViewResource(C17532R$id.widget_button_3, C17530R$drawable.yellow_widget);
            remoteViews.setImageViewResource(C17532R$id.widget_button_4, C17530R$drawable.red_widget);
            appWidgetManager.updateAppWidget(updateAppWidget, remoteViews);
        }
    }
}
