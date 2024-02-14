package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.database.room.C4403i;
import com.arlosoft.macrodroid.database.room.C4429s;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.logging.LogActivity;
import com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity;
import java.io.File;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import org.apache.commons.p353io.IOUtils;
import org.apache.commons.p353io.input.ReversedLinesFileReader;
import p149q1.C8153b;
import p149q1.C8156e;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerLogViewHolder */
/* compiled from: DrawerLogViewHolder.kt */
public final class DrawerLogViewHolder extends C4490d {
    @BindView(2131362592)
    public ImageView dragHandle;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final MacroDroidRoomDatabase f11354e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8156e f11355f;
    @BindView(2131363079)
    public TextView logText;
    @BindView(2131364038)
    public TextView title;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerLogViewHolder$a */
    /* compiled from: DrawerLogViewHolder.kt */
    static final class C4462a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ DrawerLogViewHolder this$0;

        /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerLogViewHolder$a$a */
        /* compiled from: DrawerLogViewHolder.kt */
        static final class C4463a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ DrawerLogViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4463a(DrawerLogViewHolder drawerLogViewHolder, C13635d<? super C4463a> dVar) {
                super(2, dVar);
                this.this$0 = drawerLogViewHolder;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4463a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4463a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.mo28849P().setText(C17541R$string.no_events_logged);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerLogViewHolder$a$b */
        /* compiled from: DrawerLogViewHolder.kt */
        static final class C4464b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ String $text;
            int label;
            final /* synthetic */ DrawerLogViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4464b(DrawerLogViewHolder drawerLogViewHolder, String str, C13635d<? super C4464b> dVar) {
                super(2, dVar);
                this.this$0 = drawerLogViewHolder;
                this.$text = str;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4464b(this.this$0, this.$text, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4464b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.mo28849P().setText(this.$text);
                    TextView P = this.this$0.mo28849P();
                    C8156e L = this.this$0.f11355f;
                    if (L == null) {
                        C13706o.m87945v("drawerItemLog");
                        L = null;
                    }
                    P.setMaxLines(L.getMaxLines());
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4462a(DrawerLogViewHolder drawerLogViewHolder, C13635d<? super C4462a> dVar) {
            super(2, dVar);
            this.this$0 = drawerLogViewHolder;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4462a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4462a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4429s g = this.this$0.f11354e.mo28681g();
                C8156e L = this.this$0.f11355f;
                if (L == null) {
                    C13706o.m87945v("drawerItemLog");
                    L = null;
                }
                int maxLines = L.getMaxLines();
                int d = C4403i.INFO.mo28734d();
                this.label = 1;
                obj = g.mo28778c(maxLines, d, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else if (i == 2 || i == 3) {
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<SystemLogEntry> list = (List) obj;
            StringBuilder sb = new StringBuilder();
            if (list.isEmpty()) {
                C15423h2 c2 = C15186a1.m93731c();
                C4463a aVar = new C4463a(this.this$0, (C13635d<? super C4463a>) null);
                this.label = 2;
                if (C15414h.m94298g(c2, aVar, this) == c) {
                    return c;
                }
            } else {
                for (SystemLogEntry e : list) {
                    sb.append(e.mo28688e());
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                String sb2 = sb.toString();
                C13706o.m87928e(sb2, "stringBuilder.toString()");
                String E = C15176v.m93630E(sb2, "\\n", IOUtils.LINE_SEPARATOR_UNIX, false, 4, (Object) null);
                C15423h2 c3 = C15186a1.m93731c();
                C4464b bVar = new C4464b(this.this$0, E, (C13635d<? super C4464b>) null);
                this.label = 3;
                if (C15414h.m94298g(c3, bVar, this) == c) {
                    return c;
                }
            }
            return C13339u.f61331a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerLogViewHolder(MacroDroidRoomDatabase macroDroidRoomDatabase, View view, C4481a aVar, int i) {
        super(view, aVar);
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        C13706o.m87929f(view, "itemView");
        this.f11354e = macroDroidRoomDatabase;
        ButterKnife.bind((Object) this, view);
        float f = (float) i;
        mo28850Q().setTextSize(2, f);
        mo28849P().setTextSize(2, f);
    }

    /* renamed from: N */
    private final void m17597N() {
        mo28847E();
    }

    /* renamed from: R */
    private final void m17598R() {
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C4462a(this, (C13635d<? super C4462a>) null), 2, (Object) null);
    }

    /* renamed from: S */
    private final void m17599S() {
        try {
            File filesDir = this.itemView.getContext().getFilesDir();
            File file = new File(filesDir.toString() + "/MacroDroidUserLog.txt");
            StringBuilder sb = new StringBuilder();
            C8156e eVar = null;
            if (file.exists()) {
                ReversedLinesFileReader reversedLinesFileReader = new ReversedLinesFileReader(file, 4096, "utf-8");
                int i = 0;
                C13684d0 d0Var = new C13684d0();
                while (true) {
                    T readLine = reversedLinesFileReader.readLine();
                    if (readLine != null) {
                        d0Var.element = readLine;
                    } else {
                        d0Var.element = null;
                    }
                    if (readLine != null) {
                        C8156e eVar2 = this.f11355f;
                        if (eVar2 == null) {
                            C13706o.m87945v("drawerItemLog");
                            eVar2 = null;
                        }
                        if (i >= eVar2.getMaxLines()) {
                            break;
                        }
                        T t = d0Var.element;
                        C13706o.m87926c(t);
                        int a0 = C15177w.m93682a0((CharSequence) t, "] - ", 0, false, 6, (Object) null);
                        if (a0 != -1) {
                            T t2 = d0Var.element;
                            C13706o.m87926c(t2);
                            String substring = ((String) t2).substring(a0 + 4);
                            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                            sb.append(substring);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        } else {
                            sb.append((String) d0Var.element);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (sb.length() > 0) {
                String sb2 = sb.toString();
                C13706o.m87928e(sb2, "stringBuilder.toString()");
                mo28849P().setText(C15176v.m93630E(sb2, "\\n", IOUtils.LINE_SEPARATOR_UNIX, false, 4, (Object) null));
                TextView P = mo28849P();
                C8156e eVar3 = this.f11355f;
                if (eVar3 == null) {
                    C13706o.m87945v("drawerItemLog");
                } else {
                    eVar = eVar3;
                }
                P.setMaxLines(eVar.getMaxLines());
                return;
            }
            mo28849P().setText(C17541R$string.no_events_logged);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[]{mo28850Q(), mo28849P()};
    }

    /* renamed from: D */
    public void mo28843D(C8153b bVar, boolean z) {
        C13706o.m87929f(bVar, "drawerItem");
        super.mo28843D(bVar, z);
        if (bVar instanceof C8156e) {
            C8156e eVar = (C8156e) bVar;
            this.f11355f = eVar;
            C8156e eVar2 = null;
            if (eVar == null) {
                C13706o.m87945v("drawerItemLog");
                eVar = null;
            }
            mo28887F(eVar.getColor());
            TextView Q = mo28850Q();
            C8156e eVar3 = this.f11355f;
            if (eVar3 == null) {
                C13706o.m87945v("drawerItemLog");
            } else {
                eVar2 = eVar3;
            }
            Q.setText(eVar2.isUserLog() ? C17541R$string.user_log : C17541R$string.system_log);
            m17597N();
            if (z) {
                mo28848O().setVisibility(0);
                mo28890I(mo28848O());
                return;
            }
            mo28848O().setVisibility(8);
            return;
        }
        throw new IllegalArgumentException("DrawerItemLog required".toString());
    }

    /* renamed from: E */
    public void mo28847E() {
        C8156e eVar = this.f11355f;
        if (eVar == null) {
            C13706o.m87945v("drawerItemLog");
            eVar = null;
        }
        if (eVar.isUserLog()) {
            m17599S();
        } else {
            m17598R();
        }
    }

    /* renamed from: O */
    public final ImageView mo28848O() {
        ImageView imageView = this.dragHandle;
        if (imageView != null) {
            return imageView;
        }
        C13706o.m87945v("dragHandle");
        return null;
    }

    /* renamed from: P */
    public final TextView mo28849P() {
        TextView textView = this.logText;
        if (textView != null) {
            return textView;
        }
        C13706o.m87945v("logText");
        return null;
    }

    /* renamed from: Q */
    public final TextView mo28850Q() {
        TextView textView = this.title;
        if (textView != null) {
            return textView;
        }
        C13706o.m87945v("title");
        return null;
    }

    @OnClick({2131363078})
    public final void handleClick() {
        Intent intent;
        this.itemView.setEnabled(false);
        mo28894w();
        C8156e eVar = this.f11355f;
        if (eVar == null) {
            C13706o.m87945v("drawerItemLog");
            eVar = null;
        }
        if (eVar.isUserLog()) {
            intent = new Intent(this.itemView.getContext(), LogActivity.class);
            intent.putExtra(LogActivity.f12202B, true);
        } else {
            intent = new Intent(this.itemView.getContext(), SystemLogActivity.class);
        }
        intent.addFlags(805306368);
        this.itemView.getContext().startActivity(intent);
    }
}
