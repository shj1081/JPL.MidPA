
public class Train extends PublicTransport {

    Station stationInfo = new Station();

    // constructor
    public Train() {
        setModel("KORAIL");
    }

    @Override // from PublicTransport
    public void calculatePayment() {
        // TODO: calculate total fare according to the # of stations
        setTotalFare(getBaseFare());
    }
}
