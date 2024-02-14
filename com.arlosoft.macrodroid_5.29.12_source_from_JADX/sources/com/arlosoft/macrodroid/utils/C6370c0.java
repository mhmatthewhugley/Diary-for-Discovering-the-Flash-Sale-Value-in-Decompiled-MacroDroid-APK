package com.arlosoft.macrodroid.utils;

import java.util.Observable;

/* renamed from: com.arlosoft.macrodroid.utils.c0 */
/* compiled from: FragmentObserver */
public class C6370c0 extends Observable {
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }
}
