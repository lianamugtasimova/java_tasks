public class SwitchWithoutBreak {
    public static void main(String[] args) {
        
        testSwitch(1); // value = 1
        testSwitch(2); // value = 2
        testSwitch(3); // value = 3
        testSwitch(4); // value = 4
    }
    
    public static void testSwitch(int value) {
        int i = 0;
        
        switch(value) {
            case 1:
                i = 1;
                break;          // есть break - выход после case 1
            case 2:
                i = 2;          // НЕТ break - продолжить в case 3!
            case 3:
                i = 3;          // выполнится для case 2 и 3
                break;          // выход после case 3
            default:
                i = 4;
                break;
        }
        
        System.out.println("value = " + value + " → i = " + i);
    }
}