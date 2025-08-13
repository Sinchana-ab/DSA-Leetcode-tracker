public class Longest_sufix {
    public String LongSufix(String[] str){
        if(str.length == 0){
            return "";
        }
        String suffix = str[0]; 
        for(int i=1;i<str.length;i++){
            while (!str[i].endsWith(suffix)) {
                suffix = suffix.substring(1, suffix.length());
                if(suffix.isEmpty()){
                    return "";
                }
            }
        }
        return suffix;
    }
    public static void main(String[] args) {
        Longest_sufix obj = new Longest_sufix();
        String[] str = {"Sinchana","nayana","pavana"};
        System.out.println(obj.LongSufix(str));
    }
}
