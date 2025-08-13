public class String_to_int {
    public int myatoi(String s){
        s = s.trim();
        int n = s.length();
        if(n == 0){
            return 0;
        }
        int i = 0, sign = 1, result = 0;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        int int_max = Integer.MAX_VALUE;
        int int_min = Integer.MIN_VALUE;
        while(i< n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(result> (Integer.MAX_VALUE - digit)/10){
                return (sign == 1) ? int_max : int_min;
            }
            result =result * 10 + digit;
            i++;
        }
        return result * sign;
    }
    public static void main(String[] args) {
        String_to_int s = new String_to_int();
        int a = s.myatoi(" -42");
        System.out.println(a);
    }
}
