package ma.emsi.elbir.tprevisionelbir.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Phone  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPhone;
    private String model;
    private String color;
    private Integer IMEI;
    private Float price;


}
