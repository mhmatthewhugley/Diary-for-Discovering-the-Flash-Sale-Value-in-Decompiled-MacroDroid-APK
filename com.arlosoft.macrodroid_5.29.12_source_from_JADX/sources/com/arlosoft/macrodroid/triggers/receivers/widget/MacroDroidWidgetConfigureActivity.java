package com.arlosoft.macrodroid.triggers.receivers.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import java.util.ArrayList;
import java.util.Iterator;

public class MacroDroidWidgetConfigureActivity extends MacroDroidBaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f14395o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ArrayList<Macro> f14396p;

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity$a */
    public class C6080a extends BaseAdapter {
        public C6080a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m24069b(WidgetPressedTrigger widgetPressedTrigger, Macro macro, String str, String str2, Uri uri, View view) {
            MacroDroidWidgetConfigureActivity macroDroidWidgetConfigureActivity = MacroDroidWidgetConfigureActivity.this;
            MacroDroidWidgetConfigureActivity.m24066h2(macroDroidWidgetConfigureActivity, macroDroidWidgetConfigureActivity.f14395o, widgetPressedTrigger.mo31654g3());
            MacroDroidWidgetConfigureActivity macroDroidWidgetConfigureActivity2 = MacroDroidWidgetConfigureActivity.this;
            MacroDroidWidgetConfigureActivity.m24064f2(macroDroidWidgetConfigureActivity2, macroDroidWidgetConfigureActivity2.f14395o, widgetPressedTrigger.mo31656i3());
            MacroDroidWidgetConfigureActivity macroDroidWidgetConfigureActivity3 = MacroDroidWidgetConfigureActivity.this;
            MacroDroidWidgetConfigureActivity.m24062d2(macroDroidWidgetConfigureActivity3, macroDroidWidgetConfigureActivity3.f14395o, widgetPressedTrigger.mo31655h3());
            MacroDroidWidgetConfigureActivity macroDroidWidgetConfigureActivity4 = MacroDroidWidgetConfigureActivity.this;
            MacroDroidWidgetConfigureActivity.m24063e2(macroDroidWidgetConfigureActivity4, macroDroidWidgetConfigureActivity4.f14395o, widgetPressedTrigger.mo31658k3());
            MacroDroidWidgetConfigureActivity macroDroidWidgetConfigureActivity5 = MacroDroidWidgetConfigureActivity.this;
            MacroDroidWidgetConfigureActivity.m24067i2(macroDroidWidgetConfigureActivity5, macroDroidWidgetConfigureActivity5.f14395o, macro.getGUID());
            if (widgetPressedTrigger.mo31657j3() != null) {
                MacroDroidWidgetConfigureActivity macroDroidWidgetConfigureActivity6 = MacroDroidWidgetConfigureActivity.this;
                MacroDroidWidgetConfigureActivity.m24065g2(macroDroidWidgetConfigureActivity6, macroDroidWidgetConfigureActivity6.f14395o, widgetPressedTrigger.mo31657j3().toString());
            }
            AppWidgetManager instance = AppWidgetManager.getInstance(MacroDroidWidgetConfigureActivity.this);
            MacroDroidWidgetConfigureActivity macroDroidWidgetConfigureActivity7 = MacroDroidWidgetConfigureActivity.this;
            WidgetProviderCustom.m24072c(macroDroidWidgetConfigureActivity7, instance, macroDroidWidgetConfigureActivity7.f14395o, widgetPressedTrigger.mo31659l3(), widgetPressedTrigger.mo31656i3(), str, str2, uri);
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", MacroDroidWidgetConfigureActivity.this.f14395o);
            MacroDroidWidgetConfigureActivity.this.setResult(-1, intent);
            MacroDroidWidgetConfigureActivity.this.finish();
        }

        public int getCount() {
            return MacroDroidWidgetConfigureActivity.this.f14396p.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX WARNING: type inference failed for: r0v10, types: [com.arlosoft.macrodroid.triggers.Trigger] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r16, android.view.View r17, android.view.ViewGroup r18) {
            /*
                r15 = this;
                r7 = r15
                r0 = 0
                if (r17 != 0) goto L_0x0017
                com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity r1 = com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity.this
                java.lang.String r2 = "layout_inflater"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
                r2 = 2131558526(0x7f0d007e, float:1.874237E38)
                android.view.View r1 = r1.inflate(r2, r0)
                r8 = r1
                goto L_0x0019
            L_0x0017:
                r8 = r17
            L_0x0019:
                com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity r1 = com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity.this
                java.util.ArrayList r1 = r1.f14396p
                r2 = r16
                java.lang.Object r1 = r1.get(r2)
                r3 = r1
                com.arlosoft.macrodroid.macro.Macro r3 = (com.arlosoft.macrodroid.macro.Macro) r3
                java.util.ArrayList r1 = r3.getTriggerListWithAwaitingActions()
                java.util.Iterator r1 = r1.iterator()
                r2 = r0
            L_0x0031:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x0045
                java.lang.Object r0 = r1.next()
                com.arlosoft.macrodroid.triggers.Trigger r0 = (com.arlosoft.macrodroid.triggers.Trigger) r0
                boolean r4 = r0 instanceof com.arlosoft.macrodroid.triggers.WidgetPressedTrigger
                if (r4 == 0) goto L_0x0031
                r2 = r0
                com.arlosoft.macrodroid.triggers.WidgetPressedTrigger r2 = (com.arlosoft.macrodroid.triggers.WidgetPressedTrigger) r2
                goto L_0x0031
            L_0x0045:
                r0 = 2131362432(0x7f0a0280, float:1.8344644E38)
                android.view.View r0 = r8.findViewById(r0)
                r10 = r0
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                r0 = 2131362433(0x7f0a0281, float:1.8344646E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1 = 2131362431(0x7f0a027f, float:1.8344642E38)
                android.view.View r1 = r8.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r4 = r2.mo31655h3()
                java.lang.String r5 = r2.mo31658k3()
                android.net.Uri r6 = r2.mo31657j3()
                com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity r9 = com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity.this
                r13 = -1
                r11 = r4
                r12 = r5
                r14 = r6
                com.arlosoft.macrodroid.utils.C6395j0.m24649a(r9, r10, r11, r12, r13, r14)
                java.lang.String r9 = r2.mo31659l3()
                r0.setText(r9)
                java.lang.String r0 = r3.getName()
                r1.setText(r0)
                o3.a r9 = new o3.a
                r0 = r9
                r1 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.setOnClickListener(r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity.C6080a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: U1 */
    static void m24053U1(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.remove("imageResource_" + i);
        edit.remove("label_" + i);
        edit.remove("macro_" + i);
        edit.remove("imageResourceName_" + i);
        edit.remove("imageResourcePackage_" + i);
        edit.apply();
    }

    /* renamed from: V1 */
    static boolean m24054V1(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0);
        return sharedPreferences.getBoolean("imageFaded_" + i, false);
    }

    /* renamed from: W1 */
    static String m24055W1(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0);
        return sharedPreferences.getString("imageResourceName_" + i, (String) null);
    }

    /* renamed from: X1 */
    static String m24056X1(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0);
        return sharedPreferences.getString("imageResourcePackage_" + i, (String) null);
    }

    /* renamed from: Y1 */
    static int m24057Y1(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0);
        return sharedPreferences.getInt("imageResource_" + i, 0);
    }

    /* renamed from: Z1 */
    static String m24058Z1(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0);
        return sharedPreferences.getString("imageResourceURI_" + i, (String) null);
    }

    /* renamed from: a2 */
    static String m24059a2(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0);
        String string = sharedPreferences.getString("label_" + i, (String) null);
        return string != null ? string : "Button";
    }

    /* renamed from: b2 */
    static long m24060b2(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0);
        return sharedPreferences.getLong("macro_" + i, 0);
    }

    /* renamed from: c2 */
    public static void m24061c2(Context context, int i, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.putBoolean("imageFaded_" + i, z);
        edit.apply();
    }

    /* renamed from: d2 */
    public static void m24062d2(Context context, int i, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.putString("imageResourceName_" + i, str);
        edit.apply();
    }

    /* renamed from: e2 */
    public static void m24063e2(Context context, int i, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.putString("imageResourcePackage_" + i, str);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static void m24064f2(Context context, int i, int i2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.putInt("imageResource_" + i, i2);
        edit.apply();
    }

    /* renamed from: g2 */
    public static void m24065g2(Context context, int i, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.putString("imageResourceURI_" + i, str);
        edit.apply();
    }

    /* renamed from: h2 */
    public static void m24066h2(Context context, int i, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.putString("label_" + i, str);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static void m24067i2(Context context, int i, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity", 0).edit();
        edit.putLong("macro_" + i, j);
        edit.apply();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        setContentView(C17535R$layout.custom_widget_selection);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        setTitle(C17541R$string.trigger_widget_pressed_select);
        ListView listView = (ListView) findViewById(C17532R$id.custom_widget_selection_list);
        this.f14396p = new ArrayList<>();
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof WidgetPressedTrigger) && ((WidgetPressedTrigger) next2).mo31660m3() == 4 && next2.mo31374R2()) {
                    this.f14396p.add(next);
                    next.setTriggerThatInvoked(next2);
                    break;
                }
            }
        }
        listView.setAdapter(new C6080a());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f14395o = extras.getInt("appWidgetId", 0);
        }
        if (this.f14395o == 0) {
            finish();
        }
    }
}
