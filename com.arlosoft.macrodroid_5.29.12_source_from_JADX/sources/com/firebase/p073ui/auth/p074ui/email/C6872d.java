package com.firebase.p073ui.auth.p074ui.email;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
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
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.textfield.TextInputLayout;
import p138n5.C7985a;
import p159r5.C8205f;
import p165s5.C10234b;
import p170t5.C10258b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.d */
/* compiled from: EmailLinkPromptEmailFragment */
public class C6872d extends C7985a implements View.OnClickListener {

    /* renamed from: c */
    private Button f16053c;

    /* renamed from: d */
    private ProgressBar f16054d;

    /* renamed from: f */
    private EditText f16055f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextInputLayout f16056g;

    /* renamed from: o */
    private C10234b f16057o;

    /* renamed from: p */
    private C10258b f16058p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6874b f16059s;

    /* renamed from: com.firebase.ui.auth.ui.email.d$a */
    /* compiled from: EmailLinkPromptEmailFragment */
    class C6873a extends C6905d<IdpResponse> {
        C6873a(C7985a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            C6872d.this.f16056g.setError(exc.getMessage());
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            C6872d.this.f16059s.mo34198C1(idpResponse);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.d$b */
    /* compiled from: EmailLinkPromptEmailFragment */
    interface C6874b {
        /* renamed from: C1 */
        void mo34198C1(IdpResponse idpResponse);
    }

    /* renamed from: Z */
    private void m25945Z() {
        C10258b bVar = (C10258b) new ViewModelProvider(this).get(C10258b.class);
        this.f16058p = bVar;
        bVar.mo34278g(mo37887U());
        this.f16058p.mo34267i().observe(getViewLifecycleOwner(), new C6873a(this));
    }

    /* renamed from: a0 */
    public static C6872d m25946a0() {
        return new C6872d();
    }

    /* renamed from: e0 */
    private void m25947e0() {
        String obj = this.f16055f.getText().toString();
        if (this.f16057o.mo40845b(obj)) {
            this.f16058p.mo40875C(obj);
        }
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16053c.setEnabled(true);
        this.f16054d.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16053c.setEnabled(false);
        this.f16054d.setVisibility(0);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof C6874b) {
            this.f16059s = (C6874b) activity;
            m25945Z();
            return;
        }
        throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.button_next) {
            m25947e0();
        } else if (id == R$id.email_layout || id == R$id.email) {
            this.f16056g.setError((CharSequence) null);
        }
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_check_email_layout, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.f16053c = (Button) view.findViewById(R$id.button_next);
        this.f16054d = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.f16053c.setOnClickListener(this);
        this.f16056g = (TextInputLayout) view.findViewById(R$id.email_layout);
        this.f16055f = (EditText) view.findViewById(R$id.email);
        this.f16057o = new C10234b(this.f16056g);
        this.f16056g.setOnClickListener(this);
        this.f16055f.setOnClickListener(this);
        getActivity().setTitle(R$string.fui_email_link_confirm_email_header);
        C8205f.m34072f(requireContext(), mo37887U(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
