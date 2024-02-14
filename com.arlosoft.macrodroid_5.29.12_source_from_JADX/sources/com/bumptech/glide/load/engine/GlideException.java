package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p102h4.C7376a;
import p102h4.C7380e;

public final class GlideException extends Exception {

    /* renamed from: a */
    private static final StackTraceElement[] f15491a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private C7376a dataSource;
    private String detailMessage;
    @Nullable
    private Exception exception;
    private C7380e key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: a */
    private void m25239a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).mo32980e()) {
                m25239a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m25240b(List<Throwable> list, Appendable appendable) {
        try {
            m25241c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m25241c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m25243h(appendable);
            } else {
                m25242d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m25242d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m25243h(Appendable appendable) {
        m25242d(this, appendable);
        m25240b(mo32980e(), new C6660a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> mo32980e() {
        return this.causes;
    }

    /* renamed from: f */
    public List<Throwable> mo32981f() {
        ArrayList arrayList = new ArrayList();
        m25239a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void mo32983g(String str) {
        List<Throwable> f = mo32981f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            str = ", " + this.dataClass;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            str2 = ", " + this.dataSource;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        }
        sb.append(str3);
        List<Throwable> f = mo32981f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            sb.append(" causes:");
        }
        for (Throwable next : f) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo32985i(C7380e eVar, C7376a aVar) {
        mo32986j(eVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo32986j(C7380e eVar, C7376a aVar, Class<?> cls) {
        this.key = eVar;
        this.dataSource = aVar;
        this.dataClass = cls;
    }

    /* renamed from: k */
    public void mo32987k(@Nullable Exception exc) {
        this.exception = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        m25243h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f15491a);
        this.causes = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        m25243h(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C6660a implements Appendable {

        /* renamed from: a */
        private final Appendable f15492a;

        /* renamed from: c */
        private boolean f15493c = true;

        C6660a(Appendable appendable) {
            this.f15492a = appendable;
        }

        @NonNull
        /* renamed from: a */
        private CharSequence m25250a(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f15493c) {
                this.f15493c = false;
                this.f15492a.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f15493c = z;
            this.f15492a.append(c);
            return this;
        }

        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence a = m25250a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m25250a(charSequence);
            boolean z = false;
            if (this.f15493c) {
                this.f15493c = false;
                this.f15492a.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f15493c = z;
            this.f15492a.append(a, i, i2);
            return this;
        }
    }
}
