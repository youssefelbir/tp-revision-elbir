package ma.emsi.elbir.tprevisionelbir.service.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneDtoInscription {

    private String model;
    private String color;
    private Integer IMEI;
    private Double price;
}
