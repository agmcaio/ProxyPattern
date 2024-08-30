import interfaces.Internet;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Conectando a " + serverhost + " ... OK");
    }
}
