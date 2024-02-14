package com.firebase.p073ui.auth.util.p075ui;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.IntentRequiredException;
import com.firebase.p073ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import p138n5.C7985a;

/* renamed from: com.firebase.ui.auth.util.ui.b */
/* compiled from: FlowUtils */
public final class C6897b {
    /* renamed from: a */
    private static void m26054a(HelperActivityBase helperActivityBase, PendingIntent pendingIntent, int i) {
        try {
            helperActivityBase.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            helperActivityBase.mo34177L1(0, IdpResponse.m25764k(e));
        }
    }

    /* renamed from: b */
    private static void m26055b(C7985a aVar, PendingIntent pendingIntent, int i) {
        try {
            aVar.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException e) {
            ((HelperActivityBase) aVar.requireActivity()).mo34177L1(0, IdpResponse.m25764k(e));
        }
    }

    /* renamed from: c */
    public static boolean m26056c(@NonNull HelperActivityBase helperActivityBase, @Nullable Exception exc) {
        if (exc instanceof IntentRequiredException) {
            IntentRequiredException intentRequiredException = (IntentRequiredException) exc;
            helperActivityBase.startActivityForResult(intentRequiredException.mo34153b(), intentRequiredException.mo34154c());
            return false;
        } else if (!(exc instanceof PendingIntentRequiredException)) {
            return true;
        } else {
            PendingIntentRequiredException pendingIntentRequiredException = (PendingIntentRequiredException) exc;
            m26054a(helperActivityBase, pendingIntentRequiredException.mo34155b(), pendingIntentRequiredException.mo34156c());
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m26057d(@NonNull C7985a aVar, @Nullable Exception exc) {
        if (exc instanceof IntentRequiredException) {
            IntentRequiredException intentRequiredException = (IntentRequiredException) exc;
            aVar.startActivityForResult(intentRequiredException.mo34153b(), intentRequiredException.mo34154c());
            return false;
        } else if (!(exc instanceof PendingIntentRequiredException)) {
            return true;
        } else {
            PendingIntentRequiredException pendingIntentRequiredException = (PendingIntentRequiredException) exc;
            m26055b(aVar, pendingIntentRequiredException.mo34155b(), pendingIntentRequiredException.mo34156c());
            return false;
        }
    }
}
