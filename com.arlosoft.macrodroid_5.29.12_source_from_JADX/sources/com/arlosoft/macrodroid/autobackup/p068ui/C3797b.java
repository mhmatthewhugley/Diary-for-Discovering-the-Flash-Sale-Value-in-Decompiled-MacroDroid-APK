package com.arlosoft.macrodroid.autobackup.p068ui;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.autobackup.p068ui.local.C3865f;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p193y0.C10392a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.b */
/* compiled from: BackupFileListAdapter.kt */
public final class C3797b extends RecyclerView.Adapter<C3798a> {

    /* renamed from: a */
    private final List<C10392a> f9922a;

    /* renamed from: b */
    private final C3865f f9923b;

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.b$a */
    /* compiled from: BackupFileListAdapter.kt */
    public static final class C3798a extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C3865f f9924a;

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.b$a$a */
        /* compiled from: BackupFileListAdapter.kt */
        static final class C3799a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C10392a $backupFile;
            int label;
            final /* synthetic */ C3798a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3799a(C3798a aVar, C10392a aVar2, C13635d<? super C3799a> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$backupFile = aVar2;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C3799a(this.this$0, this.$backupFile, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f9924a.mo27418v(this.$backupFile);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.b$a$b */
        /* compiled from: BackupFileListAdapter.kt */
        static final class C3800b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C10392a $backupFile;
            int label;
            final /* synthetic */ C3798a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3800b(C3798a aVar, C10392a aVar2, C13635d<? super C3800b> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$backupFile = aVar2;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C3800b(this.this$0, this.$backupFile, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f9924a.mo27417u(this.$backupFile);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3798a(View view, C3865f fVar) {
            super(view);
            C13706o.m87929f(view, "itemView");
            C13706o.m87929f(fVar, "presenter");
            this.f9924a = fVar;
        }

        /* renamed from: u */
        public final void mo27324u(C10392a aVar) {
            C13706o.m87929f(aVar, "backupFile");
            ((TextView) this.itemView.findViewById(C17532R$id.fileName)).setText(aVar.mo41077a().getName());
            ((TextView) this.itemView.findViewById(C17532R$id.infoLabel)).setText(DateUtils.getRelativeTimeSpanString(aVar.mo41077a().lastModified()));
            View view = this.itemView;
            int i = C17532R$id.container;
            MaterialCardView materialCardView = (MaterialCardView) view.findViewById(i);
            C13706o.m87928e(materialCardView, "itemView.container");
            C4666m.m18147o(materialCardView, (C13640g) null, new C3799a(this, aVar, (C13635d<? super C3799a>) null), 1, (Object) null);
            MaterialCardView materialCardView2 = (MaterialCardView) this.itemView.findViewById(i);
            C13706o.m87928e(materialCardView2, "itemView.container");
            C4666m.m18152t(materialCardView2, (C13640g) null, false, new C3800b(this, aVar, (C13635d<? super C3800b>) null), 3, (Object) null);
        }
    }

    public C3797b(List<C10392a> list, C3865f fVar) {
        C13706o.m87929f(list, "fileList");
        C13706o.m87929f(fVar, "presenter");
        this.f9922a = list;
        this.f9923b = fVar;
    }

    /* renamed from: B */
    public void onBindViewHolder(C3798a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo27324u(this.f9922a.get(i));
    }

    /* renamed from: C */
    public C3798a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.item_autobackup_file, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…ckup_file, parent, false)");
        return new C3798a(inflate, this.f9923b);
    }

    public int getItemCount() {
        return this.f9922a.size();
    }
}
