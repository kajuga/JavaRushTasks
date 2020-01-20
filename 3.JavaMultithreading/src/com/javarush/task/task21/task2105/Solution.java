package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Solution)) return false;
        if (o == null && o.getClass() != this.getClass()) return false;
        Solution sol = (Solution) o;
        return Objects.equals(this.first, sol.first) & Objects.equals(this.last, sol.last);
    }


    @Override
    public int hashCode() {
        int result;
        return result = 37 * (first != null ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
