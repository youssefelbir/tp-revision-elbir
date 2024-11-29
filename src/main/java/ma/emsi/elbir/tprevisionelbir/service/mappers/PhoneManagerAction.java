package ma.emsi.elbir.tprevisionelbir.service.mappers;


import ma.emsi.elbir.tprevisionelbir.dao.entities.Phone;
import ma.emsi.elbir.tprevisionelbir.dao.repositories.PhoneRepository;
import ma.emsi.elbir.tprevisionelbir.service.PhoneManager;
import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDTO;
import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDtoInscription;
import ma.emsi.elbir.tprevisionelbir.service.mappers.PhoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class PhoneManagerAction implements PhoneManager {

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public PhoneDTO getPhoneByModel(String model) {
        return phoneMapper.fromPhonetoPhoneDTO(phoneRepository.findByModel(model));
    }

    @Override
    public PhoneDTO getPhoneByModelAndPrice(String model, Float price) {
        return phoneMapper.fromPhonetoPhoneDTO(phoneRepository.findByModelAndPrice(model,price));
    }

    @Override
    public PhoneDTO savePhone(PhoneDtoInscription phoneDtoInscription) {
        if(phoneRepository.findByIMEI(phoneDtoInscription.getIMEI()).isPresent()){
            throw new RuntimeException("Phone already in the database");
        }
        else{Phone phone = phoneMapper.fromPhoneDtoInscriptionToPhone(phoneDtoInscription);
            phone = phoneRepository.save(phone);
            return phoneMapper.fromPhonetoPhoneDTO(phone);}
    }

    @Override
    public PhoneDTO deletePhone(Integer id) {
        Phone phone =  phoneRepository.deleteByIdPhone(id);
        return  phoneMapper.fromPhonetoPhoneDTO(phone);
    }
}
