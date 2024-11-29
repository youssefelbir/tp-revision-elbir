package ma.emsi.elbir.tprevisionelbir.service.mappers;



import ma.emsi.elbir.tprevisionelbir.dao.entities.Phone;
import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDTO;
import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDtoInscription;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PhoneMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public PhoneDTO toDTO(Phone phone) {
        return modelMapper.map(phone, PhoneDTO.class);
    }

    public Phone toEntity(PhoneDTO phoneDTO) {
        return modelMapper.map(phoneDTO, Phone.class);
    }

    public PhoneDTO fromPhonetoPhoneDTO(Phone byModel) {
        return null;
    }

    public Phone fromPhoneDtoInscriptionToPhone(PhoneDtoInscription phoneDtoInscription) {
        return null;
    }
}

