package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.events.RefreshEditMacroPageEvent;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5124c;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p037m.C2009f;
import p119k3.C7509h2;
import p157r3.C8195d;
import p161s1.C10180a;
import p163s3.C10184a;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16270q;
import p370qa.C16271r;
import p414v9.C16747p;
import p440y9.C16971a;
import p448z9.C17071b;

/* compiled from: WebHookTrigger.kt */
public final class WebHookTrigger extends Trigger {
    public static final Parcelable.Creator<WebHookTrigger> CREATOR = new C5777a();

    /* renamed from: g */
    public static final C5778b f13738g = new C5778b((C13695i) null);
    private static int triggerCounter;

    /* renamed from: d */
    public transient C8195d f13739d;

    /* renamed from: f */
    public transient C10184a f13740f;
    private String identifier;
    private transient C2009f progressDialog;
    private transient C17071b tokenUpdloadDisposable;

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$a */
    /* compiled from: WebHookTrigger.kt */
    public static final class C5777a implements Parcelable.Creator<WebHookTrigger> {
        C5777a() {
        }

        /* renamed from: a */
        public WebHookTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new WebHookTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public WebHookTrigger[] newArray(int i) {
            return new WebHookTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$b */
    /* compiled from: WebHookTrigger.kt */
    public static final class C5778b {
        private C5778b() {
        }

        public /* synthetic */ C5778b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m23699c(Map map, Macro macro) {
            C13706o.m87929f(macro, "$macro");
            if (map != null) {
                for (String str : map.keySet()) {
                    Trigger triggerThatInvoked = macro.getTriggerThatInvoked();
                    C13706o.m87928e(triggerThatInvoked, "macro.triggerThatInvoked");
                    WebHookTrigger.f13738g.m23700d(str, (String) map.get(str), triggerThatInvoked);
                }
            }
            macro.invokeActions(macro.getTriggerContextInfo());
        }

        /* renamed from: d */
        private final void m23700d(String str, String str2, SelectableItem selectableItem) {
            VariableValue variableValue;
            String str3 = str;
            String str4 = str2;
            SelectableItem selectableItem2 = selectableItem;
            MacroDroidVariable q = selectableItem2.mo27861q(str3);
            if (q != null) {
                selectableItem2.mo27832M2(q, VariableValue.C6485a.m24840d(VariableValue.Companion, str2, q.mo27743S(), (List) null, 4, (Object) null));
                return;
            }
            try {
                if (C15177w.m93663N(str3, "(", false, 2, (Object) null) && C15176v.m93640u(str3, ")", false, 2, (Object) null)) {
                    String substring = str3.substring(0, C15177w.m93682a0(str, "(", 0, false, 6, (Object) null));
                    C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    MacroDroidVariable q2 = selectableItem2.mo27861q(substring);
                    if (q2 != null) {
                        String substring2 = str3.substring(substring.length());
                        C13706o.m87928e(substring2, "this as java.lang.String).substring(startIndex)");
                        DictionaryKeys dictionaryKeys = new DictionaryKeys(C15177w.m93705x0(C15176v.m93630E(C15176v.m93630E(C15176v.m93630E(substring2, ")(", ",", false, 4, (Object) null), "(", "", false, 4, (Object) null), ")", "", false, 4, (Object) null), new String[]{","}, false, 0, 6, (Object) null));
                        VariableValue.DictionaryEntry o = q2.mo27771o(dictionaryKeys.getKeys());
                        if (o != null) {
                            variableValue = VariableValue.Companion.mo32660c(str4, o.getVariable().getVariableType(), dictionaryKeys.getKeys());
                        } else {
                            variableValue = new VariableValue.StringValue(str4 == null ? "" : str4, dictionaryKeys.getKeys());
                        }
                        selectableItem2.mo27832M2(q2, variableValue);
                    }
                }
            } catch (Exception e) {
                C4878b.m18868g("Webhook variable processing failed: " + e + '}');
            }
        }

        /* renamed from: b */
        public final void mo31632b(String str, Map<String, String> map) {
            C13706o.m87929f(str, "id");
            ArrayList<Macro> arrayList = new ArrayList<>();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (it.hasNext()) {
                    Trigger next2 = it.next();
                    if ((next2 instanceof WebHookTrigger) && C13706o.m87924a(((WebHookTrigger) next2).mo31625Q3(), str) && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            C13706o.m87928e(next, "macro");
                            arrayList.add(next);
                        }
                    }
                }
            }
            for (Macro kaVar : arrayList) {
                new Handler(Looper.getMainLooper()).post(new C5987ka(map, kaVar));
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$c */
    /* compiled from: WebHookTrigger.kt */
    static final class C5779c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ WebHookTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5779c(WebHookTrigger webHookTrigger, C13635d<? super C5779c> dVar) {
            super(3, dVar);
            this.this$0 = webHookTrigger;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5779c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m23672t4();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$d */
    /* compiled from: WebHookTrigger.kt */
    static final class C5780d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TextView $urlLinkText;
        int label;
        final /* synthetic */ WebHookTrigger this$0;

        /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$d$a */
        /* compiled from: WebHookTrigger.kt */
        static final class C5781a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ TextView $urlLinkText;
            final /* synthetic */ WebHookTrigger this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5781a(TextView textView, WebHookTrigger webHookTrigger) {
                super(0);
                this.$urlLinkText = textView;
                this.this$0 = webHookTrigger;
            }

            public final void invoke() {
                TextView textView = this.$urlLinkText;
                if (textView != null) {
                    textView.setText("https://trigger.macrodroid.com/" + C5163j2.m20217n2(this.this$0.mo27827K0(), false) + '/' + this.this$0.mo31625Q3());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5780d(WebHookTrigger webHookTrigger, TextView textView, C13635d<? super C5780d> dVar) {
            super(3, dVar);
            this.this$0 = webHookTrigger;
            this.$urlLinkText = textView;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5780d(this.this$0, this.$urlLinkText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                WebHookTrigger webHookTrigger = this.this$0;
                webHookTrigger.m23682y4(new C5781a(this.$urlLinkText, webHookTrigger));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$e */
    /* compiled from: WebHookTrigger.kt */
    static final class C5782e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TextView $urlLinkText;
        int label;
        final /* synthetic */ WebHookTrigger this$0;

        /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$e$a */
        /* compiled from: WebHookTrigger.kt */
        static final class C5783a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ TextView $urlLinkText;
            final /* synthetic */ WebHookTrigger this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5783a(TextView textView, WebHookTrigger webHookTrigger) {
                super(0);
                this.$urlLinkText = textView;
                this.this$0 = webHookTrigger;
            }

            public final void invoke() {
                TextView textView = this.$urlLinkText;
                if (textView != null) {
                    textView.setText("https://trigger.macrodroid.com/" + C5163j2.m20217n2(this.this$0.mo27827K0(), false) + '/' + this.this$0.mo31625Q3());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5782e(WebHookTrigger webHookTrigger, TextView textView, C13635d<? super C5782e> dVar) {
            super(3, dVar);
            this.this$0 = webHookTrigger;
            this.$urlLinkText = textView;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5782e(this.this$0, this.$urlLinkText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                WebHookTrigger webHookTrigger = this.this$0;
                webHookTrigger.m23678w4(new C5783a(this.$urlLinkText, webHookTrigger));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$f */
    /* compiled from: WebHookTrigger.kt */
    static final class C5784f extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ TextView $tinyUrlLinkText;
        final /* synthetic */ TextView $urlLinkText;
        final /* synthetic */ WebHookTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5784f(TextView textView, WebHookTrigger webHookTrigger, TextView textView2) {
            super(1);
            this.$urlLinkText = textView;
            this.this$0 = webHookTrigger;
            this.$tinyUrlLinkText = textView2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            TextView textView = this.$urlLinkText;
            if (textView != null) {
                textView.setText("https://trigger.macrodroid.com/" + C5163j2.m20217n2(this.this$0.mo27827K0(), false) + '/' + str);
            }
            TextView textView2 = this.$tinyUrlLinkText;
            if (textView2 != null) {
                textView2.setText(C5163j2.m20193k2(this.this$0.mo27827K0()) + '/' + str);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$g */
    /* compiled from: TextView.kt */
    public static final class C5785g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13741a;

        /* renamed from: c */
        final /* synthetic */ EditText f13742c;

        public C5785g(Button button, EditText editText) {
            this.f13741a = button;
            this.f13742c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13741a.setEnabled(this.f13742c.length() >= 5);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$h */
    /* compiled from: WebHookTrigger.kt */
    static final class C5786h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TextView $deviceIdValue;
        final /* synthetic */ Button $exportButton;
        final /* synthetic */ EditText $password;
        final /* synthetic */ TextView $passwordValue;
        final /* synthetic */ ProgressBar $progressIndicator;
        final /* synthetic */ ImageView $shareDeviceIdButton;
        final /* synthetic */ ViewFlipper $viewFlipper;
        int label;
        final /* synthetic */ WebHookTrigger this$0;

        /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$h$a */
        /* compiled from: WebHookTrigger.kt */
        static final class C5787a extends C13708q implements C16265l<Boolean, C13339u> {
            final /* synthetic */ TextView $deviceIdValue;
            final /* synthetic */ Button $exportButton;
            final /* synthetic */ EditText $password;
            final /* synthetic */ TextView $passwordValue;
            final /* synthetic */ ProgressBar $progressIndicator;
            final /* synthetic */ ImageView $shareDeviceIdButton;
            final /* synthetic */ ViewFlipper $viewFlipper;
            final /* synthetic */ WebHookTrigger this$0;

            /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$h$a$a */
            /* compiled from: WebHookTrigger.kt */
            static final class C5788a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
                final /* synthetic */ TextView $deviceIdValue;
                int label;
                final /* synthetic */ WebHookTrigger this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5788a(TextView textView, WebHookTrigger webHookTrigger, C13635d<? super C5788a> dVar) {
                    super(3, dVar);
                    this.$deviceIdValue = textView;
                    this.this$0 = webHookTrigger;
                }

                /* renamed from: h */
                public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                    return new C5788a(this.$deviceIdValue, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object unused = C13652d.m87832c();
                    if (this.label == 0) {
                        C13332o.m85685b(obj);
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", this.$deviceIdValue.getText());
                        intent.setType("text/plain");
                        this.this$0.mo27850j0().startActivity(Intent.createChooser(intent, (CharSequence) null));
                        return C13339u.f61331a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5787a(ViewFlipper viewFlipper, TextView textView, WebHookTrigger webHookTrigger, TextView textView2, EditText editText, ImageView imageView, Button button, ProgressBar progressBar) {
                super(1);
                this.$viewFlipper = viewFlipper;
                this.$deviceIdValue = textView;
                this.this$0 = webHookTrigger;
                this.$passwordValue = textView2;
                this.$password = editText;
                this.$shareDeviceIdButton = imageView;
                this.$exportButton = button;
                this.$progressIndicator = progressBar;
            }

            /* renamed from: a */
            public final void mo31641a(boolean z) {
                if (z) {
                    this.$viewFlipper.setDisplayedChild(1);
                    this.$deviceIdValue.setText(C5163j2.m20217n2(this.this$0.mo27827K0(), false));
                    this.$passwordValue.setText(this.$password.getText().toString());
                    C4666m.m18147o(this.$shareDeviceIdButton, (C13640g) null, new C5788a(this.$deviceIdValue, this.this$0, (C13635d<? super C5788a>) null), 1, (Object) null);
                    return;
                }
                this.$exportButton.setEnabled(true);
                this.$progressIndicator.setVisibility(0);
                C15626c.makeText(this.this$0.mo27827K0(), C17541R$string.webhook_device_id_export_failed_message, 0).show();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo31641a(((Boolean) obj).booleanValue());
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5786h(ProgressBar progressBar, Button button, WebHookTrigger webHookTrigger, EditText editText, ViewFlipper viewFlipper, TextView textView, TextView textView2, ImageView imageView, C13635d<? super C5786h> dVar) {
            super(3, dVar);
            this.$progressIndicator = progressBar;
            this.$exportButton = button;
            this.this$0 = webHookTrigger;
            this.$password = editText;
            this.$viewFlipper = viewFlipper;
            this.$deviceIdValue = textView;
            this.$passwordValue = textView2;
            this.$shareDeviceIdButton = imageView;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5786h(this.$progressIndicator, this.$exportButton, this.this$0, this.$password, this.$viewFlipper, this.$deviceIdValue, this.$passwordValue, this.$shareDeviceIdButton, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$progressIndicator.setVisibility(0);
                this.$exportButton.setEnabled(false);
                this.this$0.m23664p4(this.$password.getText().toString(), new C5787a(this.$viewFlipper, this.$deviceIdValue, this.this$0, this.$passwordValue, this.$password, this.$shareDeviceIdButton, this.$exportButton, this.$progressIndicator));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$i */
    /* compiled from: WebHookTrigger.kt */
    static final class C5789i extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Button $exportButton;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5789i(Button button, C13635d<? super C5789i> dVar) {
            super(4, dVar);
            this.$exportButton = button;
        }

        /* renamed from: h */
        public final Object mo31643h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C5789i iVar = new C5789i(this.$exportButton, dVar);
            iVar.Z$0 = z;
            return iVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo31643h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$exportButton.setEnabled(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$j */
    /* compiled from: WebHookTrigger.kt */
    static final class C5790j extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ Button $exportButton;
        final /* synthetic */ ProgressBar $progressIndicator;
        final /* synthetic */ C16254a<C13339u> $updatedIdHandler;
        int label;
        final /* synthetic */ WebHookTrigger this$0;

        /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$j$a */
        /* compiled from: WebHookTrigger.kt */
        static final class C5791a extends C13708q implements C16265l<Boolean, C13339u> {
            final /* synthetic */ AppCompatDialog $dialog;
            final /* synthetic */ Button $exportButton;
            final /* synthetic */ ProgressBar $progressIndicator;
            final /* synthetic */ C16254a<C13339u> $updatedIdHandler;
            final /* synthetic */ WebHookTrigger this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5791a(C16254a<C13339u> aVar, WebHookTrigger webHookTrigger, AppCompatDialog appCompatDialog, ProgressBar progressBar, Button button) {
                super(1);
                this.$updatedIdHandler = aVar;
                this.this$0 = webHookTrigger;
                this.$dialog = appCompatDialog;
                this.$progressIndicator = progressBar;
                this.$exportButton = button;
            }

            /* renamed from: a */
            public final void mo31645a(boolean z) {
                if (z) {
                    this.$updatedIdHandler.invoke();
                    C15626c.makeText(this.this$0.mo27827K0(), C17541R$string.webhook_new_device_id_was_generated, 1).show();
                    this.$dialog.dismiss();
                    return;
                }
                C15626c.makeText(this.this$0.mo27827K0(), C17541R$string.webhook_new_device_id_generation_failed, 1).show();
                this.$progressIndicator.setVisibility(8);
                this.$exportButton.setEnabled(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo31645a(((Boolean) obj).booleanValue());
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5790j(ProgressBar progressBar, Button button, WebHookTrigger webHookTrigger, C16254a<C13339u> aVar, AppCompatDialog appCompatDialog, C13635d<? super C5790j> dVar) {
            super(3, dVar);
            this.$progressIndicator = progressBar;
            this.$exportButton = button;
            this.this$0 = webHookTrigger;
            this.$updatedIdHandler = aVar;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5790j(this.$progressIndicator, this.$exportButton, this.this$0, this.$updatedIdHandler, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$progressIndicator.setVisibility(0);
                this.$exportButton.setEnabled(false);
                WebHookTrigger webHookTrigger = this.this$0;
                webHookTrigger.m23635W3(new C5791a(this.$updatedIdHandler, webHookTrigger, this.$dialog, this.$progressIndicator, this.$exportButton));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$k */
    /* compiled from: TextView.kt */
    public static final class C5792k implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13743a;

        /* renamed from: c */
        final /* synthetic */ EditText f13744c;

        /* renamed from: d */
        final /* synthetic */ EditText f13745d;

        public C5792k(Button button, EditText editText, EditText editText2) {
            this.f13743a = button;
            this.f13744c = editText;
            this.f13745d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f13743a.setEnabled(this.f13744c.length() > 0 && this.f13745d.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$l */
    /* compiled from: TextView.kt */
    public static final class C5793l implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13746a;

        /* renamed from: c */
        final /* synthetic */ EditText f13747c;

        /* renamed from: d */
        final /* synthetic */ EditText f13748d;

        public C5793l(Button button, EditText editText, EditText editText2) {
            this.f13746a = button;
            this.f13747c = editText;
            this.f13748d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f13746a.setEnabled(this.f13747c.length() > 0 && this.f13748d.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$m */
    /* compiled from: WebHookTrigger.kt */
    static final class C5794m extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ EditText $deviceId;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ Button $importButton;
        final /* synthetic */ C16254a<C13339u> $importComplete;
        final /* synthetic */ ProgressBar $importingProgressIndicator;
        final /* synthetic */ EditText $password;
        int label;
        final /* synthetic */ WebHookTrigger this$0;

        /* renamed from: com.arlosoft.macrodroid.triggers.WebHookTrigger$m$a */
        /* compiled from: WebHookTrigger.kt */
        static final class C5795a extends C13708q implements C16265l<Boolean, C13339u> {
            final /* synthetic */ EditText $deviceId;
            final /* synthetic */ AppCompatDialog $dialog;
            final /* synthetic */ Button $importButton;
            final /* synthetic */ C16254a<C13339u> $importComplete;
            final /* synthetic */ ProgressBar $importingProgressIndicator;
            final /* synthetic */ WebHookTrigger this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5795a(EditText editText, WebHookTrigger webHookTrigger, C16254a<C13339u> aVar, AppCompatDialog appCompatDialog, Button button, ProgressBar progressBar) {
                super(1);
                this.$deviceId = editText;
                this.this$0 = webHookTrigger;
                this.$importComplete = aVar;
                this.$dialog = appCompatDialog;
                this.$importButton = button;
                this.$importingProgressIndicator = progressBar;
            }

            /* renamed from: a */
            public final void mo31653a(boolean z) {
                if (z) {
                    C13696i0 i0Var = C13696i0.f61931a;
                    String I3 = SelectableItem.m15535j1(C17541R$string.webhook_device_id_ported_message);
                    C13706o.m87928e(I3, "getString(R.string.webho…device_id_ported_message)");
                    String format = String.format(I3, Arrays.copyOf(new Object[]{this.$deviceId.getText().toString()}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    C15626c.m94876a(this.this$0.mo27827K0(), format, 0).show();
                    this.$importComplete.invoke();
                    this.$dialog.dismiss();
                    return;
                }
                C15626c.makeText(this.this$0.mo27827K0(), C17541R$string.webhook_device_id_import_failed_message, 0).show();
                this.$importButton.setEnabled(true);
                this.$importingProgressIndicator.setVisibility(8);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo31653a(((Boolean) obj).booleanValue());
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5794m(Button button, ProgressBar progressBar, WebHookTrigger webHookTrigger, EditText editText, EditText editText2, C16254a<C13339u> aVar, AppCompatDialog appCompatDialog, C13635d<? super C5794m> dVar) {
            super(3, dVar);
            this.$importButton = button;
            this.$importingProgressIndicator = progressBar;
            this.this$0 = webHookTrigger;
            this.$deviceId = editText;
            this.$password = editText2;
            this.$importComplete = aVar;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5794m(this.$importButton, this.$importingProgressIndicator, this.this$0, this.$deviceId, this.$password, this.$importComplete, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$importButton.setEnabled(false);
                this.$importingProgressIndicator.setVisibility(0);
                this.this$0.m23640b4(this.$deviceId.getText().toString(), this.$password.getText().toString(), new C5795a(this.$deviceId, this.this$0, this.$importComplete, this.$dialog, this.$importButton, this.$importingProgressIndicator));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public WebHookTrigger(Activity activity, Macro macro) {
        this.identifier = "";
        m23616D1();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ WebHookTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: A4 */
    private final void m23611A4(String str) {
        this.progressDialog = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24103w(ContextCompat.getColor(mo27827K0(), C17528R$color.trigger_primary)).mo24087g(str).mo24098r(true, 0).mo24084c(false).mo24099s();
    }

    /* renamed from: B4 */
    private final void m23613B4() {
        C5163j2.m20156f5(mo27827K0(), false);
        FirebaseMessaging.m76862n().mo63351q().mo23702c(new C6191x9(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final void m23615C4(WebHookTrigger webHookTrigger, Task task) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(task, "task");
        if (task.mo23719t()) {
            boolean z = false;
            String n2 = C5163j2.m20217n2(webHookTrigger.mo27827K0(), false);
            String str = (String) task.mo23715p();
            if (task.mo23715p() == null) {
                C4878b.m18868g("No push token available, Web URL trigger will not currently work");
            } else if (!C13706o.m87924a(str, C5163j2.m20256s1(webHookTrigger.mo27827K0()))) {
                Long Y0 = webHookTrigger.mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18874m("WebHook Trigger -> Uploading push token id to macrodroid backend for this device Id (" + n2 + ')', Y0.longValue());
                C17071b bVar = webHookTrigger.tokenUpdloadDisposable;
                if (bVar != null) {
                    if (bVar != null && !bVar.isDisposed()) {
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                }
                try {
                    C8195d V3 = webHookTrigger.mo31627V3();
                    C13706o.m87928e(n2, "deviceId");
                    C13706o.m87928e(str, "firebaseToken");
                    webHookTrigger.tokenUpdloadDisposable = V3.mo38263f(n2, "", str, C5124c.f12865c).mo79657k(new C5998l9(webHookTrigger, str), new C6070r9(webHookTrigger));
                } catch (Exception e) {
                    C4878b.m18868g("Could not upload push token id: " + e);
                    FirebaseCrashlytics.m6487a().mo22936d(e);
                }
            }
        }
    }

    /* renamed from: D1 */
    private final void m23616D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38301f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public static final void m23618D4(WebHookTrigger webHookTrigger, String str) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C5163j2.m20164g5(webHookTrigger.mo27827K0(), str);
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18874m("Push token upload success", Y0.longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final void m23620E4(WebHookTrigger webHookTrigger, Throwable th) {
        C13706o.m87929f(webHookTrigger, "this$0");
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Push token upload failed, webhook trigger will not function: " + th, Y0.longValue());
        FirebaseCrashlytics.m6487a().mo22936d(th);
        C5163j2.m20156f5(webHookTrigger.mo27827K0(), true);
        webHookTrigger.m23670s4();
    }

    /* renamed from: P3 */
    private final boolean m23631P3(String str) {
        if (!URLUtil.isValidUrl(str)) {
            return false;
        }
        return C15177w.m93705x0(str, new String[]{"/"}, false, 0, 6, (Object) null).size() == 5 && !C15177w.m93663N(str, "#", false, 2, (Object) null);
    }

    /* renamed from: R3 */
    private final C16747p<String> m23632R3(String str) {
        if (this.f13740f != null) {
            C16747p<String> e = mo31626U3().mo40785a(str).mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79724f(new C6046p9(this)).mo79723e(new C5986k9(this));
            C13706o.m87928e(e, "tinyUrlApi.urlTriggerTok…ogressDialog?.dismiss() }");
            return e;
        }
        C16747p<String> k = C16747p.m99412k(str);
        C13706o.m87928e(k, "just(url)");
        return k;
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public static final void m23633S3(WebHookTrigger webHookTrigger, C17071b bVar) {
        C13706o.m87929f(webHookTrigger, "this$0");
        String string = webHookTrigger.mo27827K0().getString(C17541R$string.generate_tiny_url);
        C13706o.m87928e(string, "context.getString(R.string.generate_tiny_url)");
        webHookTrigger.m23611A4(string);
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public static final void m23634T3(WebHookTrigger webHookTrigger) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C2009f fVar = webHookTrigger.progressDialog;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public final void m23635W3(C16265l<? super Boolean, C13339u> lVar) {
        FirebaseMessaging.m76862n().mo63351q().mo23702c(new C6215z9(this, lVar)).mo23705f(new C5816aa(lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public static final void m23636X3(WebHookTrigger webHookTrigger, C16265l lVar, Task task) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(lVar, "$completeHander");
        C13706o.m87929f(task, "task");
        try {
            if (task.mo23718s()) {
                String str = (String) task.mo23715p();
                String uuid = UUID.randomUUID().toString();
                C13706o.m87928e(uuid, "randomUUID().toString()");
                C8195d V3 = webHookTrigger.mo31627V3();
                C13706o.m87928e(str, "firebaseToken");
                webHookTrigger.tokenUpdloadDisposable = V3.mo38264j(uuid, "", str, C5124c.f12865c).mo79657k(new C6034o9(uuid, webHookTrigger, str, lVar), new C6167v9(webHookTrigger, lVar));
                return;
            }
            C4878b.m18868g("No push token available, Web URL trigger will not currently work");
            lVar.invoke(Boolean.FALSE);
        } catch (IOException e) {
            C4878b.m18868g("Firebase token is not available: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public static final void m23637Y3(String str, WebHookTrigger webHookTrigger, String str2, C16265l lVar) {
        C13706o.m87929f(str, "$uid");
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(lVar, "$completeHander");
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18874m("Generated new device id for webhook: " + str + ' ', Y0.longValue());
        C5163j2.m20141d6(webHookTrigger.mo27827K0(), str);
        C5163j2.m20164g5(webHookTrigger.mo27827K0(), str2);
        lVar.invoke(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public static final void m23638Z3(WebHookTrigger webHookTrigger, C16265l lVar, Throwable th) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(lVar, "$completeHander");
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Generate new device id failed: " + th, Y0.longValue());
        lVar.invoke(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public static final void m23639a4(C16265l lVar, Exception exc) {
        C13706o.m87929f(lVar, "$completeHander");
        C13706o.m87929f(exc, "it");
        C4878b.m18868g("No push token available, Web URL trigger will not currently work");
        lVar.invoke(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public final void m23640b4(String str, String str2, C16265l<? super Boolean, C13339u> lVar) {
        FirebaseMessaging.m76862n().mo63351q().mo23702c(new C6203y9(this, str, str2, lVar)).mo23705f(new C5879ba(lVar, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static final void m23641c4(WebHookTrigger webHookTrigger, String str, String str2, C16265l lVar, Task task) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(str, "$deviceId");
        C13706o.m87929f(str2, "$password");
        C13706o.m87929f(lVar, "$completeHander");
        C13706o.m87929f(task, "task");
        if (task.mo23718s()) {
            String str3 = (String) task.mo23715p();
            C8195d V3 = webHookTrigger.mo31627V3();
            String g = C4660g.m18129g(str2);
            C13706o.m87928e(str3, "firebaseToken");
            webHookTrigger.tokenUpdloadDisposable = V3.mo38262e(str, g, str3).mo79657k(new C6022n9(webHookTrigger, str, lVar), new C6179w9(lVar, webHookTrigger));
            return;
        }
        lVar.invoke(Boolean.FALSE);
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Webhook device id import failed: No push token available on this device.", Y0.longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public static final void m23642d4(WebHookTrigger webHookTrigger, String str, C16265l lVar) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(str, "$deviceId");
        C13706o.m87929f(lVar, "$completeHander");
        C5163j2.m20141d6(webHookTrigger.mo27827K0(), str);
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18874m("Webhook device id (" + str + ") ported to this devivce.", Y0.longValue());
        lVar.invoke(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m23643e4(C16265l lVar, WebHookTrigger webHookTrigger, Throwable th) {
        C13706o.m87929f(lVar, "$completeHander");
        C13706o.m87929f(webHookTrigger, "this$0");
        lVar.invoke(Boolean.FALSE);
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Webhook device id import failed: " + th, Y0.longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public static final void m23644f4(C16265l lVar, WebHookTrigger webHookTrigger, Exception exc) {
        C13706o.m87929f(lVar, "$completeHander");
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(exc, "it");
        lVar.invoke(Boolean.FALSE);
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Webhook device id import failed: No push token available on this device.", Y0.longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static final void m23646g4(WebHookTrigger webHookTrigger, TextView textView, ImageView imageView, ImageView imageView2, Button button, View view) {
        C13706o.m87929f(webHookTrigger, "this$0");
        webHookTrigger.m23632R3("https://trigger.macrodroid.com/" + C5163j2.m20217n2(webHookTrigger.mo27827K0(), false)).mo79729o(new C6091s9(webHookTrigger, textView, imageView, imageView2, button), new C6058q9(webHookTrigger));
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m23648h4(WebHookTrigger webHookTrigger, TextView textView, ImageView imageView, ImageView imageView2, Button button, String str) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C15626c.m94876a(webHookTrigger.mo27827K0().getApplicationContext(), str, 0).show();
        C5163j2.m20117a6(webHookTrigger.mo27827K0(), str);
        if (textView != null) {
            textView.setText(str + '/' + webHookTrigger.identifier);
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        button.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final void m23650i4(WebHookTrigger webHookTrigger, Throwable th) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C15626c.makeText(webHookTrigger.mo27827K0().getApplicationContext(), C17541R$string.could_not_connect_to_server, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m23652j4(WebHookTrigger webHookTrigger, TextView textView, View view) {
        C13706o.m87929f(webHookTrigger, "this$0");
        Object systemService = webHookTrigger.mo27827K0().getSystemService("clipboard");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        clipboardManager.setText(String.valueOf(textView != null ? textView.getText() : null));
        Context applicationContext = webHookTrigger.mo27827K0().getApplicationContext();
        C15626c.m94876a(applicationContext, webHookTrigger.mo27827K0().getString(C17541R$string.copied_to_clipboard) + "\n\n" + clipboardManager.getText(), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m23654k4(WebHookTrigger webHookTrigger, TextView textView, View view) {
        C13706o.m87929f(webHookTrigger, "this$0");
        Object systemService = webHookTrigger.mo27827K0().getSystemService("clipboard");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        clipboardManager.setText(String.valueOf(textView != null ? textView.getText() : null));
        Context applicationContext = webHookTrigger.mo27827K0().getApplicationContext();
        C15626c.m94876a(applicationContext, webHookTrigger.mo27827K0().getString(C17541R$string.copied_to_clipboard) + "\n\n" + clipboardManager.getText(), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final void m23656l4(TextView textView, WebHookTrigger webHookTrigger, View view) {
        C13706o.m87929f(webHookTrigger, "this$0");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", SelectableItem.m15535j1(C17541R$string.trigger_web_hook));
        intent.putExtra("android.intent.extra.TEXT", String.valueOf(textView != null ? textView.getText() : null));
        Intent createChooser = Intent.createChooser(intent, webHookTrigger.mo27827K0().getResources().getString(C17541R$string.share_web_link));
        createChooser.addFlags(268435456);
        webHookTrigger.mo27827K0().startActivity(createChooser);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final void m23658m4(TextView textView, WebHookTrigger webHookTrigger, View view) {
        C13706o.m87929f(webHookTrigger, "this$0");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", SelectableItem.m15535j1(C17541R$string.trigger_web_hook));
        intent.putExtra("android.intent.extra.TEXT", String.valueOf(textView != null ? textView.getText() : null));
        Intent createChooser = Intent.createChooser(intent, webHookTrigger.mo27827K0().getResources().getString(C17541R$string.share_web_link));
        createChooser.addFlags(268435456);
        webHookTrigger.mo27827K0().startActivity(createChooser);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final void m23660n4(EditText editText, TextView textView, WebHookTrigger webHookTrigger, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        CharSequence charSequence = null;
        String valueOf = String.valueOf(editText != null ? editText.getText() : null);
        if (textView != null) {
            charSequence = textView.getText();
        }
        String valueOf2 = String.valueOf(charSequence);
        if (!(valueOf.length() > 0) || !webHookTrigger.m23631P3(valueOf2)) {
            C15626c.makeText(webHookTrigger.mo27827K0(), C17541R$string.invalid_value, 0).show();
            return;
        }
        webHookTrigger.identifier = valueOf;
        appCompatDialog.dismiss();
        webHookTrigger.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public static final void m23662o4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public final void m23664p4(String str, C16265l<? super Boolean, C13339u> lVar) {
        String n2 = C5163j2.m20217n2(mo27827K0(), false);
        C8195d V3 = mo31627V3();
        C13706o.m87928e(n2, "deviceId");
        this.tokenUpdloadDisposable = V3.mo38261d(n2, C4660g.m18129g(str)).mo79657k(new C6010m9(this, n2, lVar), new C6155u9(this, lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m23666q4(WebHookTrigger webHookTrigger, String str, C16265l lVar) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(lVar, "$completeHander");
        C5163j2.m20141d6(webHookTrigger.mo27827K0(), str);
        lVar.invoke(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m23668r4(WebHookTrigger webHookTrigger, C16265l lVar, Throwable th) {
        C13706o.m87929f(webHookTrigger, "this$0");
        C13706o.m87929f(lVar, "$completeHander");
        Long Y0 = webHookTrigger.mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Export webhook failed: " + th, Y0.longValue());
        lVar.invoke(Boolean.FALSE);
    }

    /* renamed from: s4 */
    private final void m23670s4() {
        C10180a.m40075a().mo80018i(new RefreshEditMacroPageEvent());
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public final void m23672t4() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_webhook_export_deviceid);
        appCompatDialog.setTitle((int) C17541R$string.webhook_export_device_id_title);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        View findViewById = appCompatDialog.findViewById(2131363462);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.exportButton);
        C13706o.m87926c(findViewById2);
        Button button = (Button) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById3);
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.exportingProgressIndicator);
        C13706o.m87926c(findViewById4);
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.viewFlipper);
        C13706o.m87926c(findViewById5);
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.deviceIdValue);
        C13706o.m87926c(findViewById6);
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.passwordValue);
        C13706o.m87926c(findViewById7);
        View findViewById8 = appCompatDialog.findViewById(C17532R$id.dismissButton);
        C13706o.m87926c(findViewById8);
        View findViewById9 = appCompatDialog.findViewById(C17532R$id.shareDeviceIdButton);
        C13706o.m87925b(findViewById9, "findViewById(id)");
        C13706o.m87926c(findViewById9);
        editText.addTextChangedListener(new C5785g(button, editText));
        button.setEnabled(false);
        C4666m.m18147o(button, (C13640g) null, new C5786h((ProgressBar) findViewById4, button, this, editText, (ViewFlipper) findViewById5, (TextView) findViewById6, (TextView) findViewById7, (ImageView) findViewById9, (C13635d<? super C5786h>) null), 1, (Object) null);
        ((Button) findViewById8).setOnClickListener(new C5951ha(appCompatDialog));
        ((Button) findViewById3).setOnClickListener(new C5927fa(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final void m23674u4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m23676v4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public final void m23678w4(C16254a<C13339u> aVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_webhook_generate_new_deviceid);
        appCompatDialog.setTitle((int) C17541R$string.webhook_trigger_generate_new_device_id);
        View findViewById = appCompatDialog.findViewById(C17532R$id.generateNewIdButton);
        C13706o.m87926c(findViewById);
        Button button = (Button) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.generatingProgressIndicator);
        C13706o.m87926c(findViewById3);
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.understoodCheckBox);
        C13706o.m87926c(findViewById4);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        C16061a.m96671b((CheckBox) findViewById4, (C13640g) null, new C5789i(button, (C13635d<? super C5789i>) null), 1, (Object) null);
        button.setEnabled(false);
        C4666m.m18147o(button, (C13640g) null, new C5790j((ProgressBar) findViewById3, button, this, aVar, appCompatDialog, (C13635d<? super C5790j>) null), 1, (Object) null);
        ((Button) findViewById2).setOnClickListener(new C5939ga(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final void m23680x4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public final void m23682y4(C16254a<C13339u> aVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_webhook_import_deviceid);
        appCompatDialog.setTitle((int) C17541R$string.webhook_import_device_id_title);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        View findViewById = appCompatDialog.findViewById(C17532R$id.deviceId);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) findViewById;
        View findViewById2 = appCompatDialog.findViewById(2131363462);
        C13706o.m87926c(findViewById2);
        EditText editText2 = (EditText) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById3);
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.importButton);
        C13706o.m87926c(findViewById4);
        Button button = (Button) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.importingProgressIndicator);
        C13706o.m87926c(findViewById5);
        editText.addTextChangedListener(new C5792k(button, editText, editText2));
        editText2.addTextChangedListener(new C5793l(button, editText, editText2));
        button.setEnabled(false);
        C4666m.m18147o(button, (C13640g) null, new C5794m(button, (ProgressBar) findViewById5, this, editText, editText2, aVar, appCompatDialog, (C13635d<? super C5794m>) null), 1, (Object) null);
        ((Button) findViewById3).setOnClickListener(new C5903da(appCompatDialog));
        C4666m.m18141i(editText);
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final void m23684z4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (C5163j2.m20248r1(mo27827K0())) {
            return "UPLOAD FAILED - CLICK TO TRY AGAIN";
        }
        return null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return "https://trigger.macrodroid.com/" + C5163j2.m20217n2(mo27827K0(), false) + '/' + this.identifier;
    }

    /* renamed from: Q3 */
    public final String mo31625Q3() {
        return this.identifier;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        triggerCounter--;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7509h2.f18375j.mo37642a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + this.identifier + ')';
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCounter == 0) {
            m23613B4();
        }
        triggerCounter++;
    }

    /* renamed from: U3 */
    public final C10184a mo31626U3() {
        C10184a aVar = this.f13740f;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("tinyUrlApi");
        return null;
    }

    /* renamed from: V3 */
    public final C8195d mo31627V3() {
        C8195d dVar = this.f13739d;
        if (dVar != null) {
            return dVar;
        }
        C13706o.m87945v("webTriggerInteractor");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        int i;
        EditText editText;
        ImageView imageView;
        TextView textView;
        AppCompatDialog appCompatDialog;
        AppCompatDialog appCompatDialog2 = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog2.setContentView((int) C17535R$layout.dialog_web_url_trigger);
        appCompatDialog2.setTitle((int) C17541R$string.trigger_web_hook);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog2.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog2.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        Button button = (Button) appCompatDialog2.findViewById(C17532R$id.okButton);
        TextView textView2 = (TextView) appCompatDialog2.findViewById(C17532R$id.urlLinkText);
        EditText editText2 = (EditText) appCompatDialog2.findViewById(C17532R$id.identifier);
        Button button2 = (Button) appCompatDialog2.findViewById(C17532R$id.tinyUrlButton);
        ImageView imageView2 = (ImageView) appCompatDialog2.findViewById(C17532R$id.urlCopyButton);
        ImageView imageView3 = (ImageView) appCompatDialog2.findViewById(C17532R$id.urlShareButton);
        ImageView imageView4 = (ImageView) appCompatDialog2.findViewById(C17532R$id.urlCopyButtonTinyUrl);
        ImageView imageView5 = (ImageView) appCompatDialog2.findViewById(C17532R$id.urlShareButtonTinyUrl);
        TextView textView3 = (TextView) appCompatDialog2.findViewById(C17532R$id.tinyUrlLinkText);
        View findViewById = appCompatDialog2.findViewById(C17532R$id.portToNewDeviceButton);
        C13706o.m87926c(findViewById);
        TextView textView4 = (TextView) findViewById;
        View findViewById2 = appCompatDialog2.findViewById(C17532R$id.importFromDeviceButton);
        C13706o.m87926c(findViewById2);
        TextView textView5 = (TextView) findViewById2;
        View findViewById3 = appCompatDialog2.findViewById(C17532R$id.newDeviceIdButton);
        C13706o.m87926c(findViewById3);
        TextView textView6 = (TextView) findViewById3;
        String k2 = C5163j2.m20193k2(mo27827K0());
        Button button3 = (Button) appCompatDialog2.findViewById(C17532R$id.cancelButton);
        if (k2 != null) {
            if (textView3 != null) {
                textView3.setText(k2 + '/' + this.identifier);
            }
            if (button2 != null) {
                button2.setVisibility(0);
            }
            i = 8;
        } else {
            if (imageView4 == null) {
                i = 8;
            } else {
                i = 8;
                imageView4.setVisibility(8);
            }
            if (imageView5 != null) {
                imageView5.setVisibility(i);
            }
            if (textView3 != null) {
                textView3.setVisibility(i);
            }
        }
        textView4.setPaintFlags(textView4.getPaintFlags() | i);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        C4666m.m18147o(textView4, (C13640g) null, new C5779c(this, (C13635d<? super C5779c>) null), 1, (Object) null);
        textView5.setPaintFlags(textView5.getPaintFlags() | 8);
        C4666m.m18147o(textView5, (C13640g) null, new C5780d(this, textView2, (C13635d<? super C5780d>) null), 1, (Object) null);
        textView6.setPaintFlags(textView6.getPaintFlags() | 8);
        C4666m.m18147o(textView6, (C13640g) null, new C5782e(this, textView2, (C13635d<? super C5782e>) null), 1, (Object) null);
        if (editText2 != null) {
            editText2.setText(this.identifier);
        }
        if (textView2 != null) {
            textView2.setText("https://trigger.macrodroid.com/" + C5163j2.m20217n2(mo27827K0(), false) + '/' + this.identifier);
        }
        if (editText2 != null) {
            C4666m.m18138f(editText2, new C5784f(textView2, this, textView3));
        }
        if (button2 != null) {
            textView = textView3;
            editText = editText2;
            imageView = imageView5;
            button2.setOnClickListener(new C5974j9(this, textView3, imageView4, imageView5, button2));
        } else {
            textView = textView3;
            editText = editText2;
            imageView = imageView5;
        }
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C5975ja(this, textView2));
        }
        if (imageView4 != null) {
            imageView4.setOnClickListener(new C5963ia(this, textView));
        }
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C5891ca(textView2, this));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new C6143t9(textView, this));
        }
        if (button != null) {
            appCompatDialog = appCompatDialog3;
            button.setOnClickListener(new C5962i9(editText, textView2, this, appCompatDialog));
        } else {
            appCompatDialog = appCompatDialog3;
        }
        if (button3 != null) {
            button3.setOnClickListener(new C5915ea(appCompatDialog));
        }
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.identifier);
    }

    /* renamed from: x1 */
    public void mo25283x1() {
        m23613B4();
        m23670s4();
        C15626c.makeText(mo27827K0(), C17541R$string.retrying_upload, 0).show();
    }

    public WebHookTrigger() {
        this.identifier = "";
        m23616D1();
    }

    private WebHookTrigger(Parcel parcel) {
        super(parcel);
        String str = "";
        this.identifier = str;
        m23616D1();
        String readString = parcel.readString();
        this.identifier = readString != null ? readString : str;
    }
}
