package com.firebase.p073ui.auth.p074ui.email;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import p138n5.C7985a;
import p159r5.C8205f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.f */
/* compiled from: TroubleSigningInFragment */
public class C6879f extends C7985a implements View.OnClickListener {

    /* renamed from: c */
    private C6880a f16077c;

    /* renamed from: d */
    private ProgressBar f16078d;

    /* renamed from: f */
    private String f16079f;

    /* renamed from: com.firebase.ui.auth.ui.email.f$a */
    /* compiled from: TroubleSigningInFragment */
    interface C6880a {
        /* renamed from: r1 */
        void mo34193r1(String str);
    }

    /* renamed from: W */
    public static C6879f m25969W(@NonNull String str) {
        C6879f fVar = new C6879f();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        fVar.setArguments(bundle);
        return fVar;
    }

    /* renamed from: X */
    private void m25970X(View view) {
        view.findViewById(R$id.button_resend_email).setOnClickListener(this);
    }

    /* renamed from: Z */
    private void m25971Z(View view) {
        C8205f.m34072f(requireContext(), mo37887U(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16078d.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16078d.setVisibility(0);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof C6880a) {
            this.f16077c = (C6880a) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement ResendEmailListener");
    }

    public void onClick(View view) {
        if (view.getId() == R$id.button_resend_email) {
            this.f16077c.mo34193r1(this.f16079f);
        }
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_email_link_trouble_signing_in_layout, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.f16078d = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.f16079f = getArguments().getString("extra_email");
        m25970X(view);
        m25971Z(view);
    }
}
