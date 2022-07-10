package Service;

import Models.Pavillon;

public interface IServicePavillon {

    public void AddPavillon(Pavillon pavillon);

    public void listerPavillon();

    public void supprimer(int id);
}
