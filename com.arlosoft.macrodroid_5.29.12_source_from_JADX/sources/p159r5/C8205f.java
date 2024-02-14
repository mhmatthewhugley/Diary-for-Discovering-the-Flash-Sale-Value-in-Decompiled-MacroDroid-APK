package p159r5;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.util.p075ui.PreambleHandler;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.f */
/* compiled from: PrivacyDisclosureUtils */
public class C8205f {
    @StringRes
    /* renamed from: a */
    private static int m34067a(FlowParameters flowParameters) {
        boolean h = flowParameters.mo34146h();
        boolean e = flowParameters.mo34143e();
        if (!h || !e) {
            return -1;
        }
        return R$string.fui_tos_and_pp_footer;
    }

    @StringRes
    /* renamed from: b */
    private static int m34068b(FlowParameters flowParameters) {
        boolean h = flowParameters.mo34146h();
        boolean e = flowParameters.mo34143e();
        if (!h || !e) {
            return -1;
        }
        return R$string.fui_tos_and_pp;
    }

    @StringRes
    /* renamed from: c */
    private static int m34069c(FlowParameters flowParameters) {
        boolean h = flowParameters.mo34146h();
        boolean e = flowParameters.mo34143e();
        if (!h || !e) {
            return -1;
        }
        return R$string.fui_sms_terms_of_service_and_privacy_policy_extended;
    }

    /* renamed from: d */
    public static void m34070d(Context context, FlowParameters flowParameters, TextView textView) {
        PreambleHandler.m26048f(context, flowParameters, R$string.fui_verify_phone_number, m34069c(flowParameters), textView);
    }

    /* renamed from: e */
    public static void m34071e(Context context, FlowParameters flowParameters, TextView textView) {
        PreambleHandler.m26049g(context, flowParameters, m34068b(flowParameters), textView);
    }

    /* renamed from: f */
    public static void m34072f(Context context, FlowParameters flowParameters, TextView textView) {
        PreambleHandler.m26049g(context, flowParameters, m34067a(flowParameters), textView);
    }
}
