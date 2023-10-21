public class Bus extends PublicTransport {

    Station stationInfo = new Station();

    // constructor
    public Bus() {
        setModel("KORBUS");
    }

    @Override // from PublicTransport
    public void calculatePayment() {
        // TODO: calculate total fare according to the # of stations
        setTotalFare(getBaseFare());
    }
}
