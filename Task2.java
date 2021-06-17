import java.time.LocalDateTime;

public class Task2 {
    public static void main(String []args)  {
        // String型　変数greeting　"HelloWorld"を表示
        String greeting = "HelloWorld";

        System.out.println(greeting);

        // １～１０まで足す
        int addition = 0;
        for(int i = 1;i <= 10;i++) { addition += i; }
        
        System.out.println(addition);

        // ３年後の今日は何曜日？
        LocalDateTime today = LocalDateTime.now();
        java.time.DayOfWeek dayOfTheWeek = today.plusYears(3).getDayOfWeek(); 
        
        System.out.println(dayOfTheWeek);

        // 引数が０なら偽、引数が１なら真
        public String judge(int num) {
            String result;
        
            if (num == 0){
            System.out.println("偽");
        }
            if (num == 1){
            System.out.println("真");
        }
            return result;
    }
}