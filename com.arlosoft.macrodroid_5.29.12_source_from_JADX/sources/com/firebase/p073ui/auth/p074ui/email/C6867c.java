package com.firebase.p073ui.auth.p074ui.email;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.util.p075ui.C6901d;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.firebase.auth.ActionCodeSettings;
import p138n5.C7985a;
import p138n5.C7986b;
import p159r5.C8205f;
import p170t5.C10256a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.c */
/* compiled from: EmailLinkFragment */
public class C6867c extends C7986b {

    /* renamed from: o */
    private C10256a f16045o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C6871c f16046p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ScrollView f16047s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f16048z;

    /* renamed from: com.firebase.ui.auth.ui.email.c$a */
    /* compiled from: EmailLinkFragment */
    class C6868a extends C6905d<String> {

        /* renamed from: com.firebase.ui.auth.ui.email.c$a$a */
        /* compiled from: EmailLinkFragment */
        class C6869a implements Runnable {
            C6869a() {
            }

            public void run() {
                C6867c.this.f16047s.setVisibility(0);
            }
        }

        C6868a(C7985a aVar, int i) {
            super(aVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            C6867c.this.f16046p.mo34188H(exc);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull String str) {
            Log.w("EmailLinkFragment", "Email for email link sign in sent successfully.");
            C6867c.this.mo37889Z(new C6869a());
            boolean unused = C6867c.this.f16048z = true;
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.c$b */
    /* compiled from: EmailLinkFragment */
    class C6870b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f16051a;

        C6870b(String str) {
            this.f16051a = str;
        }

        public void onClick(View view) {
            C6867c.this.f16046p.mo34189O0(this.f16051a);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.c$c */
    /* compiled from: EmailLinkFragment */
    interface C6871c {
        /* renamed from: H */
        void mo34188H(Exception exc);

        /* renamed from: O0 */
        void mo34189O0(String str);
    }

    /* renamed from: h0 */
    private void m25932h0() {
        C10256a aVar = (C10256a) new ViewModelProvider(this).get(C10256a.class);
        this.f16045o = aVar;
        aVar.mo34278g(mo37887U());
        this.f16045o.mo34267i().observe(getViewLifecycleOwner(), new C6868a(this, R$string.fui_progress_dialog_sending));
    }

    /* renamed from: i0 */
    public static C6867c m25933i0(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings) {
        return m25934j0(str, actionCodeSettings, (IdpResponse) null, false);
    }

    /* renamed from: j0 */
    public static C6867c m25934j0(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings, @Nullable IdpResponse idpResponse, boolean z) {
        C6867c cVar = new C6867c();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        bundle.putParcelable("action_code_settings", actionCodeSettings);
        bundle.putParcelable("extra_idp_response", idpResponse);
        bundle.putBoolean("force_same_device", z);
        cVar.setArguments(bundle);
        return cVar;
    }

    /* renamed from: m0 */
    private void m25935m0(View view, String str) {
        String string = getString(R$string.fui_email_link_email_sent, str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C6901d.m26060a(spannableStringBuilder, string, str);
        ((TextView) view.findViewById(R$id.sign_in_email_sent_text)).setText(spannableStringBuilder);
    }

    /* renamed from: n0 */
    private void m25936n0(View view, String str) {
        view.findViewById(R$id.trouble_signing_in).setOnClickListener(new C6870b(str));
    }

    /* renamed from: o0 */
    private void m25937o0(View view) {
        C8205f.m34072f(requireContext(), mo37887U(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        m25932h0();
        String string = getArguments().getString("extra_email");
        ActionCodeSettings actionCodeSettings = (ActionCodeSettings) getArguments().getParcelable("action_code_settings");
        IdpResponse idpResponse = (IdpResponse) getArguments().getParcelable("extra_idp_response");
        boolean z = getArguments().getBoolean("force_same_device");
        if (!this.f16048z) {
            this.f16045o.mo40874q(string, actionCodeSettings, idpResponse, z);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof C6871c) {
            this.f16046p = (C6871c) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement TroubleSigningInListener");
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_email_link_sign_in_layout, viewGroup, false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("emailSent", this.f16048z);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f16048z = bundle.getBoolean("emailSent");
        }
        ScrollView scrollView = (ScrollView) view.findViewById(R$id.top_level_view);
        this.f16047s = scrollView;
        if (!this.f16048z) {
            scrollView.setVisibility(8);
        }
        String string = getArguments().getString("extra_email");
        m25935m0(view, string);
        m25936n0(view, string);
        m25937o0(view);
    }
}
