package com.durumluemrullah.demoSpringJdbc.model;

import com.durumluemrullah.demoSpringJdbc.annotations.Collumn;
import com.durumluemrullah.demoSpringJdbc.annotations.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"OBS\".\"DERS_OGRENCI\"")
public class DersOgranci {

    private int kayitId;
    @Collumn(name="OGRENCI_ID")
    private int ogrenciId;
    @Collumn(name = "DERS_ID")
    private int dersId;
}
