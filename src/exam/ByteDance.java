package exam;

public class ByteDance {
    public static void main(String[] args) {
        String a = "1001";
        String b = "1";
        // 1.区分大串小串
        if (a.length() < b.length()){
            String temp = a;
            a = b;
            b=temp;
        }
        // 2.将小串补全和大串相等长度
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char c : a.toCharArray()) {
            sb1.append(c);
        }
        for (int i = b.length(); i < a.length(); i++) {
            sb2.append('0');
        }
        for (char c : b.toCharArray()) {
            sb2.append(c);
        }
        // 3.按位相加，初始时认为没有进位
        char index = '0';
        StringBuilder result = new StringBuilder();
        for (int i = sb1.length()-1;i>= 0; i--) {
            index = singleCharAdd(sb1.charAt(i),sb2.charAt(i),index,result);
        }
        if (index == '1'){
            result.append('1');
        }
        System.out.println(result.reverse().toString());
    }

    private static char singleCharAdd(char c1, char c2, char index, StringBuilder result) {
        int i1 = Integer.valueOf(c1+"");
        int i2 = Integer.valueOf(c2+"");
        int i3 = Integer.valueOf(index+"");
        int sum = i1+i2+i3;
        if (sum == 0){
            result.append('0');
            return '0';
        }else if (sum == 1){
            result.append('1');
            return '0';
        }else if (sum == 2){
            result.append('0');
            return '1';
        }else {
            result.append('1');
            return '1';
        }
    }
}
