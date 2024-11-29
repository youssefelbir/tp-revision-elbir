package ma.emsi.elbir.tprevisionelbir.web;



import ma.emsi.elbir.tprevisionelbir.service.PhoneManager;
import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDTO;
import ma.emsi.elbir.tprevisionelbir.service.dtos.PhoneDtoInscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PhoneGraphQLController {

    @Autowired
    private PhoneManager phoneManager;

    @QueryMapping
    public PhoneDTO getPhoneByModel(@Argument String model) {
        return phoneManager.getPhoneByModel(model);
    }

    @QueryMapping
    public PhoneDTO getPhoneByModelAndPrice(@Argument String model, @Argument Float price) {
        return phoneManager.getPhoneByModelAndPrice(model, price);
    }

    @MutationMapping
    public PhoneDTO savePhone(@Argument PhoneDtoInscription phoneDtoInscription) {
        return phoneManager.savePhone(phoneDtoInscription);
    }

    @MutationMapping
    public PhoneDTO deletePhone(@Argument Integer id) {

        return phoneManager.deletePhone(id);
    }

}
