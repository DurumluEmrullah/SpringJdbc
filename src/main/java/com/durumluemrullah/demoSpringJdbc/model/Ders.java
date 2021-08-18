package com.durumluemrullah.demoSpringJdbc.model;

import com.durumluemrullah.demoSpringJdbc.annotations.Collumn;
import com.durumluemrullah.demoSpringJdbc.annotations.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="\"OBS\".\"DERS\"")
public class Ders {

    private int dersId;
    @Collumn(name="OGRETMEN_ID")
    private int ogretmenId;
    @Collumn(name="KONU_ID")
    private int konuId;
}
