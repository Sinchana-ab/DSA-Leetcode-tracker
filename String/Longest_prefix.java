public class Longest_prefix {
    public String LongPrefix(String[] str){
        if(str.length == 0){
            return "";
        }
        String prefix = str[0];
        for(int i = 0;i<str.length;i++){
            prefix = prefix.substring(0, prefix.length()-1);
            if(prefix.length() == 0){
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","floor"};
        Longest_prefix obj = new Longest_prefix();
        System.out.println(obj.LongPrefix(str));

    }
}
