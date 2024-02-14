package com.google.firebase.database.collection;

import java.lang.Comparable;
import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class StandardComparator<A extends Comparable<A>> implements Comparator<A> {

    /* renamed from: a */
    private static StandardComparator f5560a = new StandardComparator();

    private StandardComparator() {
    }

    /* renamed from: a */
    public int compare(A a, A a2) {
        return a.compareTo(a2);
    }
}
