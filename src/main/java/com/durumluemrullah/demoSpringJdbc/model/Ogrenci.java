package com.durumluemrullah.demoSpringJdbc.model;

import com.durumluemrullah.demoSpringJdbc.annotations.Collumn;
import com.durumluemrullah.demoSpringJdbc.annotations.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="\"OBS\".\"OGRENCI\"")
public class Ogrenci {
    private int id;
    @Collumn(name="OGR_NUM")
    private int ogrenciNum;

    @Collumn(name="OGR_NAME")
    private String ogrName;
}
