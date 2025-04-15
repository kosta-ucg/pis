// Adapter
class EUToUSAdapter implements USPlug {
    private final EUSocket EUSocket;

    public EUToUSAdapter(EUSocket euSocket) {
        this.euSocket = euSocket;
    }

    @Override
    public void providePower() {
        System.out.println("Adapter pretvara napon...");
        euSocket.supplyElectricity();
        System.out.println("Uređaj dobio struju u US formatu");
    }
}
