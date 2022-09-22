import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        int lowerRangeLimit;
        int upperRangeLimit;
        int expected;

        SQRService service = new SQRService();
        System.out.println(service.sqrRange(100, 200));

    }
}
