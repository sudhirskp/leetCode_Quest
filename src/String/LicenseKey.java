package String;

public class LicenseKey {


        public String licenseKeyFormatting(String s, int k) {
            StringBuilder sb = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (ch != '-') {
                    sb.append(Character.toUpperCase(ch));
                }
            }

            String str = sb.toString();
            sb.setLength(0);


            int count = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
                count++;
                if (count == k && i != 0) {
                    sb.append('-');
                    count = 0;
                }
            }


            return sb.reverse().toString();
        }

    public static void main(String[] args) {
        LicenseKey ob = new LicenseKey();
        System.out.println(ob.licenseKeyFormatting("2-5g-3-J", 2));

    }
}
