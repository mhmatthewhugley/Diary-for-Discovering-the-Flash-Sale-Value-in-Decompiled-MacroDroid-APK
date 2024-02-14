package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.udojava.evalex.Expression;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.utils.w */
/* compiled from: ExpressionUtils */
public class C6451w {
    /* renamed from: a */
    public static void m24765a(Context context, LinearLayout linearLayout) {
        List<String> f = m24770f();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C17529R$dimen.margin_tiny);
        for (String text : f) {
            TextView textView = new TextView(context);
            textView.setText(text);
            textView.setTextColor(ContextCompat.getColor(context, C17528R$color.default_text_color));
            textView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            linearLayout.addView(textView);
        }
    }

    /* renamed from: b */
    public static double m24766b(Context context, Macro macro, String str, TriggerContextInfo triggerContextInfo) throws IllegalArgumentException {
        return m24767c(context, macro, str, triggerContextInfo).doubleValue();
    }

    /* renamed from: c */
    public static BigDecimal m24767c(Context context, Macro macro, String str, TriggerContextInfo triggerContextInfo) throws IllegalArgumentException {
        try {
            return m24769e(C4023j0.m15768x0(context, str, triggerContextInfo, false, macro, true, Locale.US));
        } catch (ArithmeticException unused) {
            return BigDecimal.ZERO;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static long m24768d(Context context, Macro macro, String str, TriggerContextInfo triggerContextInfo) throws IllegalArgumentException {
        BigDecimal c = m24767c(context, macro, str, triggerContextInfo);
        if (c == null) {
            return 0;
        }
        return c.longValue();
    }

    /* renamed from: e */
    private static BigDecimal m24769e(String str) {
        return new Expression(str, MathContext.DECIMAL128).mo67113j();
    }

    /* renamed from: f */
    public static List<String> m24770f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("NOT(val)");
        arrayList.add("MIN(val1,val2,..)");
        arrayList.add("MAX(val1,val2,..)");
        arrayList.add("ABS(val)");
        arrayList.add("ROUND(val,dps)");
        arrayList.add("RANDOM()");
        arrayList.add("FLOOR(val)");
        arrayList.add("CEILING(val)");
        arrayList.add("LOG(val)");
        arrayList.add("LOG10(val)");
        arrayList.add("SQRT(val)");
        arrayList.add("SIN(val)");
        arrayList.add("SINR(val)");
        arrayList.add("COS(val)");
        arrayList.add("COSR(val)");
        arrayList.add("TAN(val)");
        arrayList.add("TANR(val)");
        arrayList.add("COTR(val)");
        arrayList.add("SECR(val)");
        arrayList.add("CSCR(val)");
        arrayList.add("ASIN(val)");
        arrayList.add("ASINR(val)");
        arrayList.add("ACOS(val)");
        arrayList.add("ACOSR(val)");
        arrayList.add("ATAN(val)");
        arrayList.add("ATANR(val)");
        arrayList.add("ACOTR(val)");
        arrayList.add("SINH(val)");
        arrayList.add("COSH(val)");
        arrayList.add("TANH(val)");
        arrayList.add("RAD(val)");
        arrayList.add("DEG(val)");
        arrayList.add("PI");
        arrayList.add("FACT(val)");
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m24771g(Context context, Macro macro, String str, TriggerContextInfo triggerContextInfo) {
        try {
            m24766b(context, macro, str, triggerContextInfo);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
