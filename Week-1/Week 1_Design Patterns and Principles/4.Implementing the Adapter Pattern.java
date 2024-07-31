// PaymentProcessor.java
interface PaymentProcessor {
    void processPayment(double amount);
}

// PayPal.java
class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}

// PayPalAdapter.java
class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}

// AdapterPatternExample.java
public class AdapterPatternExample {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);

        payPalAdapter.processPayment(100.0);
    }
}
