package com.firebase.p073ui.auth.p074ui.email;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.util.p075ui.C6898c;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseNetworkException;
import p138n5.C7985a;
import p141o5.C8036a;
import p159r5.C8205f;
import p165s5.C10234b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.a */
/* compiled from: CheckEmailFragment */
public class C6862a extends C7985a implements View.OnClickListener, C6898c.C6900b {

    /* renamed from: c */
    private C8036a f16034c;

    /* renamed from: d */
    private Button f16035d;

    /* renamed from: f */
    private ProgressBar f16036f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public EditText f16037g;

    /* renamed from: o */
    private TextInputLayout f16038o;

    /* renamed from: p */
    private C10234b f16039p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6864b f16040s;

    /* renamed from: com.firebase.ui.auth.ui.email.a$a */
    /* compiled from: CheckEmailFragment */
    class C6863a extends C6905d<User> {
        C6863a(C7985a aVar, int i) {
            super(aVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if ((exc instanceof FirebaseUiException) && ((FirebaseUiException) exc).mo34082a() == 3) {
                C6862a.this.f16040s.mo34191V(exc);
            }
            if (exc instanceof FirebaseNetworkException) {
                Snackbar.m69560c0(C6862a.this.getView(), C6862a.this.getString(R$string.fui_no_internet), -1).mo58859S();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull User user) {
            String a = user.mo34158a();
            String d = user.mo34161d();
            C6862a.this.f16037g.setText(a);
            if (d == null) {
                C6862a.this.f16040s.mo34195z1(new User.C6853b("password", a).mo34172b(user.mo34159b()).mo34174d(user.mo34160c()).mo34171a());
            } else if (d.equals("password") || d.equals("emailLink")) {
                C6862a.this.f16040s.mo34192a0(user);
            } else {
                C6862a.this.f16040s.mo34190R0(user);
            }
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.a$b */
    /* compiled from: CheckEmailFragment */
    interface C6864b {
        /* renamed from: R0 */
        void mo34190R0(User user);

        /* renamed from: V */
        void mo34191V(Exception exc);

        /* renamed from: a0 */
        void mo34192a0(User user);

        /* renamed from: z1 */
        void mo34195z1(User user);
    }

    /* renamed from: Z */
    public static C6862a m25912Z(@Nullable String str) {
        C6862a aVar = new C6862a();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: a0 */
    private void m25913a0() {
        String obj = this.f16037g.getText().toString();
        if (this.f16039p.mo40845b(obj)) {
            this.f16034c.mo37938s(obj);
        }
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16035d.setEnabled(true);
        this.f16036f.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16035d.setEnabled(false);
        this.f16036f.setVisibility(0);
    }

    /* renamed from: j1 */
    public void mo34200j1() {
        m25913a0();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        C8036a aVar = (C8036a) new ViewModelProvider(this).get(C8036a.class);
        this.f16034c = aVar;
        aVar.mo34278g(mo37887U());
        FragmentActivity activity = getActivity();
        if (activity instanceof C6864b) {
            this.f16040s = (C6864b) activity;
            this.f16034c.mo34267i().observe(getViewLifecycleOwner(), new C6863a(this, R$string.fui_progress_dialog_checking_accounts));
            if (bundle == null) {
                String string = getArguments().getString("extra_email");
                if (!TextUtils.isEmpty(string)) {
                    this.f16037g.setText(string);
                    m25913a0();
                } else if (mo37887U().f15979B) {
                    this.f16034c.mo37937r();
                }
            }
        } else {
            throw new IllegalStateException("Activity must implement CheckEmailListener");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f16034c.mo37939t(i, i2, intent);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.button_next) {
            m25913a0();
        } else if (id == R$id.email_layout || id == R$id.email) {
            this.f16038o.setError((CharSequence) null);
        }
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_check_email_layout, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.f16035d = (Button) view.findViewById(R$id.button_next);
        this.f16036f = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.f16038o = (TextInputLayout) view.findViewById(R$id.email_layout);
        this.f16037g = (EditText) view.findViewById(R$id.email);
        this.f16039p = new C10234b(this.f16038o);
        this.f16038o.setOnClickListener(this);
        this.f16037g.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(R$id.header_text);
        if (textView != null) {
            textView.setVisibility(8);
        }
        C6898c.m26058a(this.f16037g, this);
        if (Build.VERSION.SDK_INT >= 26 && mo37887U().f15979B) {
            this.f16037g.setImportantForAutofill(2);
        }
        this.f16035d.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R$id.email_tos_and_pp_text);
        TextView textView3 = (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text);
        FlowParameters U = mo37887U();
        if (!U.mo34147i()) {
            C8205f.m34071e(requireContext(), U, textView2);
            return;
        }
        textView2.setVisibility(8);
        C8205f.m34072f(requireContext(), U, textView3);
    }
}
