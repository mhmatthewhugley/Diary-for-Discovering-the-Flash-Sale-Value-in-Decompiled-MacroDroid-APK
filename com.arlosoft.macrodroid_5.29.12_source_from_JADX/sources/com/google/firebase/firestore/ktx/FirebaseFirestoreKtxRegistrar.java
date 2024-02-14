package com.google.firebase.firestore.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, mo71668d2 = {"Lcom/google/firebase/firestore/ktx/FirebaseFirestoreKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-firestore-ktx"}, mo71669k = 1, mo71670mv = {1, 1, 13})
@Keep
/* compiled from: Firestore.kt */
public final class FirebaseFirestoreKtxRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return C13612s.m87736e(LibraryVersionComponent.m77170b("fire-fst-ktx", "22.1.2"));
    }
}
