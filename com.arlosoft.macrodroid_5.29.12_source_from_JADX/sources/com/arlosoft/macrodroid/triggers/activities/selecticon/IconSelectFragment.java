package com.arlosoft.macrodroid.triggers.activities.selecticon;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindDimen;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.events.CloseDrawerEvent;
import com.arlosoft.macrodroid.events.IconSelectedEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.templatestore.p071ui.C5274a;
import com.arlosoft.macrodroid.templatestore.p071ui.C5275b;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.arlosoft.macrodroid.utils.C6391i0;
import com.yalantis.ucrop.C11913a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p113j3.C13282e;
import p113j3.C13283f;
import p113j3.C13284g;
import p113j3.C13285h;
import p113j3.C13286i;
import p161s1.C10180a;
import p248e7.C12168a;
import p259f7.C12242b;
import p259f7.C12245e;
import p267g7.C12312a;
import p270ga.C12318a;
import p319lc.C15626c;
import p440y9.C16971a;

public class IconSelectFragment extends Fragment implements C5274a {

    /* renamed from: A */
    private C5275b f13877A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public List<C5858a> f13878B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public SelectIconAdapter f13879C;

    /* renamed from: D */
    private C5856a f13880D;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6391i0.C6392a f13881a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public RecyclerView f13882c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ProgressBar f13883d;

    /* renamed from: f */
    private Button f13884f;

    /* renamed from: g */
    private boolean f13885g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final List<Integer> f13886o = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final List<String> f13887p = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final List<String> f13888s = new ArrayList();
    @BindDimen(2131165973)
    int userIconSize;

    /* renamed from: z */
    private int f13889z;

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment$a */
    private class C5856a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final int f13890a;

        /* renamed from: b */
        private boolean f13891b = false;

        /* renamed from: c */
        private final List<Integer> f13892c;

        /* renamed from: d */
        private String f13893d;

        /* renamed from: com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment$a$a */
        class C5857a implements Runnable {
            C5857a() {
            }

            public void run() {
                IconSelectFragment.this.f13879C.mo31745L(IconSelectFragment.this.f13886o, IconSelectFragment.this.f13888s, IconSelectFragment.this.f13887p);
            }
        }

        public C5856a(Context context, int i, String str) {
            ArrayList arrayList = new ArrayList();
            this.f13892c = arrayList;
            this.f13893d = str;
            this.f13890a = i;
            Macro macro = new Macro();
            arrayList.add(Integer.valueOf(C17530R$drawable.active_icon_new));
            arrayList.add(Integer.valueOf(C17530R$drawable.active_icon_new_alternative));
            for (C4001c1 g : Trigger.m23340W2(context)) {
                int g2 = g.mo27892g();
                if (!this.f13892c.contains(Integer.valueOf(g2))) {
                    this.f13892c.add(Integer.valueOf(g2));
                }
            }
            for (C4001c1 g3 : Action.m9594Y2(context, macro, true)) {
                int g4 = g3.mo27892g();
                if (!this.f13892c.contains(Integer.valueOf(g4))) {
                    this.f13892c.add(Integer.valueOf(g4));
                }
            }
            for (C4001c1 next : Constraint.m16348X2(context, macro, false)) {
                if (!this.f13892c.contains(Integer.valueOf(next.mo27892g()))) {
                    this.f13892c.add(Integer.valueOf(next.mo27892g()));
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:95|96) */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            r10.f13891b = true;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x029c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r11) {
            /*
                r10 = this;
                java.lang.String r11 = "drawable"
                java.lang.Class<com.arlosoft.macrodroid.R$drawable> r0 = com.arlosoft.macrodroid.C17530R$drawable.class
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r1 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this
                androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
                r2 = 0
                if (r1 != 0) goto L_0x000e
                return r2
            L_0x000e:
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this
                java.util.List r3 = r3.f13886o
                r3.clear()
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this
                java.util.List r3 = r3.f13887p
                r3.clear()
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this
                java.util.List r3 = r3.f13888s
                r3.clear()
                android.content.Context r1 = r1.getApplicationContext()     // Catch:{ IllegalAccessException -> 0x035c }
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.utils.i0$a r3 = r3.f13881a     // Catch:{ IllegalAccessException -> 0x035c }
                r4 = 2
                r5 = 0
                r6 = 1
                if (r3 == 0) goto L_0x00f3
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r0 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.utils.i0$a r0 = r0.f13881a     // Catch:{ IllegalAccessException -> 0x035c }
                r0.mo32436a()     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r0 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()     // Catch:{ Exception -> 0x02f7 }
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r1 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.utils.i0$a r1 = r1.f13881a     // Catch:{ Exception -> 0x02f7 }
                java.lang.String r1 = r1.f14988a     // Catch:{ Exception -> 0x02f7 }
                android.content.res.Resources r0 = r0.getResourcesForApplication(r1)     // Catch:{ Exception -> 0x02f7 }
                java.lang.String r1 = "appfilter"
                java.lang.String r3 = "xml"
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r7 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.utils.i0$a r7 = r7.f13881a     // Catch:{ Exception -> 0x02f7 }
                java.lang.String r7 = r7.f14988a     // Catch:{ Exception -> 0x02f7 }
                int r1 = r0.getIdentifier(r1, r3, r7)     // Catch:{ Exception -> 0x02f7 }
                android.content.res.XmlResourceParser r1 = r0.getXml(r1)     // Catch:{ Exception -> 0x02f7 }
                java.util.TreeSet r3 = new java.util.TreeSet     // Catch:{ Exception -> 0x02f7 }
                r3.<init>()     // Catch:{ Exception -> 0x02f7 }
            L_0x0074:
                int r7 = r1.getEventType()     // Catch:{ XmlPullParserException -> 0x00a9 }
                if (r7 == r6) goto L_0x00ad
                int r7 = r1.getEventType()     // Catch:{ XmlPullParserException -> 0x00a9 }
                if (r7 != r4) goto L_0x00a5
                java.lang.String r7 = r1.getName()     // Catch:{ XmlPullParserException -> 0x00a9 }
                java.lang.String r8 = "item"
                boolean r7 = r7.equals(r8)     // Catch:{ XmlPullParserException -> 0x00a9 }
                if (r7 == 0) goto L_0x00a5
                java.lang.String r7 = r1.getAttributeValue(r2, r11)     // Catch:{ XmlPullParserException -> 0x00a9 }
                if (r7 == 0) goto L_0x00a5
                java.lang.String r8 = r10.f13893d     // Catch:{ XmlPullParserException -> 0x00a9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ XmlPullParserException -> 0x00a9 }
                if (r8 != 0) goto L_0x00a2
                java.lang.String r8 = r10.f13893d     // Catch:{ XmlPullParserException -> 0x00a9 }
                boolean r8 = r7.contains(r8)     // Catch:{ XmlPullParserException -> 0x00a9 }
                if (r8 == 0) goto L_0x00a5
            L_0x00a2:
                r3.add(r7)     // Catch:{ XmlPullParserException -> 0x00a9 }
            L_0x00a5:
                r1.next()     // Catch:{ XmlPullParserException -> 0x00a9 }
                goto L_0x0074
            L_0x00a9:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x02f7 }
            L_0x00ad:
                java.util.Iterator r1 = r3.iterator()     // Catch:{ Exception -> 0x02f7 }
            L_0x00b1:
                boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x02f7 }
                if (r3 == 0) goto L_0x02f7
                java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x02f7 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r4 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.utils.i0$a r4 = r4.f13881a     // Catch:{ Exception -> 0x02f7 }
                java.lang.String r4 = r4.f14988a     // Catch:{ Exception -> 0x02f7 }
                int r4 = r0.getIdentifier(r3, r11, r4)     // Catch:{ Exception -> 0x02f7 }
                if (r4 == 0) goto L_0x00b1
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r7 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                java.util.List r7 = r7.f13887p     // Catch:{ Exception -> 0x02f7 }
                r7.add(r3)     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                java.util.List r3 = r3.f13888s     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r7 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.utils.i0$a r7 = r7.f13881a     // Catch:{ Exception -> 0x02f7 }
                java.lang.String r7 = r7.f14988a     // Catch:{ Exception -> 0x02f7 }
                r3.add(r7)     // Catch:{ Exception -> 0x02f7 }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x02f7 }
                java.util.List r3 = r3.f13886o     // Catch:{ Exception -> 0x02f7 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x02f7 }
                r3.add(r4)     // Catch:{ Exception -> 0x02f7 }
                goto L_0x00b1
            L_0x00f3:
                int r11 = r10.f13890a     // Catch:{ IllegalAccessException -> 0x035c }
                if (r11 != r4) goto L_0x01a7
                java.lang.reflect.Field[] r11 = r0.getFields()     // Catch:{ IllegalAccessException -> 0x035c }
                int r0 = r11.length     // Catch:{ IllegalAccessException -> 0x035c }
                r1 = 0
            L_0x00fd:
                if (r1 >= r0) goto L_0x02f7
                r3 = r11[r1]     // Catch:{ IllegalAccessException -> 0x035c }
                int r4 = r3.getInt(r2)     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r7 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r8 = "notification_icon_"
                boolean r8 = r7.startsWith(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r8 == 0) goto L_0x0149
                java.lang.String r8 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r8 != 0) goto L_0x0121
                java.lang.String r8 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r7 = r7.contains(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r7 == 0) goto L_0x017b
            L_0x0121:
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r7 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r7 = r7.f13886o     // Catch:{ IllegalAccessException -> 0x035c }
                int r8 = r3.getInt(r2)     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                r7.add(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r7 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r7 = r7.f13887p     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r8 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                r7.add(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r7 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r7 = r7.f13888s     // Catch:{ IllegalAccessException -> 0x035c }
                r7.add(r2)     // Catch:{ IllegalAccessException -> 0x035c }
                goto L_0x017b
            L_0x0149:
                java.lang.String r8 = "not_icon"
                boolean r8 = r7.startsWith(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r8 != 0) goto L_0x017b
                java.util.List<java.lang.Integer> r8 = r10.f13892c     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ IllegalAccessException -> 0x035c }
            L_0x0157:
                boolean r9 = r8.hasNext()     // Catch:{ IllegalAccessException -> 0x035c }
                if (r9 == 0) goto L_0x017b
                java.lang.Object r9 = r8.next()     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ IllegalAccessException -> 0x035c }
                int r9 = r9.intValue()     // Catch:{ IllegalAccessException -> 0x035c }
                if (r9 != r4) goto L_0x0157
                java.lang.String r8 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r8 != 0) goto L_0x0179
                java.lang.String r8 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r7 = r7.contains(r8)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r7 == 0) goto L_0x017b
            L_0x0179:
                r7 = 1
                goto L_0x017c
            L_0x017b:
                r7 = 0
            L_0x017c:
                if (r7 == 0) goto L_0x01a3
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r7 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r7 = r7.f13886o     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalAccessException -> 0x035c }
                r7.add(r4)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r4 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r4 = r4.f13887p     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r3 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                r4.add(r3)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r3 = r3.f13888s     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r4 = "com.arlosoft.macrodroid"
                r3.add(r4)     // Catch:{ IllegalAccessException -> 0x035c }
            L_0x01a3:
                int r1 = r1 + 1
                goto L_0x00fd
            L_0x01a7:
                r3 = 3
                if (r11 != r3) goto L_0x01ff
                java.lang.reflect.Field[] r11 = r0.getFields()     // Catch:{ IllegalAccessException -> 0x035c }
                int r0 = r11.length     // Catch:{ IllegalAccessException -> 0x035c }
                r1 = 0
            L_0x01b0:
                if (r1 >= r0) goto L_0x02f7
                r3 = r11[r1]     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r4 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r7 = "not_icon_"
                boolean r7 = r4.startsWith(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r7 == 0) goto L_0x01d2
                java.lang.String r7 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r7 != 0) goto L_0x01d0
                java.lang.String r7 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r4 = r4.contains(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r4 == 0) goto L_0x01d2
            L_0x01d0:
                r4 = 1
                goto L_0x01d3
            L_0x01d2:
                r4 = 0
            L_0x01d3:
                if (r4 == 0) goto L_0x01fc
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r4 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r4 = r4.f13886o     // Catch:{ IllegalAccessException -> 0x035c }
                int r7 = r3.getInt(r2)     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                r4.add(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r4 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r4 = r4.f13887p     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r3 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                r4.add(r3)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r3 = r3.f13888s     // Catch:{ IllegalAccessException -> 0x035c }
                r3.add(r2)     // Catch:{ IllegalAccessException -> 0x035c }
            L_0x01fc:
                int r1 = r1 + 1
                goto L_0x01b0
            L_0x01ff:
                if (r11 != 0) goto L_0x029f
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r11 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x029c }
                java.util.List r11 = r11.f13878B     // Catch:{ Exception -> 0x029c }
                if (r11 != 0) goto L_0x0246
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r11 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x029c }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x029c }
                r0.<init>()     // Catch:{ Exception -> 0x029c }
                java.util.List unused = r11.f13878B = r0     // Catch:{ Exception -> 0x029c }
                java.util.List r11 = r1.getInstalledApplications(r5)     // Catch:{ Exception -> 0x029c }
                java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x029c }
            L_0x021b:
                boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x029c }
                if (r0 == 0) goto L_0x0246
                java.lang.Object r0 = r11.next()     // Catch:{ Exception -> 0x029c }
                android.content.pm.ApplicationInfo r0 = (android.content.pm.ApplicationInfo) r0     // Catch:{ Exception -> 0x029c }
                int r3 = r0.icon     // Catch:{ Exception -> 0x029c }
                if (r3 <= 0) goto L_0x021b
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x029c }
                java.util.List r3 = r3.f13878B     // Catch:{ Exception -> 0x029c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.a r4 = new com.arlosoft.macrodroid.triggers.activities.selecticon.a     // Catch:{ Exception -> 0x029c }
                int r7 = r0.icon     // Catch:{ Exception -> 0x029c }
                java.lang.String r8 = r0.packageName     // Catch:{ Exception -> 0x029c }
                java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch:{ Exception -> 0x029c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x029c }
                r4.<init>(r7, r8, r0)     // Catch:{ Exception -> 0x029c }
                r3.add(r4)     // Catch:{ Exception -> 0x029c }
                goto L_0x021b
            L_0x0246:
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r11 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x029c }
                java.util.List r11 = r11.f13878B     // Catch:{ Exception -> 0x029c }
                java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x029c }
            L_0x0250:
                boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x029c }
                if (r0 == 0) goto L_0x02f7
                java.lang.Object r0 = r11.next()     // Catch:{ Exception -> 0x029c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.a r0 = (com.arlosoft.macrodroid.triggers.activities.selecticon.C5858a) r0     // Catch:{ Exception -> 0x029c }
                java.lang.String r1 = r10.f13893d     // Catch:{ Exception -> 0x029c }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x029c }
                if (r1 != 0) goto L_0x0276
                java.lang.String r1 = r0.f13905c     // Catch:{ Exception -> 0x029c }
                java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x029c }
                java.lang.String r3 = r10.f13893d     // Catch:{ Exception -> 0x029c }
                java.lang.String r3 = r3.toLowerCase()     // Catch:{ Exception -> 0x029c }
                boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x029c }
                if (r1 == 0) goto L_0x0250
            L_0x0276:
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r1 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x029c }
                java.util.List r1 = r1.f13886o     // Catch:{ Exception -> 0x029c }
                int r3 = r0.f13903a     // Catch:{ Exception -> 0x029c }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x029c }
                r1.add(r3)     // Catch:{ Exception -> 0x029c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r1 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x029c }
                java.util.List r1 = r1.f13887p     // Catch:{ Exception -> 0x029c }
                java.lang.String r3 = r0.f13904b     // Catch:{ Exception -> 0x029c }
                r1.add(r3)     // Catch:{ Exception -> 0x029c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r1 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ Exception -> 0x029c }
                java.util.List r1 = r1.f13888s     // Catch:{ Exception -> 0x029c }
                java.lang.String r0 = r0.f13904b     // Catch:{ Exception -> 0x029c }
                r1.add(r0)     // Catch:{ Exception -> 0x029c }
                goto L_0x0250
            L_0x029c:
                r10.f13891b = r6     // Catch:{ IllegalAccessException -> 0x035c }
                goto L_0x02f7
            L_0x029f:
                r1 = 4
                if (r11 != r1) goto L_0x02f7
                java.lang.reflect.Field[] r11 = r0.getFields()     // Catch:{ IllegalAccessException -> 0x035c }
                int r0 = r11.length     // Catch:{ IllegalAccessException -> 0x035c }
                r1 = 0
            L_0x02a8:
                if (r1 >= r0) goto L_0x02f7
                r3 = r11[r1]     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r4 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r7 = "material_"
                boolean r7 = r4.startsWith(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r7 == 0) goto L_0x02ca
                java.lang.String r7 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r7 != 0) goto L_0x02c8
                java.lang.String r7 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r4 = r4.contains(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r4 == 0) goto L_0x02ca
            L_0x02c8:
                r4 = 1
                goto L_0x02cb
            L_0x02ca:
                r4 = 0
            L_0x02cb:
                if (r4 == 0) goto L_0x02f4
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r4 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r4 = r4.f13886o     // Catch:{ IllegalAccessException -> 0x035c }
                int r7 = r3.getInt(r2)     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                r4.add(r7)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r4 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r4 = r4.f13887p     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r3 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                r4.add(r3)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r3 = r3.f13888s     // Catch:{ IllegalAccessException -> 0x035c }
                r3.add(r2)     // Catch:{ IllegalAccessException -> 0x035c }
            L_0x02f4:
                int r1 = r1 + 1
                goto L_0x02a8
            L_0x02f7:
                int r11 = r10.f13890a     // Catch:{ IllegalAccessException -> 0x035c }
                if (r11 != r6) goto L_0x037a
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r11 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                android.content.Context r11 = r11.getContext()     // Catch:{ IllegalAccessException -> 0x035c }
                java.io.File r11 = com.arlosoft.macrodroid.utils.C6362a0.m24602h(r11)     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r0 = r11.exists()     // Catch:{ IllegalAccessException -> 0x035c }
                if (r0 != 0) goto L_0x030c
                return r2
            L_0x030c:
                java.io.File[] r11 = r11.listFiles()     // Catch:{ IllegalAccessException -> 0x035c }
                if (r11 == 0) goto L_0x037a
                int r0 = r11.length     // Catch:{ IllegalAccessException -> 0x035c }
                r1 = 0
            L_0x0314:
                if (r1 >= r0) goto L_0x037a
                r3 = r11[r1]     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r4 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r4 != 0) goto L_0x0334
                java.lang.String r4 = r3.getName()     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r4 = r4.toLowerCase()     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r6 = r10.f13893d     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r6 = r6.toLowerCase()     // Catch:{ IllegalAccessException -> 0x035c }
                boolean r4 = r4.contains(r6)     // Catch:{ IllegalAccessException -> 0x035c }
                if (r4 == 0) goto L_0x0359
            L_0x0334:
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r4 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r4 = r4.f13887p     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ IllegalAccessException -> 0x035c }
                r4.add(r3)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r3 = r3.f13888s     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.String r4 = "UserIcon"
                r3.add(r4)     // Catch:{ IllegalAccessException -> 0x035c }
                com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment r3 = com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.this     // Catch:{ IllegalAccessException -> 0x035c }
                java.util.List r3 = r3.f13886o     // Catch:{ IllegalAccessException -> 0x035c }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x035c }
                r3.add(r4)     // Catch:{ IllegalAccessException -> 0x035c }
            L_0x0359:
                int r1 = r1 + 1
                goto L_0x0314
            L_0x035c:
                r11 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "IconSelectFragment: IllegalAccessException when selecting icon: "
                r1.append(r3)
                java.lang.String r11 = r11.getMessage()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                p148q0.C8151a.m33873n(r0)
            L_0x037a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.C5856a.doInBackground(java.lang.Void[]):java.lang.Void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            if (!isCancelled()) {
                IconSelectFragment.this.f13883d.setVisibility(8);
                if (IconSelectFragment.this.getActivity() != null && !IconSelectFragment.this.getActivity().isFinishing()) {
                    int dimensionPixelSize = IconSelectFragment.this.getResources().getDimensionPixelSize(C17529R$dimen.select_icon_size);
                    Display defaultDisplay = IconSelectFragment.this.getActivity().getWindowManager().getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    if (IconSelectFragment.this.f13879C == null) {
                        IconSelectFragment iconSelectFragment = IconSelectFragment.this;
                        SelectIconAdapter unused = iconSelectFragment.f13879C = new SelectIconAdapter(iconSelectFragment, iconSelectFragment.f13886o, IconSelectFragment.this.f13888s, IconSelectFragment.this.f13887p);
                        IconSelectFragment.this.f13882c.setLayoutManager(new GridLayoutManager(IconSelectFragment.this.getActivity(), point.x / dimensionPixelSize));
                        IconSelectFragment.this.f13882c.setAdapter(IconSelectFragment.this.f13879C);
                    } else {
                        IconSelectFragment.this.f13882c.post(new C5857a());
                    }
                    if (this.f13891b) {
                        C15626c.m94876a(IconSelectFragment.this.getActivity().getApplicationContext(), IconSelectFragment.this.getString(C17541R$string.android_issue_requesting_installed_apps), 1).show();
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(Void... voidArr) {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            IconSelectFragment.this.f13883d.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m23950A0(View view) {
        C10180a.m40075a().mo80018i(new CloseDrawerEvent());
        C11913a.C11914a aVar = new C11913a.C11914a();
        aVar.mo67215e(1.0f, 1.0f);
        aVar.mo67213c(Bitmap.CompressFormat.PNG);
        aVar.mo67214d(getString(C17541R$string.edit_image));
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        ((C12168a.C12171c) ((C12168a.C12171c) ((C12168a.C12171c) C12168a.m82812e(getActivity()).mo68446a(aVar)).mo68449d(new C12312a(point.x / 2))).mo68450e()).mo68453g().mo79688T(C12318a.m83030b()).mo79679I(C16971a.m100210a()).mo79707n(new C13284g(this)).mo79686Q(new C13285h(this), new C13286i(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23969u0() {
        /*
            r4 = this;
            java.lang.String r0 = "MacroDroid/RXP"
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x000e }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x000e }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x000e }
            org.apache.commons.p353io.FileUtils.deleteDirectory(r1)     // Catch:{ Exception -> 0x000e }
        L_0x000e:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x001f }
            android.content.Context r2 = r4.requireContext()     // Catch:{ Exception -> 0x001f }
            r3 = 0
            java.io.File r2 = r2.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x001f }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x001f }
            org.apache.commons.p353io.FileUtils.deleteDirectory(r1)     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectFragment.m23969u0():void");
    }

    /* renamed from: r0 */
    private void m23967r0(int i, String str) {
        C5856a aVar = this.f13880D;
        if (aVar != null) {
            aVar.cancel(true);
        }
        C5856a aVar2 = new C5856a(getActivity().getApplicationContext(), i, str);
        this.f13880D = aVar2;
        aVar2.execute((Object[]) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m23968s0(int i, DialogInterface dialogInterface, int i2) {
        try {
            new File(this.f13887p.get(i)).delete();
            m23967r0(this.f13889z, "");
        } catch (Exception e) {
            C4878b.m18868g("Failed to delete user icon: " + e.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void m23970v0(C12245e eVar) throws Exception {
        if (eVar.mo68558b() == -1) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(((C12242b) eVar.mo68557a()).mo68545c().getAbsolutePath(), options);
            int i = this.userIconSize;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i, i, true);
            File h = C6362a0.m24602h(getContext());
            if (!h.exists()) {
                h.mkdirs();
            }
            File file = new File(h, UUID.randomUUID() + ".png");
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            createScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            m23967r0(this.f13889z, "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m23971y0(Throwable th) throws Exception {
        Context applicationContext = getContext().getApplicationContext();
        C15626c.m94876a(applicationContext, getString(C17541R$string.error) + ": " + th.toString(), 1).show();
    }

    /* renamed from: B0 */
    public void mo31733B0(int i) {
        if (this.f13885g) {
            Intent intent = new Intent();
            intent.putExtra("drawableId", this.f13886o.get(i).intValue());
            intent.putExtra("drawableName", this.f13887p.get(i));
            intent.putExtra("drawablePackageName", this.f13888s.get(i));
            getActivity().setResult(-1, intent);
            getActivity().finish();
            return;
        }
        C10180a.m40075a().mo80018i(new IconSelectedEvent(this.f13888s.get(i), this.f13887p.get(i)));
    }

    /* renamed from: L */
    public void mo30432L(@NonNull String str) {
        m23967r0(this.f13889z, str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (requireActivity() instanceof C5275b) {
            C5275b bVar = (C5275b) requireActivity();
            this.f13877A = bVar;
            bVar.mo30411Y(this);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C17535R$layout.select_icon, viewGroup, false);
        ButterKnife.bind((Object) this, (View) viewGroup2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13889z = arguments.getInt("IconTypes");
            this.f13885g = arguments.getBoolean("ReturnResult", true);
            String string = arguments.getString("IconPackName");
            if (string != null) {
                C6391i0 i0Var = new C6391i0();
                i0Var.mo32435c(getContext().getApplicationContext());
                this.f13881a = i0Var.mo32434b(false).get(string);
            }
        } else {
            this.f13889z = 0;
        }
        this.f13882c = (RecyclerView) viewGroup2.findViewById(C17532R$id.select_icon_list);
        this.f13883d = (ProgressBar) viewGroup2.findViewById(C17532R$id.progress_spinner);
        Button button = (Button) viewGroup2.findViewById(C17532R$id.add_user_icon_button);
        this.f13884f = button;
        if (this.f13889z == 1) {
            button.setVisibility(0);
        }
        m23967r0(this.f13889z, "");
        this.f13884f.setOnClickListener(new C13283f(this));
        return viewGroup2;
    }

    public void onDestroy() {
        super.onDestroy();
        setHasOptionsMenu(true);
        C5275b bVar = this.f13877A;
        if (bVar != null) {
            bVar.mo30412b0(this);
            this.f13877A = null;
        }
    }

    /* renamed from: q0 */
    public void mo31734q0(int i) {
        if (this.f13889z == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C17542R$style.Theme_App_Dialog);
            builder.setTitle((int) C17541R$string.delete_icon);
            builder.setMessage((int) C17541R$string.delete_icon_confirm);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13282e(this, i));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.show();
        }
    }
}
