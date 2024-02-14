package com.arlosoft.macrodroid.extensions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.extensions.b */
/* compiled from: AppCompatActivityExtensions.kt */
public final class C4655b {
    /* renamed from: a */
    public static final void m18110a(AppCompatActivity appCompatActivity, Fragment fragment, int i) {
        C13706o.m87929f(appCompatActivity, "<this>");
        C13706o.m87929f(fragment, "fragment");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        C13706o.m87928e(supportFragmentManager, "supportFragmentManager");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        beginTransaction.add(i, fragment);
        beginTransaction.commit();
    }

    /* renamed from: b */
    public static final void m18111b(AppCompatActivity appCompatActivity, Fragment fragment, int i) {
        C13706o.m87929f(appCompatActivity, "<this>");
        C13706o.m87929f(fragment, "fragment");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        C13706o.m87928e(supportFragmentManager, "supportFragmentManager");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        C13706o.m87928e(beginTransaction, "beginTransaction()");
        beginTransaction.replace(i, fragment);
        beginTransaction.commit();
    }
}
