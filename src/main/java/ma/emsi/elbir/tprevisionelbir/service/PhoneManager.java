package ma.emsi.elbir.tprevisionelbir.service;


import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDTO;
import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDtoInscription;
import org.springframework.stereotype.Component;

@Component
public interface PhoneManager {

    public PhoneDTO getPhoneByModel(String model);
    public PhoneDTO getPhoneByModelAndPrice(String model, Float price);
    public PhoneDTO savePhone(PhoneDtoInscription phoneDtoInscription);
    public PhoneDTO deletePhone(Integer id);
}

