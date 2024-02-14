package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfsj;
import com.google.android.gms.internal.ads.zzftk;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbx {
    /* renamed from: a */
    public static Point m2608a(MotionEvent motionEvent, @Nullable View view) {
        int[] j = m2617j(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - j[0], ((int) motionEvent.getRawY()) - j[1]);
    }

    /* renamed from: b */
    public static WindowManager.LayoutParams m2609b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) zzay.m1924c().mo42663b(zzbjc.f26993S6)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* renamed from: c */
    public static JSONObject m2610c(@Nullable String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", zzaw.m1917b().mo43547c(context, point2.x));
                    jSONObject3.put("y", zzaw.m1917b().mo43547c(context, point2.y));
                    jSONObject3.put("start_x", zzaw.m1917b().mo43547c(context, point.x));
                    jSONObject3.put("start_y", zzaw.m1917b().mo43547c(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    zzcgp.m45227e("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                zzcgp.m45227e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
            zzcgp.m45227e("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
    }

    /* renamed from: d */
    public static JSONObject m2611d(Context context, @Nullable Map map, @Nullable Map map2, @Nullable View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry entry;
        Context context2 = context;
        Map map3 = map2;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] j = m2617j(view);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            View view2 = (View) ((WeakReference) entry2.getValue()).get();
            if (view2 != null) {
                int[] j2 = m2617j(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", zzaw.m1917b().mo43547c(context2, view2.getMeasuredWidth()));
                        jSONObject5.put("height", zzaw.m1917b().mo43547c(context2, view2.getMeasuredHeight()));
                        jSONObject5.put("x", zzaw.m1917b().mo43547c(context2, j2[0] - j[0]));
                        jSONObject5.put("y", zzaw.m1917b().mo43547c(context2, j2[1] - j[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put(TypedValues.Attributes.S_FRAME, jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = m2618k(context2, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", zzaw.m1917b().mo43547c(context2, j2[0] - j[0]));
                            jSONObject2.put("y", zzaw.m1917b().mo43547c(context2, j2[1] - j[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry2.getKey()).equals("3010")) {
                            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26953O6)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26963P6)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", m2619l(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", m2619l(layoutParams.height) - 1);
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = entry2;
                            jSONObject4.put("font_size", (double) textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = entry2;
                        }
                        jSONObject4.put("is_clickable", map3 != null && map3.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject6;
                        zzcgp.m45229g("Unable to get asset views information");
                        jSONObject3 = jSONObject;
                        it = it2;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                    zzcgp.m45229g("Unable to get asset views information");
                    jSONObject3 = jSONObject;
                    it = it2;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    /* renamed from: e */
    public static JSONObject m2612e(Context context, @Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzt.m2905r();
            jSONObject.put("can_show_on_lock_screen", zzs.m2735I(view));
            zzt.m2905r();
            jSONObject.put("is_keyguard_locked", zzs.m2749W(context));
        } catch (JSONException unused) {
            zzcgp.m45229g("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static JSONObject m2613f(@Nullable View view) {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            boolean z = false;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26943N6)).booleanValue()) {
                zzt.m2905r();
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    z = true;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } else {
                zzt.m2905r();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if (parent2 == null) {
                    i = -1;
                } else {
                    i = ((AdapterView) parent2).getPositionForView(view);
                }
                if (i != -1) {
                    z = true;
                }
                jSONObject.put("contained_in_scroll_view", z);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0175 A[Catch:{ JSONException -> 0x017a }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m2614g(android.content.Context r16, @androidx.annotation.Nullable android.view.View r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "window"
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "height"
            java.lang.String r7 = "width"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r1 != 0) goto L_0x001c
            return r8
        L_0x001c:
            r9 = 2
            r10 = 1
            r11 = 0
            int[] r12 = m2617j(r17)     // Catch:{ Exception -> 0x0102 }
            int[] r13 = new int[r9]     // Catch:{ Exception -> 0x0102 }
            int r14 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x0102 }
            r13[r11] = r14     // Catch:{ Exception -> 0x0102 }
            int r14 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x0102 }
            r13[r10] = r14     // Catch:{ Exception -> 0x0102 }
            android.view.ViewParent r14 = r17.getParent()     // Catch:{ Exception -> 0x0102 }
        L_0x0035:
            boolean r15 = r14 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x0102 }
            if (r15 == 0) goto L_0x005c
            r15 = r14
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ Exception -> 0x0102 }
            int r9 = r15.getMeasuredWidth()     // Catch:{ Exception -> 0x0102 }
            r10 = r13[r11]     // Catch:{ Exception -> 0x0102 }
            int r9 = java.lang.Math.min(r9, r10)     // Catch:{ Exception -> 0x0102 }
            r13[r11] = r9     // Catch:{ Exception -> 0x0102 }
            int r9 = r15.getMeasuredHeight()     // Catch:{ Exception -> 0x0102 }
            r10 = 1
            r15 = r13[r10]     // Catch:{ Exception -> 0x0102 }
            int r9 = java.lang.Math.min(r9, r15)     // Catch:{ Exception -> 0x0102 }
            r13[r10] = r9     // Catch:{ Exception -> 0x0102 }
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x0102 }
            r9 = 2
            r10 = 1
            goto L_0x0035
        L_0x005c:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0102 }
            r9.<init>()     // Catch:{ Exception -> 0x0102 }
            int r10 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r14 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r10 = r14.mo43547c(r0, r10)     // Catch:{ Exception -> 0x0102 }
            r9.put(r7, r10)     // Catch:{ Exception -> 0x0102 }
            int r10 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r14 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r10 = r14.mo43547c(r0, r10)     // Catch:{ Exception -> 0x0102 }
            r9.put(r6, r10)     // Catch:{ Exception -> 0x0102 }
            r10 = r12[r11]     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r14 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r10 = r14.mo43547c(r0, r10)     // Catch:{ Exception -> 0x0102 }
            r9.put(r5, r10)     // Catch:{ Exception -> 0x0102 }
            r10 = 1
            r14 = r12[r10]     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r10 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r10 = r10.mo43547c(r0, r14)     // Catch:{ Exception -> 0x0102 }
            r9.put(r4, r10)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r10 = "maximum_visible_width"
            r14 = r13[r11]     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r15 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r14 = r15.mo43547c(r0, r14)     // Catch:{ Exception -> 0x0102 }
            r9.put(r10, r14)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r10 = "maximum_visible_height"
            r14 = 1
            r13 = r13[r14]     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r14 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r13 = r14.mo43547c(r0, r13)     // Catch:{ Exception -> 0x0102 }
            r9.put(r10, r13)     // Catch:{ Exception -> 0x0102 }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r10 = "frame"
            r8.put(r10, r9)     // Catch:{ Exception -> 0x0102 }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ Exception -> 0x0102 }
            r9.<init>()     // Catch:{ Exception -> 0x0102 }
            boolean r10 = r1.getGlobalVisibleRect(r9)     // Catch:{ Exception -> 0x0102 }
            if (r10 == 0) goto L_0x00d1
            org.json.JSONObject r0 = m2618k(r0, r9)     // Catch:{ Exception -> 0x0102 }
            goto L_0x00fb
        L_0x00d1:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0102 }
            r9.<init>()     // Catch:{ Exception -> 0x0102 }
            r9.put(r7, r11)     // Catch:{ Exception -> 0x0102 }
            r9.put(r6, r11)     // Catch:{ Exception -> 0x0102 }
            r6 = r12[r11]     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r7 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r6 = r7.mo43547c(r0, r6)     // Catch:{ Exception -> 0x0102 }
            r9.put(r5, r6)     // Catch:{ Exception -> 0x0102 }
            r5 = 1
            r6 = r12[r5]     // Catch:{ Exception -> 0x0102 }
            com.google.android.gms.internal.ads.zzcgi r5 = com.google.android.gms.ads.internal.client.zzaw.m1917b()     // Catch:{ Exception -> 0x0102 }
            int r0 = r5.mo43547c(r0, r6)     // Catch:{ Exception -> 0x0102 }
            r9.put(r4, r0)     // Catch:{ Exception -> 0x0102 }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x0102 }
            r0 = r9
        L_0x00fb:
            java.lang.String r2 = "visible_bounds"
            r8.put(r2, r0)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0107
        L_0x0102:
            java.lang.String r0 = "Unable to get native ad view bounding box"
            com.google.android.gms.internal.ads.zzcgp.m45229g(r0)
        L_0x0107:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27207o5
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r2.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = -1
            if (r0 == 0) goto L_0x0180
            android.view.ViewParent r0 = r17.getParent()
            if (r0 == 0) goto L_0x013f
            java.lang.Class r3 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x013f, SecurityException -> 0x0139, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0135 }
            java.lang.String r4 = "getTemplateTypeName"
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ NoSuchMethodException -> 0x013f, SecurityException -> 0x0139, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0135 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x013f, SecurityException -> 0x0139, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0135 }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x013f, SecurityException -> 0x0139, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0135 }
            java.lang.Object r0 = r3.invoke(r0, r4)     // Catch:{ NoSuchMethodException -> 0x013f, SecurityException -> 0x0139, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0135 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NoSuchMethodException -> 0x013f, SecurityException -> 0x0139, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0135 }
            goto L_0x0141
        L_0x0135:
            r0 = move-exception
            goto L_0x013a
        L_0x0137:
            r0 = move-exception
            goto L_0x013a
        L_0x0139:
            r0 = move-exception
        L_0x013a:
            java.lang.String r3 = "Cannot access method getTemplateTypeName: "
            com.google.android.gms.internal.ads.zzcgp.m45227e(r3, r0)
        L_0x013f:
            java.lang.String r0 = ""
        L_0x0141:
            int r3 = r0.hashCode()     // Catch:{ JSONException -> 0x017a }
            r4 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r3 == r4) goto L_0x015a
            r4 = 2019754500(0x78630204, float:1.8417067E34)
            if (r3 == r4) goto L_0x0150
            goto L_0x0164
        L_0x0150:
            java.lang.String r3 = "medium_template"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0164
            r0 = 1
            goto L_0x0165
        L_0x015a:
            java.lang.String r3 = "small_template"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0164
            r0 = 0
            goto L_0x0165
        L_0x0164:
            r0 = -1
        L_0x0165:
            java.lang.String r3 = "native_template_type"
            if (r0 == 0) goto L_0x0175
            r4 = 1
            if (r0 == r4) goto L_0x0170
            r8.put(r3, r11)     // Catch:{ JSONException -> 0x017a }
            goto L_0x0180
        L_0x0170:
            r4 = 2
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x017a }
            goto L_0x0180
        L_0x0175:
            r4 = 1
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x017a }
            goto L_0x0180
        L_0x017a:
            r0 = move-exception
            java.lang.String r3 = "Could not log native template signal to JSON"
            com.google.android.gms.internal.ads.zzcgp.m45227e(r3, r0)
        L_0x0180:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26963P6
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r3.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01b6
            android.view.ViewGroup$LayoutParams r0 = r17.getLayoutParams()     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = "view_width_layout_type"
            int r3 = r0.width     // Catch:{ Exception -> 0x01b1 }
            int r3 = m2619l(r3)     // Catch:{ Exception -> 0x01b1 }
            int r3 = r3 + r2
            r8.put(r1, r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = "view_height_layout_type"
            int r0 = r0.height     // Catch:{ Exception -> 0x01b1 }
            int r0 = m2619l(r0)     // Catch:{ Exception -> 0x01b1 }
            int r0 = r0 + r2
            r8.put(r1, r0)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x01b6
        L_0x01b1:
            java.lang.String r0 = "Unable to get native ad view layout types"
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)
        L_0x01b6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbx.m2614g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    /* renamed from: h */
    public static boolean m2615h(Context context, zzfdk zzfdk) {
        if (!zzfdk.f35507O) {
            return false;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26973Q6)).booleanValue()) {
            return ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27003T6)).booleanValue();
        }
        String str = (String) zzay.m1924c().mo42663b(zzbjc.f26983R6);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            for (String equals : zzftk.m50964c(zzfsj.m50923c(';')).mo46184d(str)) {
                if (equals.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m2616i(int i) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26869G2)).booleanValue()) {
            return true;
        }
        return ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26879H2)).booleanValue() || i <= 15299999;
    }

    /* renamed from: j */
    public static int[] m2617j(@Nullable View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* renamed from: k */
    private static JSONObject m2618k(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzaw.m1917b().mo43547c(context, rect.right - rect.left));
        jSONObject.put("height", zzaw.m1917b().mo43547c(context, rect.bottom - rect.top));
        jSONObject.put("x", zzaw.m1917b().mo43547c(context, rect.left));
        jSONObject.put("y", zzaw.m1917b().mo43547c(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: l */
    private static int m2619l(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
