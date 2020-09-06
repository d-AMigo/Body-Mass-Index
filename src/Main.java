public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 51.5F;
        float height = 165;
        float Bmi = service.calculate(weight,height);
        System.out.println(Bmi);
    }
}