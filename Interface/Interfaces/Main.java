package Interface.Interfaces;

public class Main {

    public static void main(String[] args) {
        // ITelephone timsPhone;
        ITelephone timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
        timsPhone.dial(1238456);

    }
}
