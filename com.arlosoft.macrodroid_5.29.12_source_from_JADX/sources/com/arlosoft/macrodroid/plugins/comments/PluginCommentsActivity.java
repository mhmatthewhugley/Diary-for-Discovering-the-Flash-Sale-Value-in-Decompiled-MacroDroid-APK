package com.arlosoft.macrodroid.plugins.comments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17523R$anim;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.comments.C3975c;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.plugins.comments.C4999m;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.google.android.material.snackbar.SnackbarAnimate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p058a3.C2229c;
import p063b5.C2253f;
import p083e4.C7271c;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16270q;

/* compiled from: PluginCommentsActivity.kt */
public final class PluginCommentsActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: G */
    public static final C4978a f12552G = new C4978a((C13695i) null);

    /* renamed from: A */
    public C5331h f12553A;

    /* renamed from: B */
    public C4083b f12554B;

    /* renamed from: C */
    private LinearLayoutManager f12555C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C3975c f12556D;

    /* renamed from: E */
    private AppCompatDialog f12557E;

    /* renamed from: F */
    public Map<Integer, View> f12558F = new LinkedHashMap();

    /* renamed from: s */
    public C4999m f12559s;

    /* renamed from: z */
    public C5527g f12560z;

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$a */
    /* compiled from: PluginCommentsActivity.kt */
    public static final class C4978a {
        private C4978a() {
        }

        public /* synthetic */ C4978a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo29798a(Context context, PluginDetail pluginDetail) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(pluginDetail, "pluginDetail");
            Intent intent = new Intent(context, PluginCommentsActivity.class);
            intent.putExtra("plugin", pluginDetail);
            return intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$b */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4979b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ PluginCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4979b(PluginCommentsActivity pluginCommentsActivity, C13635d<? super C4979b> dVar) {
            super(3, dVar);
            this.this$0 = pluginCommentsActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4979b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m19353v0();
                this.this$0.m19345g0(false);
                this.this$0.mo29797i2().mo29813u(String.valueOf(((AppCompatEditText) this.this$0.mo29793V1(C17532R$id.commentText)).getText()));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$c */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4980c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ PluginCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4980c(PluginCommentsActivity pluginCommentsActivity, C13635d<? super C4980c> dVar) {
            super(3, dVar);
            this.this$0 = pluginCommentsActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4980c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C3975c W1 = this.this$0.f12556D;
                if (W1 == null) {
                    C13706o.m87945v("adapter");
                    W1 = null;
                }
                W1.notifyDataSetChanged();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$d */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4981d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;

        C4981d(C13635d<? super C4981d> dVar) {
            super(3, dVar);
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4981d(dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$e */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4982e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ PluginCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4982e(PluginCommentsActivity pluginCommentsActivity, C13635d<? super C4982e> dVar) {
            super(3, dVar);
            this.this$0 = pluginCommentsActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4982e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Intent intent = new Intent();
                intent.putExtra("sign_in", true);
                this.this$0.setResult(-1, intent);
                this.this$0.finish();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$f */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4983f extends C13708q implements C16265l<Comment, C13339u> {
        final /* synthetic */ PluginCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4983f(PluginCommentsActivity pluginCommentsActivity) {
            super(1);
            this.this$0 = pluginCommentsActivity;
        }

        /* renamed from: a */
        public final void mo29803a(Comment comment) {
            C13706o.m87929f(comment, "it");
            this.this$0.m19344f(comment);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29803a((Comment) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$g */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4984g extends C13708q implements C16265l<Comment, C13339u> {

        /* renamed from: a */
        public static final C4984g f12561a = new C4984g();

        C4984g() {
            super(1);
        }

        /* renamed from: a */
        public final void mo29804a(Comment comment) {
            C13706o.m87929f(comment, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29804a((Comment) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$h */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4985h extends C13708q implements C16269p<Comment, Boolean, C13339u> {

        /* renamed from: a */
        public static final C4985h f12562a = new C4985h();

        C4985h() {
            super(2);
        }

        /* renamed from: a */
        public final void mo29805a(Comment comment, boolean z) {
            C13706o.m87929f(comment, "<anonymous parameter 0>");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo29805a((Comment) obj, ((Boolean) obj2).booleanValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.PluginCommentsActivity$i */
    /* compiled from: PluginCommentsActivity.kt */
    static final class C4986i extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Comment $comment;
        final /* synthetic */ EditText $commentText;
        int label;
        final /* synthetic */ PluginCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4986i(PluginCommentsActivity pluginCommentsActivity, Comment comment, EditText editText, C13635d<? super C4986i> dVar) {
            super(3, dVar);
            this.this$0 = pluginCommentsActivity;
            this.$comment = comment;
            this.$commentText = editText;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4986i(this.this$0, this.$comment, this.$commentText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m19347k1(false);
                C4999m i2 = this.this$0.mo29797i2();
                Comment comment = this.$comment;
                EditText editText = this.$commentText;
                i2.mo29815y(comment, String.valueOf(editText != null ? editText.getText() : null));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b2 */
    private final void m19340b2() {
        mo29797i2().mo29810q().observe(this, new C4990d(this));
        mo29797i2().mo29809p().observe(this, new C4988b(this));
        mo29797i2().mo29811s().observe(this, new C4989c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m19341c2(PluginCommentsActivity pluginCommentsActivity, C2229c cVar) {
        C13706o.m87929f(pluginCommentsActivity, "this$0");
        C13706o.m87928e(cVar, "it");
        pluginCommentsActivity.m19350m2(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m19342d2(PluginCommentsActivity pluginCommentsActivity, PagedList pagedList) {
        C13706o.m87929f(pluginCommentsActivity, "this$0");
        C3975c cVar = pluginCommentsActivity.f12556D;
        if (cVar == null) {
            C13706o.m87945v("adapter");
            cVar = null;
        }
        cVar.submitList(pagedList);
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public static final void m19343e2(PluginCommentsActivity pluginCommentsActivity, C4999m.C5000a aVar) {
        C13706o.m87929f(pluginCommentsActivity, "this$0");
        if (aVar != null) {
            pluginCommentsActivity.m19346j2(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m19344f(Comment comment) {
        String[] strArr = {getString(C17541R$string.edit_comment), getString(C17541R$string.delete)};
        new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template).setTitle((int) C17541R$string.select_option).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C4987a(strArr, this, comment)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m19345g0(boolean z) {
        int i = C17532R$id.commentText;
        ((AppCompatEditText) mo29793V1(i)).setEnabled(z);
        float f = 1.0f;
        ((AppCompatEditText) mo29793V1(i)).setAlpha(z ? 1.0f : 0.5f);
        int i2 = C17532R$id.sendCommentButton;
        ((ImageView) mo29793V1(i2)).setEnabled(z);
        ImageView imageView = (ImageView) mo29793V1(i2);
        if (!z) {
            f = 0.5f;
        }
        imageView.setAlpha(f);
    }

    /* renamed from: j2 */
    private final void m19346j2(C4999m.C5000a aVar) {
        DataSource dataSource;
        if (aVar instanceof C4999m.C5000a.C5004d) {
            ((AppCompatEditText) mo29793V1(C17532R$id.commentText)).setText("");
            m19345g0(true);
            LinearLayout linearLayout = (LinearLayout) mo29793V1(C17532R$id.uploadingLayout);
            C13706o.m87928e(linearLayout, "uploadingLayout");
            linearLayout.setVisibility(8);
            return;
        }
        boolean z = aVar instanceof C4999m.C5000a.C5003c;
        int i = C17541R$string.not_allowed_to_post_comment;
        if (z) {
            if (!((C4999m.C5000a.C5003c) aVar).mo29817a()) {
                i = C17541R$string.upload_failed;
            }
            String string = getString(i);
            C13706o.m87928e(string, "getString(if (uiState.no…e R.string.upload_failed)");
            m19352o2(string);
            m19345g0(true);
            LinearLayout linearLayout2 = (LinearLayout) mo29793V1(C17532R$id.uploadingLayout);
            C13706o.m87928e(linearLayout2, "uploadingLayout");
            linearLayout2.setVisibility(8);
        } else if (aVar instanceof C4999m.C5000a.C5002b) {
            C3975c cVar = this.f12556D;
            if (cVar == null) {
                C13706o.m87945v("adapter");
                cVar = null;
            }
            PagedList currentList = cVar.getCurrentList();
            if (!(currentList == null || (dataSource = currentList.getDataSource()) == null)) {
                dataSource.invalidate();
            }
            LinearLayout linearLayout3 = (LinearLayout) mo29793V1(C17532R$id.uploadingLayout);
            C13706o.m87928e(linearLayout3, "uploadingLayout");
            linearLayout3.setVisibility(8);
            AppCompatDialog appCompatDialog = this.f12557E;
            if (appCompatDialog != null) {
                appCompatDialog.dismiss();
            }
        } else if (aVar instanceof C4999m.C5000a.C5001a) {
            LinearLayout linearLayout4 = (LinearLayout) mo29793V1(C17532R$id.uploadingLayout);
            C13706o.m87928e(linearLayout4, "uploadingLayout");
            linearLayout4.setVisibility(8);
            m19347k1(true);
            if (!((C4999m.C5000a.C5001a) aVar).mo29816a()) {
                i = C17541R$string.upload_failed;
            }
            String string2 = getString(i);
            C13706o.m87928e(string2, "getString(if (uiState.no…e R.string.upload_failed)");
            m19352o2(string2);
        } else if (aVar instanceof C4999m.C5000a.C5005e) {
            String string3 = getString(C17541R$string.delete_failed);
            C13706o.m87928e(string3, "getString(R.string.delete_failed)");
            m19352o2(string3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public final void m19347k1(boolean z) {
        AppCompatDialog appCompatDialog = this.f12557E;
        View view = null;
        View findViewById = appCompatDialog != null ? appCompatDialog.findViewById(C17532R$id.commentText) : null;
        AppCompatDialog appCompatDialog2 = this.f12557E;
        View findViewById2 = appCompatDialog2 != null ? appCompatDialog2.findViewById(C17532R$id.updateCommentButton) : null;
        AppCompatDialog appCompatDialog3 = this.f12557E;
        if (appCompatDialog3 != null) {
            view = appCompatDialog3.findViewById(C17532R$id.uploadingLayout);
        }
        if (view != null) {
            view.setVisibility(z ^ true ? 0 : 8);
        }
        if (findViewById != null) {
            findViewById.setEnabled(z);
        }
        float f = 1.0f;
        if (findViewById != null) {
            findViewById.setAlpha(z ? 1.0f : 0.5f);
        }
        if (findViewById2 != null) {
            findViewById2.setEnabled(z);
        }
        if (findViewById2 != null) {
            if (!z) {
                f = 0.5f;
            }
            findViewById2.setAlpha(f);
        }
    }

    /* renamed from: k2 */
    private final void m19348k2(PluginDetail pluginDetail) {
        ((TextView) mo29793V1(C17532R$id.macroNameText)).setText(pluginDetail.getName());
        C7271c.m30018u(this).mo37190t(pluginDetail.getIconUrl()).mo24491a(new C2253f().mo24503h()).mo37169G0((ImageView) mo29793V1(C17532R$id.pluginIcon));
        ((TextView) mo29793V1(C17532R$id.developerName)).setText(pluginDetail.getDeveloperName());
        ImageView imageView = (ImageView) mo29793V1(C17532R$id.sendCommentButton);
        C13706o.m87928e(imageView, "sendCommentButton");
        C4666m.m18147o(imageView, (C13640g) null, new C4979b(this, (C13635d<? super C4979b>) null), 1, (Object) null);
        AppCompatButton appCompatButton = (AppCompatButton) mo29793V1(C17532R$id.retryButton);
        C13706o.m87928e(appCompatButton, "retryButton");
        C4666m.m18147o(appCompatButton, (C13640g) null, new C4980c(this, (C13635d<? super C4980c>) null), 1, (Object) null);
        if (!mo29794f2().mo28009e().mo28008a()) {
            LinearLayout linearLayout = (LinearLayout) mo29793V1(C17532R$id.addCommentLayout);
            C13706o.m87928e(linearLayout, "addCommentLayout");
            linearLayout.setVisibility(8);
            int i = C17532R$id.proVersionText;
            TextView textView = (TextView) mo29793V1(i);
            C13706o.m87928e(textView, "proVersionText");
            textView.setVisibility(0);
            TextView textView2 = (TextView) mo29793V1(i);
            C13706o.m87928e(textView2, "proVersionText");
            C4666m.m18147o(textView2, (C13640g) null, new C4981d((C13635d<? super C4981d>) null), 1, (Object) null);
        } else if (mo29796h2().mo30790b().isGuest()) {
            LinearLayout linearLayout2 = (LinearLayout) mo29793V1(C17532R$id.addCommentLayout);
            C13706o.m87928e(linearLayout2, "addCommentLayout");
            linearLayout2.setVisibility(8);
            int i2 = C17532R$id.proVersionText;
            TextView textView3 = (TextView) mo29793V1(i2);
            C13706o.m87928e(textView3, "proVersionText");
            textView3.setVisibility(0);
            TextView textView4 = (TextView) mo29793V1(i2);
            C13706o.m87928e(textView4, "proVersionText");
            C4666m.m18147o(textView4, (C13640g) null, new C4982e(this, (C13635d<? super C4982e>) null), 1, (Object) null);
            ((TextView) mo29793V1(i2)).setText(getString(C17541R$string.comments_signed_in_users_only));
        }
    }

    /* renamed from: l2 */
    private final void m19349l2(Comment comment) {
        ImageView imageView;
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Plugins_NoTitle);
        this.f12557E = appCompatDialog;
        appCompatDialog.setCancelable(false);
        AppCompatDialog appCompatDialog2 = this.f12557E;
        if (appCompatDialog2 != null) {
            appCompatDialog2.setContentView((int) C17535R$layout.dialog_edit_comment);
        }
        AppCompatDialog appCompatDialog3 = this.f12557E;
        Window window = null;
        EditText editText = appCompatDialog3 != null ? (EditText) appCompatDialog3.findViewById(C17532R$id.commentText) : null;
        if (editText != null) {
            editText.setText(comment.getText());
        }
        if (editText != null) {
            Editable text = editText.getText();
            C13706o.m87926c(text);
            editText.setSelection(text.length());
        }
        AppCompatDialog appCompatDialog4 = this.f12557E;
        if (!(appCompatDialog4 == null || (imageView = (ImageView) appCompatDialog4.findViewById(C17532R$id.updateCommentButton)) == null)) {
            C4666m.m18147o(imageView, (C13640g) null, new C4986i(this, comment, editText, (C13635d<? super C4986i>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog5 = this.f12557E;
        if (appCompatDialog5 != null) {
            appCompatDialog5.setCancelable(true);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        AppCompatDialog appCompatDialog6 = this.f12557E;
        Window window2 = appCompatDialog6 != null ? appCompatDialog6.getWindow() : null;
        C13706o.m87926c(window2);
        layoutParams.copyFrom(window2.getAttributes());
        layoutParams.width = Resources.getSystem().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelSize(C17529R$dimen.margin_medium) * 2);
        AppCompatDialog appCompatDialog7 = this.f12557E;
        if (appCompatDialog7 != null) {
            window = appCompatDialog7.getWindow();
        }
        C13706o.m87926c(window);
        window.setAttributes(layoutParams);
        AppCompatDialog appCompatDialog8 = this.f12557E;
        if (appCompatDialog8 != null) {
            appCompatDialog8.show();
        }
    }

    /* renamed from: m2 */
    private final void m19350m2(C2229c cVar) {
        int i = 0;
        if (cVar == C2229c.LOADING) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) mo29793V1(C17532R$id.loadingView);
            C13706o.m87928e(lottieAnimationView, "loadingView");
            lottieAnimationView.setVisibility(0);
            TextView textView = (TextView) mo29793V1(C17532R$id.noCommentsLabel);
            C13706o.m87928e(textView, "noCommentsLabel");
            textView.setVisibility(8);
            return;
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo29793V1(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView2, "loadingView");
        lottieAnimationView2.setVisibility(8);
        TextView textView2 = (TextView) mo29793V1(C17532R$id.noCommentsLabel);
        C13706o.m87928e(textView2, "noCommentsLabel");
        if (!(cVar == C2229c.EMPTY)) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m19351n2(String[] strArr, PluginCommentsActivity pluginCommentsActivity, Comment comment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(pluginCommentsActivity, "this$0");
        C13706o.m87929f(comment, "$comment");
        String str = strArr[i];
        C13706o.m87928e(str, "options[index]");
        if (C13706o.m87924a(str, pluginCommentsActivity.getString(C17541R$string.edit_comment))) {
            pluginCommentsActivity.m19349l2(comment);
        } else if (C13706o.m87924a(str, pluginCommentsActivity.getString(C17541R$string.delete))) {
            pluginCommentsActivity.mo29797i2().mo29808m(comment);
        }
    }

    /* renamed from: o2 */
    private final void m19352o2(String str) {
        LinearLayout linearLayout = (LinearLayout) mo29793V1(C17532R$id.uploadingLayout);
        C13706o.m87928e(linearLayout, "uploadingLayout");
        linearLayout.setVisibility(8);
        SnackbarAnimate i = SnackbarAnimate.m69574i(findViewById(C17532R$id.coordinatorLayout), str, 0);
        C13706o.m87928e(i, "make(findViewById(R.id.c…ckbarAnimate.LENGTH_LONG)");
        i.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = i.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        i.mo58932r();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public final void m19353v0() {
        AppCompatEditText appCompatEditText = (AppCompatEditText) mo29793V1(C17532R$id.commentText);
        C13706o.m87928e(appCompatEditText, "commentText");
        C4666m.m18144l(appCompatEditText);
        LinearLayout linearLayout = (LinearLayout) mo29793V1(C17532R$id.uploadingLayout);
        C13706o.m87928e(linearLayout, "uploadingLayout");
        linearLayout.setVisibility(0);
    }

    /* renamed from: V1 */
    public View mo29793V1(int i) {
        Map<Integer, View> map = this.f12558F;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f2 */
    public final C4083b mo29794f2() {
        C4083b bVar = this.f12554B;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: g2 */
    public final C5331h mo29795g2() {
        C5331h hVar = this.f12553A;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: h2 */
    public final C5527g mo29796h2() {
        C5527g gVar = this.f12560z;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: i2 */
    public final C4999m mo29797i2() {
        C4999m mVar = this.f12559s;
        if (mVar != null) {
            return mVar;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(0, C17523R$anim.out_to_bottom);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_plugin_comments);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("plugin");
        C13706o.m87926c(parcelableExtra);
        PluginDetail pluginDetail = (PluginDetail) parcelableExtra;
        mo29797i2().mo29812t(pluginDetail);
        m19340b2();
        this.f12556D = new C3975c(pluginDetail, new C4983f(this), C4984g.f12561a, C4985h.f12562a, mo29796h2().mo30790b(), mo29795g2(), C13614t.m87748j());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f12555C = linearLayoutManager;
        linearLayoutManager.setReverseLayout(true);
        LinearLayoutManager linearLayoutManager2 = this.f12555C;
        LinearLayoutManager linearLayoutManager3 = null;
        if (linearLayoutManager2 == null) {
            C13706o.m87945v("layoutManager");
            linearLayoutManager2 = null;
        }
        linearLayoutManager2.setStackFromEnd(true);
        int i = C17532R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) mo29793V1(i);
        C3975c cVar = this.f12556D;
        if (cVar == null) {
            C13706o.m87945v("adapter");
            cVar = null;
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = (RecyclerView) mo29793V1(i);
        LinearLayoutManager linearLayoutManager4 = this.f12555C;
        if (linearLayoutManager4 == null) {
            C13706o.m87945v("layoutManager");
        } else {
            linearLayoutManager3 = linearLayoutManager4;
        }
        recyclerView2.setLayoutManager(linearLayoutManager3);
        m19348k2(pluginDetail);
    }
}
