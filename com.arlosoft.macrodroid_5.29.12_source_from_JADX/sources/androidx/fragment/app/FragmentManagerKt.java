package androidx.fragment.app;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\bø\u0001\u0000\u001a.\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\bø\u0001\u0000\u001a8\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u000b"}, mo71668d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lja/u;", "body", "commit", "commitNow", "now", "transaction", "fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: FragmentManager.kt */
public final class FragmentManagerKt {
    public static final void commit(FragmentManager fragmentManager, boolean z, C16265l<? super FragmentTransaction, C13339u> lVar) {
        C13706o.m87929f(fragmentManager, "<this>");
        C13706o.m87929f(lVar, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        lVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        C13706o.m87929f(fragmentManager, "<this>");
        C13706o.m87929f(lVar, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        lVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static final void commitNow(FragmentManager fragmentManager, boolean z, C16265l<? super FragmentTransaction, C13339u> lVar) {
        C13706o.m87929f(fragmentManager, "<this>");
        C13706o.m87929f(lVar, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        lVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        C13706o.m87929f(fragmentManager, "<this>");
        C13706o.m87929f(lVar, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        lVar.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static final void transaction(FragmentManager fragmentManager, boolean z, boolean z2, C16265l<? super FragmentTransaction, C13339u> lVar) {
        C13706o.m87929f(fragmentManager, "<this>");
        C13706o.m87929f(lVar, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        lVar.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z, boolean z2, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        C13706o.m87929f(fragmentManager, "<this>");
        C13706o.m87929f(lVar, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        lVar.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}
