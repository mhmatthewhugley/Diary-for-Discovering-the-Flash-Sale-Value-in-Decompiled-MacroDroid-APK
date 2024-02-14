package com.arlosoft.macrodroid.variables;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.C4068u1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.utils.C6363a1;
import com.arlosoft.macrodroid.utils.C6451w;
import com.arlosoft.macrodroid.variables.C6489b;
import com.arlosoft.macrodroid.variables.C6585q0;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p057a2.C2224m;
import p135n1.C7967d;
import p149q1.C8152a;
import p149q1.C8153b;
import p149q1.C8162k;
import p297ja.C13328m;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16270q;
import p474sf.C17435a;

/* renamed from: com.arlosoft.macrodroid.variables.o0 */
/* compiled from: VariableHelper.kt */
public final class C6520o0 {

    /* renamed from: a */
    public static final C6520o0 f15162a = new C6520o0();

    /* renamed from: com.arlosoft.macrodroid.variables.o0$a */
    /* compiled from: VariableHelper.kt */
    public interface C6521a {
        /* renamed from: a */
        void mo24836a();

        /* renamed from: b */
        void mo24837b(List<String> list);

        /* renamed from: c */
        void mo24838c();

        /* renamed from: d */
        void mo24839d();

        /* renamed from: e */
        void mo24840e(VariableValue.DictionaryEntry dictionaryEntry);
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$a0 */
    /* compiled from: VariableHelper.kt */
    static final class C6522a0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C6487a $dictionaryEventListener;
        final /* synthetic */ TextView $varName;
        final /* synthetic */ MacroDroidVariable $variable;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6522a0(Activity activity, MacroDroidVariable macroDroidVariable, TextView textView, C6487a aVar, C13635d<? super C6522a0> dVar) {
            super(3, dVar);
            this.$activity = activity;
            this.$variable = macroDroidVariable;
            this.$varName = textView;
            this.$dictionaryEventListener = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m24962r(TextView textView, MacroDroidVariable macroDroidVariable, C6487a aVar, View view) {
            textView.setText(macroDroidVariable.getName());
            aVar.mo27160b();
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Activity activity = this.$activity;
                MacroDroidVariable macroDroidVariable = this.$variable;
                C6520o0.m24932o0(activity, macroDroidVariable, new C6583p0(this.$varName, macroDroidVariable, this.$dictionaryEventListener));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6522a0(this.$activity, this.$variable, this.$varName, this.$dictionaryEventListener, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$b */
    /* compiled from: VariableHelper.kt */
    public static final class C6523b {

        /* renamed from: a */
        private final List<String> f15163a;

        /* renamed from: b */
        private final Integer f15164b;

        public C6523b(List<String> list, Integer num) {
            C13706o.m87929f(list, "keys");
            this.f15163a = list;
            this.f15164b = num;
        }

        /* renamed from: a */
        public final List<String> mo32706a() {
            return this.f15163a;
        }

        /* renamed from: b */
        public final Integer mo32707b() {
            return this.f15164b;
        }

        /* renamed from: c */
        public final List<String> mo32708c() {
            return this.f15163a;
        }

        /* renamed from: d */
        public final Integer mo32709d() {
            return this.f15164b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6523b)) {
                return false;
            }
            C6523b bVar = (C6523b) obj;
            return C13706o.m87924a(this.f15163a, bVar.f15163a) && C13706o.m87924a(this.f15164b, bVar.f15164b);
        }

        public int hashCode() {
            int hashCode = this.f15163a.hashCode() * 31;
            Integer num = this.f15164b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "ManualKeyData(keys=" + this.f15163a + ", varType=" + this.f15164b + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$b0 */
    /* compiled from: VariableHelper.kt */
    static final class C6524b0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ C6543g0 $interceptDictionaryEventListener;
        final /* synthetic */ ArrayList<String> $parentKeys;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6524b0(Activity activity, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, C6543g0 g0Var, C13635d<? super C6524b0> dVar) {
            super(3, dVar);
            this.$activity = activity;
            this.$dictionary = dictionary;
            this.$parentKeys = arrayList;
            this.$interceptDictionaryEventListener = g0Var;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6524b0(this.$activity, this.$dictionary, this.$parentKeys, this.$interceptDictionaryEventListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C6520o0.m24873E0(this.$activity, C17542R$style.Theme_App_Dialog_Variables_NoTitle, this.$dictionary, (VariableValue.DictionaryEntry) null, this.$parentKeys, this.$interceptDictionaryEventListener);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$c */
    /* compiled from: VariableHelper.kt */
    public static final class C6525c {

        /* renamed from: a */
        private final boolean f15165a;

        /* renamed from: b */
        private final List<String> f15166b;

        public C6525c(boolean z, List<String> list) {
            this.f15165a = z;
            this.f15166b = list;
        }

        /* renamed from: a */
        public final List<String> mo32714a() {
            return this.f15166b;
        }

        /* renamed from: b */
        public final boolean mo32715b() {
            return this.f15165a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6525c)) {
                return false;
            }
            C6525c cVar = (C6525c) obj;
            return this.f15165a == cVar.f15165a && C13706o.m87924a(this.f15166b, cVar.f15166b);
        }

        public int hashCode() {
            boolean z = this.f15165a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<String> list = this.f15166b;
            return i + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "ManualKeyOption(showManualKeys=" + this.f15165a + ", existingKeys=" + this.f15166b + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$c0 */
    /* compiled from: VariableHelper.kt */
    static final class C6526c0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C13684d0<C6489b> $adapter;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ C6487a $dictionaryEventListener;
        final /* synthetic */ TextView $emptyView;
        final /* synthetic */ RecyclerView $recyclerView;
        int label;

        /* renamed from: com.arlosoft.macrodroid.variables.o0$c0$a */
        /* compiled from: VariableHelper.kt */
        static final class C6527a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ C6487a $dictionaryEventListener;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6527a(C6487a aVar) {
                super(0);
                this.$dictionaryEventListener = aVar;
            }

            public final void invoke() {
                this.$dictionaryEventListener.mo27159a();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$c0$b */
        /* compiled from: AlertDialog.kt */
        public static final class C6528b implements DialogInterface.OnClickListener {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C13706o.m87929f(dialogInterface, "dialog");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$c0$c */
        /* compiled from: AlertDialog.kt */
        public static final class C6529c implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ VariableValue.Dictionary f15167a;

            /* renamed from: c */
            final /* synthetic */ C13684d0 f15168c;

            /* renamed from: d */
            final /* synthetic */ TextView f15169d;

            /* renamed from: f */
            final /* synthetic */ RecyclerView f15170f;

            /* renamed from: g */
            final /* synthetic */ C6487a f15171g;

            public C6529c(VariableValue.Dictionary dictionary, C13684d0 d0Var, TextView textView, RecyclerView recyclerView, C6487a aVar) {
                this.f15167a = dictionary;
                this.f15168c = d0Var;
                this.f15169d = textView;
                this.f15170f = recyclerView;
                this.f15171g = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C6489b bVar;
                C13706o.m87929f(dialogInterface, "dialog");
                this.f15167a.clearAll();
                C6520o0 o0Var = C6520o0.f15162a;
                VariableValue.Dictionary dictionary = this.f15167a;
                T t = this.f15168c.element;
                if (t == null) {
                    C13706o.m87945v("adapter");
                    bVar = null;
                } else {
                    bVar = (C6489b) t;
                }
                o0Var.m24924k0(dictionary, bVar, this.f15169d, this.f15170f, new C6527a(this.f15171g));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6526c0(Activity activity, VariableValue.Dictionary dictionary, C13684d0<C6489b> d0Var, TextView textView, RecyclerView recyclerView, C6487a aVar, C13635d<? super C6526c0> dVar) {
            super(3, dVar);
            this.$activity = activity;
            this.$dictionary = dictionary;
            this.$adapter = d0Var;
            this.$emptyView = textView;
            this.$recyclerView = recyclerView;
            this.$dictionaryEventListener = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6526c0(this.$activity, this.$dictionary, this.$adapter, this.$emptyView, this.$recyclerView, this.$dictionaryEventListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Activity activity = this.$activity;
                VariableValue.Dictionary dictionary = this.$dictionary;
                C13684d0<C6489b> d0Var = this.$adapter;
                TextView textView = this.$emptyView;
                RecyclerView recyclerView = this.$recyclerView;
                C6487a aVar = this.$dictionaryEventListener;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                C17435a.m101225c(builder, C17541R$string.action_clear_notifications_clear_all);
                C17435a.m101223a(builder, C17541R$string.clear_all_variable_entries_confirm);
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6529c(dictionary, d0Var, textView, recyclerView, aVar));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6528b());
                AlertDialog create = builder.create();
                C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
                create.show();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$d */
    /* compiled from: VariableHelper.kt */
    public interface C6530d {
        /* renamed from: a */
        void mo25509a(MacroDroidVariable macroDroidVariable, boolean z);

        /* renamed from: b */
        boolean mo25510b(String str);
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$d0 */
    /* compiled from: VariableHelper.kt */
    static final class C6531d0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C13684d0<C6489b> $adapter;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ C6487a $dictionaryEventListener;
        final /* synthetic */ TextView $emptyView;
        final /* synthetic */ String $keyName;
        final /* synthetic */ VariableValue.Dictionary $parentDictionary;
        final /* synthetic */ RecyclerView $recyclerView;
        final /* synthetic */ boolean $showDeleteDictionaryOption;
        int label;

        /* renamed from: com.arlosoft.macrodroid.variables.o0$d0$a */
        /* compiled from: VariableHelper.kt */
        static final class C6532a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ C6487a $dictionaryEventListener;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6532a(C6487a aVar) {
                super(0);
                this.$dictionaryEventListener = aVar;
            }

            public final void invoke() {
                this.$dictionaryEventListener.mo27159a();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$d0$b */
        /* compiled from: VariableHelper.kt */
        static final class C6533b extends C13708q implements C16265l<VariableValue.DictionaryEntry, Boolean> {
            final /* synthetic */ String $keyName;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6533b(String str) {
                super(1);
                this.$keyName = str;
            }

            /* renamed from: a */
            public final Boolean invoke(VariableValue.DictionaryEntry dictionaryEntry) {
                C13706o.m87929f(dictionaryEntry, "it");
                return Boolean.valueOf(C13706o.m87924a(dictionaryEntry.getKey(), this.$keyName));
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$d0$c */
        /* compiled from: VariableHelper.kt */
        static final class C6534c extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ C6487a $dictionaryEventListener;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6534c(C6487a aVar) {
                super(0);
                this.$dictionaryEventListener = aVar;
            }

            public final void invoke() {
                this.$dictionaryEventListener.mo27159a();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$d0$d */
        /* compiled from: AlertDialog.kt */
        public static final class C6535d implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ VariableValue.Dictionary f15172a;

            /* renamed from: c */
            final /* synthetic */ C13684d0 f15173c;

            /* renamed from: d */
            final /* synthetic */ TextView f15174d;

            /* renamed from: f */
            final /* synthetic */ RecyclerView f15175f;

            /* renamed from: g */
            final /* synthetic */ C6487a f15176g;

            /* renamed from: o */
            final /* synthetic */ AppCompatDialog f15177o;

            /* renamed from: p */
            final /* synthetic */ String f15178p;

            public C6535d(VariableValue.Dictionary dictionary, C13684d0 d0Var, TextView textView, RecyclerView recyclerView, C6487a aVar, AppCompatDialog appCompatDialog, String str) {
                this.f15172a = dictionary;
                this.f15173c = d0Var;
                this.f15174d = textView;
                this.f15175f = recyclerView;
                this.f15176g = aVar;
                this.f15177o = appCompatDialog;
                this.f15178p = str;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C6489b bVar;
                C13706o.m87929f(dialogInterface, "dialog");
                VariableValue.Dictionary dictionary = this.f15172a;
                if (dictionary != null) {
                    boolean unused = C13624y.m87795D(dictionary.getEntries(), new C6533b(this.f15178p));
                    C6520o0 o0Var = C6520o0.f15162a;
                    VariableValue.Dictionary dictionary2 = this.f15172a;
                    T t = this.f15173c.element;
                    if (t == null) {
                        C13706o.m87945v("adapter");
                        bVar = null;
                    } else {
                        bVar = (C6489b) t;
                    }
                    o0Var.m24924k0(dictionary2, bVar, this.f15174d, this.f15175f, new C6534c(this.f15176g));
                } else {
                    this.f15176g.mo27163e();
                }
                this.f15177o.dismiss();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$d0$e */
        /* compiled from: AlertDialog.kt */
        public static final class C6536e implements DialogInterface.OnClickListener {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C13706o.m87929f(dialogInterface, "dialog");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$d0$f */
        /* compiled from: AlertDialog.kt */
        public static final class C6537f implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ VariableValue.Dictionary f15179a;

            /* renamed from: c */
            final /* synthetic */ C13684d0 f15180c;

            /* renamed from: d */
            final /* synthetic */ TextView f15181d;

            /* renamed from: f */
            final /* synthetic */ RecyclerView f15182f;

            /* renamed from: g */
            final /* synthetic */ C6487a f15183g;

            public C6537f(VariableValue.Dictionary dictionary, C13684d0 d0Var, TextView textView, RecyclerView recyclerView, C6487a aVar) {
                this.f15179a = dictionary;
                this.f15180c = d0Var;
                this.f15181d = textView;
                this.f15182f = recyclerView;
                this.f15183g = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C6489b bVar;
                C13706o.m87929f(dialogInterface, "dialog");
                this.f15179a.deleteAll();
                C6520o0 o0Var = C6520o0.f15162a;
                VariableValue.Dictionary dictionary = this.f15179a;
                T t = this.f15180c.element;
                if (t == null) {
                    C13706o.m87945v("adapter");
                    bVar = null;
                } else {
                    bVar = (C6489b) t;
                }
                o0Var.m24924k0(dictionary, bVar, this.f15181d, this.f15182f, new C6532a(this.f15183g));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6531d0(Activity activity, boolean z, VariableValue.Dictionary dictionary, C13684d0<C6489b> d0Var, TextView textView, RecyclerView recyclerView, C6487a aVar, VariableValue.Dictionary dictionary2, AppCompatDialog appCompatDialog, String str, C13635d<? super C6531d0> dVar) {
            super(3, dVar);
            this.$activity = activity;
            this.$showDeleteDictionaryOption = z;
            this.$dictionary = dictionary;
            this.$adapter = d0Var;
            this.$emptyView = textView;
            this.$recyclerView = recyclerView;
            this.$dictionaryEventListener = aVar;
            this.$parentDictionary = dictionary2;
            this.$dialog = appCompatDialog;
            this.$keyName = str;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6531d0(this.$activity, this.$showDeleteDictionaryOption, this.$dictionary, this.$adapter, this.$emptyView, this.$recyclerView, this.$dictionaryEventListener, this.$parentDictionary, this.$dialog, this.$keyName, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            AlertDialog.Builder builder;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Activity activity = this.$activity;
                boolean z = this.$showDeleteDictionaryOption;
                VariableValue.Dictionary dictionary = this.$dictionary;
                C13684d0<C6489b> d0Var = this.$adapter;
                TextView textView = this.$emptyView;
                RecyclerView recyclerView = this.$recyclerView;
                C6487a aVar = this.$dictionaryEventListener;
                VariableValue.Dictionary dictionary2 = this.$parentDictionary;
                AppCompatDialog appCompatDialog = this.$dialog;
                String str = this.$keyName;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity);
                C17435a.m101225c(builder2, C17541R$string.delete_all);
                C17435a.m101223a(builder2, C17541R$string.delete_all_variable_entries_confirm);
                C6537f fVar = r3;
                TextView textView2 = textView;
                TextView textView3 = textView;
                AlertDialog.Builder builder3 = builder2;
                String str2 = str;
                C6537f fVar2 = new C6537f(dictionary, d0Var, textView2, recyclerView, aVar);
                builder3.setPositiveButton((int) C17541R$string.variable_delete_all_entries, (DialogInterface.OnClickListener) fVar);
                if (z) {
                    builder = builder3;
                    builder.setNegativeButton(dictionary.isArray() ? C17541R$string.variable_delete_array : C17541R$string.variable_delete_dictionary, (DialogInterface.OnClickListener) new C6535d(dictionary2, d0Var, textView3, recyclerView, aVar, appCompatDialog, str2));
                } else {
                    builder = builder3;
                }
                builder.setNeutralButton(2131952563, (DialogInterface.OnClickListener) new C6536e());
                AlertDialog create = builder.create();
                C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
                create.show();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$e */
    /* compiled from: VariableHelper.kt */
    public enum C6538e {
        DONT_SHOW,
        SHOW_DICTIONARIES_AND_ARRAYS,
        SHOW_DICTIONARIES_ONLY,
        SHOW_ARRAYS_ONLY
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$e0 */
    /* compiled from: VariableHelper.kt */
    static final class C6539e0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6539e0(AppCompatDialog appCompatDialog, C13635d<? super C6539e0> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6539e0(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$f */
    /* compiled from: VariableHelper.kt */
    public interface C6540f {
        /* renamed from: a */
        void mo24722a(int i, String str);

        /* renamed from: b */
        void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list);
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$f0 */
    /* compiled from: VariableHelper.kt */
    public static final class C6541f0 implements C6489b.C6490a {

        /* renamed from: a */
        final /* synthetic */ String f15189a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<String> f15190b;

        /* renamed from: c */
        final /* synthetic */ Activity f15191c;

        /* renamed from: d */
        final /* synthetic */ VariableValue.Dictionary f15192d;

        /* renamed from: e */
        final /* synthetic */ C6543g0 f15193e;

        C6541f0(String str, ArrayList<String> arrayList, Activity activity, VariableValue.Dictionary dictionary, C6543g0 g0Var) {
            this.f15189a = str;
            this.f15190b = arrayList;
            this.f15191c = activity;
            this.f15192d = dictionary;
            this.f15193e = g0Var;
        }

        /* renamed from: a */
        public void mo32679a(VariableValue.DictionaryEntry dictionaryEntry, boolean z) {
            C13706o.m87929f(dictionaryEntry, "dictionaryEntry");
            if (!(dictionaryEntry.getVariable() instanceof VariableValue.Dictionary)) {
                C6520o0.m24873E0(this.f15191c, C17542R$style.Theme_App_Dialog_Variables_NoTitle, this.f15192d, dictionaryEntry, this.f15190b, this.f15193e);
            } else if (!z) {
                String str = this.f15189a + '[' + dictionaryEntry.getKey() + ']';
                this.f15190b.add(dictionaryEntry.getKey());
                Activity activity = this.f15191c;
                String key = dictionaryEntry.getKey();
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                C6520o0.m24871D0(activity, (MacroDroidVariable) null, str, key, (VariableValue.Dictionary) variable, true, this.f15192d, this.f15190b, this.f15193e);
            } else {
                C6520o0.m24877G0(this.f15191c, C17542R$style.Theme_App_Dialog_Variables_NoTitle, this.f15192d, dictionaryEntry, this.f15193e);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$g */
    /* compiled from: VariableHelper.kt */
    static final class C6542g extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C6542g f15194a = new C6542g();

        C6542g() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(VariableValue variableValue) {
            boolean z;
            C13706o.m87929f(variableValue, "variableValue");
            if (variableValue instanceof VariableValue.Dictionary) {
                VariableValue.Dictionary dictionary = (VariableValue.Dictionary) variableValue;
                if (dictionary.isArray() || dictionary.hasArrayChildren(dictionary)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$g0 */
    /* compiled from: VariableHelper.kt */
    public static final class C6543g0 implements C6487a {

        /* renamed from: a */
        final /* synthetic */ C6487a f15195a;

        /* renamed from: b */
        final /* synthetic */ C13684d0<C6489b> f15196b;

        /* renamed from: c */
        final /* synthetic */ VariableValue.Dictionary f15197c;

        /* renamed from: d */
        final /* synthetic */ TextView f15198d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView f15199e;

        C6543g0(C6487a aVar, C13684d0<C6489b> d0Var, VariableValue.Dictionary dictionary, TextView textView, RecyclerView recyclerView) {
            this.f15195a = aVar;
            this.f15196b = d0Var;
            this.f15197c = dictionary;
            this.f15198d = textView;
            this.f15199e = recyclerView;
        }

        /* renamed from: f */
        private final void m24982f() {
            C6489b bVar;
            T t = this.f15196b.element;
            C6489b bVar2 = null;
            if (t == null) {
                C13706o.m87945v("adapter");
                bVar = null;
            } else {
                bVar = (C6489b) t;
            }
            bVar.mo32678D(this.f15197c);
            int i = 0;
            this.f15198d.setVisibility(this.f15197c.getEntries().isEmpty() ? 0 : 8);
            RecyclerView recyclerView = this.f15199e;
            if (!(!this.f15197c.getEntries().isEmpty())) {
                i = 8;
            }
            recyclerView.setVisibility(i);
            T t2 = this.f15196b.element;
            if (t2 == null) {
                C13706o.m87945v("adapter");
            } else {
                bVar2 = (C6489b) t2;
            }
            bVar2.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo27159a() {
            m24982f();
            this.f15195a.mo27159a();
        }

        /* renamed from: b */
        public void mo27160b() {
            m24982f();
            this.f15195a.mo27160b();
        }

        /* renamed from: c */
        public void mo27161c(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "removedEntry");
            m24982f();
            this.f15195a.mo27161c(dictionaryEntry);
        }

        /* renamed from: d */
        public void mo27162d(VariableValue.DictionaryEntry dictionaryEntry, VariableValue.DictionaryEntry dictionaryEntry2) {
            C13706o.m87929f(dictionaryEntry, "newEntry");
            m24982f();
            this.f15195a.mo27162d(dictionaryEntry, dictionaryEntry2);
        }

        /* renamed from: e */
        public void mo27163e() {
            m24982f();
            this.f15195a.mo27163e();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$h */
    /* compiled from: VariableHelper.kt */
    static final class C6544h extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C6544h f15200a = new C6544h();

        C6544h() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
            if (r2.hasBooleanChildren(r2) != false) goto L_0x0018;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(com.arlosoft.macrodroid.variables.VariableValue r2) {
            /*
                r1 = this;
                java.lang.String r0 = "variableValue"
                kotlin.jvm.internal.C13706o.m87929f(r2, r0)
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.BooleanValue
                if (r0 != 0) goto L_0x0018
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.Dictionary
                if (r0 == 0) goto L_0x0016
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r2 = (com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r2
                boolean r2 = r2.hasBooleanChildren(r2)
                if (r2 == 0) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r2 = 0
                goto L_0x0019
            L_0x0018:
                r2 = 1
            L_0x0019:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.C6544h.invoke(com.arlosoft.macrodroid.variables.VariableValue):java.lang.Boolean");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$h0 */
    /* compiled from: TextView.kt */
    public static final class C6545h0 implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15201a;

        /* renamed from: c */
        final /* synthetic */ EditText f15202c;

        public C6545h0(Button button, EditText editText) {
            this.f15201a = button;
            this.f15202c = editText;
        }

        public void afterTextChanged(Editable editable) {
            Button button = this.f15201a;
            Editable text = this.f15202c.getText();
            C13706o.m87928e(text, "keyName.text");
            button.setEnabled(text.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$i */
    /* compiled from: VariableHelper.kt */
    static final class C6546i extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C6546i f15203a = new C6546i();

        C6546i() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(VariableValue variableValue) {
            C13706o.m87929f(variableValue, "variableValue");
            return Boolean.valueOf(variableValue instanceof VariableValue.Dictionary);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$i0 */
    /* compiled from: VariableHelper.kt */
    public static final class C6547i0 implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ C13678a0 f15204a;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f15205c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f15206d;

        /* renamed from: f */
        final /* synthetic */ RadioButton f15207f;

        /* renamed from: g */
        final /* synthetic */ RadioButton f15208g;

        /* renamed from: o */
        final /* synthetic */ EditText f15209o;

        /* renamed from: p */
        final /* synthetic */ EditText f15210p;

        C6547i0(C13678a0 a0Var, ViewGroup viewGroup, ViewGroup viewGroup2, RadioButton radioButton, RadioButton radioButton2, EditText editText, EditText editText2) {
            this.f15204a = a0Var;
            this.f15205c = viewGroup;
            this.f15206d = viewGroup2;
            this.f15207f = radioButton;
            this.f15208g = radioButton2;
            this.f15209o = editText;
            this.f15210p = editText2;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C13706o.m87929f(adapterView, "parent");
            C13678a0 a0Var = this.f15204a;
            boolean z = false;
            if (a0Var.element) {
                a0Var.element = false;
            } else if (i == 0) {
                this.f15205c.setVisibility(0);
                this.f15206d.setVisibility(8);
                this.f15207f.setChecked(true);
                this.f15208g.setChecked(false);
            } else if (i == 4 || i == 5) {
                this.f15205c.setVisibility(8);
                this.f15206d.setVisibility(8);
            } else {
                this.f15205c.setVisibility(8);
                this.f15206d.setVisibility(0);
                if (i == 1) {
                    this.f15209o.setInputType(InputDeviceCompat.SOURCE_TOUCHSCREEN);
                    this.f15209o.setText("0");
                } else if (i != 3) {
                    this.f15209o.setInputType(655361);
                    this.f15209o.setText("");
                } else {
                    this.f15209o.setInputType(12290);
                    this.f15209o.setText("0");
                }
                C4666m.m18154v(this.f15209o);
                Editable text = this.f15210p.getText();
                C13706o.m87928e(text, "keyName.text");
                if (text.length() > 0) {
                    z = true;
                }
                if (z) {
                    C4666m.m18141i(this.f15209o);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C13706o.m87929f(adapterView, "parent");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$j */
    /* compiled from: VariableHelper.kt */
    static final class C6548j extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C6548j f15211a = new C6548j();

        C6548j() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(VariableValue variableValue) {
            boolean z;
            C13706o.m87929f(variableValue, "variableValue");
            if (variableValue instanceof VariableValue.Dictionary) {
                VariableValue.Dictionary dictionary = (VariableValue.Dictionary) variableValue;
                if (!dictionary.isArray() || dictionary.hasDictionaryChildren(dictionary)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$j0 */
    /* compiled from: VariableHelper.kt */
    static final class C6549j0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ VariableValue.DictionaryEntry $dictionaryEntry;
        final /* synthetic */ C6487a $dictionaryEventListener;
        final /* synthetic */ EditText $keyName;
        final /* synthetic */ ArrayList<String> $parentKeys;
        final /* synthetic */ EditText $textValue;
        final /* synthetic */ RadioButton $trueRadio;
        final /* synthetic */ Spinner $valueTypeSpinner;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6549j0(EditText editText, Spinner spinner, RadioButton radioButton, EditText editText2, VariableValue.DictionaryEntry dictionaryEntry, ArrayList<String> arrayList, VariableValue.Dictionary dictionary, C6487a aVar, AppCompatDialog appCompatDialog, C13635d<? super C6549j0> dVar) {
            super(3, dVar);
            this.$keyName = editText;
            this.$valueTypeSpinner = spinner;
            this.$trueRadio = radioButton;
            this.$textValue = editText2;
            this.$dictionaryEntry = dictionaryEntry;
            this.$parentKeys = arrayList;
            this.$dictionary = dictionary;
            this.$dictionaryEventListener = aVar;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6549j0(this.$keyName, this.$valueTypeSpinner, this.$trueRadio, this.$textValue, this.$dictionaryEntry, this.$parentKeys, this.$dictionary, this.$dictionaryEventListener, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object unused = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r0 = r8.label
                if (r0 != 0) goto L_0x00d2
                p297ja.C13332o.m85685b(r9)
                android.widget.EditText r9 = r8.$keyName
                android.text.Editable r9 = r9.getText()
                java.lang.String r1 = r9.toString()
                android.widget.Spinner r9 = r8.$valueTypeSpinner
                int r9 = r9.getSelectedItemPosition()
                r0 = 2
                r2 = 0
                if (r9 == 0) goto L_0x0084
                r3 = 1
                if (r9 == r3) goto L_0x0074
                if (r9 == r0) goto L_0x0064
                r0 = 3
                if (r9 == r0) goto L_0x0054
                r0 = 4
                if (r9 == r0) goto L_0x0044
                r0 = 5
                if (r9 != r0) goto L_0x003c
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r9 = new com.arlosoft.macrodroid.variables.VariableValue$Dictionary
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4 = 1
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0090
            L_0x003c:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid Dictionary Value"
                r9.<init>(r0)
                throw r9
            L_0x0044:
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r9 = new com.arlosoft.macrodroid.variables.VariableValue$Dictionary
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4 = 0
                r5 = 0
                r6 = 6
                r7 = 0
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0090
            L_0x0054:
                com.arlosoft.macrodroid.variables.VariableValue$DecimalValue r9 = new com.arlosoft.macrodroid.variables.VariableValue$DecimalValue
                android.widget.EditText r0 = r8.$textValue
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                goto L_0x008f
            L_0x0064:
                com.arlosoft.macrodroid.variables.VariableValue$StringValue r9 = new com.arlosoft.macrodroid.variables.VariableValue$StringValue
                android.widget.EditText r3 = r8.$textValue
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                r9.<init>(r3, r2, r0, r2)
                goto L_0x008f
            L_0x0074:
                com.arlosoft.macrodroid.variables.VariableValue$IntegerValue r9 = new com.arlosoft.macrodroid.variables.VariableValue$IntegerValue
                android.widget.EditText r0 = r8.$textValue
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                goto L_0x008f
            L_0x0084:
                com.arlosoft.macrodroid.variables.VariableValue$BooleanValue r9 = new com.arlosoft.macrodroid.variables.VariableValue$BooleanValue
                android.widget.RadioButton r3 = r8.$trueRadio
                boolean r3 = r3.isChecked()
                r9.<init>(r3, r2, r0, r2)
            L_0x008f:
                r2 = r9
            L_0x0090:
                com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r9 = r8.$dictionaryEntry
                if (r9 == 0) goto L_0x00a5
                java.lang.String r9 = r9.getKey()
                if (r9 == 0) goto L_0x00a5
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = r8.$dictionary
                boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r1, r9)
                if (r3 != 0) goto L_0x00a5
                r0.removeKey(r9)
            L_0x00a5:
                java.util.ArrayList<java.lang.String> r9 = r8.$parentKeys
                java.util.List r9 = kotlin.collections.C13566b0.m87443r0(r9, r1)
                r2.setParentKeys(r9)
                com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r9 = new com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry
                r3 = 0
                r4 = 4
                r5 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r0 = r8.$dictionary
                r0.setEntry(r9)
                com.arlosoft.macrodroid.variables.a r0 = r8.$dictionaryEventListener
                com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r1 = r8.$dictionaryEntry
                r0.mo27162d(r9, r1)
                com.arlosoft.macrodroid.common.u r9 = com.arlosoft.macrodroid.common.C4064u.m16048t()
                r9.mo27974H()
                androidx.appcompat.app.AppCompatDialog r9 = r8.$dialog
                r9.dismiss()
                ja.u r9 = p297ja.C13339u.f61331a
                return r9
            L_0x00d2:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.C6549j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$k */
    /* compiled from: VariableHelper.kt */
    static final class C6550k extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C6550k f15212a = new C6550k();

        C6550k() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
            if (r2.hasNumericalChildren(r2) != false) goto L_0x001c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(com.arlosoft.macrodroid.variables.VariableValue r2) {
            /*
                r1 = this;
                java.lang.String r0 = "variableValue"
                kotlin.jvm.internal.C13706o.m87929f(r2, r0)
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.IntegerValue
                if (r0 != 0) goto L_0x001c
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.DecimalValue
                if (r0 != 0) goto L_0x001c
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.Dictionary
                if (r0 == 0) goto L_0x001a
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r2 = (com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r2
                boolean r2 = r2.hasNumericalChildren(r2)
                if (r2 == 0) goto L_0x001a
                goto L_0x001c
            L_0x001a:
                r2 = 0
                goto L_0x001d
            L_0x001c:
                r2 = 1
            L_0x001d:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.C6550k.invoke(com.arlosoft.macrodroid.variables.VariableValue):java.lang.Boolean");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$k0 */
    /* compiled from: VariableHelper.kt */
    static final class C6551k0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6551k0(AppCompatDialog appCompatDialog, C13635d<? super C6551k0> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6551k0(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$l */
    /* compiled from: VariableHelper.kt */
    static final class C6552l extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C6552l f15213a = new C6552l();

        C6552l() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
            if (r2.hasStringChildren(r2) != false) goto L_0x0018;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(com.arlosoft.macrodroid.variables.VariableValue r2) {
            /*
                r1 = this;
                java.lang.String r0 = "variableValue"
                kotlin.jvm.internal.C13706o.m87929f(r2, r0)
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.StringValue
                if (r0 != 0) goto L_0x0018
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.Dictionary
                if (r0 == 0) goto L_0x0016
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r2 = (com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r2
                boolean r2 = r2.hasStringChildren(r2)
                if (r2 == 0) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r2 = 0
                goto L_0x0019
            L_0x0018:
                r2 = 1
            L_0x0019:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.C6552l.invoke(com.arlosoft.macrodroid.variables.VariableValue):java.lang.Boolean");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$l0 */
    /* compiled from: VariableHelper.kt */
    static final class C6553l0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ VariableValue.DictionaryEntry $dictionaryEntry;
        final /* synthetic */ C6487a $dictionaryEventListener;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6553l0(VariableValue.DictionaryEntry dictionaryEntry, AppCompatDialog appCompatDialog, VariableValue.Dictionary dictionary, C6487a aVar, C13635d<? super C6553l0> dVar) {
            super(3, dVar);
            this.$dictionaryEntry = dictionaryEntry;
            this.$dialog = appCompatDialog;
            this.$dictionary = dictionary;
            this.$dictionaryEventListener = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6553l0(this.$dictionaryEntry, this.$dialog, this.$dictionary, this.$dictionaryEventListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                VariableValue.DictionaryEntry dictionaryEntry = this.$dictionaryEntry;
                if (dictionaryEntry != null) {
                    VariableValue.Dictionary dictionary = this.$dictionary;
                    C6487a aVar = this.$dictionaryEventListener;
                    dictionary.removeEntry(dictionaryEntry);
                    aVar.mo27161c(dictionaryEntry);
                }
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$m */
    /* compiled from: VariableHelper.kt */
    public static final class C6554m implements AdapterView.OnItemSelectedListener {

        /* renamed from: A */
        final /* synthetic */ SelectableItem f15214A;

        /* renamed from: B */
        final /* synthetic */ String f15215B;

        /* renamed from: a */
        final /* synthetic */ List<C6585q0> f15216a;

        /* renamed from: c */
        final /* synthetic */ C13678a0 f15217c;

        /* renamed from: d */
        final /* synthetic */ C6595s0 f15218d;

        /* renamed from: f */
        final /* synthetic */ C6540f f15219f;

        /* renamed from: g */
        final /* synthetic */ Activity f15220g;

        /* renamed from: o */
        final /* synthetic */ int f15221o;

        /* renamed from: p */
        final /* synthetic */ Macro f15222p;

        /* renamed from: s */
        final /* synthetic */ C16265l<VariableValue, Boolean> f15223s;

        /* renamed from: z */
        final /* synthetic */ C6538e f15224z;

        /* renamed from: com.arlosoft.macrodroid.variables.o0$m$a */
        /* compiled from: VariableHelper.kt */
        static final class C6555a extends C13708q implements C16265l<List<? extends String>, C13339u> {
            final /* synthetic */ String $labelSuffix;
            final /* synthetic */ C6595s0 $spinnerArrayAdapter;
            final /* synthetic */ MacroDroidVariable $variable;
            final /* synthetic */ C6540f $variableSelectedListener;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6555a(C6540f fVar, MacroDroidVariable macroDroidVariable, C6595s0 s0Var, String str) {
                super(1);
                this.$variableSelectedListener = fVar;
                this.$variable = macroDroidVariable;
                this.$spinnerArrayAdapter = s0Var;
                this.$labelSuffix = str;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<String>) (List) obj);
                return C13339u.f61331a;
            }

            public final void invoke(List<String> list) {
                C13706o.m87929f(list, "keys");
                this.$variableSelectedListener.mo24723b(this.$variable, list);
                C6595s0 s0Var = this.$spinnerArrayAdapter;
                s0Var.mo32811a(this.$variable.getName() + C6520o0.m24914f0(list) + this.$labelSuffix);
                this.$spinnerArrayAdapter.notifyDataSetChanged();
            }
        }

        C6554m(List<? extends C6585q0> list, C13678a0 a0Var, C6595s0 s0Var, C6540f fVar, Activity activity, int i, Macro macro, C16265l<? super VariableValue, Boolean> lVar, C6538e eVar, SelectableItem selectableItem, String str) {
            this.f15216a = list;
            this.f15217c = a0Var;
            this.f15218d = s0Var;
            this.f15219f = fVar;
            this.f15220g = activity;
            this.f15221o = i;
            this.f15222p = macro;
            this.f15223s = lVar;
            this.f15224z = eVar;
            this.f15214A = selectableItem;
            this.f15215B = str;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            if (!this.f15216a.isEmpty()) {
                C13678a0 a0Var = this.f15217c;
                if (a0Var.element) {
                    a0Var.element = false;
                } else if (this.f15216a.get(i2) instanceof C6585q0.C6586a) {
                    C6585q0 q0Var = this.f15216a.get(i2);
                    C13706o.m87927d(q0Var, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableOrOption.Option");
                    C6585q0.C6586a aVar = (C6585q0.C6586a) q0Var;
                    this.f15218d.mo32811a((String) null);
                    this.f15218d.notifyDataSetChanged();
                    this.f15219f.mo24722a(aVar.mo32790b(), aVar.mo32789a());
                } else {
                    C6585q0 q0Var2 = this.f15216a.get(i2);
                    C13706o.m87927d(q0Var2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableOrOption.Variable");
                    MacroDroidVariable b = ((C6585q0.C6587b) q0Var2).mo32794b();
                    if (b.mo27748X() || b.mo27751a0()) {
                        C6520o0.m24882J0(this.f15220g, this.f15221o, b, this.f15222p, b.mo27770n(), this.f15223s, new ArrayList(), 0, this.f15224z, false, this.f15214A, new C6555a(this.f15219f, b, this.f15218d, this.f15215B));
                        return;
                    }
                    this.f15218d.mo32811a((String) null);
                    this.f15218d.notifyDataSetChanged();
                    this.f15219f.mo24723b(b, (List<String>) null);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$m0 */
    /* compiled from: TextView.kt */
    public static final class C6556m0 implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15225a;

        /* renamed from: c */
        final /* synthetic */ EditText f15226c;

        public C6556m0(Button button, EditText editText) {
            this.f15225a = button;
            this.f15226c = editText;
        }

        public void afterTextChanged(Editable editable) {
            Button button = this.f15225a;
            Editable text = this.f15226c.getText();
            C13706o.m87928e(text, "keyName.text");
            button.setEnabled(text.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$n */
    /* compiled from: VariableHelper.kt */
    static final class C6557n extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ Macro $macro;
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        final /* synthetic */ int $style;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6557n(VariableValue.Dictionary dictionary, Activity activity, Macro macro, C4023j0.C4028e eVar, int i, C13635d<? super C6557n> dVar) {
            super(3, dVar);
            this.$dictionary = dictionary;
            this.$activity = activity;
            this.$macro = macro;
            this.$magicTextListener = eVar;
            this.$style = i;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6557n(this.$dictionary, this.$activity, this.$macro, this.$magicTextListener, this.$style, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.$dictionary.isArray()) {
                    C4023j0.m15693A(this.$activity, this.$macro, this.$magicTextListener, this.$style, C7967d.NONE);
                } else {
                    C4023j0.m15700F(this.$activity, this.$magicTextListener, this.$macro, true, true, true, this.$style, C7967d.NONE);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$n0 */
    /* compiled from: VariableHelper.kt */
    static final class C6558n0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ VariableValue.DictionaryEntry $dictionaryEntry;
        final /* synthetic */ C6487a $dictionaryEventListener;
        final /* synthetic */ EditText $keyName;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6558n0(EditText editText, VariableValue.DictionaryEntry dictionaryEntry, VariableValue.Dictionary dictionary, C6487a aVar, AppCompatDialog appCompatDialog, C13635d<? super C6558n0> dVar) {
            super(3, dVar);
            this.$keyName = editText;
            this.$dictionaryEntry = dictionaryEntry;
            this.$dictionary = dictionary;
            this.$dictionaryEventListener = aVar;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6558n0(this.$keyName, this.$dictionaryEntry, this.$dictionary, this.$dictionaryEventListener, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                String obj2 = this.$keyName.getText().toString();
                String key = this.$dictionaryEntry.getKey();
                VariableValue.Dictionary dictionary = this.$dictionary;
                if (!C13706o.m87924a(obj2, key)) {
                    dictionary.removeKey(key);
                }
                VariableValue.DictionaryEntry dictionaryEntry = this.$dictionaryEntry;
                C13706o.m87926c(dictionaryEntry);
                VariableValue.DictionaryEntry dictionaryEntry2 = new VariableValue.DictionaryEntry(obj2, dictionaryEntry.getVariable(), (List) null, 4, (C13695i) null);
                this.$dictionary.setEntry(dictionaryEntry2);
                this.$dictionaryEventListener.mo27162d(dictionaryEntry2, this.$dictionaryEntry);
                this.$dictionaryEventListener.mo27160b();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$o */
    /* compiled from: VariableHelper.kt */
    public static final class C6559o implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ VariableValue.Dictionary f15227a;

        /* renamed from: c */
        final /* synthetic */ Activity f15228c;

        /* renamed from: d */
        final /* synthetic */ Macro f15229d;

        /* renamed from: f */
        final /* synthetic */ Button f15230f;

        /* renamed from: g */
        final /* synthetic */ EditText f15231g;

        C6559o(VariableValue.Dictionary dictionary, Activity activity, Macro macro, Button button, EditText editText) {
            this.f15227a = dictionary;
            this.f15228c = activity;
            this.f15229d = macro;
            this.f15230f = button;
            this.f15231g = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            boolean z = true;
            if (this.f15227a.isArray()) {
                try {
                    C6451w.m24766b(this.f15228c, this.f15229d, editable.toString(), (TriggerContextInfo) null);
                    this.f15230f.setEnabled(true);
                } catch (IllegalArgumentException unused) {
                    this.f15230f.setEnabled(false);
                } catch (IndexOutOfBoundsException unused2) {
                    this.f15230f.setEnabled(false);
                }
            } else {
                Button button = this.f15230f;
                Editable text = this.f15231g.getText();
                C13706o.m87928e(text, "keyName.text");
                if (text.length() <= 0) {
                    z = false;
                }
                button.setEnabled(z);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$o0 */
    /* compiled from: VariableHelper.kt */
    static final class C6560o0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6560o0(AppCompatDialog appCompatDialog, C13635d<? super C6560o0> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6560o0(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$p */
    /* compiled from: VariableHelper.kt */
    public static final class C6561p implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15232a;

        /* renamed from: c */
        final /* synthetic */ EditText f15233c;

        C6561p(Button button, EditText editText) {
            this.f15232a = button;
            this.f15233c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f15232a;
            Editable text = this.f15233c.getText();
            C13706o.m87928e(text, "variableName.text");
            button.setEnabled(text.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$p0 */
    /* compiled from: VariableHelper.kt */
    static final class C6562p0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ VariableValue.DictionaryEntry $dictionaryEntry;
        final /* synthetic */ C6487a $dictionaryEventListener;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6562p0(VariableValue.DictionaryEntry dictionaryEntry, AppCompatDialog appCompatDialog, VariableValue.Dictionary dictionary, C6487a aVar, C13635d<? super C6562p0> dVar) {
            super(3, dVar);
            this.$dictionaryEntry = dictionaryEntry;
            this.$dialog = appCompatDialog;
            this.$dictionary = dictionary;
            this.$dictionaryEventListener = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6562p0(this.$dictionaryEntry, this.$dialog, this.$dictionary, this.$dictionaryEventListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                VariableValue.DictionaryEntry dictionaryEntry = this.$dictionaryEntry;
                VariableValue.Dictionary dictionary = this.$dictionary;
                C6487a aVar = this.$dictionaryEventListener;
                dictionary.removeEntry(dictionaryEntry);
                aVar.mo27161c(dictionaryEntry);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$q */
    /* compiled from: VariableHelper.kt */
    static final class C6563q extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ Macro $macro;
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        final /* synthetic */ SelectableItem $selectableItem;
        final /* synthetic */ int $style;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6563q(VariableValue.Dictionary dictionary, Activity activity, Macro macro, C4023j0.C4028e eVar, int i, SelectableItem selectableItem, C13635d<? super C6563q> dVar) {
            super(3, dVar);
            this.$dictionary = dictionary;
            this.$activity = activity;
            this.$macro = macro;
            this.$magicTextListener = eVar;
            this.$style = i;
            this.$selectableItem = selectableItem;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6563q(this.$dictionary, this.$activity, this.$macro, this.$magicTextListener, this.$style, this.$selectableItem, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C7967d dVar = null;
                if (this.$dictionary.isArray()) {
                    Activity activity = this.$activity;
                    Macro macro = this.$macro;
                    C4023j0.C4028e eVar = this.$magicTextListener;
                    int i = this.$style;
                    SelectableItem selectableItem = this.$selectableItem;
                    if (selectableItem != null) {
                        dVar = selectableItem.mo24686E1();
                    }
                    if (dVar == null) {
                        dVar = C7967d.NONE;
                    }
                    C4023j0.m15693A(activity, macro, eVar, i, dVar);
                } else {
                    Activity activity2 = this.$activity;
                    C4023j0.C4028e eVar2 = this.$magicTextListener;
                    Macro macro2 = this.$macro;
                    int i2 = this.$style;
                    SelectableItem selectableItem2 = this.$selectableItem;
                    if (selectableItem2 != null) {
                        dVar = selectableItem2.mo24686E1();
                    }
                    C4023j0.m15700F(activity2, eVar2, macro2, true, true, true, i2, dVar == null ? C7967d.NONE : dVar);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$q0 */
    /* compiled from: VariableHelper.kt */
    static final class C6564q0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ EditText $valueEditText;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6564q0(EditText editText, C13635d<? super C6564q0> dVar) {
            super(3, dVar);
            this.$valueEditText = editText;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6564q0(this.$valueEditText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                EditText editText = this.$valueEditText;
                if (editText != null) {
                    editText.setText("");
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$r */
    /* compiled from: VariableHelper.kt */
    public static final class C6565r implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TextView f15234a;

        /* renamed from: c */
        final /* synthetic */ MacroDroidVariable f15235c;

        /* renamed from: d */
        final /* synthetic */ VariableValue.Dictionary f15236d;

        /* renamed from: f */
        final /* synthetic */ Button f15237f;

        /* renamed from: g */
        final /* synthetic */ ImageView f15238g;

        /* renamed from: o */
        final /* synthetic */ Activity f15239o;

        /* renamed from: p */
        final /* synthetic */ Macro f15240p;

        C6565r(TextView textView, MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, Button button, ImageView imageView, Activity activity, Macro macro) {
            this.f15234a = textView;
            this.f15235c = macroDroidVariable;
            this.f15236d = dictionary;
            this.f15237f = button;
            this.f15238g = imageView;
            this.f15239o = activity;
            this.f15240p = macro;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            C6520o0 o0Var = C6520o0.f15162a;
            o0Var.m24952y0(this.f15234a, this.f15235c.getName(), editable.toString());
            if (this.f15236d.isArray()) {
                try {
                    List<String> x = o0Var.m24922j0(editable.toString());
                    if (x == null) {
                        this.f15237f.setEnabled(false);
                        this.f15238g.setImageResource(C17530R$drawable.red_cross);
                        return;
                    }
                    for (String b : x) {
                        C6451w.m24766b(this.f15239o, this.f15240p, b, (TriggerContextInfo) null);
                        this.f15237f.setEnabled(true);
                        this.f15238g.setImageResource(C17530R$drawable.green_tick);
                    }
                } catch (IllegalArgumentException unused) {
                    this.f15237f.setEnabled(false);
                    this.f15238g.setImageResource(C17530R$drawable.red_cross);
                } catch (IndexOutOfBoundsException unused2) {
                    this.f15237f.setEnabled(false);
                    this.f15238g.setImageResource(C17530R$drawable.red_cross);
                }
            } else if (o0Var.m24922j0(editable.toString()) == null) {
                this.f15237f.setEnabled(false);
                this.f15238g.setImageResource(C17530R$drawable.red_cross);
            } else {
                this.f15237f.setEnabled(true);
                this.f15238g.setImageResource(C17530R$drawable.green_tick);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$r0 */
    /* compiled from: VariableHelper.kt */
    static final class C6566r0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ C6487a $dictionaryEventListener;
        final /* synthetic */ Macro $macro;
        final /* synthetic */ int $themeTitle;
        final /* synthetic */ MacroDroidVariable $variable;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6566r0(Activity activity, MacroDroidVariable macroDroidVariable, Macro macro, int i, AppCompatDialog appCompatDialog, C6487a aVar, C13635d<? super C6566r0> dVar) {
            super(3, dVar);
            this.$activity = activity;
            this.$variable = macroDroidVariable;
            this.$macro = macro;
            this.$themeTitle = i;
            this.$dialog = appCompatDialog;
            this.$dictionaryEventListener = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6566r0(this.$activity, this.$variable, this.$macro, this.$themeTitle, this.$dialog, this.$dictionaryEventListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C6520o0.f15162a.m24887M(this.$activity, this.$variable, this.$macro, this.$themeTitle, this.$dialog, this.$dictionaryEventListener);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$s */
    /* compiled from: VariableHelper.kt */
    static final class C6567s extends C13708q implements C16265l<String, CharSequence> {

        /* renamed from: a */
        public static final C6567s f15241a = new C6567s();

        C6567s() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(String str) {
            C13706o.m87929f(str, "it");
            return '[' + str + ']';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$s0 */
    /* compiled from: VariableHelper.kt */
    public static final class C6568s0 implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15242a;

        /* renamed from: c */
        final /* synthetic */ EditText f15243c;

        C6568s0(Button button, EditText editText) {
            this.f15242a = button;
            this.f15243c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f15242a;
            if (button != null) {
                Editable text = this.f15243c.getText();
                C13706o.m87928e(text, "nameEditText.text");
                button.setEnabled(text.length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$t */
    /* compiled from: VariableHelper.kt */
    static final class C6569t extends C13708q implements C16265l<String, CharSequence> {

        /* renamed from: a */
        public static final C6569t f15244a = new C6569t();

        C6569t() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(String str) {
            C13706o.m87929f(str, "it");
            return '[' + str + ']';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$t0 */
    /* compiled from: VariableHelper.kt */
    static final class C6570t0 extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ Button $okButton;
        final /* synthetic */ EditText $valueEditText;
        final /* synthetic */ MacroDroidVariable $variable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6570t0(Button button, MacroDroidVariable macroDroidVariable, EditText editText) {
            super(1);
            this.$okButton = button;
            this.$variable = macroDroidVariable;
            this.$valueEditText = editText;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            if ((r0.length() > 0) != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C13706o.m87929f(r5, r0)
                android.widget.Button r5 = r4.$okButton
                if (r5 != 0) goto L_0x000a
                goto L_0x002f
            L_0x000a:
                com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r4.$variable
                int r0 = r0.mo27743S()
                r1 = 2
                r2 = 0
                r3 = 1
                if (r0 == r1) goto L_0x002b
                android.widget.EditText r0 = r4.$valueEditText
                android.text.Editable r0 = r0.getText()
                java.lang.String r1 = "valueEditText.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0028
                r0 = 1
                goto L_0x0029
            L_0x0028:
                r0 = 0
            L_0x0029:
                if (r0 == 0) goto L_0x002c
            L_0x002b:
                r2 = 1
            L_0x002c:
                r5.setEnabled(r2)
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.C6570t0.invoke(java.lang.String):void");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$u */
    /* compiled from: VariableHelper.kt */
    public static final class C6571u implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15245a;

        /* renamed from: c */
        final /* synthetic */ EditText f15246c;

        C6571u(Button button, EditText editText) {
            this.f15245a = button;
            this.f15246c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f15245a;
            C13706o.m87926c(button);
            button.setEnabled(this.f15246c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$u0 */
    /* compiled from: VariableHelper.kt */
    static final class C6572u0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ C6487a $dictionaryEventListener;
        final /* synthetic */ Macro $macro;
        final /* synthetic */ EditText $nameEditText;
        final /* synthetic */ RadioButton $trueRadio;
        final /* synthetic */ EditText $valueEditText;
        final /* synthetic */ MacroDroidVariable $variable;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6572u0(EditText editText, MacroDroidVariable macroDroidVariable, Macro macro, Activity activity, RadioButton radioButton, EditText editText2, C6487a aVar, AppCompatDialog appCompatDialog, C13635d<? super C6572u0> dVar) {
            super(3, dVar);
            this.$nameEditText = editText;
            this.$variable = macroDroidVariable;
            this.$macro = macro;
            this.$activity = activity;
            this.$trueRadio = radioButton;
            this.$valueEditText = editText2;
            this.$dictionaryEventListener = aVar;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6572u0(this.$nameEditText, this.$variable, this.$macro, this.$activity, this.$trueRadio, this.$valueEditText, this.$dictionaryEventListener, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                EditText editText = this.$nameEditText;
                String valueOf = String.valueOf(editText != null ? editText.getText() : null);
                if (!C13706o.m87924a(valueOf, this.$variable.getName())) {
                    if (this.$macro.findLocalVariableByName(valueOf) != null) {
                        C6520o0.m24867B0(this.$activity, C17542R$style.Theme_App_Dialog_LocalVariables);
                        return C13339u.f61331a;
                    }
                    C6520o0.f15162a.m24948w0(this.$variable, this.$macro, valueOf);
                }
                if (this.$variable.mo27749Y()) {
                    VariableValue V = this.$variable.mo27746V();
                    RadioButton radioButton = this.$trueRadio;
                    VariableValue.BooleanValue booleanValue = new VariableValue.BooleanValue(radioButton != null ? radioButton.isChecked() : false, (List) null, 2, (C13695i) null);
                    this.$variable.mo27767l0(booleanValue, !this.$macro.isExcludedFromLog(), V, (Macro) null);
                    Set<C4068u1> localVariableUpdatedListeners = this.$macro.getLocalVariableUpdatedListeners();
                    if (localVariableUpdatedListeners != null) {
                        MacroDroidVariable macroDroidVariable = this.$variable;
                        Macro macro = this.$macro;
                        for (C4068u1 v : localVariableUpdatedListeners) {
                            v.mo27212v(macroDroidVariable, booleanValue, V, macro.getGUID());
                        }
                    }
                } else {
                    VariableValue V2 = this.$variable.mo27746V();
                    VariableValue.C6485a aVar = VariableValue.Companion;
                    EditText editText2 = this.$valueEditText;
                    VariableValue d = VariableValue.C6485a.m24840d(aVar, String.valueOf(editText2 != null ? editText2.getText() : null), this.$variable.mo27743S(), (List) null, 4, (Object) null);
                    this.$variable.mo27767l0(d, !this.$macro.isExcludedFromLog(), V2, (Macro) null);
                    Set<C4068u1> localVariableUpdatedListeners2 = this.$macro.getLocalVariableUpdatedListeners();
                    if (localVariableUpdatedListeners2 != null) {
                        MacroDroidVariable macroDroidVariable2 = this.$variable;
                        Macro macro2 = this.$macro;
                        for (C4068u1 v2 : localVariableUpdatedListeners2) {
                            v2.mo27212v(macroDroidVariable2, d, V2, macro2.getGUID());
                        }
                    }
                }
                this.$dictionaryEventListener.mo27160b();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$v */
    /* compiled from: VariableHelper.kt */
    public static final class C6573v implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15247a;

        /* renamed from: c */
        final /* synthetic */ C13684d0<VariableValue> f15248c;

        /* renamed from: d */
        final /* synthetic */ EditText f15249d;

        C6573v(Button button, C13684d0<VariableValue> d0Var, EditText editText) {
            this.f15247a = button;
            this.f15248c = d0Var;
            this.f15249d = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            this.f15247a.setEnabled(((VariableValue) this.f15248c.element).getVariableType() == 2 || this.f15249d.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$v0 */
    /* compiled from: VariableHelper.kt */
    static final class C6574v0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6574v0(AppCompatDialog appCompatDialog, C13635d<? super C6574v0> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6574v0(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$w */
    /* compiled from: TextView.kt */
    public static final class C6575w implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15250a;

        /* renamed from: c */
        final /* synthetic */ EditText f15251c;

        public C6575w(Button button, EditText editText) {
            this.f15250a = button;
            this.f15251c = editText;
        }

        public void afterTextChanged(Editable editable) {
            Button button = this.f15250a;
            Editable text = this.f15251c.getText();
            C13706o.m87928e(text, "keyName.text");
            button.setEnabled(text.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$w0 */
    /* compiled from: VariableHelper.kt */
    public static final class C6576w0 implements C6521a {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f15252a;

        /* renamed from: b */
        final /* synthetic */ C16265l<List<String>, C13339u> f15253b;

        /* renamed from: c */
        final /* synthetic */ Activity f15254c;

        /* renamed from: d */
        final /* synthetic */ int f15255d;

        /* renamed from: e */
        final /* synthetic */ MacroDroidVariable f15256e;

        /* renamed from: f */
        final /* synthetic */ Macro f15257f;

        /* renamed from: g */
        final /* synthetic */ C16265l<VariableValue, Boolean> f15258g;

        /* renamed from: h */
        final /* synthetic */ int f15259h;

        /* renamed from: i */
        final /* synthetic */ C6538e f15260i;

        /* renamed from: j */
        final /* synthetic */ boolean f15261j;

        /* renamed from: k */
        final /* synthetic */ SelectableItem f15262k;

        /* renamed from: l */
        final /* synthetic */ VariableValue.Dictionary f15263l;

        /* renamed from: com.arlosoft.macrodroid.variables.o0$w0$a */
        /* compiled from: VariableHelper.kt */
        static final class C6577a extends C13708q implements C16265l<String, C13339u> {
            final /* synthetic */ ArrayList<String> $keyList;
            final /* synthetic */ C16265l<List<String>, C13339u> $keysChosen;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6577a(ArrayList<String> arrayList, C16265l<? super List<String>, C13339u> lVar) {
                super(1);
                this.$keyList = arrayList;
                this.$keysChosen = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13339u.f61331a;
            }

            public final void invoke(String str) {
                C13706o.m87929f(str, "keyName");
                this.$keyList.add(str);
                this.$keysChosen.invoke(this.$keyList);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.o0$w0$b */
        /* compiled from: VariableHelper.kt */
        static final class C6578b extends C13708q implements C16265l<C6523b, C13339u> {
            final /* synthetic */ C16265l<List<String>, C13339u> $keysChosen;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6578b(C16265l<? super List<String>, C13339u> lVar) {
                super(1);
                this.$keysChosen = lVar;
            }

            /* renamed from: a */
            public final void mo32782a(C6523b bVar) {
                C13706o.m87929f(bVar, "manualKeyData");
                this.$keysChosen.invoke(bVar.mo32708c());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo32782a((C6523b) obj);
                return C13339u.f61331a;
            }
        }

        C6576w0(ArrayList<String> arrayList, C16265l<? super List<String>, C13339u> lVar, Activity activity, int i, MacroDroidVariable macroDroidVariable, Macro macro, C16265l<? super VariableValue, Boolean> lVar2, int i2, C6538e eVar, boolean z, SelectableItem selectableItem, VariableValue.Dictionary dictionary) {
            this.f15252a = arrayList;
            this.f15253b = lVar;
            this.f15254c = activity;
            this.f15255d = i;
            this.f15256e = macroDroidVariable;
            this.f15257f = macro;
            this.f15258g = lVar2;
            this.f15259h = i2;
            this.f15260i = eVar;
            this.f15261j = z;
            this.f15262k = selectableItem;
            this.f15263l = dictionary;
        }

        /* renamed from: a */
        public void mo24836a() {
            this.f15253b.invoke(this.f15252a);
        }

        /* renamed from: b */
        public void mo24837b(List<String> list) {
            C6520o0.m24902Z(this.f15254c, this.f15255d, this.f15256e, this.f15263l, this.f15257f, (List<String>) null, (List<String>) null, false, this.f15262k, new C6578b(this.f15253b));
        }

        /* renamed from: c */
        public void mo24838c() {
        }

        /* renamed from: d */
        public void mo24839d() {
            C6520o0.m24893Q(this.f15254c, this.f15255d, this.f15263l, this.f15257f, new C6577a(this.f15252a, this.f15253b));
        }

        /* renamed from: e */
        public void mo24840e(VariableValue.DictionaryEntry dictionaryEntry) {
            boolean z;
            boolean z2;
            C13706o.m87929f(dictionaryEntry, "dictionaryEntry");
            this.f15252a.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                List<VariableValue.DictionaryEntry> entries = ((VariableValue.Dictionary) variable).getEntries();
                C16265l<VariableValue, Boolean> lVar = this.f15258g;
                if (!(entries instanceof Collection) || !entries.isEmpty()) {
                    Iterator<T> it = entries.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        VariableValue.DictionaryEntry dictionaryEntry2 = (VariableValue.DictionaryEntry) it.next();
                        if (lVar == null) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = lVar.invoke(dictionaryEntry2.getVariable()).booleanValue();
                            continue;
                        }
                        if (z2) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    this.f15253b.invoke(this.f15252a);
                    return;
                }
                Activity activity = this.f15254c;
                int i = this.f15255d;
                MacroDroidVariable macroDroidVariable = this.f15256e;
                Macro macro = this.f15257f;
                VariableValue variable2 = dictionaryEntry.getVariable();
                C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                C6520o0.m24882J0(activity, i, macroDroidVariable, macro, (VariableValue.Dictionary) variable2, this.f15258g, this.f15252a, this.f15259h + 1, this.f15260i, this.f15261j, this.f15262k, this.f15253b);
                return;
            }
            this.f15253b.invoke(this.f15252a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$x */
    /* compiled from: VariableHelper.kt */
    static final class C6579x extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C4023j0.C4028e $authPasswordTextListener;
        final /* synthetic */ VariableValue.Dictionary $dictionary;
        final /* synthetic */ C7967d $iteratorType;
        final /* synthetic */ EditText $keyName;
        final /* synthetic */ Macro $macro;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6579x(EditText editText, VariableValue.Dictionary dictionary, Activity activity, Macro macro, C4023j0.C4028e eVar, C7967d dVar, C13635d<? super C6579x> dVar2) {
            super(3, dVar2);
            this.$keyName = editText;
            this.$dictionary = dictionary;
            this.$activity = activity;
            this.$macro = macro;
            this.$authPasswordTextListener = eVar;
            this.$iteratorType = dVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6579x(this.$keyName, this.$dictionary, this.$activity, this.$macro, this.$authPasswordTextListener, this.$iteratorType, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$keyName.setInputType(1);
                if (this.$dictionary.isArray()) {
                    C4023j0.m15693A(this.$activity, this.$macro, this.$authPasswordTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText, this.$iteratorType);
                } else {
                    C4023j0.m15698D(this.$activity, this.$authPasswordTextListener, this.$macro, C17542R$style.Theme_App_Dialog_Action_SmallText, this.$iteratorType);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$y */
    /* compiled from: VariableHelper.kt */
    static final class C6580y extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ C16265l<C13328m<String, Integer>, C13339u> $keyAndTypeChosen;
        final /* synthetic */ EditText $keyName;
        final /* synthetic */ Spinner $valueTypeSpinner;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6580y(C16265l<? super C13328m<String, Integer>, C13339u> lVar, EditText editText, Spinner spinner, AppCompatDialog appCompatDialog, C13635d<? super C6580y> dVar) {
            super(3, dVar);
            this.$keyAndTypeChosen = lVar;
            this.$keyName = editText;
            this.$valueTypeSpinner = spinner;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6580y(this.$keyAndTypeChosen, this.$keyName, this.$valueTypeSpinner, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$keyAndTypeChosen.invoke(new C13328m(this.$keyName.getText().toString(), C13654b.m87834b(this.$valueTypeSpinner.getSelectedItemPosition())));
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.o0$z */
    /* compiled from: VariableHelper.kt */
    static final class C6581z extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6581z(AppCompatDialog appCompatDialog, C13635d<? super C6581z> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6581z(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C6520o0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m24865A0(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$keyName");
        int b = C16792h.m99540b(editText.getSelectionStart(), 0);
        int b2 = C16792h.m99540b(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        if (text != null) {
            int d = C16792h.m99542d(b, b2);
            int b3 = C16792h.m99540b(b, b2);
            String str = fVar.f10575a;
            text.replace(d, b3, str, 0, str.length());
        }
    }

    /* renamed from: B */
    private final void m24866B(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, boolean z, List<VariableWithDictionaryKeys> list, List<String> list2) {
        for (VariableValue.DictionaryEntry dictionaryEntry : dictionary.getEntries()) {
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                VariableValue.Dictionary dictionary2 = (VariableValue.Dictionary) variable;
                List r0 = C13566b0.m87443r0(list2, dictionaryEntry.getKey());
                if (dictionary2.isArray() == z) {
                    list.add(new VariableWithDictionaryKeys(macroDroidVariable.getName(), new DictionaryKeys(r0)));
                }
                if ((z && dictionary2.hasArrayChildren(dictionary2)) || (!z && dictionary2.hasDictionaryChildren(dictionary2))) {
                    C6520o0 o0Var = f15162a;
                    VariableValue variable2 = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    o0Var.m24866B(macroDroidVariable, (VariableValue.Dictionary) variable2, z, list, r0);
                }
            }
        }
    }

    /* renamed from: B0 */
    public static final void m24867B0(Context context, int i) {
        C13706o.m87926c(context);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        builder.setTitle((int) C17541R$string.variable_creation_failed);
        builder.setMessage((int) C17541R$string.variable_already_exists);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C6508i0.f15136a);
        builder.show();
    }

    /* renamed from: C */
    public static final ArrayList<String> m24868C(Context context, List<String> list, TriggerContextInfo triggerContextInfo, Macro macro) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(list, "dictionaryKeys");
        C13706o.m87929f(macro, "macro");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String t0 : list) {
            arrayList.add(C4023j0.m15760t0(context, t0, triggerContextInfo, macro));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m24869C0(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* renamed from: D */
    private final void m24870D(Constraint constraint, String str, String str2) {
        m24950x0(constraint, str, str2);
        m24890N0(constraint, str, str2);
        if (constraint instanceof LogicConstraint) {
            for (Constraint next : ((LogicConstraint) constraint).mo27826J0()) {
                C13706o.m87928e(next, "lc");
                m24870D(next, str, str2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [kotlin.coroutines.g, java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m24871D0(android.app.Activity r22, com.arlosoft.macrodroid.common.MacroDroidVariable r23, java.lang.String r24, java.lang.String r25, com.arlosoft.macrodroid.variables.VariableValue.Dictionary r26, boolean r27, com.arlosoft.macrodroid.variables.VariableValue.Dictionary r28, java.util.ArrayList<java.lang.String> r29, com.arlosoft.macrodroid.variables.C6487a r30) {
        /*
            r8 = r22
            r6 = r24
            r9 = r26
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "parentName"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            java.lang.String r0 = "keyName"
            r10 = r25
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "dictionary"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "parentKeys"
            r7 = r29
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            java.lang.String r0 = "dictionaryEventListener"
            r11 = r30
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            androidx.appcompat.app.AppCompatDialog r12 = new androidx.appcompat.app.AppCompatDialog
            r0 = 2132017846(0x7f1402b6, float:1.9673982E38)
            r12.<init>(r8, r0)
            r0 = 2131558616(0x7f0d00d8, float:1.8742553E38)
            r12.setContentView((int) r0)
            r0 = 2131362665(0x7f0a0369, float:1.8345117E38)
            android.view.View r0 = r12.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 2131362714(0x7f0a039a, float:1.8345216E38)
            android.view.View r0 = r12.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r14 = r0
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            r0 = 2131361907(0x7f0a0073, float:1.834358E38)
            android.view.View r0 = r12.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r15 = r0
            com.google.android.material.floatingactionbutton.FloatingActionButton r15 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r15
            r0 = 2131364204(0x7f0a096c, float:1.8348238E38)
            android.view.View r0 = r12.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131362241(0x7f0a01c1, float:1.8344257E38)
            android.view.View r0 = r12.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 2131362459(0x7f0a029b, float:1.83447E38)
            android.view.View r0 = r12.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r3 = r0
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r0 = 2131362028(0x7f0a00ec, float:1.8343825E38)
            android.view.View r0 = r12.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r2 = r0
            android.widget.ImageButton r2 = (android.widget.ImageButton) r2
            kotlin.jvm.internal.i0 r0 = kotlin.jvm.internal.C13696i0.f61931a
            r0 = 2131955788(0x7f13104c, float:1.9548113E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "activity.getString(R.str…_multi_entry_num_entries)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            r1 = 1
            r16 = r2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r11 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)
            r2[r11] = r17
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r2 = "format(format, *args)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r13.setText(r0)
            r5.setText(r6)
            java.util.List r0 = r26.getEntries()
            boolean r0 = r0.isEmpty()
            r2 = 8
            if (r0 == 0) goto L_0x00ce
            r0 = 0
            goto L_0x00d0
        L_0x00ce:
            r0 = 8
        L_0x00d0:
            r13.setVisibility(r0)
            java.util.List r0 = r26.getEntries()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x00df
            r2 = 0
        L_0x00df:
            r14.setVisibility(r2)
            kotlin.jvm.internal.d0 r2 = new kotlin.jvm.internal.d0
            r2.<init>()
            r0 = 0
            if (r23 == 0) goto L_0x010a
            com.arlosoft.macrodroid.variables.o0$a0 r11 = new com.arlosoft.macrodroid.variables.o0$a0
            r18 = 0
            r7 = r0
            r0 = r11
            r10 = 1
            r1 = r22
            r19 = r16
            r16 = r2
            r2 = r23
            r20 = r3
            r3 = r5
            r21 = r4
            r4 = r30
            r6 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r6, r7, r11, r10, r7)
            goto L_0x0114
        L_0x010a:
            r7 = r0
            r20 = r3
            r21 = r4
            r19 = r16
            r10 = 1
            r16 = r2
        L_0x0114:
            com.arlosoft.macrodroid.variables.o0$g0 r6 = new com.arlosoft.macrodroid.variables.o0$g0
            r0 = r6
            r1 = r30
            r2 = r16
            r3 = r26
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            com.arlosoft.macrodroid.variables.o0$f0 r11 = new com.arlosoft.macrodroid.variables.o0$f0
            r0 = r11
            r1 = r24
            r2 = r29
            r3 = r22
            r4 = r26
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.arlosoft.macrodroid.variables.o0$b0 r5 = new com.arlosoft.macrodroid.variables.o0$b0
            r18 = 0
            r0 = r5
            r1 = r22
            r2 = r26
            r3 = r29
            r4 = r6
            r6 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r15, r7, r6, r10, r7)
            com.arlosoft.macrodroid.variables.b r0 = new com.arlosoft.macrodroid.variables.b
            r0.<init>(r9, r11)
            r11 = r16
            r11.element = r0
            r14.setAdapter(r0)
            com.arlosoft.macrodroid.variables.o0$c0 r15 = new com.arlosoft.macrodroid.variables.o0$c0
            r16 = 0
            r0 = r15
            r1 = r22
            r2 = r26
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r30
            r9 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r21
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r0, r9, r15, r10, r9)
            com.arlosoft.macrodroid.variables.o0$d0 r15 = new com.arlosoft.macrodroid.variables.o0$d0
            r0 = r15
            r2 = r27
            r3 = r26
            r4 = r11
            r5 = r13
            r6 = r14
            r7 = r30
            r8 = r28
            r13 = r9
            r9 = r12
            r14 = 1
            r10 = r25
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r20
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r0, r13, r15, r14, r13)
            com.arlosoft.macrodroid.variables.o0$e0 r0 = new com.arlosoft.macrodroid.variables.o0$e0
            r0.<init>(r12, r13)
            r1 = r19
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r1, r13, r0, r14, r13)
            r0 = 0
            com.arlosoft.macrodroid.extensions.C4656c.m18115d(r12, r0, r14, r13)
            com.arlosoft.macrodroid.extensions.C4656c.m18113b(r12, r0, r14, r13)
            r12.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.m24871D0(android.app.Activity, com.arlosoft.macrodroid.common.MacroDroidVariable, java.lang.String, java.lang.String, com.arlosoft.macrodroid.variables.VariableValue$Dictionary, boolean, com.arlosoft.macrodroid.variables.VariableValue$Dictionary, java.util.ArrayList, com.arlosoft.macrodroid.variables.a):void");
    }

    /* renamed from: E */
    public static final void m24872E(Activity activity, int i, SelectableItem selectableItem, Spinner spinner, Macro macro, List<String> list, String str, C6540f fVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(spinner, "spinner");
        C13706o.m87929f(list, "customItems");
        C13706o.m87929f(fVar, "variableSelectedListener");
        C6542g gVar = C6542g.f15194a;
        ArrayList<MacroDroidVariable> p0 = selectableItem.mo27859p0();
        C13706o.m87928e(p0, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList = new ArrayList();
        for (T next : p0) {
            MacroDroidVariable macroDroidVariable = (MacroDroidVariable) next;
            if (macroDroidVariable.mo27748X() || macroDroidVariable.mo27773s()) {
                arrayList.add(next);
            }
        }
        ArrayList<MacroDroidVariable> p02 = selectableItem.mo27859p0();
        C13706o.m87928e(p02, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : p02) {
            if (((MacroDroidVariable) next2).mo27773s()) {
                arrayList2.add(next2);
            }
        }
        m24883K(activity, i, spinner, macro, list, C13566b0.m87415P(C13566b0.m87442q0(arrayList, arrayList2)), str, "", C6538e.SHOW_ARRAYS_ONLY, selectableItem, gVar, fVar);
    }

    /* renamed from: E0 */
    public static final void m24873E0(Activity activity, int i, VariableValue.Dictionary dictionary, VariableValue.DictionaryEntry dictionaryEntry, ArrayList<String> arrayList, C6487a aVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(dictionary, "dictionary");
        C13706o.m87929f(arrayList, "parentKeys");
        C13706o.m87929f(aVar, "dictionaryEventListener");
        m24875F0(activity, i, dictionaryEntry, dictionary, false, arrayList, aVar);
    }

    /* renamed from: F */
    public static final void m24874F(Activity activity, int i, SelectableItem selectableItem, Spinner spinner, Macro macro, List<String> list, String str, String str2, boolean z, C6540f fVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(spinner, "spinner");
        C13706o.m87929f(list, "customItems");
        C13706o.m87929f(str2, "labelSuffix");
        C13706o.m87929f(fVar, "variableSelectedListener");
        C6544h hVar = C6544h.f15200a;
        ArrayList<MacroDroidVariable> n0 = selectableItem.mo27855n0();
        ArrayList<MacroDroidVariable> p0 = selectableItem.mo27859p0();
        C13706o.m87928e(p0, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList = new ArrayList();
        for (T next : p0) {
            if (z || ((MacroDroidVariable) next).mo27774t()) {
                arrayList.add(next);
            }
        }
        C13706o.m87928e(n0, "allBoolVars");
        m24883K(activity, i, spinner, macro, list, C13566b0.m87442q0(n0, arrayList), str, str2, C6538e.DONT_SHOW, selectableItem, hVar, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x011b, code lost:
        r2 = kotlin.text.C15175u.m93622l((r2 = r2.getKey()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02c0  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m24875F0(android.app.Activity r25, int r26, com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry r27, com.arlosoft.macrodroid.variables.VariableValue.Dictionary r28, boolean r29, java.util.ArrayList<java.lang.String> r30, com.arlosoft.macrodroid.variables.C6487a r31) {
        /*
            r0 = r25
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.C13706o.m87929f(r0, r1)
            java.lang.String r1 = "dictionary"
            r12 = r28
            kotlin.jvm.internal.C13706o.m87929f(r12, r1)
            java.lang.String r1 = "parentKeys"
            r7 = r30
            kotlin.jvm.internal.C13706o.m87929f(r7, r1)
            java.lang.String r1 = "dictionaryEventListener"
            r13 = r31
            kotlin.jvm.internal.C13706o.m87929f(r13, r1)
            androidx.appcompat.app.AppCompatDialog r14 = new androidx.appcompat.app.AppCompatDialog
            r1 = r26
            r14.<init>(r0, r1)
            r1 = 2131558578(0x7f0d00b2, float:1.8742476E38)
            r14.setContentView((int) r1)
            r1 = 2131362492(0x7f0a02bc, float:1.8344766E38)
            android.view.View r1 = r14.findViewById(r1)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131363010(0x7f0a04c2, float:1.8345817E38)
            android.view.View r2 = r14.findViewById(r2)
            kotlin.jvm.internal.C13706o.m87926c(r2)
            com.google.android.material.textfield.TextInputLayout r2 = (com.google.android.material.textfield.TextInputLayout) r2
            r3 = 2131363009(0x7f0a04c1, float:1.8345815E38)
            android.view.View r3 = r14.findViewById(r3)
            kotlin.jvm.internal.C13706o.m87926c(r3)
            r11 = r3
            android.widget.EditText r11 = (android.widget.EditText) r11
            r3 = 2131362073(0x7f0a0119, float:1.8343916E38)
            android.view.View r3 = r14.findViewById(r3)
            kotlin.jvm.internal.C13706o.m87926c(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = 2131364109(0x7f0a090d, float:1.8348046E38)
            android.view.View r4 = r14.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r5 = 2131362771(0x7f0a03d3, float:1.8345332E38)
            android.view.View r5 = r14.findViewById(r5)
            kotlin.jvm.internal.C13706o.m87926c(r5)
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            r6 = 2131363986(0x7f0a0892, float:1.8347796E38)
            android.view.View r6 = r14.findViewById(r6)
            kotlin.jvm.internal.C13706o.m87926c(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r8 = 2131363985(0x7f0a0891, float:1.8347794E38)
            android.view.View r8 = r14.findViewById(r8)
            kotlin.jvm.internal.C13706o.m87926c(r8)
            android.widget.EditText r8 = (android.widget.EditText) r8
            r9 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r9 = r14.findViewById(r9)
            kotlin.jvm.internal.C13706o.m87926c(r9)
            r10 = r9
            android.widget.Button r10 = (android.widget.Button) r10
            r9 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r9 = r14.findViewById(r9)
            kotlin.jvm.internal.C13706o.m87926c(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r15 = 2131362459(0x7f0a029b, float:1.83447E38)
            android.view.View r15 = r14.findViewById(r15)
            kotlin.jvm.internal.C13706o.m87926c(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r0 = 2131364201(0x7f0a0969, float:1.8348232E38)
            android.view.View r0 = r14.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            android.widget.Spinner r0 = (android.widget.Spinner) r0
            if (r29 == 0) goto L_0x00c4
            r7 = 2131955793(0x7f131051, float:1.9548124E38)
            r1.setText(r7)
            goto L_0x00d3
        L_0x00c4:
            if (r27 != 0) goto L_0x00cd
            r7 = 2131955753(0x7f131029, float:1.9548042E38)
            r1.setText(r7)
            goto L_0x00d3
        L_0x00cd:
            r7 = 2131955776(0x7f131040, float:1.954809E38)
            r1.setText(r7)
        L_0x00d3:
            java.util.List r1 = r28.getEntries()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00df
            r1 = 0
            goto L_0x00f1
        L_0x00df:
            java.util.List r1 = r28.getEntries()
            java.lang.Object r1 = kotlin.collections.C13566b0.m87434i0(r1)
            com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r1 = (com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry) r1
            com.arlosoft.macrodroid.variables.VariableValue r1 = r1.getVariable()
            int r1 = r1.getVariableType()
        L_0x00f1:
            kotlin.jvm.internal.a0 r7 = new kotlin.jvm.internal.a0
            r7.<init>()
            r12 = 1
            r7.element = r12
            boolean r16 = r28.isArray()
            if (r16 == 0) goto L_0x0131
            r12 = 2131955757(0x7f13102d, float:1.954805E38)
            r2.setHint((int) r12)
            r2 = 2
            r11.setInputType(r2)
            java.util.List r2 = r28.getEntriesArrayOrder()
            java.lang.Object r2 = kotlin.collections.C13566b0.m87436k0(r2)
            com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r2 = (com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry) r2
            if (r2 == 0) goto L_0x0126
            java.lang.String r2 = r2.getKey()
            if (r2 == 0) goto L_0x0126
            java.lang.Integer r2 = kotlin.text.C15175u.m93622l(r2)
            if (r2 == 0) goto L_0x0126
            int r2 = r2.intValue()
            goto L_0x0127
        L_0x0126:
            r2 = -1
        L_0x0127:
            r12 = 1
            int r2 = r2 + r12
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r11.setText(r2)
            goto L_0x013d
        L_0x0131:
            r12 = 2131955772(0x7f13103c, float:1.954808E38)
            r2.setHint((int) r12)
            r2 = 655361(0xa0001, float:9.18356E-40)
            r11.setInputType(r2)
        L_0x013d:
            r2 = 0
            r3.setVisibility(r2)
            r2 = 8
            r6.setVisibility(r2)
            r12 = 1
            r5.setChecked(r12)
            r15.setVisibility(r2)
            com.arlosoft.macrodroid.variables.o0$i0 r12 = new com.arlosoft.macrodroid.variables.o0$i0
            r23 = r15
            r15 = r12
            r16 = r7
            r17 = r3
            r18 = r6
            r19 = r5
            r20 = r4
            r21 = r8
            r22 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r0.setOnItemSelectedListener(r12)
            r7 = 0
            r0.setSelection(r1, r7)
            java.lang.String r15 = "keyName.text"
            if (r1 == 0) goto L_0x01c0
            r12 = 4
            if (r1 == r12) goto L_0x01b8
            r12 = 5
            if (r1 == r12) goto L_0x01b8
            r3.setVisibility(r2)
            r6.setVisibility(r7)
            java.lang.String r7 = "0"
            r12 = 1
            if (r1 == r12) goto L_0x0197
            r12 = 3
            if (r1 == r12) goto L_0x018e
            r1 = 655361(0xa0001, float:9.18356E-40)
            r8.setInputType(r1)
            java.lang.String r1 = ""
            r8.setText(r1)
            goto L_0x019f
        L_0x018e:
            r1 = 12290(0x3002, float:1.7222E-41)
            r8.setInputType(r1)
            r8.setText(r7)
            goto L_0x019f
        L_0x0197:
            r1 = 4098(0x1002, float:5.743E-42)
            r8.setInputType(r1)
            r8.setText(r7)
        L_0x019f:
            com.arlosoft.macrodroid.extensions.C4666m.m18154v(r8)
            android.text.Editable r1 = r11.getText()
            kotlin.jvm.internal.C13706o.m87928e(r1, r15)
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x01b1
            r1 = 1
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            if (r1 == 0) goto L_0x01be
            com.arlosoft.macrodroid.extensions.C4666m.m18141i(r8)
            goto L_0x01be
        L_0x01b8:
            r3.setVisibility(r2)
            r6.setVisibility(r2)
        L_0x01be:
            r1 = 0
            goto L_0x01ce
        L_0x01c0:
            r1 = 0
            r3.setVisibility(r1)
            r6.setVisibility(r2)
            r7 = 1
            r5.setChecked(r7)
            r4.setChecked(r1)
        L_0x01ce:
            if (r27 == 0) goto L_0x0263
            java.lang.String r7 = r27.getKey()
            r11.setText(r7)
            r12 = r23
            r12.setVisibility(r1)
            com.arlosoft.macrodroid.variables.VariableValue r7 = r27.getVariable()
            int r7 = r7.getVariableType()
            r0.setSelection(r7, r1)
            com.arlosoft.macrodroid.variables.VariableValue r7 = r27.getVariable()
            boolean r7 = r7 instanceof com.arlosoft.macrodroid.variables.VariableValue.BooleanValue
            if (r7 == 0) goto L_0x021a
            r3.setVisibility(r1)
            r6.setVisibility(r2)
            com.arlosoft.macrodroid.variables.VariableValue r1 = r27.getVariable()
            java.lang.String r3 = "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.BooleanValue"
            kotlin.jvm.internal.C13706o.m87927d(r1, r3)
            com.arlosoft.macrodroid.variables.VariableValue$BooleanValue r1 = (com.arlosoft.macrodroid.variables.VariableValue.BooleanValue) r1
            boolean r1 = r1.getBooleanValue()
            r4.setChecked(r1)
            com.arlosoft.macrodroid.variables.VariableValue r1 = r27.getVariable()
            kotlin.jvm.internal.C13706o.m87927d(r1, r3)
            com.arlosoft.macrodroid.variables.VariableValue$BooleanValue r1 = (com.arlosoft.macrodroid.variables.VariableValue.BooleanValue) r1
            boolean r1 = r1.getBooleanValue()
            r3 = 1
            r1 = r1 ^ r3
            r5.setChecked(r1)
            goto L_0x0265
        L_0x021a:
            r3.setVisibility(r2)
            r7 = 0
            r6.setVisibility(r7)
            com.arlosoft.macrodroid.variables.VariableValue r1 = r27.getVariable()
            java.lang.String r1 = r1.getValueAsText()
            r8.setText(r1)
            com.arlosoft.macrodroid.variables.VariableValue r1 = r27.getVariable()
            boolean r3 = r1 instanceof com.arlosoft.macrodroid.variables.VariableValue.IntegerValue
            if (r3 == 0) goto L_0x023a
            r3 = 4098(0x1002, float:5.743E-42)
            r8.setInputType(r3)
            goto L_0x024a
        L_0x023a:
            boolean r1 = r1 instanceof com.arlosoft.macrodroid.variables.VariableValue.DecimalValue
            if (r1 == 0) goto L_0x0244
            r1 = 12290(0x3002, float:1.7222E-41)
            r8.setInputType(r1)
            goto L_0x024a
        L_0x0244:
            r1 = 655361(0xa0001, float:9.18356E-40)
            r8.setInputType(r1)
        L_0x024a:
            com.arlosoft.macrodroid.extensions.C4666m.m18154v(r8)
            android.text.Editable r1 = r11.getText()
            kotlin.jvm.internal.C13706o.m87928e(r1, r15)
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x025c
            r1 = 1
            goto L_0x025d
        L_0x025c:
            r1 = 0
        L_0x025d:
            if (r1 == 0) goto L_0x0266
            com.arlosoft.macrodroid.extensions.C4666m.m18141i(r8)
            goto L_0x0266
        L_0x0263:
            r12 = r23
        L_0x0265:
            r7 = 0
        L_0x0266:
            if (r29 == 0) goto L_0x026b
            r12.setVisibility(r2)
        L_0x026b:
            com.arlosoft.macrodroid.variables.o0$h0 r1 = new com.arlosoft.macrodroid.variables.o0$h0
            r1.<init>(r10, r11)
            r11.addTextChangedListener(r1)
            com.arlosoft.macrodroid.variables.o0$j0 r6 = new com.arlosoft.macrodroid.variables.o0$j0
            r16 = 0
            r1 = r6
            r2 = r11
            r3 = r0
            r5 = r8
            r0 = r6
            r6 = r27
            r17 = 0
            r7 = r30
            r8 = r28
            r24 = r9
            r9 = r31
            r13 = r10
            r10 = r14
            r18 = r11
            r11 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r7 = 0
            r8 = 1
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r13, r7, r0, r8, r7)
            com.arlosoft.macrodroid.variables.o0$k0 r0 = new com.arlosoft.macrodroid.variables.o0$k0
            r0.<init>(r14, r7)
            r9 = r24
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r9, r7, r0, r8, r7)
            com.arlosoft.macrodroid.variables.o0$l0 r0 = new com.arlosoft.macrodroid.variables.o0$l0
            r6 = 0
            r1 = r0
            r2 = r27
            r3 = r14
            r4 = r28
            r5 = r31
            r1.<init>(r2, r3, r4, r5, r6)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r12, r7, r0, r8, r7)
            android.text.Editable r0 = r18.getText()
            kotlin.jvm.internal.C13706o.m87928e(r0, r15)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02c0
            r7 = 1
            goto L_0x02c1
        L_0x02c0:
            r7 = 0
        L_0x02c1:
            r13.setEnabled(r7)
            android.content.res.Resources r0 = r25.getResources()
            r1 = 2131165589(0x7f070195, float:1.79454E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            com.arlosoft.macrodroid.extensions.C4656c.m18114c(r14, r0)
            r14.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.m24875F0(android.app.Activity, int, com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry, com.arlosoft.macrodroid.variables.VariableValue$Dictionary, boolean, java.util.ArrayList, com.arlosoft.macrodroid.variables.a):void");
    }

    /* renamed from: G */
    public static final void m24876G(Activity activity, int i, SelectableItem selectableItem, Spinner spinner, Macro macro, List<String> list, String str, C6540f fVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(spinner, "spinner");
        C13706o.m87929f(list, "customItems");
        C13706o.m87929f(fVar, "variableSelectedListener");
        C6546i iVar = C6546i.f15203a;
        ArrayList<MacroDroidVariable> p0 = selectableItem.mo27859p0();
        ArrayList<MacroDroidVariable> p02 = selectableItem.mo27859p0();
        C13706o.m87928e(p02, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList = new ArrayList();
        for (T next : p02) {
            if (((MacroDroidVariable) next).mo27776v()) {
                arrayList.add(next);
            }
        }
        C13706o.m87928e(p0, "dictionaryVars");
        m24883K(activity, i, spinner, macro, list, C13566b0.m87415P(C13566b0.m87442q0(p0, arrayList)), str, "", C6538e.SHOW_DICTIONARIES_ONLY, selectableItem, iVar, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x009e, code lost:
        r2 = kotlin.text.C15175u.m93622l((r2 = r2.getKey()));
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m24877G0(android.app.Activity r19, int r20, com.arlosoft.macrodroid.variables.VariableValue.Dictionary r21, com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry r22, com.arlosoft.macrodroid.variables.C6487a r23) {
        /*
            r0 = r19
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.C13706o.m87929f(r0, r1)
            java.lang.String r1 = "dictionary"
            r9 = r21
            kotlin.jvm.internal.C13706o.m87929f(r9, r1)
            java.lang.String r1 = "dictionaryEntry"
            r10 = r22
            kotlin.jvm.internal.C13706o.m87929f(r10, r1)
            java.lang.String r1 = "dictionaryEventListener"
            r11 = r23
            kotlin.jvm.internal.C13706o.m87929f(r11, r1)
            androidx.appcompat.app.AppCompatDialog r1 = new androidx.appcompat.app.AppCompatDialog
            r2 = r20
            r1.<init>(r0, r2)
            r2 = 2131558579(0x7f0d00b3, float:1.8742478E38)
            r1.setContentView((int) r2)
            r2 = 2131362492(0x7f0a02bc, float:1.8344766E38)
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.C13706o.m87926c(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131363010(0x7f0a04c2, float:1.8345817E38)
            android.view.View r3 = r1.findViewById(r3)
            kotlin.jvm.internal.C13706o.m87926c(r3)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            r4 = 2131363009(0x7f0a04c1, float:1.8345815E38)
            android.view.View r4 = r1.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            r12 = r4
            android.widget.EditText r12 = (android.widget.EditText) r12
            r4 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r4 = r1.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            r13 = r4
            android.widget.Button r13 = (android.widget.Button) r13
            r4 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r4 = r1.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            r14 = r4
            android.widget.Button r14 = (android.widget.Button) r14
            r4 = 2131362459(0x7f0a029b, float:1.83447E38)
            android.view.View r4 = r1.findViewById(r4)
            kotlin.jvm.internal.C13706o.m87926c(r4)
            r15 = r4
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r4 = 2131955776(0x7f131040, float:1.954809E38)
            r2.setText(r4)
            boolean r2 = r21.isArray()
            r8 = 1
            if (r2 == 0) goto L_0x00b3
            r2 = 2131955757(0x7f13102d, float:1.954805E38)
            r3.setHint((int) r2)
            r2 = 2
            r12.setInputType(r2)
            java.util.List r2 = r21.getEntriesArrayOrder()
            java.lang.Object r2 = kotlin.collections.C13566b0.m87436k0(r2)
            com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r2 = (com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry) r2
            if (r2 == 0) goto L_0x00a9
            java.lang.String r2 = r2.getKey()
            if (r2 == 0) goto L_0x00a9
            java.lang.Integer r2 = kotlin.text.C15175u.m93622l(r2)
            if (r2 == 0) goto L_0x00a9
            int r2 = r2.intValue()
            goto L_0x00aa
        L_0x00a9:
            r2 = -1
        L_0x00aa:
            int r2 = r2 + r8
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r12.setText(r2)
            goto L_0x00bf
        L_0x00b3:
            r2 = 2131955772(0x7f13103c, float:1.954808E38)
            r3.setHint((int) r2)
            r2 = 655361(0xa0001, float:9.18356E-40)
            r12.setInputType(r2)
        L_0x00bf:
            java.lang.String r2 = r22.getKey()
            r12.setText(r2)
            r7 = 0
            r15.setVisibility(r7)
            com.arlosoft.macrodroid.variables.o0$m0 r2 = new com.arlosoft.macrodroid.variables.o0$m0
            r2.<init>(r13, r12)
            r12.addTextChangedListener(r2)
            com.arlosoft.macrodroid.variables.o0$n0 r6 = new com.arlosoft.macrodroid.variables.o0$n0
            r16 = 0
            r2 = r6
            r3 = r12
            r4 = r22
            r5 = r21
            r17 = r6
            r6 = r23
            r18 = 0
            r7 = r1
            r0 = 1
            r8 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r8 = 0
            r2 = r17
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r13, r8, r2, r0, r8)
            com.arlosoft.macrodroid.variables.o0$o0 r2 = new com.arlosoft.macrodroid.variables.o0$o0
            r2.<init>(r1, r8)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r14, r8, r2, r0, r8)
            com.arlosoft.macrodroid.variables.o0$p0 r14 = new com.arlosoft.macrodroid.variables.o0$p0
            r7 = 0
            r2 = r14
            r3 = r22
            r4 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r15, r8, r14, r0, r8)
            android.text.Editable r2 = r12.getText()
            java.lang.String r3 = "keyName.text"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0115
            r8 = 1
            goto L_0x0116
        L_0x0115:
            r8 = 0
        L_0x0116:
            r13.setEnabled(r8)
            android.content.res.Resources r0 = r19.getResources()
            r2 = 2131165589(0x7f070195, float:1.79454E38)
            int r0 = r0.getDimensionPixelOffset(r2)
            com.arlosoft.macrodroid.extensions.C4656c.m18114c(r1, r0)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.m24877G0(android.app.Activity, int, com.arlosoft.macrodroid.variables.VariableValue$Dictionary, com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry, com.arlosoft.macrodroid.variables.a):void");
    }

    /* renamed from: H */
    public static final void m24878H(Activity activity, int i, SelectableItem selectableItem, Spinner spinner, Macro macro, List<String> list, String str, C6540f fVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(spinner, "spinner");
        C13706o.m87929f(list, "customItems");
        C13706o.m87929f(fVar, "variableSelectedListener");
        C6548j jVar = C6548j.f15211a;
        ArrayList<MacroDroidVariable> p0 = selectableItem.mo27859p0();
        C13706o.m87928e(p0, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList = new ArrayList();
        for (T next : p0) {
            MacroDroidVariable macroDroidVariable = (MacroDroidVariable) next;
            if (!macroDroidVariable.mo27748X() || macroDroidVariable.mo27776v()) {
                arrayList.add(next);
            }
        }
        ArrayList<MacroDroidVariable> p02 = selectableItem.mo27859p0();
        C13706o.m87928e(p02, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : p02) {
            if (((MacroDroidVariable) next2).mo27776v()) {
                arrayList2.add(next2);
            }
        }
        m24883K(activity, i, spinner, macro, list, C13566b0.m87415P(C13566b0.m87442q0(arrayList, arrayList2)), str, "", C6538e.SHOW_DICTIONARIES_ONLY, selectableItem, jVar, fVar);
    }

    /* renamed from: I */
    public static final void m24879I(Activity activity, int i, SelectableItem selectableItem, Spinner spinner, Macro macro, List<String> list, String str, String str2, boolean z, C6540f fVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(spinner, "spinner");
        C13706o.m87929f(list, "customItems");
        C13706o.m87929f(str2, "labelSuffix");
        C13706o.m87929f(fVar, "variableSelectedListener");
        C6550k kVar = C6550k.f15212a;
        ArrayList<MacroDroidVariable> s0 = selectableItem.mo27865s0();
        ArrayList<MacroDroidVariable> o0 = selectableItem.mo27857o0();
        ArrayList<MacroDroidVariable> p0 = selectableItem.mo27859p0();
        C13706o.m87928e(p0, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList = new ArrayList();
        for (T next : p0) {
            if (z || ((MacroDroidVariable) next).mo27777w()) {
                arrayList.add(next);
            }
        }
        C13706o.m87928e(s0, "allIntVars");
        C13706o.m87928e(o0, "allDecimalVars");
        m24883K(activity, i, spinner, macro, list, C13566b0.m87442q0(C13566b0.m87442q0(s0, o0), arrayList), str, str2, C6538e.DONT_SHOW, selectableItem, kVar, fVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r13v2, types: [kotlin.coroutines.g, java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24880I0(android.app.Activity r19, com.arlosoft.macrodroid.common.MacroDroidVariable r20, com.arlosoft.macrodroid.macro.Macro r21, int r22, int r23, com.arlosoft.macrodroid.variables.C6487a r24) {
        /*
            r18 = this;
            androidx.appcompat.app.AppCompatDialog r10 = new androidx.appcompat.app.AppCompatDialog
            r8 = r19
            r0 = r22
            r10.<init>(r8, r0)
            r0 = 2131558850(0x7f0d01c2, float:1.8743027E38)
            r10.setContentView((int) r0)
            java.lang.String r0 = r20.getName()
            r10.setTitle((java.lang.CharSequence) r0)
            r9 = 0
            com.arlosoft.macrodroid.extensions.C4656c.m18114c(r10, r9)
            r0 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r0 = r10.findViewById(r0)
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r0 = r10.findViewById(r0)
            r12 = r0
            android.widget.Button r12 = (android.widget.Button) r12
            r0 = 2131362711(0x7f0a0397, float:1.834521E38)
            android.view.View r0 = r10.findViewById(r0)
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 2131364249(0x7f0a0999, float:1.834833E38)
            android.view.View r0 = r10.findViewById(r0)
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 2131362073(0x7f0a0119, float:1.8343916E38)
            android.view.View r0 = r10.findViewById(r0)
            r1 = 2131363986(0x7f0a0892, float:1.8347796E38)
            android.view.View r1 = r10.findViewById(r1)
            r2 = 2131364109(0x7f0a090d, float:1.8348046E38)
            android.view.View r2 = r10.findViewById(r2)
            r15 = r2
            android.widget.RadioButton r15 = (android.widget.RadioButton) r15
            r2 = 2131362771(0x7f0a03d3, float:1.8345332E38)
            android.view.View r2 = r10.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r3 = 2131362241(0x7f0a01c1, float:1.8344257E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131362459(0x7f0a029b, float:1.83447E38)
            android.view.View r4 = r10.findViewById(r4)
            r7 = r4
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r4 = 8
            if (r0 != 0) goto L_0x007b
            goto L_0x0088
        L_0x007b:
            boolean r5 = r20.mo27749Y()
            if (r5 == 0) goto L_0x0083
            r5 = 0
            goto L_0x0085
        L_0x0083:
            r5 = 8
        L_0x0085:
            r0.setVisibility(r5)
        L_0x0088:
            r6 = 1
            if (r1 != 0) goto L_0x008c
            goto L_0x009a
        L_0x008c:
            boolean r0 = r20.mo27749Y()
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x0095
            r0 = 0
            goto L_0x0097
        L_0x0095:
            r0 = 8
        L_0x0097:
            r1.setVisibility(r0)
        L_0x009a:
            if (r14 == 0) goto L_0x00a3
            java.lang.String r0 = r20.getName()
            r14.setText(r0)
        L_0x00a3:
            if (r3 != 0) goto L_0x00a6
            goto L_0x00b0
        L_0x00a6:
            boolean r0 = r20.mo27756d0()
            if (r0 == 0) goto L_0x00ad
            r4 = 0
        L_0x00ad:
            r3.setVisibility(r4)
        L_0x00b0:
            boolean r0 = r20.mo27749Y()
            if (r0 == 0) goto L_0x00cc
            if (r15 != 0) goto L_0x00b9
            goto L_0x00c0
        L_0x00b9:
            boolean r0 = r20.mo27762j()
            r15.setChecked(r0)
        L_0x00c0:
            if (r2 != 0) goto L_0x00c3
            goto L_0x00ed
        L_0x00c3:
            boolean r0 = r20.mo27762j()
            r0 = r0 ^ r6
            r2.setChecked(r0)
            goto L_0x00ed
        L_0x00cc:
            if (r13 == 0) goto L_0x00d5
            java.lang.String r0 = r20.toString()
            r13.setText(r0)
        L_0x00d5:
            if (r13 != 0) goto L_0x00d8
            goto L_0x00ed
        L_0x00d8:
            int r0 = r20.mo27743S()
            if (r0 == r6) goto L_0x00e8
            r1 = 3
            if (r0 == r1) goto L_0x00e5
            r0 = 655361(0xa0001, float:9.18356E-40)
            goto L_0x00ea
        L_0x00e5:
            r0 = 12290(0x3002, float:1.7222E-41)
            goto L_0x00ea
        L_0x00e8:
            r0 = 4098(0x1002, float:5.743E-42)
        L_0x00ea:
            r13.setInputType(r0)
        L_0x00ed:
            r5 = 0
            if (r3 == 0) goto L_0x00f8
            com.arlosoft.macrodroid.variables.o0$q0 r0 = new com.arlosoft.macrodroid.variables.o0$q0
            r0.<init>(r13, r5)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r3, r5, r0, r6, r5)
        L_0x00f8:
            if (r7 == 0) goto L_0x0119
            com.arlosoft.macrodroid.variables.o0$r0 r4 = new com.arlosoft.macrodroid.variables.o0$r0
            r16 = 0
            r0 = r4
            r1 = r19
            r2 = r20
            r3 = r21
            r9 = r4
            r4 = r23
            r5 = r10
            r17 = r12
            r12 = 1
            r6 = r24
            r8 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r7 = 0
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r8, r7, r9, r12, r7)
            goto L_0x011d
        L_0x0119:
            r7 = r5
            r17 = r12
            r12 = 1
        L_0x011d:
            if (r14 == 0) goto L_0x0127
            com.arlosoft.macrodroid.variables.o0$s0 r0 = new com.arlosoft.macrodroid.variables.o0$s0
            r0.<init>(r11, r14)
            r14.addTextChangedListener(r0)
        L_0x0127:
            if (r11 != 0) goto L_0x012a
            goto L_0x0147
        L_0x012a:
            int r0 = r20.mo27743S()
            r1 = 2
            if (r0 == r1) goto L_0x0143
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x013d
            r6 = 1
            goto L_0x013e
        L_0x013d:
            r6 = 0
        L_0x013e:
            if (r6 == 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r9 = 0
            goto L_0x0144
        L_0x0143:
            r9 = 1
        L_0x0144:
            r11.setEnabled(r9)
        L_0x0147:
            if (r13 == 0) goto L_0x014c
            com.arlosoft.macrodroid.extensions.C4666m.m18154v(r13)
        L_0x014c:
            if (r13 == 0) goto L_0x0159
            com.arlosoft.macrodroid.variables.o0$t0 r0 = new com.arlosoft.macrodroid.variables.o0$t0
            r2 = r20
            r0.<init>(r11, r2, r13)
            com.arlosoft.macrodroid.extensions.C4666m.m18138f(r13, r0)
            goto L_0x015b
        L_0x0159:
            r2 = r20
        L_0x015b:
            if (r11 == 0) goto L_0x0179
            com.arlosoft.macrodroid.variables.o0$u0 r9 = new com.arlosoft.macrodroid.variables.o0$u0
            r16 = 0
            r0 = r9
            r1 = r14
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r15
            r6 = r13
            r13 = r7
            r7 = r24
            r8 = r10
            r14 = r9
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r11, r13, r14, r12, r13)
            goto L_0x017a
        L_0x0179:
            r13 = r7
        L_0x017a:
            if (r17 == 0) goto L_0x0186
            com.arlosoft.macrodroid.variables.o0$v0 r0 = new com.arlosoft.macrodroid.variables.o0$v0
            r0.<init>(r10, r13)
            r1 = r17
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r1, r13, r0, r12, r13)
        L_0x0186:
            r10.show()
            android.view.Window r0 = r10.getWindow()
            if (r0 == 0) goto L_0x0193
            r1 = 5
            r0.setSoftInputMode(r1)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.m24880I0(android.app.Activity, com.arlosoft.macrodroid.common.MacroDroidVariable, com.arlosoft.macrodroid.macro.Macro, int, int, com.arlosoft.macrodroid.variables.a):void");
    }

    /* renamed from: J */
    public static final void m24881J(Activity activity, int i, SelectableItem selectableItem, Spinner spinner, Macro macro, List<String> list, String str, boolean z, C6540f fVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(spinner, "spinner");
        C13706o.m87929f(list, "customItems");
        C13706o.m87929f(fVar, "variableSelectedListener");
        C6552l lVar = C6552l.f15213a;
        ArrayList<MacroDroidVariable> y0 = selectableItem.mo27875y0();
        ArrayList<MacroDroidVariable> p0 = selectableItem.mo27859p0();
        C13706o.m87928e(p0, "selectableItem.allDictionaryAndArrayVariables");
        ArrayList arrayList = new ArrayList();
        for (T next : p0) {
            if (z || ((MacroDroidVariable) next).mo27780y()) {
                arrayList.add(next);
            }
        }
        C13706o.m87928e(y0, "stringVars");
        m24883K(activity, i, spinner, macro, list, C13566b0.m87442q0(y0, arrayList), str, "", C6538e.DONT_SHOW, selectableItem, lVar, fVar);
    }

    /* renamed from: J0 */
    public static final void m24882J0(Activity activity, int i, MacroDroidVariable macroDroidVariable, Macro macro, VariableValue.Dictionary dictionary, C16265l<? super VariableValue, Boolean> lVar, ArrayList<String> arrayList, int i2, C6538e eVar, boolean z, SelectableItem selectableItem, C16265l<? super List<String>, C13339u> lVar2) {
        VariableValue.Dictionary dictionary2 = dictionary;
        ArrayList<String> arrayList2 = arrayList;
        C6538e eVar2 = eVar;
        C16265l<? super List<String>, C13339u> lVar3 = lVar2;
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(macroDroidVariable, "variable");
        C13706o.m87929f(dictionary2, "dictionary");
        C13706o.m87929f(arrayList2, "keyList");
        C13706o.m87929f(eVar2, "showThisDictionaryOption");
        C13706o.m87929f(lVar3, "keysChosen");
        if (eVar2 == C6538e.SHOW_DICTIONARIES_ONLY && !dictionary2.hasDictionaryChildren(dictionary2)) {
            lVar3.invoke(arrayList2);
        } else if (eVar2 != C6538e.SHOW_ARRAYS_ONLY || dictionary2.hasArrayChildren(dictionary2)) {
            m24884K0(activity, i, dictionary, lVar, (String) null, true, new C6525c(true, (List<String>) null), false, eVar, z, new C6576w0(arrayList, lVar2, activity, i, macroDroidVariable, macro, lVar, i2, eVar, z, selectableItem, dictionary));
        } else {
            lVar3.invoke(arrayList2);
        }
    }

    /* renamed from: K */
    private static final void m24883K(Activity activity, int i, Spinner spinner, Macro macro, List<String> list, List<MacroDroidVariable> list2, String str, String str2, C6538e eVar, SelectableItem selectableItem, C16265l<? super VariableValue, Boolean> lVar, C6540f fVar) {
        Spinner spinner2 = spinner;
        String str3 = str;
        String str4 = str2;
        Iterable<C13592k0> M0 = C13566b0.m87411M0(list);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(M0, 10));
        for (C13592k0 k0Var : M0) {
            arrayList.add(new C6585q0.C6586a((String) k0Var.mo71845d(), k0Var.mo71844c()));
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list2, 10));
        for (MacroDroidVariable bVar : list2) {
            arrayList2.add(new C6585q0.C6587b(bVar, str4));
        }
        List q0 = C13566b0.m87442q0(arrayList, arrayList2);
        Activity activity2 = activity;
        C6595s0 s0Var = new C6595s0(activity2, q0);
        s0Var.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(s0Var);
        C13678a0 a0Var = new C13678a0();
        a0Var.element = true;
        C6595s0 s0Var2 = s0Var;
        C6554m mVar = r2;
        C6554m mVar2 = new C6554m(q0, a0Var, s0Var, fVar, activity2, i, macro, lVar, eVar, selectableItem, str2);
        spinner2.setOnItemSelectedListener(mVar);
        if (str3 != null) {
            C6595s0 s0Var3 = s0Var2;
            s0Var3.mo32811a(str3 + str4);
            s0Var3.notifyDataSetChanged();
            return;
        }
        spinner2.setSelection(0);
    }

    /* renamed from: K0 */
    public static final void m24884K0(Activity activity, int i, VariableValue.Dictionary dictionary, C16265l<? super VariableValue, Boolean> lVar, String str, boolean z, C6525c cVar, boolean z2, C6538e eVar, boolean z3, C6521a aVar) {
        List<VariableValue.DictionaryEntry> list;
        Activity activity2 = activity;
        C16265l<? super VariableValue, Boolean> lVar2 = lVar;
        C6538e eVar2 = eVar;
        C13706o.m87929f(activity, "activity");
        VariableValue.Dictionary dictionary2 = dictionary;
        C13706o.m87929f(dictionary, "dictionary");
        C13706o.m87929f(cVar, "manualKeyOption");
        C13706o.m87929f(eVar2, "showThisDictionaryOption");
        C13706o.m87929f(aVar, "optionChosenCallback");
        if (lVar2 == null) {
            list = dictionary.getEntriesSorted();
        } else {
            List<VariableValue.DictionaryEntry> entriesSorted = dictionary.getEntriesSorted();
            ArrayList arrayList = new ArrayList();
            for (T next : entriesSorted) {
                if (lVar2.invoke(((VariableValue.DictionaryEntry) next).getVariable()).booleanValue()) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
        for (VariableValue.DictionaryEntry key : list) {
            arrayList2.add(key.getKey());
        }
        List F0 = C13566b0.m87402F0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        boolean z4 = eVar2 == C6538e.SHOW_DICTIONARIES_AND_ARRAYS || (eVar2 == C6538e.SHOW_DICTIONARIES_ONLY && !dictionary.isArray()) || (eVar2 == C6538e.SHOW_ARRAYS_ONLY && dictionary.isArray());
        if (z4) {
            String string = activity.getString(dictionary.isArray() ? C17541R$string.variable_this_array : C17541R$string.variable_this_dictionary);
            C13706o.m87928e(string, "activity.getString(if (d…variable_this_dictionary)");
            arrayList3.add(string);
        }
        if (z2) {
            String string2 = activity.getString(dictionary.isArray() ? C17541R$string.variable_copy_other_array : C17541R$string.variable_copy_other_dictionary);
            C13706o.m87928e(string2, "activity.getString(if (d…le_copy_other_dictionary)");
            arrayList3.add(string2);
        }
        if (z) {
            String string3 = activity.getString(dictionary.isArray() ? C17541R$string.variable_dictionary_add_array_index : C17541R$string.variable_dictionary_add_key);
            C13706o.m87928e(string3, "activity.getString(if (d…iable_dictionary_add_key)");
            arrayList3.add(string3);
        }
        if (cVar.mo32715b()) {
            String string4 = activity.getString(C17541R$string.variable_dictionary_array_define_indexes_or_keys_manually);
            C13706o.m87928e(string4, "activity.getString(R.str…indexes_or_keys_manually)");
            arrayList3.add(string4);
        }
        arrayList3.addAll(F0);
        Object[] array = arrayList3.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        C13680b0 b0Var = new C13680b0();
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (C13706o.m87924a(strArr[i2], str)) {
                break;
            } else {
                i2++;
            }
        }
        b0Var.element = i2;
        if (i2 < 0) {
            b0Var.element = 0;
        }
        if (!z4 || strArr.length != 1) {
            int i3 = i;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
            builder.setTitle(dictionary.isArray() ? C17541R$string.variable_array_index : C17541R$string.variable_dictionary_select_key);
            builder.setSingleChoiceItems((CharSequence[]) strArr, b0Var.element, (DialogInterface.OnClickListener) new C6498d0(b0Var));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6504g0(strArr, b0Var, activity, aVar, cVar, dictionary));
            builder.setCancelable(z3);
            builder.show();
            return;
        }
        aVar.mo24836a();
    }

    /* renamed from: L */
    public static final void m24885L(int i, Activity activity, int i2, SelectableItem selectableItem, Spinner spinner, Macro macro, List<String> list, String str, String str2, C6540f fVar) {
        int i3 = i;
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(spinner, "spinner");
        C13706o.m87929f(list, "customItems");
        C13706o.m87929f(str2, "labelSuffix");
        C13706o.m87929f(fVar, "variableSelectedListener");
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    m24881J(activity, i2, selectableItem, spinner, macro, list, str, false, fVar);
                    return;
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        m24878H(activity, i2, selectableItem, spinner, macro, list, str, fVar);
                        return;
                    } else if (i3 == 5) {
                        m24872E(activity, i2, selectableItem, spinner, macro, list, str, fVar);
                        return;
                    } else {
                        return;
                    }
                }
            }
            m24879I(activity, i2, selectableItem, spinner, macro, list, str, str2, false, fVar);
            return;
        }
        m24874F(activity, i2, selectableItem, spinner, macro, list, str, str2, false, fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m24886L0(C13680b0 b0Var, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(b0Var, "$selectedIndex");
        b0Var.element = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m24887M(Activity activity, MacroDroidVariable macroDroidVariable, Macro macro, int i, Dialog dialog, C6487a aVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setTitle((int) C17541R$string.delete_variable);
        builder.setMessage((CharSequence) activity.getString(C17541R$string.are_you_sure_delete_variable));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6594s(macro, macroDroidVariable, aVar, dialog));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C6506h0.f15133a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m24888M0(String[] strArr, C13680b0 b0Var, Activity activity, C6521a aVar, C6525c cVar, VariableValue.Dictionary dictionary, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$keys");
        C13706o.m87929f(b0Var, "$selectedIndex");
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(aVar, "$optionChosenCallback");
        C13706o.m87929f(cVar, "$manualKeyOption");
        C13706o.m87929f(dictionary, "$dictionary");
        C13706o.m87929f(dialogInterface, "dialog");
        String str = strArr[b0Var.element];
        boolean z = true;
        if (C13706o.m87924a(str, activity.getString(C17541R$string.variable_copy_other_array)) ? true : C13706o.m87924a(str, activity.getString(C17541R$string.variable_copy_other_dictionary))) {
            aVar.mo24838c();
        } else {
            if (!C13706o.m87924a(str, activity.getString(C17541R$string.variable_dictionary_add_array_index))) {
                z = C13706o.m87924a(str, activity.getString(C17541R$string.variable_dictionary_add_key));
            }
            if (z) {
                aVar.mo24839d();
            } else if (C13706o.m87924a(str, activity.getString(C17541R$string.variable_dictionary_array_define_indexes_or_keys_manually))) {
                aVar.mo24837b(cVar.mo32714a());
            } else if (C13706o.m87924a(str, activity.getString(C17541R$string.variable_this_array))) {
                aVar.mo24836a();
            } else if (C13706o.m87924a(str, activity.getString(C17541R$string.variable_this_dictionary))) {
                aVar.mo24836a();
            } else {
                VariableValue.DictionaryEntry entry = dictionary.getEntry(strArr[b0Var.element]);
                C13706o.m87926c(entry);
                aVar.mo24840e(entry);
            }
        }
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static final void m24889N(Macro macro, MacroDroidVariable macroDroidVariable, C6487a aVar, Dialog dialog, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(macro, "$macro");
        C13706o.m87929f(macroDroidVariable, "$variable");
        C13706o.m87929f(aVar, "$dictionaryEventListener");
        C13706o.m87929f(dialog, "$dialogToClose");
        macro.getLocalVariables().remove(macroDroidVariable);
        aVar.mo27160b();
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r0 = (p057a2.C2220i) r6;
     */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24890N0(com.arlosoft.macrodroid.common.SelectableItem r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p057a2.C2219h
            if (r0 == 0) goto L_0x001a
            r0 = r6
            a2.h r0 = (p057a2.C2219h) r0
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r0.mo24432s()
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.getName()
            boolean r1 = kotlin.jvm.internal.C13706o.m87924a(r1, r7)
            if (r1 == 0) goto L_0x001a
            r0.mo27765k0(r8)
        L_0x001a:
            boolean r0 = r6 instanceof p057a2.C2220i
            if (r0 == 0) goto L_0x0030
            r0 = r6
            a2.i r0 = (p057a2.C2220i) r0
            java.lang.String r1 = r0.mo24434m()
            if (r1 == 0) goto L_0x0030
            boolean r1 = kotlin.jvm.internal.C13706o.m87924a(r1, r7)
            if (r1 == 0) goto L_0x0030
            r0.mo24433f(r8)
        L_0x0030:
            boolean r0 = r6 instanceof p057a2.C2221j
            if (r0 == 0) goto L_0x0053
            r0 = r6
            a2.j r0 = (p057a2.C2221j) r0
            java.lang.String[] r1 = r0.mo24435a()
            r2 = 0
            int r3 = r1.length
        L_0x003d:
            if (r2 >= r3) goto L_0x0050
            r4 = r1[r2]
            if (r4 == 0) goto L_0x004d
            r4 = r1[r2]
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r7)
            if (r4 == 0) goto L_0x004d
            r1[r2] = r8
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0050:
            r0.mo24436e(r1)
        L_0x0053:
            boolean r0 = r6 instanceof p057a2.C2222k
            if (r0 == 0) goto L_0x007e
            r0 = r6
            a2.k r0 = (p057a2.C2222k) r0
            java.util.List r0 = r0.mo24437j()
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r0.next()
            com.arlosoft.macrodroid.common.MacroDroidVariable r1 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r1
            if (r1 == 0) goto L_0x0062
            java.lang.String r2 = r1.getName()
            boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r2, r7)
            if (r2 == 0) goto L_0x0062
            r1.mo27765k0(r8)
            goto L_0x0062
        L_0x007e:
            boolean r0 = r6 instanceof p057a2.C2226o
            if (r0 == 0) goto L_0x0087
            a2.o r6 = (p057a2.C2226o) r6
            r6.mo24443c(r7, r8)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.m24890N0(com.arlosoft.macrodroid.common.SelectableItem, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static final void m24891O(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: P */
    public static final void m24892P(VariableValue.Dictionary dictionary, VariableValue.Dictionary dictionary2) {
        C13706o.m87929f(dictionary, "dicToUpdate");
        C13706o.m87929f(dictionary2, "dicToCopy");
        dictionary.getEntries().clear();
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        obtain.writeParcelable(dictionary2, 0);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(VariableValue.Dictionary.class.getClassLoader());
        C13706o.m87926c(readParcelable);
        obtain.recycle();
        dictionary.getEntries().addAll(((VariableValue.Dictionary) readParcelable).getEntries());
    }

    /* renamed from: Q */
    public static final void m24893Q(Activity activity, int i, VariableValue.Dictionary dictionary, Macro macro, C16265l<? super String, C13339u> lVar) {
        Activity activity2 = activity;
        C16265l<? super String, C13339u> lVar2 = lVar;
        C13706o.m87929f(activity2, "activity");
        C13706o.m87929f(dictionary, "dictionary");
        C13706o.m87929f(lVar2, "keyChosen");
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity2, i);
        appCompatDialog.setContentView((int) C17535R$layout.variable_new_key_dialog);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        Button button = (Button) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        Button button2 = (Button) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.keyName);
        C13706o.m87926c(findViewById3);
        EditText editText = (EditText) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.magicTextButton);
        C13706o.m87926c(findViewById4);
        Button button3 = (Button) findViewById4;
        if (dictionary.isArray()) {
            appCompatDialog.setTitle((int) C17541R$string.variable_dictionary_add_array_index);
            editText.setHint(C17541R$string.variable_array_index);
            editText.setInputType(2);
        } else {
            appCompatDialog.setTitle((int) C17541R$string.variable_dictionary_add_key);
            editText.setHint(C17541R$string.variable_dictionary_key);
            editText.setInputType(655361);
        }
        Activity activity3 = activity;
        Macro macro2 = macro;
        C4666m.m18147o(button3, (C13640g) null, new C6557n(dictionary, activity3, macro2, new C6496c0(editText), i, (C13635d<? super C6557n>) null), 1, (Object) null);
        editText.addTextChangedListener(new C6559o(dictionary, activity3, macro2, button, editText));
        button.setOnClickListener(new C6488a0(lVar2, editText, appCompatDialog));
        button2.setOnClickListener(new C6597u(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final void m24894R(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$keyName");
        editText.setInputType(1);
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        if (text != null) {
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static final void m24895S(C16265l lVar, EditText editText, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(lVar, "$keyChosen");
        C13706o.m87929f(editText, "$keyName");
        C13706o.m87929f(appCompatDialog, "$dialog");
        lVar.invoke(editText.getText().toString());
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static final void m24896T(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: U */
    public static final void m24897U(Activity activity, boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, String str, boolean z5, Macro macro, Integer num, C6530d dVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity2, "activity");
        C13706o.m87929f(str, "secondaryColorAsString");
        C13706o.m87929f(dVar, "newVariableCreationListener");
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity2, i);
        appCompatDialog.setContentView((int) C17535R$layout.variable_new_variable_dialog);
        appCompatDialog.setTitle((int) C17541R$string.create_new_variable);
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        Button button = (Button) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        Button button2 = (Button) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.type_container);
        C13706o.m87926c(findViewById3);
        ViewGroup viewGroup = (ViewGroup) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.variable_new_variable_dialog_name);
        C13706o.m87926c(findViewById4);
        EditText editText = (EditText) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.variable_new_variable_type_spinner);
        C13706o.m87926c(findViewById5);
        Spinner spinner = (Spinner) findViewById5;
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.local_global_layout);
        C13706o.m87926c(findViewById6);
        ViewGroup viewGroup2 = (ViewGroup) findViewById6;
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.radio_button_local);
        C13706o.m87926c(findViewById7);
        RadioButton radioButton = (RadioButton) findViewById7;
        C13684d0 d0Var = new C13684d0();
        T findViewById8 = appCompatDialog.findViewById(C17532R$id.create_now_check_box);
        C13706o.m87926c(findViewById8);
        d0Var.element = findViewById8;
        View findViewById9 = appCompatDialog.findViewById(C17532R$id.create_var_magic_text);
        C13706o.m87926c(findViewById9);
        Button button3 = (Button) findViewById9;
        ((View) d0Var.element).setVisibility(z3 ? 0 : 8);
        viewGroup2.setVisibility(z4 ? 0 : 8);
        editText.addTextChangedListener(new C6561p(button, editText));
        if (z5) {
            button3.setVisibility(0);
            button3.setOnClickListener(new C6510j0(activity2, new C6500e0(editText), macro));
        }
        C13684d0 d0Var2 = d0Var;
        spinner.setAdapter(m24918h0(activity, true, !z, str, i2, false, 32, (Object) null));
        if (num != null) {
            viewGroup.setVisibility(8);
        }
        C6602z zVar = r0;
        C6602z zVar2 = new C6602z(dVar, editText, activity, num, spinner, z, z4, radioButton, z2, appCompatDialog, d0Var2, z3);
        button.setOnClickListener(zVar);
        button2.setOnClickListener(new C6596t(appCompatDialog));
        button.setEnabled(false);
        C4656c.m18114c(appCompatDialog, activity.getResources().getDimensionPixelOffset(C17529R$dimen.margin_large));
        appCompatDialog.show();
        Window window = appCompatDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static final void m24898V(Activity activity, C4023j0.C4028e eVar, Macro macro, View view) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(eVar, "$textMagicTextListener");
        C4023j0.m15700F(activity, eVar, macro, true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static final void m24899W(C6530d dVar, EditText editText, Activity activity, Integer num, Spinner spinner, boolean z, boolean z2, RadioButton radioButton, boolean z3, AppCompatDialog appCompatDialog, C13684d0 d0Var, boolean z4, View view) {
        C13706o.m87929f(dVar, "$newVariableCreationListener");
        C13706o.m87929f(editText, "$variableName");
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(spinner, "$variableTypeSpinner");
        C13706o.m87929f(radioButton, "$radioButtonLocal");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(d0Var, "$createNowCheckbox");
        if (!dVar.mo25510b(editText.getText().toString())) {
            m24867B0(activity, C17542R$style.Theme_App_Dialog_Variables);
            return;
        }
        int intValue = num != null ? num.intValue() : spinner.getSelectedItemPosition();
        if (z || !(intValue == 5 || intValue == 4)) {
            if (z2) {
                z3 = radioButton.isChecked();
            }
            MacroDroidVariable macroDroidVariable = new MacroDroidVariable(num != null ? num.intValue() : spinner.getSelectedItemPosition(), editText.getText().toString(), z3);
            appCompatDialog.dismiss();
            dVar.mo25509a(macroDroidVariable, ((CheckBox) d0Var.element).isChecked() || !z4);
            return;
        }
        UpgradeActivity2.f14829L.mo32326a(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static final void m24900X(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m24901Y(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$variableName");
        C13706o.m87929f(fVar, "pair");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* renamed from: Z */
    public static final void m24902Z(Activity activity, int i, MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, Macro macro, List<String> list, List<String> list2, boolean z, SelectableItem selectableItem, C16265l<? super C6523b, C13339u> lVar) {
        String str;
        ViewGroup viewGroup;
        int i2;
        String g0;
        Activity activity2 = activity;
        C16265l<? super C6523b, C13339u> lVar2 = lVar;
        C13706o.m87929f(activity2, "activity");
        C13706o.m87929f(macroDroidVariable, "variable");
        C13706o.m87929f(dictionary, "dictionary");
        C13706o.m87929f(lVar2, "keyChosen");
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity2, i);
        appCompatDialog.setContentView((int) C17535R$layout.variable_manual_key_dialog);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        Button button = (Button) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        Button button2 = (Button) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.manualKeysEntry);
        C13706o.m87926c(findViewById3);
        EditText editText = (EditText) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.magicTextButton);
        C13706o.m87926c(findViewById4);
        Button button3 = (Button) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.descriptionText);
        C13706o.m87926c(findViewById5);
        TextView textView = (TextView) findViewById5;
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.fullVariableText);
        C13706o.m87926c(findViewById6);
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.validIndicator);
        C13706o.m87926c(findViewById7);
        ImageView imageView = (ImageView) findViewById7;
        View findViewById8 = appCompatDialog.findViewById(C17532R$id.fullVarTitle);
        C13706o.m87926c(findViewById8);
        TextView textView3 = (TextView) findViewById8;
        View findViewById9 = appCompatDialog.findViewById(C17532R$id.variableTypeContainer);
        C13706o.m87926c(findViewById9);
        ViewGroup viewGroup2 = (ViewGroup) findViewById9;
        View findViewById10 = appCompatDialog.findViewById(C17532R$id.valueTypeSpinner);
        C13706o.m87926c(findViewById10);
        Spinner spinner = (Spinner) findViewById10;
        appCompatDialog.setTitle((int) C17541R$string.variable_dictionary_array_define_indexes_or_keys_manually);
        textView.setText(dictionary.isArray() ? C17541R$string.variable_array_define_indexes_manually_description : C17541R$string.variable_dictionary_define_keys_manually_description);
        textView3.setText(dictionary.isArray() ? C17541R$string.variable_full_variable_name_with_array_index : C17541R$string.variable_full_variable_name_with_dictionary_keys);
        String str2 = "";
        if (list == null || (str = C13566b0.m87432g0(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C6567s.f15241a, 30, (Object) null)) == null) {
            str = str2;
        }
        if (!(list2 == null || (g0 = C13566b0.m87432g0(list2, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C6569t.f15244a, 30, (Object) null)) == null)) {
            str2 = g0;
        }
        Button button4 = button3;
        if (C15176v.m93634I(str2, str, false, 2, (Object) null)) {
            editText.setText(str2);
        } else {
            editText.setText(str + str2);
        }
        C4666m.m18154v(editText);
        C6563q qVar = r0;
        Spinner spinner2 = spinner;
        ViewGroup viewGroup3 = viewGroup2;
        ImageView imageView2 = imageView;
        TextView textView4 = textView2;
        C6563q qVar2 = new C6563q(dictionary, activity, macro, new C6502f0(editText), i, selectableItem, (C13635d<? super C6563q>) null);
        boolean z2 = true;
        C4666m.m18147o(button4, (C13640g) null, qVar, 1, (Object) null);
        if (z) {
            viewGroup = viewGroup3;
            i2 = 0;
        } else {
            i2 = 8;
            viewGroup = viewGroup3;
        }
        viewGroup.setVisibility(i2);
        Editable text = editText.getText();
        C13706o.m87928e(text, "keyText.text");
        button.setEnabled(text.length() > 0);
        Editable text2 = editText.getText();
        C13706o.m87928e(text2, "keyText.text");
        if (text2.length() <= 0) {
            z2 = false;
        }
        ImageView imageView3 = imageView2;
        imageView3.setImageResource(z2 ? C17530R$drawable.green_tick : C17530R$drawable.red_cross);
        TextView textView5 = textView4;
        textView5.setText(String.valueOf(macroDroidVariable.getName()));
        editText.addTextChangedListener(new C6565r(textView5, macroDroidVariable, dictionary, button, imageView3, activity, macro));
        f15162a.m24952y0(textView5, macroDroidVariable.getName(), editText.getText().toString());
        button.setOnClickListener(new C6512k0(editText, spinner2, lVar2, appCompatDialog));
        button2.setOnClickListener(new C6518n0(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m24904a0(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$keyText");
        editText.setInputType(1);
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        if (text != null) {
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m24906b0(EditText editText, Spinner spinner, C16265l lVar, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(editText, "$keyText");
        C13706o.m87929f(spinner, "$valueTypeSpinner");
        C13706o.m87929f(lVar, "$keyChosen");
        C13706o.m87929f(appCompatDialog, "$dialog");
        List<String> j0 = f15162a.m24922j0(editText.getText().toString());
        if (!(j0 == null || j0.isEmpty()) && !j0.contains("")) {
            lVar.invoke(new C6523b(j0, Integer.valueOf(spinner.getSelectedItemPosition())));
            appCompatDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m24908c0(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: d0 */
    public static final List<VariableWithDictionaryKeys> m24910d0(List<MacroDroidVariable> list, boolean z) {
        C13706o.m87929f(list, "dictionaryList");
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable macroDroidVariable : list) {
            if (macroDroidVariable.mo27748X() == z) {
                arrayList.add(new VariableWithDictionaryKeys(macroDroidVariable.getName(), new DictionaryKeys(C13614t.m87748j())));
            }
            f15162a.m24866B(macroDroidVariable, macroDroidVariable.mo27770n(), z, arrayList, C13614t.m87748j());
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public static final String m24912e0(DictionaryKeys dictionaryKeys) {
        return dictionaryKeys == null ? "" : m24914f0(dictionaryKeys.getKeys());
    }

    /* renamed from: f0 */
    public static final String m24914f0(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            for (String a : list) {
                sb.append("[");
                sb.append(MacroDroidVariable.f10326c.mo27785a(a));
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "dictionaryKeysString.toString()");
        return sb2;
    }

    /* renamed from: g0 */
    public static final ArrayAdapter<CharSequence> m24916g0(Activity activity, boolean z, boolean z2, String str, int i, boolean z3) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, "secondaryColorAsString");
        CharSequence[] textArray = activity.getResources().getTextArray(C17525R$array.variable_type_options);
        C13706o.m87928e(textArray, "activity.resources.getTe…ay.variable_type_options)");
        List r0 = C13596m.m87619r0(textArray);
        if (z) {
            List<String> m = C13614t.m87751m(activity.getString(C17541R$string.variable_type_dictionary), activity.getString(C17541R$string.variable_type_array));
            if (z2) {
                ArrayList arrayList = new ArrayList(C13616u.m87774u(m, 10));
                for (String str2 : m) {
                    arrayList.add(Html.fromHtml(str2 + "<br/><font color=" + str + "><small>" + activity.getString(C17541R$string.pro_version_required) + "</small></font>"));
                }
                r0.addAll(arrayList);
            } else {
                r0.addAll(m);
            }
        }
        if (z3) {
            r0.add(0, activity.getString(C17541R$string.variable_type_filter_all_variables));
        }
        return new ArrayAdapter<>(activity, i, r0);
    }

    /* renamed from: h0 */
    public static /* synthetic */ ArrayAdapter m24918h0(Activity activity, boolean z, boolean z2, String str, int i, boolean z3, int i2, Object obj) {
        return m24916g0(activity, z, z2, str, i, (i2 & 32) != 0 ? false : z3);
    }

    /* renamed from: i0 */
    public static final List<String> m24920i0(Context context) {
        C13706o.m87929f(context, "context");
        String[] stringArray = context.getResources().getStringArray(C17525R$array.variable_type_options);
        C13706o.m87928e(stringArray, "context.resources.getStr…ay.variable_type_options)");
        List<String> I0 = C13566b0.m87405I0(new ArrayList(C13596m.m87610i0(stringArray)));
        I0.addAll(C13614t.m87751m(context.getString(C17541R$string.variable_type_dictionary), context.getString(C17541R$string.variable_type_array)));
        return I0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final List<String> m24922j0(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (!C15176v.m93640u(str, "]", false, 2, (Object) null)) {
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '[') {
                i++;
                if (i == 1) {
                    sb = new StringBuilder();
                } else {
                    sb.append(str.charAt(i2));
                }
            } else if (str.charAt(i2) == ']') {
                i--;
                if (i == 0) {
                    String sb2 = sb.toString();
                    C13706o.m87928e(sb2, "entryBuilder.toString()");
                    arrayList.add(sb2);
                } else {
                    sb.append(str.charAt(i2));
                }
            } else {
                sb.append(str.charAt(i2));
            }
        }
        if (i != 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m24924k0(VariableValue.Dictionary dictionary, C6489b bVar, View view, RecyclerView recyclerView, C16254a<C13339u> aVar) {
        C4064u.m16048t().mo27974H();
        bVar.mo32678D(dictionary);
        int i = 0;
        view.setVisibility(dictionary.getEntries().isEmpty() ? 0 : 8);
        if (!(!dictionary.getEntries().isEmpty())) {
            i = 8;
        }
        recyclerView.setVisibility(i);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: l0 */
    private final void m24926l0(Context context, MacroDroidVariable macroDroidVariable, DictionaryKeys dictionaryKeys, View.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        VariableValue.DictionaryEntry o;
        VariableValue V = macroDroidVariable.mo27746V();
        if (!(dictionaryKeys == null || (o = macroDroidVariable.mo27771o(dictionaryKeys.getKeys())) == null)) {
            V = o.getVariable();
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(context, C17542R$style.Theme_App_Dialog_Variables);
        appCompatDialog.setContentView((int) C17535R$layout.enter_boolean_value_dialog);
        appCompatDialog.setTitle((CharSequence) macroDroidVariable.getName() + m24912e0(dictionaryKeys));
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.trueRadio);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.falseRadio);
        C13706o.m87926c(radioButton);
        C13706o.m87927d(V, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.BooleanValue");
        VariableValue.BooleanValue booleanValue = (VariableValue.BooleanValue) V;
        radioButton.setChecked(booleanValue.getBooleanValue());
        C13706o.m87926c(radioButton2);
        C13706o.m87927d(V, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.BooleanValue");
        radioButton2.setChecked(!booleanValue.getBooleanValue());
        C13706o.m87926c(button);
        button.setOnClickListener(new C6601y(macroDroidVariable, radioButton, dictionaryKeys, onClickListener, appCompatDialog));
        C13706o.m87926c(button2);
        button2.setOnClickListener(new C6599w(appCompatDialog));
        appCompatDialog.setOnDismissListener(onDismissListener);
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        window.setType(C6363a1.m24607a());
        appCompatDialog.show();
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setSoftInputMode(5);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m24928m0(MacroDroidVariable macroDroidVariable, RadioButton radioButton, DictionaryKeys dictionaryKeys, View.OnClickListener onClickListener, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(macroDroidVariable, "$variable");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C4064u.m16048t().mo27980P(macroDroidVariable, new VariableValue.BooleanValue(radioButton.isChecked(), dictionaryKeys != null ? dictionaryKeys.getKeys() : null), true, (Macro) null);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m24930n0(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: o0 */
    public static final void m24932o0(Context context, MacroDroidVariable macroDroidVariable, View.OnClickListener onClickListener) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(macroDroidVariable, "variable");
        AppCompatDialog appCompatDialog = new AppCompatDialog(context, C17542R$style.Theme_App_Dialog_Variables);
        appCompatDialog.setContentView((int) C17535R$layout.enter_variable_value_dialog);
        appCompatDialog.setTitle((int) C17541R$string.enter_variable_name);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_variable_dialog_value);
        C13706o.m87926c(editText);
        editText.setHint(C17541R$string.enter_variable_name);
        editText.setText(macroDroidVariable.getName());
        editText.setSelection(editText.length());
        editText.addTextChangedListener(new C6571u(button, editText));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        if (!context.getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        appCompatDialog.show();
        Window window3 = appCompatDialog.getWindow();
        C13706o.m87926c(window3);
        window3.setSoftInputMode(5);
        C13706o.m87926c(button2);
        button2.setOnClickListener(new C6598v(appCompatDialog));
        C13706o.m87926c(button);
        button.setOnClickListener(new C6514l0(editText, macroDroidVariable, appCompatDialog, context, onClickListener));
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m24934p0(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static final void m24936q0(EditText editText, MacroDroidVariable macroDroidVariable, AppCompatDialog appCompatDialog, Context context, View.OnClickListener onClickListener, View view) {
        C13706o.m87929f(macroDroidVariable, "$variable");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(context, "$context");
        String obj = editText.getText().toString();
        if (C13706o.m87924a(obj, macroDroidVariable.getName())) {
            appCompatDialog.dismiss();
        } else if (C4064u.m16048t().mo27996w(obj) != null) {
            m24867B0(context, C17542R$style.Theme_App_Dialog_Variables);
        } else {
            if (!macroDroidVariable.mo27754c0()) {
                f15162a.m24946v0(macroDroidVariable, obj);
            } else {
                macroDroidVariable.mo27765k0(obj);
            }
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            appCompatDialog.dismiss();
        }
    }

    /* renamed from: r0 */
    public static final void m24938r0(Context context, MacroDroidVariable macroDroidVariable, DictionaryKeys dictionaryKeys, View.OnClickListener onClickListener, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        VariableValue.DictionaryEntry o;
        Context context2 = context;
        MacroDroidVariable macroDroidVariable2 = macroDroidVariable;
        C13706o.m87929f(context, "context");
        C13706o.m87929f(macroDroidVariable, "variable");
        C13684d0 d0Var = new C13684d0();
        d0Var.element = macroDroidVariable.mo27746V();
        if (!(dictionaryKeys == null || (o = macroDroidVariable.mo27771o(dictionaryKeys.getKeys())) == null)) {
            d0Var.element = o.getVariable();
        }
        if (((VariableValue) d0Var.element).getVariableType() == 0) {
            f15162a.m24926l0(context, macroDroidVariable, dictionaryKeys, onClickListener, onDismissListener);
            return;
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(context, C17542R$style.Theme_App_Dialog_Variables);
        appCompatDialog.setContentView((int) C17535R$layout.enter_variable_value_dialog);
        appCompatDialog.setTitle((CharSequence) macroDroidVariable.getName());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        if (!context.getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_variable_dialog_value);
        int variableType = ((VariableValue) d0Var.element).getVariableType();
        boolean z2 = true;
        if (variableType == 1) {
            C13706o.m87926c(editText);
            editText.setInputType(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            editText.setText(((VariableValue) d0Var.element).getValueAsText());
        } else if (variableType != 3) {
            C13706o.m87926c(editText);
            editText.setInputType(655361);
            editText.setText(((VariableValue) d0Var.element).getValueAsText());
        } else {
            C13706o.m87926c(editText);
            editText.setText(((VariableValue) d0Var.element).getValueAsText());
            editText.setInputType(12290);
        }
        C13706o.m87926c(button);
        if (((VariableValue) d0Var.element).getVariableType() != 2 && editText.toString().length() <= 0) {
            z2 = false;
        }
        button.setEnabled(z2);
        editText.setSelection(editText.getText().length());
        editText.addTextChangedListener(new C6573v(button, d0Var, editText));
        button.setOnClickListener(new C6600x(macroDroidVariable, editText, d0Var, dictionaryKeys, onClickListener, appCompatDialog));
        appCompatDialog.setOnDismissListener(onDismissListener);
        C13706o.m87926c(button2);
        button2.setOnClickListener(new C6516m0(appCompatDialog));
        if (z) {
            Window window3 = appCompatDialog.getWindow();
            C13706o.m87926c(window3);
            window3.setType(C6363a1.m24607a());
        }
        appCompatDialog.show();
        Window window4 = appCompatDialog.getWindow();
        C13706o.m87926c(window4);
        window4.setSoftInputMode(5);
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m24940s0(MacroDroidVariable macroDroidVariable, EditText editText, C13684d0 d0Var, DictionaryKeys dictionaryKeys, View.OnClickListener onClickListener, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(macroDroidVariable, "$variable");
        C13706o.m87929f(d0Var, "$variableValue");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C4064u.m16048t().mo27980P(macroDroidVariable, VariableValue.Companion.mo32660c(editText.getText().toString(), ((VariableValue) d0Var.element).getVariableType(), dictionaryKeys != null ? dictionaryKeys.getKeys() : null), true, (Macro) null);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m24942t0(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: u0 */
    private final void m24944u0(String str, String str2, String str3) {
        for (Macro actions : C4934n.m18998M().mo29673C()) {
            Iterator<Action> it = actions.getActions().iterator();
            while (it.hasNext()) {
                Action next = it.next();
                if (next instanceof ActionBlockAction) {
                    ActionBlockAction actionBlockAction = (ActionBlockAction) next;
                    if (C13706o.m87924a(actionBlockAction.mo24716y3(), str)) {
                        actionBlockAction.mo24711E3(str2, str3);
                    }
                }
            }
        }
    }

    /* renamed from: v0 */
    private final void m24946v0(MacroDroidVariable macroDroidVariable, String str) {
        String name = macroDroidVariable.getName();
        List<Macro> C = C4934n.m18998M().mo29673C();
        C4064u.m16048t().mo27981Q(macroDroidVariable, str);
        for (Macro next : C) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                C13706o.m87928e(next2, "trigger");
                m24950x0(next2, name, str);
                m24890N0(next2, name, str);
                for (Constraint next3 : next2.mo27826J0()) {
                    C13706o.m87928e(next3, "constraint");
                    m24870D(next3, name, str);
                }
            }
            Iterator<Action> it2 = next.getActions().iterator();
            while (it2.hasNext()) {
                Action next4 = it2.next();
                C13706o.m87928e(next4, "action");
                m24950x0(next4, name, str);
                m24890N0(next4, name, str);
                for (Constraint next5 : next4.mo27826J0()) {
                    C13706o.m87928e(next5, "constraint");
                    m24870D(next5, name, str);
                }
                if (next4 instanceof WaitUntilTriggerAction) {
                    Iterator<Trigger> it3 = ((WaitUntilTriggerAction) next4).mo26117B3().iterator();
                    while (it3.hasNext()) {
                        Trigger next6 = it3.next();
                        C13706o.m87928e(next6, "trigger");
                        m24950x0(next6, name, str);
                        m24890N0(next6, name, str);
                        for (Constraint next7 : next6.mo27826J0()) {
                            C13706o.m87928e(next7, "constraint");
                            m24870D(next7, name, str);
                        }
                    }
                }
            }
            for (Constraint next8 : next.getConstraints()) {
                C13706o.m87928e(next8, "constraint");
                m24870D(next8, name, str);
            }
        }
        C8152a M = C5163j2.m20012M(MacroDroidApplication.f9883I.mo27303b());
        for (C8153b next9 : M.drawerItems) {
            if (next9 instanceof C8162k) {
                C8162k kVar = (C8162k) next9;
                if (C13706o.m87924a(kVar.getVariableName(), name)) {
                    kVar.setVariableName(str);
                }
            }
        }
        C5163j2.m19974G3(MacroDroidApplication.f9883I.mo27303b(), M);
        C4934n.m18998M().mo29702s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public final void m24948w0(MacroDroidVariable macroDroidVariable, Macro macro, String str) {
        String name = macroDroidVariable.getName();
        macro.renameLocalVariable(macroDroidVariable, str);
        Iterator<Trigger> it = macro.getTriggerListWithAwaitingActions().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            C13706o.m87928e(next, "trigger");
            m24950x0(next, name, str);
            m24890N0(next, name, str);
            for (Constraint next2 : next.mo27826J0()) {
                C13706o.m87928e(next2, "constraint");
                m24870D(next2, name, str);
            }
        }
        Iterator<Action> it2 = macro.getActions().iterator();
        while (it2.hasNext()) {
            Action next3 = it2.next();
            C13706o.m87928e(next3, "action");
            m24950x0(next3, name, str);
            m24890N0(next3, name, str);
            for (Constraint next4 : next3.mo27826J0()) {
                C13706o.m87928e(next4, "constraint");
                m24870D(next4, name, str);
            }
            if (next3 instanceof WaitUntilTriggerAction) {
                Iterator<Trigger> it3 = ((WaitUntilTriggerAction) next3).mo26117B3().iterator();
                while (it3.hasNext()) {
                    Trigger next5 = it3.next();
                    C13706o.m87928e(next5, "trigger");
                    m24950x0(next5, name, str);
                    m24890N0(next5, name, str);
                    for (Constraint next6 : next5.mo27826J0()) {
                        C13706o.m87928e(next6, "constraint");
                        m24870D(next6, name, str);
                    }
                }
            }
        }
        for (Constraint next7 : macro.getConstraints()) {
            C13706o.m87928e(next7, "constraint");
            m24870D(next7, name, str);
        }
        if (macro instanceof ActionBlock) {
            String name2 = ((ActionBlock) macro).getName();
            C13706o.m87928e(name2, "macro.name");
            m24944u0(name2, name, str);
        }
        C4934n.m18998M().mo29702s0();
    }

    /* renamed from: x0 */
    private final void m24950x0(SelectableItem selectableItem, String str, String str2) {
        SelectableItem selectableItem2 = selectableItem;
        String str3 = str;
        String str4 = str2;
        if (selectableItem2 instanceof C2224m) {
            C2224m mVar = (C2224m) selectableItem2;
            String[] F = mVar.mo24440F();
            int length = F.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                if (!TextUtils.isEmpty(F[i])) {
                    String str5 = F[i];
                    C13706o.m87928e(str5, "textValues[i]");
                    if (C15177w.m93663N(str5, "v=" + str3, z, 2, (Object) null)) {
                        String str6 = F[i];
                        C13706o.m87928e(str6, "textValues[i]");
                        if (!C15177w.m93663N(str6, "stopwatch=" + str3, z, 2, (Object) null)) {
                            String str7 = F[i];
                            C13706o.m87928e(str7, "textValues[i]");
                            if (!C15177w.m93663N(str7, "stopwatchtime=" + str3, z, 2, (Object) null)) {
                                String str8 = F[i];
                                C13706o.m87928e(str8, "textValues[i]");
                                F[i] = C15176v.m93630E(str8, "{v=" + str3 + '}', "{v=" + str4 + '}', false, 4, (Object) null);
                                String str9 = F[i];
                                C13706o.m87928e(str9, "textValues[i]");
                                String str10 = "[v=";
                                F[i] = C15176v.m93630E(str9, "[v=" + str3 + ']', "[v=" + str4 + ']', false, 4, (Object) null);
                                String str11 = F[i];
                                C13706o.m87928e(str11, "textValues[i]");
                                F[i] = C15176v.m93630E(str11, "{v=" + str3 + '[', "{v=" + str4 + '[', false, 4, (Object) null);
                                String str12 = F[i];
                                C13706o.m87928e(str12, "textValues[i]");
                                F[i] = C15176v.m93630E(str12, str10 + str3 + '[', str10 + str4 + '[', false, 4, (Object) null);
                                String str13 = F[i];
                                C13706o.m87928e(str13, "textValues[i]");
                                F[i] = C15176v.m93630E(str13, "{lv=" + str3 + '}', "{lv=" + str4 + '}', false, 4, (Object) null);
                                String str14 = F[i];
                                C13706o.m87928e(str14, "textValues[i]");
                                F[i] = C15176v.m93630E(str14, "[lv=" + str3 + ']', "[lv=" + str4 + ']', false, 4, (Object) null);
                                String str15 = F[i];
                                C13706o.m87928e(str15, "textValues[i]");
                                F[i] = C15176v.m93630E(str15, "{lv=" + str3 + '[', "{lv=" + str4 + '[', false, 4, (Object) null);
                                String str16 = F[i];
                                C13706o.m87928e(str16, "textValues[i]");
                                F[i] = C15176v.m93630E(str16, "[lv=" + str3 + '[', "[lv=" + str4 + '[', false, 4, (Object) null);
                            }
                        }
                    }
                }
                i++;
                z = false;
            }
            mVar.mo24441I(F);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m24952y0(TextView textView, String str, String str2) {
        SpannableStringBuilder append = new SpannableStringBuilder().append(String.valueOf(str));
        C13706o.m87928e(append, "SpannableStringBuilder()…      .append(\"$varName\")");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.3f);
        int length = append.length();
        append.append(" ");
        append.setSpan(relativeSizeSpan, length, append.length(), 17);
        int color = ContextCompat.getColor(textView.getContext(), C17528R$color.manual_dictionary_formatting_param);
        int color2 = ContextCompat.getColor(textView.getContext(), C17528R$color.manual_dictionary_formatting_bad);
        int length2 = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str2.charAt(i2);
            if (charAt == '[') {
                i++;
                if (i == 1) {
                    RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(1.2f);
                    int length3 = append.length();
                    append.append('[');
                    append.setSpan(relativeSizeSpan2, length3, append.length(), 17);
                } else if (i >= 2) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
                    int length4 = append.length();
                    append.append('[');
                    append.setSpan(foregroundColorSpan, length4, append.length(), 17);
                } else {
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(color2);
                    int length5 = append.length();
                    append.append('[');
                    append.setSpan(foregroundColorSpan2, length5, append.length(), 17);
                }
            } else if (charAt == ']') {
                i--;
                if (i == 0) {
                    RelativeSizeSpan relativeSizeSpan3 = new RelativeSizeSpan(1.2f);
                    int length6 = append.length();
                    append.append("]");
                    append.setSpan(relativeSizeSpan3, length6, append.length(), 17);
                    RelativeSizeSpan relativeSizeSpan4 = new RelativeSizeSpan(0.3f);
                    int length7 = append.length();
                    append.append(" ");
                    append.setSpan(relativeSizeSpan4, length7, append.length(), 17);
                } else if (i >= 1) {
                    ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(color);
                    int length8 = append.length();
                    append.append(']');
                    append.setSpan(foregroundColorSpan3, length8, append.length(), 17);
                } else {
                    ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(color2);
                    int length9 = append.length();
                    append.append(']');
                    append.setSpan(foregroundColorSpan4, length9, append.length(), 17);
                }
            } else if (i >= 1) {
                ForegroundColorSpan foregroundColorSpan5 = new ForegroundColorSpan(color);
                int length10 = append.length();
                append.append(charAt);
                append.setSpan(foregroundColorSpan5, length10, append.length(), 17);
            } else {
                ForegroundColorSpan foregroundColorSpan6 = new ForegroundColorSpan(color2);
                int length11 = append.length();
                append.append(charAt);
                append.setSpan(foregroundColorSpan6, length11, append.length(), 17);
            }
        }
        textView.setText(append);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00d4, code lost:
        r1 = kotlin.text.C15175u.m93622l((r1 = r1.getKey()));
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m24954z0(android.app.Activity r20, int r21, com.arlosoft.macrodroid.common.MacroDroidVariable r22, com.arlosoft.macrodroid.variables.VariableValue.Dictionary r23, com.arlosoft.macrodroid.macro.Macro r24, p135n1.C7967d r25, p370qa.C16265l<? super p297ja.C13328m<java.lang.String, java.lang.Integer>, p297ja.C13339u> r26) {
        /*
            r8 = r20
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "variable"
            r1 = r22
            kotlin.jvm.internal.C13706o.m87929f(r1, r0)
            java.lang.String r0 = "dictionary"
            r9 = r23
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "macro"
            r4 = r24
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = "iteratorType"
            r6 = r25
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            java.lang.String r0 = "keyAndTypeChosen"
            r10 = r26
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            androidx.appcompat.app.AppCompatDialog r11 = new androidx.appcompat.app.AppCompatDialog
            r0 = r21
            r11.<init>(r8, r0)
            r0 = 2131558551(0x7f0d0097, float:1.874242E38)
            r11.setContentView((int) r0)
            java.lang.String r0 = r22.getName()
            r11.setTitle((java.lang.CharSequence) r0)
            r0 = 2131363010(0x7f0a04c2, float:1.8345817E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r12 = r0
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            r0 = 2131363009(0x7f0a04c1, float:1.8345815E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 2131364201(0x7f0a0969, float:1.8348232E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r14 = r0
            android.widget.Spinner r14 = (android.widget.Spinner) r14
            r0 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r15 = r0
            android.widget.Button r15 = (android.widget.Button) r15
            r0 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r7 = r0
            android.widget.Button r7 = (android.widget.Button) r7
            r0 = 2131363011(0x7f0a04c3, float:1.8345819E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r5 = r0
            android.widget.Button r5 = (android.widget.Button) r5
            com.arlosoft.macrodroid.variables.b0 r3 = new com.arlosoft.macrodroid.variables.b0
            r3.<init>(r13)
            com.arlosoft.macrodroid.variables.o0$x r2 = new com.arlosoft.macrodroid.variables.o0$x
            r16 = 0
            r0 = r2
            r1 = r13
            r17 = r2
            r2 = r23
            r18 = r3
            r3 = r20
            r19 = r5
            r5 = r18
            r8 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            r7 = 1
            r2 = r17
            r1 = r19
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r1, r0, r2, r7, r0)
            boolean r1 = r23.isArray()
            if (r1 == 0) goto L_0x00e9
            r1 = 2131955757(0x7f13102d, float:1.954805E38)
            r12.setHint((int) r1)
            r1 = 2
            r13.setInputType(r1)
            java.util.List r1 = r23.getEntriesArrayOrder()
            java.lang.Object r1 = kotlin.collections.C13566b0.m87436k0(r1)
            com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r1 = (com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry) r1
            if (r1 == 0) goto L_0x00df
            java.lang.String r1 = r1.getKey()
            if (r1 == 0) goto L_0x00df
            java.lang.Integer r1 = kotlin.text.C15175u.m93622l(r1)
            if (r1 == 0) goto L_0x00df
            int r1 = r1.intValue()
            goto L_0x00e0
        L_0x00df:
            r1 = -1
        L_0x00e0:
            int r1 = r1 + r7
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.setText(r1)
            goto L_0x00f5
        L_0x00e9:
            r1 = 2131955772(0x7f13103c, float:1.954808E38)
            r12.setHint((int) r1)
            r1 = 655361(0xa0001, float:9.18356E-40)
            r13.setInputType(r1)
        L_0x00f5:
            com.arlosoft.macrodroid.variables.o0$w r1 = new com.arlosoft.macrodroid.variables.o0$w
            r1.<init>(r15, r13)
            r13.addTextChangedListener(r1)
            com.arlosoft.macrodroid.variables.o0$y r9 = new com.arlosoft.macrodroid.variables.o0$y
            r6 = 0
            r1 = r9
            r2 = r26
            r3 = r13
            r4 = r14
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r15, r0, r9, r7, r0)
            com.arlosoft.macrodroid.variables.o0$z r1 = new com.arlosoft.macrodroid.variables.o0$z
            r1.<init>(r11, r0)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r8, r0, r1, r7, r0)
            android.text.Editable r0 = r13.getText()
            java.lang.String r1 = "keyName.text"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r7 = 0
        L_0x0125:
            r15.setEnabled(r7)
            android.content.res.Resources r0 = r20.getResources()
            r1 = 2131165589(0x7f070195, float:1.79454E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            com.arlosoft.macrodroid.extensions.C4656c.m18114c(r11, r0)
            r11.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.C6520o0.m24954z0(android.app.Activity, int, com.arlosoft.macrodroid.common.MacroDroidVariable, com.arlosoft.macrodroid.variables.VariableValue$Dictionary, com.arlosoft.macrodroid.macro.Macro, n1.d, qa.l):void");
    }

    /* renamed from: H0 */
    public final void mo32704H0(Activity activity, MacroDroidVariable macroDroidVariable, Macro macro, int i, int i2, C6487a aVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity, "activity");
        MacroDroidVariable macroDroidVariable2 = macroDroidVariable;
        C13706o.m87929f(macroDroidVariable, "variable");
        Macro macro2 = macro;
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(aVar, "dictionaryEventListener");
        if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
            m24871D0(activity, macroDroidVariable, macroDroidVariable.getName(), macroDroidVariable.getName(), macroDroidVariable.mo27770n(), true, (VariableValue.Dictionary) null, new ArrayList(), aVar);
            return;
        }
        m24880I0(activity, macroDroidVariable, macro, i, i2, aVar);
    }
}
