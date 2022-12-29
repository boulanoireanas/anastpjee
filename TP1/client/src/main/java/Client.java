import proxy.BanqueService;
import proxy.BanqueService_Service;
import proxy.Compte;

public class Client {
    public static void main(String[] args) {
        BanqueService stub=new BanqueService_Service().getBanqueServicePort();
        System.out.println(stub.conversionEuroTODh(100));
        Compte cp=stub.getCompte(1);
        System.out.println(cp.getCode());
        System.out.println(cp.getSold());
    }
}
