package p064c2;

import com.arlosoft.macrodroid.action.IterateDictionaryAction;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;
import kotlin.jvm.internal.C13706o;

/* renamed from: c2.a */
/* compiled from: ActiveIteratorRepository.kt */
public final class C2267a {

    /* renamed from: a */
    public static final C2267a f6973a = new C2267a();

    /* renamed from: b */
    private static final HashMap<Macro, Stack<IterateDictionaryAction>> f6974b = new HashMap<>();

    private C2267a() {
    }

    /* renamed from: a */
    public static final void m9332a(Macro macro, IterateDictionaryAction iterateDictionaryAction) {
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(iterateDictionaryAction, "action");
        HashMap<Macro, Stack<IterateDictionaryAction>> hashMap = f6974b;
        if (hashMap.get(macro) == null) {
            hashMap.put(macro, new Stack());
        }
        Stack stack = hashMap.get(macro);
        if (stack != null) {
            IterateDictionaryAction iterateDictionaryAction2 = (IterateDictionaryAction) stack.push(iterateDictionaryAction);
        }
    }

    /* renamed from: b */
    public static final void m9333b(Macro macro) {
        C13706o.m87929f(macro, "macro");
        f6974b.remove(macro);
    }

    /* renamed from: c */
    public static final IterateDictionaryAction m9334c(Macro macro) {
        if (macro == null) {
            return null;
        }
        try {
            Stack stack = f6974b.get(macro);
            if (stack != null) {
                return (IterateDictionaryAction) stack.peek();
            }
            return null;
        } catch (EmptyStackException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static final void m9335d(Macro macro, IterateDictionaryAction iterateDictionaryAction) {
        Stack stack;
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(iterateDictionaryAction, "action");
        HashMap<Macro, Stack<IterateDictionaryAction>> hashMap = f6974b;
        Stack stack2 = hashMap.get(macro);
        if (C13706o.m87924a(stack2 != null ? (IterateDictionaryAction) stack2.peek() : null, iterateDictionaryAction) && (stack = hashMap.get(macro)) != null) {
            IterateDictionaryAction iterateDictionaryAction2 = (IterateDictionaryAction) stack.pop();
        }
    }
}
