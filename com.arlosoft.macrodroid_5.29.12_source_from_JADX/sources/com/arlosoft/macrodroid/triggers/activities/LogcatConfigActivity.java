package com.arlosoft.macrodroid.triggers.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logcat.LogcatButtonService;
import com.arlosoft.macrodroid.logcat.LogcatMessage;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.LogcatTrigger;
import com.arlosoft.macrodroid.utils.C6364b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p112j2.C7439d0;
import p119k3.C7559u0;
import p135n1.C7967d;
import p139o1.C8027t;
import p149q1.C8157f;
import p190x3.C10378a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;
import p472rf.C17311a;

/* compiled from: LogcatConfigActivity.kt */
public final class LogcatConfigActivity extends MacroDroidBaseActivity {

    /* renamed from: B */
    public static final C5820a f13795B = new C5820a((C13695i) null);

    /* renamed from: A */
    public Map<Integer, View> f13796A = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8027t f13797o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Macro f13798p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public LogcatTrigger f13799s;

    /* renamed from: z */
    private int f13800z;

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$a */
    /* compiled from: LogcatConfigActivity.kt */
    public static final class C5820a {
        private C5820a() {
        }

        public /* synthetic */ C5820a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo31701a(Activity activity, Macro macro, LogcatTrigger logcatTrigger, LogcatMessage logcatMessage, int i) {
            C13706o.m87929f(activity, "activity");
            C13706o.m87929f(macro, "macro");
            C13706o.m87929f(logcatTrigger, "trigger");
            Intent intent = new Intent(activity, LogcatConfigActivity.class);
            intent.putExtra(C8157f.ITEM_TYPE, macro);
            intent.putExtra("trigger", logcatTrigger);
            intent.putExtra("logcat_message", logcatMessage);
            intent.putExtra("enabled_buffers", i);
            activity.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$b */
    /* compiled from: LogcatConfigActivity.kt */
    static final class C5821b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        int label;
        final /* synthetic */ LogcatConfigActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5821b(LogcatConfigActivity logcatConfigActivity, C4023j0.C4028e eVar, C13635d<? super C5821b> dVar) {
            super(3, dVar);
            this.this$0 = logcatConfigActivity;
            this.$magicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5821b(this.this$0, this.$magicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                LogcatConfigActivity logcatConfigActivity = this.this$0;
                C4023j0.C4028e eVar = this.$magicTextListener;
                Macro V1 = logcatConfigActivity.f13798p;
                if (V1 == null) {
                    C13706o.m87945v("macro");
                    V1 = null;
                }
                C4023j0.m15699E(logcatConfigActivity, eVar, V1, C17542R$style.Theme_App_Dialog_Action_SmallText, true, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$c */
    /* compiled from: LogcatConfigActivity.kt */
    static final class C5822c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListenerComponent;
        int label;
        final /* synthetic */ LogcatConfigActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5822c(LogcatConfigActivity logcatConfigActivity, C4023j0.C4028e eVar, C13635d<? super C5822c> dVar) {
            super(3, dVar);
            this.this$0 = logcatConfigActivity;
            this.$magicTextListenerComponent = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5822c(this.this$0, this.$magicTextListenerComponent, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                LogcatConfigActivity logcatConfigActivity = this.this$0;
                C4023j0.C4028e eVar = this.$magicTextListenerComponent;
                Macro V1 = logcatConfigActivity.f13798p;
                if (V1 == null) {
                    C13706o.m87945v("macro");
                    V1 = null;
                }
                C4023j0.m15699E(logcatConfigActivity, eVar, V1, C17542R$style.Theme_App_Dialog_Action_SmallText, true, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$d */
    /* compiled from: LogcatConfigActivity.kt */
    static final class C5823d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ LogcatConfigActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5823d(LogcatConfigActivity logcatConfigActivity, C13635d<? super C5823d> dVar) {
            super(3, dVar);
            this.this$0 = logcatConfigActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5823d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (ContextCompat.checkSelfPermission(C10378a.f23596a.mo41059a(), "android.permission.READ_LOGS") != 0) {
                    this.this$0.m23876g2();
                } else {
                    this.this$0.m23871b2();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$e */
    /* compiled from: LogcatConfigActivity.kt */
    static final class C5824e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ LogcatConfigActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5824e(LogcatConfigActivity logcatConfigActivity, C13635d<? super C5824e> dVar) {
            super(3, dVar);
            this.this$0 = logcatConfigActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5824e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C8027t T1 = this.this$0.f13797o;
                C8027t tVar = null;
                if (T1 == null) {
                    C13706o.m87945v("binding");
                    T1 = null;
                }
                Editable text = T1.f19457n.getText();
                if (text == null || text.length() == 0) {
                    C15626c.makeText(this.this$0, C17541R$string.enter_text, 1).show();
                } else {
                    int U1 = this.this$0.m23873d2();
                    if (U1 == 0) {
                        C15626c.makeText(this.this$0, C17541R$string.action_set_bluetooth_invalid, 1).show();
                    } else {
                        Intent intent = new Intent();
                        LogcatConfigActivity logcatConfigActivity = this.this$0;
                        C8027t T12 = logcatConfigActivity.f13797o;
                        if (T12 == null) {
                            C13706o.m87945v("binding");
                            T12 = null;
                        }
                        String valueOf = String.valueOf(T12.f19454k.getText());
                        C8027t T13 = logcatConfigActivity.f13797o;
                        if (T13 == null) {
                            C13706o.m87945v("binding");
                        } else {
                            tVar = T13;
                        }
                        intent.putExtra("logcat_message", new LogcatMessage(valueOf, String.valueOf(tVar.f19457n.getText())));
                        intent.putExtra("enabled_buffers", U1);
                        this.this$0.setResult(-1, intent);
                        this.this$0.finish();
                    }
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$f */
    /* compiled from: LogcatConfigActivity.kt */
    static final class C5825f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ LogcatConfigActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5825f(LogcatConfigActivity logcatConfigActivity, C13635d<? super C5825f> dVar) {
            super(3, dVar);
            this.this$0 = logcatConfigActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5825f(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.setResult(0);
                this.this$0.finish();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$g */
    /* compiled from: AlertDialog.kt */
    public static final class C5826g implements DialogInterface.OnClickListener {
        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity$h */
    /* compiled from: AlertDialog.kt */
    public static final class C5827h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LogcatConfigActivity f13801a;

        /* renamed from: c */
        final /* synthetic */ int f13802c;

        public C5827h(LogcatConfigActivity logcatConfigActivity, int i) {
            this.f13801a = logcatConfigActivity;
            this.f13802c = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
            LogcatButtonService.C4834a aVar = LogcatButtonService.f12159L;
            LogcatConfigActivity logcatConfigActivity = this.f13801a;
            Macro V1 = logcatConfigActivity.f13798p;
            LogcatTrigger logcatTrigger = null;
            if (V1 == null) {
                C13706o.m87945v("macro");
                V1 = null;
            }
            LogcatTrigger W1 = this.f13801a.f13799s;
            if (W1 == null) {
                C13706o.m87945v("trigger");
            } else {
                logcatTrigger = W1;
            }
            aVar.mo29363a(logcatConfigActivity, V1, logcatTrigger, this.f13802c);
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(268435456);
                this.f13801a.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Y1 */
    private final void m23868Y1(LogcatMessage logcatMessage) {
        String str;
        C8027t tVar = this.f13797o;
        C8027t tVar2 = null;
        if (tVar == null) {
            C13706o.m87945v("binding");
            tVar = null;
        }
        AppCompatEditText appCompatEditText = tVar.f19457n;
        LogcatTrigger logcatTrigger = this.f13799s;
        if (logcatTrigger == null) {
            C13706o.m87945v("trigger");
            logcatTrigger = null;
        }
        appCompatEditText.setText(logcatTrigger.mo31303m3());
        C5848m mVar = new C5848m(this);
        C8027t tVar3 = this.f13797o;
        if (tVar3 == null) {
            C13706o.m87945v("binding");
            tVar3 = null;
        }
        AppCompatEditText appCompatEditText2 = tVar3.f19454k;
        LogcatTrigger logcatTrigger2 = this.f13799s;
        if (logcatTrigger2 == null) {
            C13706o.m87945v("trigger");
            logcatTrigger2 = null;
        }
        if (logcatTrigger2.mo31302l3().length() == 0) {
            str = ProxyConfig.MATCH_ALL_SCHEMES;
        } else {
            LogcatTrigger logcatTrigger3 = this.f13799s;
            if (logcatTrigger3 == null) {
                C13706o.m87945v("trigger");
                logcatTrigger3 = null;
            }
            str = logcatTrigger3.mo31302l3();
        }
        appCompatEditText2.setText(str);
        C5849n nVar = new C5849n(this);
        C8027t tVar4 = this.f13797o;
        if (tVar4 == null) {
            C13706o.m87945v("binding");
            tVar4 = null;
        }
        tVar4.f19448e.setChecked(m23875f2(1));
        C8027t tVar5 = this.f13797o;
        if (tVar5 == null) {
            C13706o.m87945v("binding");
            tVar5 = null;
        }
        tVar5.f19450g.setChecked(m23875f2(2));
        C8027t tVar6 = this.f13797o;
        if (tVar6 == null) {
            C13706o.m87945v("binding");
            tVar6 = null;
        }
        tVar6.f19445b.setChecked(m23875f2(4));
        C8027t tVar7 = this.f13797o;
        if (tVar7 == null) {
            C13706o.m87945v("binding");
            tVar7 = null;
        }
        tVar7.f19447d.setChecked(m23875f2(8));
        C8027t tVar8 = this.f13797o;
        if (tVar8 == null) {
            C13706o.m87945v("binding");
            tVar8 = null;
        }
        tVar8.f19449f.setChecked(m23875f2(16));
        C8027t tVar9 = this.f13797o;
        if (tVar9 == null) {
            C13706o.m87945v("binding");
            tVar9 = null;
        }
        tVar9.f19446c.setChecked(m23875f2(32));
        C8027t tVar10 = this.f13797o;
        if (tVar10 == null) {
            C13706o.m87945v("binding");
            tVar10 = null;
        }
        Button button = tVar10.f19456m;
        C13706o.m87928e(button, "binding.magicTextButton");
        C4666m.m18147o(button, (C13640g) null, new C5821b(this, mVar, (C13635d<? super C5821b>) null), 1, (Object) null);
        C8027t tVar11 = this.f13797o;
        if (tVar11 == null) {
            C13706o.m87945v("binding");
            tVar11 = null;
        }
        Button button2 = tVar11.f19453j;
        C13706o.m87928e(button2, "binding.componentMagicTextButton");
        C4666m.m18147o(button2, (C13640g) null, new C5822c(this, nVar, (C13635d<? super C5822c>) null), 1, (Object) null);
        C8027t tVar12 = this.f13797o;
        if (tVar12 == null) {
            C13706o.m87945v("binding");
            tVar12 = null;
        }
        Button button3 = tVar12.f19452i;
        C13706o.m87928e(button3, "binding.captureMessagesButton");
        C4666m.m18147o(button3, (C13640g) null, new C5823d(this, (C13635d<? super C5823d>) null), 1, (Object) null);
        C8027t tVar13 = this.f13797o;
        if (tVar13 == null) {
            C13706o.m87945v("binding");
            tVar13 = null;
        }
        Button button4 = tVar13.f19451h.f19246d;
        C13706o.m87928e(button4, "binding.buttonBar.okButton");
        C4666m.m18147o(button4, (C13640g) null, new C5824e(this, (C13635d<? super C5824e>) null), 1, (Object) null);
        C8027t tVar14 = this.f13797o;
        if (tVar14 == null) {
            C13706o.m87945v("binding");
            tVar14 = null;
        }
        Button button5 = tVar14.f19451h.f19245c;
        C13706o.m87928e(button5, "binding.buttonBar.cancelButton");
        C4666m.m18147o(button5, (C13640g) null, new C5825f(this, (C13635d<? super C5825f>) null), 1, (Object) null);
        if (logcatMessage != null) {
            C8027t tVar15 = this.f13797o;
            if (tVar15 == null) {
                C13706o.m87945v("binding");
                tVar15 = null;
            }
            tVar15.f19454k.setText(logcatMessage.mo29367a());
            C8027t tVar16 = this.f13797o;
            if (tVar16 == null) {
                C13706o.m87945v("binding");
            } else {
                tVar2 = tVar16;
            }
            tVar2.f19457n.setText(logcatMessage.mo29368b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m23869Z1(LogcatConfigActivity logcatConfigActivity, C4023j0.C4029f fVar) {
        C13706o.m87929f(logcatConfigActivity, "this$0");
        C8027t tVar = logcatConfigActivity.f13797o;
        C8027t tVar2 = null;
        if (tVar == null) {
            C13706o.m87945v("binding");
            tVar = null;
        }
        int max = Math.max(tVar.f19457n.getSelectionStart(), 0);
        C8027t tVar3 = logcatConfigActivity.f13797o;
        if (tVar3 == null) {
            C13706o.m87945v("binding");
            tVar3 = null;
        }
        int max2 = Math.max(tVar3.f19457n.getSelectionEnd(), 0);
        C8027t tVar4 = logcatConfigActivity.f13797o;
        if (tVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            tVar2 = tVar4;
        }
        Editable text = tVar2.f19457n.getText();
        C13706o.m87926c(text);
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m23870a2(LogcatConfigActivity logcatConfigActivity, C4023j0.C4029f fVar) {
        C13706o.m87929f(logcatConfigActivity, "this$0");
        C8027t tVar = logcatConfigActivity.f13797o;
        C8027t tVar2 = null;
        if (tVar == null) {
            C13706o.m87945v("binding");
            tVar = null;
        }
        AppCompatEditText appCompatEditText = tVar.f19454k;
        C13706o.m87926c(appCompatEditText);
        int max = Math.max(appCompatEditText.getSelectionStart(), 0);
        C8027t tVar3 = logcatConfigActivity.f13797o;
        if (tVar3 == null) {
            C13706o.m87945v("binding");
            tVar3 = null;
        }
        int max2 = Math.max(tVar3.f19454k.getSelectionEnd(), 0);
        C8027t tVar4 = logcatConfigActivity.f13797o;
        if (tVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            tVar2 = tVar4;
        }
        Editable text = tVar2.f19454k.getText();
        if (text != null) {
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m23871b2() {
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(this)) {
            int d2 = m23873d2();
            if (d2 == 0) {
                C15626c.makeText(this, C17541R$string.action_set_bluetooth_invalid, 1).show();
                return;
            }
            C5163j2.m19927A4(C10378a.f23596a.mo41059a(), d2);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C17311a.m101020b(builder, C17541R$string.trigger_logcat_capture_messages);
            C17311a.m101019a(builder, C17541R$string.trigger_logcat_capture_messages_detail);
            builder.setPositiveButton(17039370, new C5827h(this, d2));
            builder.setNegativeButton(17039360, new C5826g());
            AlertDialog create = builder.create();
            C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
            create.show();
            return;
        }
        C7439d0.m30887d0(this, false, false);
    }

    /* renamed from: c2 */
    private final int m23872c2(int i, CheckBox checkBox) {
        if (checkBox.isChecked()) {
            return i;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final int m23873d2() {
        C8027t tVar = this.f13797o;
        C8027t tVar2 = null;
        if (tVar == null) {
            C13706o.m87945v("binding");
            tVar = null;
        }
        CheckBox checkBox = tVar.f19448e;
        C13706o.m87928e(checkBox, "binding.bufferMainCheckbox");
        int c2 = m23872c2(1, checkBox);
        C8027t tVar3 = this.f13797o;
        if (tVar3 == null) {
            C13706o.m87945v("binding");
            tVar3 = null;
        }
        CheckBox checkBox2 = tVar3.f19450g;
        C13706o.m87928e(checkBox2, "binding.bufferSystemCheckbox");
        int c22 = c2 + m23872c2(2, checkBox2);
        C8027t tVar4 = this.f13797o;
        if (tVar4 == null) {
            C13706o.m87945v("binding");
            tVar4 = null;
        }
        CheckBox checkBox3 = tVar4.f19445b;
        C13706o.m87928e(checkBox3, "binding.bufferCrashCheckbox");
        int c23 = c22 + m23872c2(4, checkBox3);
        C8027t tVar5 = this.f13797o;
        if (tVar5 == null) {
            C13706o.m87945v("binding");
            tVar5 = null;
        }
        CheckBox checkBox4 = tVar5.f19447d;
        C13706o.m87928e(checkBox4, "binding.bufferKernelCheckbox");
        int c24 = c23 + m23872c2(8, checkBox4);
        C8027t tVar6 = this.f13797o;
        if (tVar6 == null) {
            C13706o.m87945v("binding");
            tVar6 = null;
        }
        CheckBox checkBox5 = tVar6.f19449f;
        C13706o.m87928e(checkBox5, "binding.bufferRadioCheckbox");
        int c25 = c24 + m23872c2(16, checkBox5);
        C8027t tVar7 = this.f13797o;
        if (tVar7 == null) {
            C13706o.m87945v("binding");
        } else {
            tVar2 = tVar7;
        }
        CheckBox checkBox6 = tVar2.f19446c;
        C13706o.m87928e(checkBox6, "binding.bufferEventsCheckbox");
        return c25 + m23872c2(32, checkBox6);
    }

    /* renamed from: e2 */
    private final void m23874e2(Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra(C8157f.ITEM_TYPE);
            C13706o.m87926c(parcelableExtra);
            this.f13798p = (Macro) parcelableExtra;
            Parcelable parcelableExtra2 = intent.getParcelableExtra("trigger");
            C13706o.m87926c(parcelableExtra2);
            this.f13799s = (LogcatTrigger) parcelableExtra2;
            this.f13800z = intent.getIntExtra("enabled_buffers", 0);
            m23868Y1((LogcatMessage) intent.getParcelableExtra("logcat_message"));
        }
    }

    /* renamed from: f2 */
    private final boolean m23875f2(int i) {
        return (this.f13800z & i) == i;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m23876g2() {
        C6364b.m24610a(this, C7559u0.f18453l.mo37651a().mo27889c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8027t c = C8027t.m33417c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f13797o = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        m23874e2(getIntent());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m23874e2(intent);
    }
}
