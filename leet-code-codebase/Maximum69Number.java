public class Maximum69Number {
    static public int maximum69Number (int num) {
        if( num <= 9 && num >= 1){
            return fun9(num);
        }
        if( num <=99 && num >= 10){
            return fun99(num);
        }
        if( num <=999 && num >= 100){
            return fun999(num);
        }
        if( num <=9999 && num >= 1000){
            return fun9999(num);
        }
        return num;
    }
    static int fun9(int num) {
        if( num == 6){
            return 9;
        }
        return 9;
    }
    static int fun99(int num){
        int d = num /10;
        num %= 10;
        if(d == 6){
            return 90 + num;
        }
        
        return 90 + fun9(num);
        
    }
    static int fun999(int num){
        int d = num /100;
        num %= 100;
        if(d == 6){
            return 900 + num;
        }
      
        return 900 + fun99(num);
       

    }
    static int fun9999(int num){
        int d = num /1000;
        num %= 1000;
        if(d == 6){
            return 9000 + num;
        }
        
        return 9000 + fun999(num);
       
    }
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
