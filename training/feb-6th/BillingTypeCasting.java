class BillingTypeCasting {

    public static void main(String[] args) {

        double billAmount = 249.75;

        int implicitCastAmount = (int) billAmount;

        int explicitCastAmount = (int) billAmount;

        System.out.println("Original Bill Amount (double): " + billAmount);
        System.out.println("After Implicit Casting (int): " + implicitCastAmount);
        System.out.println("After Explicit Casting (int): " + explicitCastAmount);

        double precisionLoss = billAmount - explicitCastAmount;

        System.out.println("Precision Loss: " + precisionLoss);
    }
}