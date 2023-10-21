
public class PublicTransport implements Payable {
    private String model;
    private double baseFare;
    private double totalFare;

    // constructor
    public PublicTransport() {
        baseFare = 0;
        totalFare = 0;
    }

    // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        baseFare = baseFare;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    @Override // from PublicTransport
    public void calculatePayment() {
        // TODO: calculate total fare according to the # of stations
    }
}
