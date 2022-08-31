package learnwithAli;
 

public class Question {
    private int hour = 0;
    boolean twelvehour = false;
    boolean summertime = false;

    public Question(){}

    public void tick(){
        ++hour;
        if(hour == 24){
            hour = 0;
        }
    }

    public void printStatus(){
        System.out.print("Akuelle Uhrzeit: ");

        if(twelvehour == true){
            if(hour % 12 == 0){
                System.out.println(12 + " am");
            } else if(hour > 12 ){
                System.out.println(hour - 12 + " pm");
            }else if(hour < 12){
                System.out.println(hour + " am");
            }
        }else{
            System.out.println(hour + " Uhr");
        }
    }

    public  void switchMode(){
        twelvehour = !twelvehour;
    }

    public void switchToSummertime(){
        summertime = true;
        tick();
    }

    public  void switchToWintertime(){
        summertime = false;
        --hour;
        if(hour == -1){
            hour = 23;
        }
    }
    public static void main( String[]args) {
    	Question basicClock = new Question();
    	 basicClock.printStatus();
    	 basicClock.tick();
    	 basicClock.printStatus();
    	 for (int i = 1; i <= 12; i++) {
    	 basicClock.tick();
    	 }
    	 basicClock.printStatus();
    	 basicClock.switchMode();
    	 basicClock.printStatus();
    	 for (int i = 1; i <= 10; i++) {
    	 basicClock.tick();
    	 }
    	 basicClock.printStatus();
    	 basicClock.switchMode();
    	 basicClock.printStatus();
    	 basicClock.switchToSummertime();
    	 basicClock.printStatus();
    	 basicClock.tick();
    	 basicClock.printStatus();
    	 basicClock.switchToWintertime();
    	 basicClock.printStatus();
    	 basicClock.switchMode();
    	 basicClock.printStatus();basicClock.switchMode();
    	 basicClock.printStatus();
    	 basicClock.printStatus();basicClock.switchMode();
    	 basicClock.printStatus();
    }
}
