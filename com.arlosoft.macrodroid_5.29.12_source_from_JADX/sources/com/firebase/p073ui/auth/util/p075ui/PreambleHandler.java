package com.firebase.p073ui.auth.util.p075ui;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import com.firebase.p073ui.auth.R$attr;
import com.firebase.p073ui.auth.R$color;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.util.ui.PreambleHandler */
public class PreambleHandler {

    /* renamed from: a */
    private final Context f16130a;

    /* renamed from: b */
    private final FlowParameters f16131b;

    /* renamed from: c */
    private final int f16132c;

    /* renamed from: d */
    private final ForegroundColorSpan f16133d;

    /* renamed from: e */
    private SpannableStringBuilder f16134e;

    /* renamed from: com.firebase.ui.auth.util.ui.PreambleHandler$CustomTabsSpan */
    private static final class CustomTabsSpan extends URLSpan {

        /* renamed from: a */
        private final WeakReference<Context> f16135a;

        /* renamed from: c */
        private final String f16136c;

        /* renamed from: d */
        private final CustomTabsIntent f16137d;

        public CustomTabsSpan(Context context, String str) {
            super(str);
            this.f16135a = new WeakReference<>(context);
            this.f16136c = str;
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R$attr.colorPrimary, typedValue, true);
            this.f16137d = new CustomTabsIntent.Builder().setToolbarColor(typedValue.data).setShowTitle(true).build();
        }

        public void onClick(View view) {
            Context context = (Context) this.f16135a.get();
            if (context != null) {
                this.f16137d.launchUrl(context, Uri.parse(this.f16136c));
            }
        }
    }

    private PreambleHandler(Context context, FlowParameters flowParameters, @StringRes int i) {
        this.f16130a = context;
        this.f16131b = flowParameters;
        this.f16132c = i;
        this.f16133d = new ForegroundColorSpan(ContextCompat.getColor(context, R$color.fui_linkColor));
    }

    @Nullable
    /* renamed from: a */
    private String m26043a(@StringRes int i, boolean z) {
        boolean z2 = !TextUtils.isEmpty(this.f16131b.f15989o);
        boolean z3 = !TextUtils.isEmpty(this.f16131b.f15990p);
        if (!z2 || !z3) {
            return null;
        }
        return this.f16130a.getString(i, z ? new Object[]{"%BTN%", "%TOS%", "%PP%"} : new Object[]{"%TOS%", "%PP%"});
    }

    /* renamed from: b */
    private void m26044b(@StringRes int i) {
        String a = m26043a(i, this.f16132c != -1);
        if (a != null) {
            this.f16134e = new SpannableStringBuilder(a);
            m26045c("%BTN%", this.f16132c);
            m26046d("%TOS%", R$string.fui_terms_of_service, this.f16131b.f15989o);
            m26046d("%PP%", R$string.fui_privacy_policy, this.f16131b.f15990p);
        }
    }

    /* renamed from: c */
    private void m26045c(String str, @StringRes int i) {
        int indexOf = this.f16134e.toString().indexOf(str);
        if (indexOf != -1) {
            this.f16134e.replace(indexOf, str.length() + indexOf, this.f16130a.getString(i));
        }
    }

    /* renamed from: d */
    private void m26046d(String str, @StringRes int i, String str2) {
        int indexOf = this.f16134e.toString().indexOf(str);
        if (indexOf != -1) {
            String string = this.f16130a.getString(i);
            this.f16134e.replace(indexOf, str.length() + indexOf, string);
            int length = string.length() + indexOf;
            this.f16134e.setSpan(this.f16133d, indexOf, length, 0);
            this.f16134e.setSpan(new CustomTabsSpan(this.f16130a, str2), indexOf, length, 0);
        }
    }

    /* renamed from: e */
    private void m26047e(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(this.f16134e);
    }

    /* renamed from: f */
    public static void m26048f(Context context, FlowParameters flowParameters, @StringRes int i, @StringRes int i2, TextView textView) {
        PreambleHandler preambleHandler = new PreambleHandler(context, flowParameters, i);
        preambleHandler.m26044b(i2);
        preambleHandler.m26047e(textView);
    }

    /* renamed from: g */
    public static void m26049g(Context context, FlowParameters flowParameters, @StringRes int i, TextView textView) {
        m26048f(context, flowParameters, -1, i, textView);
    }
}
