public class DeliveryServiceTest {
    public static void main(String[] args) {
        System.out.println("-- Welcome!\n");
        System.out.println("**********************************");
        System.out.println("Delivery Service Charge Calculator");
        System.out.println("**********************************\n");

        DeliveryService Package1 = new DeliveryService("Letter", "Next Day Priority", 7.00);
        System.out.println("[ #1 ]");
        Package1.calculatePackageCharge();
        Package1.displayPackageDetails();

        DeliveryService Package2 = new DeliveryService("Letter", "Next Day Standard", 5.00);
        System.out.println("[ #2 ]");
        Package2.calculatePackageCharge();
        Package2.displayPackageDetails();

        DeliveryService Package3 = new DeliveryService("Box", "Next Day Priority", 1.00);
        System.out.println("[ #3 ]");
        Package3.calculatePackageCharge();
        Package3.displayPackageDetails();

        DeliveryService Package4 = new DeliveryService("Box", "Next Day Standard", 1.00);
        System.out.println("[ #4 ]");
        Package4.calculatePackageCharge();
        Package4.displayPackageDetails();

        DeliveryService Package5 = new DeliveryService("Box", "2-Day", 1.00);
        System.out.println("[ #5 ]");
        Package5.calculatePackageCharge();
        Package5.displayPackageDetails();

        DeliveryService Package6 = new DeliveryService("Box", "Next Day Priority", 5.00);
        System.out.println("[ #6 ]");
        Package6.calculatePackageCharge();
        Package6.displayPackageDetails();

        DeliveryService Package7 = new DeliveryService("Box", "Next Day Standard", 5.00);
        System.out.println("[ #7 ]");
        Package7.calculatePackageCharge();
        Package7.displayPackageDetails();

        DeliveryService Package8 = new DeliveryService("Box", "2-Day", 5.00);
        System.out.println("[ #8 ]");
        Package8.calculatePackageCharge();
        Package8.displayPackageDetails();
    }
}