package com.firebase.p073ui.auth.p074ui.email;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.util.p075ui.C6901d;
import p138n5.C7985a;
import p159r5.C8201c;
import p159r5.C8205f;
import p159r5.C8207h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.b */
/* compiled from: EmailLinkCrossDeviceLinkingFragment */
public class C6865b extends C7985a implements View.OnClickListener {

    /* renamed from: c */
    private C6866a f16042c;

    /* renamed from: d */
    private ProgressBar f16043d;

    /* renamed from: f */
    private Button f16044f;

    /* renamed from: com.firebase.ui.auth.ui.email.b$a */
    /* compiled from: EmailLinkCrossDeviceLinkingFragment */
    interface C6866a {
        /* renamed from: g1 */
        void mo34199g1();
    }

    /* renamed from: W */
    public static C6865b m25924W() {
        return new C6865b();
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16043d.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16043d.setVisibility(0);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof C6866a) {
            this.f16042c = (C6866a) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
    }

    public void onClick(View view) {
        if (view.getId() == R$id.button_continue) {
            this.f16042c.mo34199g1();
        }
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_email_link_cross_device_linking, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.f16043d = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        Button button = (Button) view.findViewById(R$id.button_continue);
        this.f16044f = button;
        button.setOnClickListener(this);
        String i = C8207h.m34082i(new C8201c(mo37887U().f15991s).mo38280d());
        TextView textView = (TextView) view.findViewById(R$id.cross_device_linking_body);
        String string = getString(R$string.fui_email_link_cross_device_linking_text, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C6901d.m26060a(spannableStringBuilder, string, i);
        textView.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
        C8205f.m34072f(requireContext(), mo37887U(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
