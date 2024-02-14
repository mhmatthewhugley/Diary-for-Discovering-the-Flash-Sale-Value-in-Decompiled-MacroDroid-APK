package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class CycleDetector {

    private static class ComponentNode {

        /* renamed from: a */
        private final Component<?> f4780a;

        /* renamed from: b */
        private final Set<ComponentNode> f4781b = new HashSet();

        /* renamed from: c */
        private final Set<ComponentNode> f4782c = new HashSet();

        ComponentNode(Component<?> component) {
            this.f4780a = component;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22900a(ComponentNode componentNode) {
            this.f4781b.add(componentNode);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo22901b(ComponentNode componentNode) {
            this.f4782c.add(componentNode);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Component<?> mo22902c() {
            return this.f4780a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<ComponentNode> mo22903d() {
            return this.f4781b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo22904e() {
            return this.f4781b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo22905f() {
            return this.f4782c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo22906g(ComponentNode componentNode) {
            this.f4782c.remove(componentNode);
        }
    }

    private static class Dep {

        /* renamed from: a */
        private final Class<?> f4783a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f4784b;

        public boolean equals(Object obj) {
            if (!(obj instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) obj;
            if (!dep.f4783a.equals(this.f4783a) || dep.f4784b != this.f4784b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f4783a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f4784b).hashCode();
        }

        private Dep(Class<?> cls, boolean z) {
            this.f4783a = cls;
            this.f4784b = z;
        }
    }

    CycleDetector() {
    }

    /* renamed from: a */
    static void m6412a(List<Component<?>> list) {
        Set<ComponentNode> c = m6414c(list);
        Set<ComponentNode> b = m6413b(c);
        int i = 0;
        while (!b.isEmpty()) {
            ComponentNode next = b.iterator().next();
            b.remove(next);
            i++;
            for (ComponentNode next2 : next.mo22903d()) {
                next2.mo22906g(next);
                if (next2.mo22905f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (ComponentNode next3 : c) {
                if (!next3.mo22905f() && !next3.mo22904e()) {
                    arrayList.add(next3.mo22902c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<ComponentNode> m6413b(Set<ComponentNode> set) {
        HashSet hashSet = new HashSet();
        for (ComponentNode next : set) {
            if (next.mo22905f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<ComponentNode> m6414c(List<Component<?>> list) {
        Set<ComponentNode> set;
        HashMap hashMap = new HashMap(list.size());
        for (Component next : list) {
            ComponentNode componentNode = new ComponentNode(next);
            Iterator it = next.mo22873h().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    Dep dep = new Dep(cls, !next.mo22877n());
                    if (!hashMap.containsKey(dep)) {
                        hashMap.put(dep, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(dep);
                    if (set2.isEmpty() || dep.f4784b) {
                        set2.add(componentNode);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<ComponentNode> it2 : hashMap.values()) {
            for (ComponentNode componentNode2 : it2) {
                for (Dependency next2 : componentNode2.mo22902c().mo22870e()) {
                    if (next2.mo22911e() && (set = (Set) hashMap.get(new Dep(next2.mo22909c(), next2.mo22914g()))) != null) {
                        for (ComponentNode componentNode3 : set) {
                            componentNode2.mo22900a(componentNode3);
                            componentNode3.mo22901b(componentNode2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
