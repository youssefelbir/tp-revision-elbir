package ma.emsi.elbir.tprevisionelbir.service.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PhoneDTO {

    private String model;
    private String color;
    private Integer IMEI;
    private Double price;
}
