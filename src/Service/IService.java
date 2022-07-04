package Service;

import java.util.List;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public interface IService {

    public void AddPavillon(Pavillon $pavPavillon);

    public void listerPavillon();

    public int question();

    // public void traitementInformation(int repon);

}
