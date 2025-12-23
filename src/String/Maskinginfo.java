package String;

public class Maskinginfo {

        public String maskPII(String s) {
            if (s.contains("@")) {
                String[] email = s.split("@");
                String before = email[0].toLowerCase();
                String after = email[1].toLowerCase();


                return before.charAt(0) + "*****" + before.charAt(before.length() - 1) + "@" + after;
            } else {
                StringBuilder digits = new StringBuilder();
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        digits.append(c);
                    }
                }

                int numCount = digits.length();
                String last4 = digits.substring(numCount - 4);

                StringBuilder mask = new StringBuilder();
                if (numCount > 10) {
                    mask.append('+');
                    for (int i = 0; i < numCount - 10; i++) {
                        mask.append('*');
                    }
                    mask.append('-');
                }
                mask.append("***-***-").append(last4);

                return mask.toString();
            }
        }

    public static void main(String[] args) {
            Maskinginfo maskinginfo = new Maskinginfo();
            System.out.println(maskinginfo.maskPII("12345678901"));
            System.out.println(maskinginfo.maskPII("leetCode@LeetCode.com"));
    }
}
//Q3