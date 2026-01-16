package org.problems.strings;

public class RotateStringProblem {
    public static void main(String[] args) {
        String s = "world";
        String target = "dlrow";

        StringBuffer sb = new StringBuffer(s);
        int num = s.length();
        boolean isRotatable = false;
        while (num > 0) {
            char deleted = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(deleted);
            if (sb.toString().equals(target)) {
                isRotatable = true;
                break;
            } else {
                isRotatable = false;
            }
            num--;
        }

        System.out.println(isRotatable ? "Yes" : "No");
    }
}
