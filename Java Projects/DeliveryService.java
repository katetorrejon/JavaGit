public class DeliveryService {
    private String packageType, serviceType, error;
    private double packageWeight = 0.00;
    private double packageCharge;

    DeliveryService(String pt, String st, double pw) {
        packageType = pt;
        serviceType = st;
        packageWeight = pw;
    }

    public void calculatePackageCharge() {
        if (packageType.equalsIgnoreCase("letter") && (packageWeight >= 0 && packageWeight <= 8)) {
            switch (serviceType) {
                case "Next Day Priority":
                    packageCharge = 12.00;
                    break;
                case "Next Day Standard":
                    packageCharge = 10.50;
                    break;
                default:
                    error = "Service type not applicable for letter packages.\n";
            }
        } else if (packageType.equalsIgnoreCase("box") && packageWeight >= 1) {
            switch (serviceType) {
                case "Next Day Priority":
                    packageCharge = 15.75 + (1.25*(packageWeight - 1));
                    break;
                case "Next Day Standard":
                    packageCharge = 13.75 + (1.00*(packageWeight - 1));
                    break;
                case "2-Day":
                    packageCharge = 7.00 + (0.50*(packageWeight - 1));
                    break;
                default:
                    error = "Service type not applicable for box packages\n";
            }
        } else {
            error = "Not Applicable. Package weight exceeds the limit.\n";
        }
    }

    public void displayPackageDetails() {
        if (packageCharge > 0) {
            System.out.println("--- Package Details ---");
            System.out.println("Package Type: " + packageType);
            System.out.println("Service Type: " + serviceType);
            System.out.println("Package Weight: " + packageWeight + " lbs");
            System.out.println("Delivery Charge: PHP " + packageCharge);
            System.out.println();
        } else {
            System.out.println(error);
        }
    }
}