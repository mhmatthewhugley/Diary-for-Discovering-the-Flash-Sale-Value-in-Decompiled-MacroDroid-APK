package com.arlosoft.macrodroid.action.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NonAppActivityWithPreventClash;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.InvokedByOptionDialogTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.commons.p353io.IOUtils;
import p257f0.C12203i;
import p257f0.C12204j;
import p257f0.C12205k;

public class OptionDialogActivity extends NonAppActivityWithPreventClash {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f7786A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f7787B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public Timer f7788C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public long[] f7789D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ActionBlockData[] f7790E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public TriggerContextInfo f7791F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f7792G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f7793H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public String f7794I;

    /* renamed from: J */
    private boolean f7795J;

    /* renamed from: K */
    private boolean f7796K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Macro f7797L;

    /* renamed from: M */
    private int f7798M;

    /* renamed from: N */
    private Stack<Integer> f7799N;

    /* renamed from: O */
    private boolean f7800O;

    /* renamed from: P */
    private Trigger f7801P;

    /* renamed from: Q */
    private boolean f7802Q;

    /* renamed from: R */
    private ResumeMacroInfo f7803R;
    @BindView(2131362119)
    Button button1;
    @BindView(2131362120)
    Button button2;
    @BindView(2131362121)
    Button button3;
    @BindView(2131363420)
    TextView messageView;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public long f7804z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.OptionDialogActivity$a */
    class C2824a implements Runnable {

        /* renamed from: A */
        final /* synthetic */ long f7805A;

        /* renamed from: B */
        final /* synthetic */ Trigger f7806B;

        /* renamed from: C */
        final /* synthetic */ int f7807C;

        /* renamed from: D */
        final /* synthetic */ Stack f7808D;

        /* renamed from: E */
        final /* synthetic */ boolean f7809E;

        /* renamed from: F */
        final /* synthetic */ boolean f7810F;

        /* renamed from: G */
        final /* synthetic */ ResumeMacroInfo f7811G;

        /* renamed from: H */
        final /* synthetic */ boolean f7812H;

        /* renamed from: I */
        final /* synthetic */ boolean f7813I;

        /* renamed from: a */
        final /* synthetic */ Context f7814a;

        /* renamed from: c */
        final /* synthetic */ String f7815c;

        /* renamed from: d */
        final /* synthetic */ String f7816d;

        /* renamed from: f */
        final /* synthetic */ long[] f7817f;

        /* renamed from: g */
        final /* synthetic */ ActionBlockData[] f7818g;

        /* renamed from: o */
        final /* synthetic */ String[] f7819o;

        /* renamed from: p */
        final /* synthetic */ int f7820p;

        /* renamed from: s */
        final /* synthetic */ int f7821s;

        /* renamed from: z */
        final /* synthetic */ TriggerContextInfo f7822z;

        C2824a(Context context, String str, String str2, long[] jArr, ActionBlockData[] actionBlockDataArr, String[] strArr, int i, int i2, TriggerContextInfo triggerContextInfo, long j, Trigger trigger, int i3, Stack stack, boolean z, boolean z2, ResumeMacroInfo resumeMacroInfo, boolean z3, boolean z4) {
            this.f7814a = context;
            this.f7815c = str;
            this.f7816d = str2;
            this.f7817f = jArr;
            this.f7818g = actionBlockDataArr;
            this.f7819o = strArr;
            this.f7820p = i;
            this.f7821s = i2;
            this.f7822z = triggerContextInfo;
            this.f7805A = j;
            this.f7806B = trigger;
            this.f7807C = i3;
            this.f7808D = stack;
            this.f7809E = z;
            this.f7810F = z2;
            this.f7811G = resumeMacroInfo;
            this.f7812H = z3;
            this.f7813I = z4;
        }

        public void run() {
            try {
                Intent intent = new Intent(this.f7814a, OptionDialogActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("Title", this.f7815c);
                intent.putExtra("Message", this.f7816d);
                intent.putExtra("MacroIds", this.f7817f);
                intent.putExtra("ActionBlockData", this.f7818g);
                intent.putExtra("ButtonNames", this.f7819o);
                intent.putExtra("DefaultButton", this.f7820p);
                intent.putExtra("DefaultTimeout", this.f7821s);
                intent.putExtra("TriggerContextInfo", this.f7822z);
                intent.putExtra("guid", this.f7805A);
                intent.putExtra("TriggerThatInvoked", this.f7806B);
                intent.putExtra("NextActionIndex", this.f7807C);
                intent.putExtra("SkipEndifIndex", this.f7808D);
                intent.putExtra("force_not_enabled", this.f7809E);
                intent.putExtra("IsTest", this.f7810F);
                intent.putExtra("resume_macro_info", this.f7811G);
                intent.putExtra("block_next_action", this.f7812H);
                intent.putExtra("PreventBackButton", this.f7813I);
                this.f7814a.startActivity(intent);
            } catch (Exception unused) {
                C4878b.m18868g("Failed to display option dialog");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public void m13946e2() {
        Macro macro;
        if (this.f7796K && this.f7791F != null && (macro = this.f7797L) != null && !this.f7795J) {
            macro.setTriggerThatInvoked(this.f7801P);
            Macro macro2 = this.f7797L;
            macro2.invokeActions(macro2.getActions(), this.f7798M, this.f7791F, this.f7800O, this.f7799N, this.f7803R);
        }
    }

    /* renamed from: f2 */
    private C4915a m13947f2() {
        return C4934n.m18998M();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ void m13948g2(View view) {
        finish();
        long[] jArr = this.f7789D;
        if (jArr[0] != 2) {
            if (jArr[0] == 1) {
                m13946e2();
                return;
            }
            m13951j2(this.f7797L, jArr[0], this.f7790E[0], this.f7791F);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m13949h2(View view) {
        finish();
        long[] jArr = this.f7789D;
        if (jArr[1] != 2) {
            if (jArr[1] == 1) {
                m13946e2();
                return;
            }
            m13951j2(this.f7797L, jArr[1], this.f7790E[1], this.f7791F);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m13950i2(View view) {
        finish();
        long[] jArr = this.f7789D;
        if (jArr[2] != 2) {
            if (jArr[2] == 1) {
                m13946e2();
                return;
            }
            m13951j2(this.f7797L, jArr[2], this.f7790E[2], this.f7791F);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public void m13951j2(Macro macro, long j, ActionBlockData actionBlockData, TriggerContextInfo triggerContextInfo) {
        ResumeMacroInfo resumeMacroInfo;
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        Macro Q = C4934n.m18998M().mo29682Q(j);
        if (Q != null && Q.canInvoke(triggerContextInfo2)) {
            if (Q.isActionBlock) {
                ActionBlock actionBlock = (ActionBlock) Q;
                ActionBlock cloneActionBlock = actionBlock.cloneActionBlock(false);
                cloneActionBlock.setIsClonedInstance(true);
                m13947f2().mo29647e(cloneActionBlock);
                if (this.f7796K) {
                    resumeMacroInfo = new ResumeMacroInfo(macro.getGUID(), this.f7798M, triggerContextInfo, true, this.f7799N, this.f7803R, actionBlockData.mo27087f());
                } else {
                    resumeMacroInfo = null;
                }
                C4878b.m18874m("Running action block: " + actionBlock.getName(), this.f7797L.getGUID());
                cloneActionBlock.invokeActions(triggerContextInfo, true, resumeMacroInfo, actionBlockData.mo27085e(), Collections.emptyMap(), macro);
                return;
            }
            C4878b.m18874m("Running macro: " + this.f7797L.getName(), this.f7797L.getGUID());
            Q.setTriggerThatInvoked(InvokedByOptionDialogTrigger.m22485g3());
            Q.invokeActions(triggerContextInfo2);
            m13946e2();
        }
    }

    /* renamed from: k2 */
    public static void m13952k2(Context context, String str, String str2, long[] jArr, ActionBlockData[] actionBlockDataArr, String[] strArr, int i, int i2, TriggerContextInfo triggerContextInfo, long j, Trigger trigger, int i3, Stack<Integer> stack, boolean z, boolean z2, ResumeMacroInfo resumeMacroInfo, boolean z3, boolean z4) {
        Context context2 = context;
        Handler handler = new Handler();
        C2824a aVar = r0;
        C2824a aVar2 = new C2824a(context, str, str2, jArr, actionBlockDataArr, strArr, i, i2, triggerContextInfo, j, trigger, i3, stack, z, z2, resumeMacroInfo, z3, z4);
        handler.postDelayed(aVar, NonAppActivityWithPreventClash.m15476N1());
    }

    public void onBackPressed() {
        if (!this.f7802Q) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(524288);
        getWindow().addFlags(4194304);
        setContentView((int) C17535R$layout.option_dialog);
        getWindow().setLayout(-1, -2);
        ButterKnife.bind((Activity) this);
        setFinishOnTouchOutside(false);
        if (getIntent() == null || getIntent().getExtras() == null) {
            C4878b.m18868g("Failed to start OptionDialogActivity - extras are null");
            finish();
            return;
        }
        this.f7795J = getIntent().getExtras().getBoolean("IsTest");
        this.f7796K = getIntent().getExtras().getBoolean("block_next_action");
        this.f7802Q = getIntent().getBooleanExtra("PreventBackButton", false);
        this.f7798M = getIntent().getExtras().getInt("NextActionIndex");
        this.f7800O = getIntent().getBooleanExtra("force_not_enabled", false);
        this.f7801P = (Trigger) getIntent().getExtras().getParcelable("TriggerThatInvoked");
        if (getIntent().hasExtra("SkipEndifIndex")) {
            this.f7799N = C4061t1.m16017s((ArrayList) getIntent().getSerializableExtra("SkipEndifIndex"));
        } else {
            this.f7799N = new Stack<>();
        }
        Macro Q = C4934n.m18998M().mo29682Q(getIntent().getExtras().getLong("guid"));
        this.f7797L = Q;
        if (Q == null) {
            C4878b.m18868g("Could not find macro in Confirm Next Actions");
            finish();
            return;
        }
        String string = getIntent().getExtras().getString("Title");
        String string2 = getIntent().getExtras().getString("Message");
        this.f7789D = getIntent().getExtras().getLongArray("MacroIds");
        Parcelable[] parcelableArray = getIntent().getExtras().getParcelableArray("ActionBlockData");
        this.f7790E = new ActionBlockData[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            this.f7790E[i] = (ActionBlockData) parcelableArray[i];
        }
        String[] stringArray = getIntent().getExtras().getStringArray("ButtonNames");
        this.f7791F = (TriggerContextInfo) getIntent().getExtras().getParcelable("TriggerContextInfo");
        this.f7786A = getIntent().getIntExtra("DefaultButton", -1);
        this.f7787B = getIntent().getIntExtra("DefaultTimeout", -1);
        this.f7803R = (ResumeMacroInfo) getIntent().getParcelableExtra("resume_macro_info");
        setTitle(C4023j0.m15760t0(this, string, this.f7791F, this.f7797L));
        this.f7804z = System.currentTimeMillis();
        if (TextUtils.isEmpty(stringArray[0]) || this.f7789D[0] == 0) {
            this.button1.setVisibility(8);
        } else {
            String t0 = C4023j0.m15760t0(this, stringArray[0], this.f7791F, this.f7797L);
            this.f7792G = t0;
            this.button1.setText(t0);
            this.button1.setOnClickListener(new C12203i(this));
        }
        if (TextUtils.isEmpty(stringArray[1]) || this.f7789D[1] == 0) {
            this.button2.setVisibility(8);
        } else {
            String t02 = C4023j0.m15760t0(this, stringArray[1], this.f7791F, this.f7797L);
            this.f7793H = t02;
            this.button2.setText(t02);
            this.button2.setOnClickListener(new C12204j(this));
        }
        if (TextUtils.isEmpty(stringArray[2]) || this.f7789D[2] == 0) {
            this.button3.setVisibility(8);
        } else {
            String t03 = C4023j0.m15760t0(this, stringArray[2], this.f7791F, this.f7797L);
            this.f7794I = t03;
            this.button3.setText(t03);
            this.button3.setOnClickListener(new C12205k(this));
        }
        if (TextUtils.isEmpty(string2)) {
            this.messageView.setVisibility(8);
        } else {
            this.messageView.setText(Html.fromHtml(C4023j0.m15760t0(this, string2, this.f7791F, this.f7797L).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX).replace(IOUtils.LINE_SEPARATOR_UNIX, "<br/>").replaceAll(" ", "&nbsp;")));
        }
        setFinishOnTouchOutside(false);
        int i2 = this.f7786A;
        if (i2 > 0 && this.f7789D[i2 - 1] != 0 && !TextUtils.isEmpty(stringArray[i2 - 1])) {
            Timer timer = new Timer();
            this.f7788C = timer;
            timer.scheduleAtFixedRate(new C2825b(this, (C2824a) null), 0, 1000);
        }
        if (!this.f7796K && !this.f7795J) {
            this.f7797L.setTriggerThatInvoked(this.f7801P);
            Macro macro = this.f7797L;
            macro.invokeActions(macro.getActions(), this.f7798M, this.f7791F, this.f7800O, this.f7799N, this.f7803R);
        }
    }

    public void onStop() {
        super.onStop();
        Timer timer = this.f7788C;
        if (timer != null) {
            timer.cancel();
        }
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        finish();
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.OptionDialogActivity$b */
    private class C2825b extends TimerTask {

        /* renamed from: a */
        boolean f7823a;

        private C2825b() {
            this.f7823a = false;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m13955c(long j) {
            int Z1 = OptionDialogActivity.this.f7786A;
            if (Z1 == 1) {
                Button button = OptionDialogActivity.this.button1;
                button.setText(OptionDialogActivity.this.f7792G + " (" + String.valueOf(((long) OptionDialogActivity.this.f7787B) - j) + ")");
            } else if (Z1 == 2) {
                Button button2 = OptionDialogActivity.this.button2;
                button2.setText(OptionDialogActivity.this.f7793H + " (" + String.valueOf(((long) OptionDialogActivity.this.f7787B) - j) + ")");
            } else if (Z1 == 3) {
                Button button3 = OptionDialogActivity.this.button3;
                button3.setText(OptionDialogActivity.this.f7794I + " (" + String.valueOf(((long) OptionDialogActivity.this.f7787B) - j) + ")");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m13956d() {
            OptionDialogActivity optionDialogActivity = OptionDialogActivity.this;
            optionDialogActivity.m13951j2(optionDialogActivity.f7797L, OptionDialogActivity.this.f7789D[OptionDialogActivity.this.f7786A - 1], OptionDialogActivity.this.f7790E[OptionDialogActivity.this.f7786A - 1], OptionDialogActivity.this.f7791F);
            if (OptionDialogActivity.this.f7788C != null) {
                OptionDialogActivity.this.f7788C.cancel();
            }
            OptionDialogActivity.this.m13946e2();
            OptionDialogActivity.this.finish();
        }

        public void run() {
            long currentTimeMillis = (System.currentTimeMillis() - OptionDialogActivity.this.f7804z) / 1000;
            OptionDialogActivity.this.runOnUiThread(new C2839b(this, currentTimeMillis));
            if (currentTimeMillis >= ((long) OptionDialogActivity.this.f7787B) && !this.f7823a) {
                this.f7823a = true;
                OptionDialogActivity.this.runOnUiThread(new C2838a(this));
            }
        }

        /* synthetic */ C2825b(OptionDialogActivity optionDialogActivity, C2824a aVar) {
            this();
        }
    }
}
