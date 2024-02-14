package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;
import java.util.Arrays;

public class FieldFilter extends Filter {

    /* renamed from: a */
    private final Filter.Operator f5856a;

    /* renamed from: b */
    private final Value f5857b;

    /* renamed from: c */
    private final FieldPath f5858c;

    /* renamed from: com.google.firebase.firestore.core.FieldFilter$1 */
    static /* synthetic */ class C19561 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5859a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.core.Filter$Operator[] r0 = com.google.firebase.firestore.core.Filter.Operator.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5859a = r0
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5859a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5859a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.EQUAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5859a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5859a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5859a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firebase.firestore.core.Filter$Operator r1 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.FieldFilter.C19561.<clinit>():void");
        }
    }

    protected FieldFilter(FieldPath fieldPath, Filter.Operator operator, Value value) {
        this.f5858c = fieldPath;
        this.f5856a = operator;
        this.f5857b = value;
    }

    /* renamed from: d */
    public static FieldFilter m8065d(FieldPath fieldPath, Filter.Operator operator, Value value) {
        if (fieldPath.mo62849v()) {
            if (operator == Filter.Operator.IN) {
                return new KeyFieldInFilter(fieldPath, value);
            }
            if (operator == Filter.Operator.NOT_IN) {
                return new KeyFieldNotInFilter(fieldPath, value);
            }
            boolean z = (operator == Filter.Operator.ARRAY_CONTAINS || operator == Filter.Operator.ARRAY_CONTAINS_ANY) ? false : true;
            Assert.m76443d(z, operator.toString() + "queries don't make sense on document keys", new Object[0]);
            return new KeyFieldFilter(fieldPath, operator, value);
        } else if (operator == Filter.Operator.ARRAY_CONTAINS) {
            return new ArrayContainsFilter(fieldPath, value);
        } else {
            if (operator == Filter.Operator.IN) {
                return new InFilter(fieldPath, value);
            }
            if (operator == Filter.Operator.ARRAY_CONTAINS_ANY) {
                return new ArrayContainsAnyFilter(fieldPath, value);
            }
            if (operator == Filter.Operator.NOT_IN) {
                return new NotInFilter(fieldPath, value);
            }
            return new FieldFilter(fieldPath, operator, value);
        }
    }

    /* renamed from: a */
    public String mo23858a() {
        return mo23859b().mo62797e() + mo23860e().toString() + Values.m75915b(mo23862f());
    }

    /* renamed from: b */
    public FieldPath mo23859b() {
        return this.f5858c;
    }

    /* renamed from: c */
    public boolean mo23807c(Document document) {
        Value f = document.mo62823f(this.f5858c);
        if (this.f5856a == Filter.Operator.NOT_EQUAL) {
            if (f == null || !mo23864h(Values.m75922i(f, this.f5857b))) {
                return false;
            }
            return true;
        } else if (f == null || Values.m75913B(f) != Values.m75913B(this.f5857b) || !mo23864h(Values.m75922i(f, this.f5857b))) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public Filter.Operator mo23860e() {
        return this.f5856a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FieldFilter)) {
            return false;
        }
        FieldFilter fieldFilter = (FieldFilter) obj;
        if (this.f5856a != fieldFilter.f5856a || !this.f5858c.equals(fieldFilter.f5858c) || !this.f5857b.equals(fieldFilter.f5857b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Value mo23862f() {
        return this.f5857b;
    }

    /* renamed from: g */
    public boolean mo23863g() {
        return Arrays.asList(new Filter.Operator[]{Filter.Operator.LESS_THAN, Filter.Operator.LESS_THAN_OR_EQUAL, Filter.Operator.GREATER_THAN, Filter.Operator.GREATER_THAN_OR_EQUAL, Filter.Operator.NOT_EQUAL, Filter.Operator.NOT_IN}).contains(this.f5856a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo23864h(int i) {
        switch (C19561.f5859a[this.f5856a.ordinal()]) {
            case 1:
                if (i < 0) {
                    return true;
                }
                return false;
            case 2:
                if (i <= 0) {
                    return true;
                }
                return false;
            case 3:
                if (i == 0) {
                    return true;
                }
                return false;
            case 4:
                if (i != 0) {
                    return true;
                }
                return false;
            case 5:
                if (i > 0) {
                    return true;
                }
                return false;
            case 6:
                if (i >= 0) {
                    return true;
                }
                return false;
            default:
                throw Assert.m76440a("Unknown FieldFilter operator: %s", this.f5856a);
        }
    }

    public int hashCode() {
        return ((((1147 + this.f5856a.hashCode()) * 31) + this.f5858c.hashCode()) * 31) + this.f5857b.hashCode();
    }

    public String toString() {
        return this.f5858c.mo62797e() + " " + this.f5856a + " " + this.f5857b;
    }
}
