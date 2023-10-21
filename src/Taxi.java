
public class Taxi extends PublicTransport {
    private double farePerKm;
    private double distance;

    // constructor
    public Taxi() {
        setModel("KAKAO TAXI");
    }

    // getters and setters
    public double getFarePerKm() {
        return farePerKm;
    }

    public void setFarePerKm(double farePerKm) {
        this.farePerKm = farePerKm;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override // from PublicTransport
    public void calculatePayment() {
        setTotalFare(getBaseFare() + (getFarePerKm() * getDistance()));
    }
}
