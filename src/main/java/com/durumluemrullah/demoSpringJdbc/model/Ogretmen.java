package com.durumluemrullah.demoSpringJdbc.model;

import com.durumluemrullah.demoSpringJdbc.annotations.Collumn;
import com.durumluemrullah.demoSpringJdbc.annotations.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "\"OBS\".\"OGRETMEN\"")
public class Ogretmen {

    private int ogrId;
    @Collumn(name = "OGR_NAME")
    private String ogrName;
}
