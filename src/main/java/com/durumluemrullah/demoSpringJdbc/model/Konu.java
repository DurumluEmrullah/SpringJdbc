package com.durumluemrullah.demoSpringJdbc.model;

import com.durumluemrullah.demoSpringJdbc.annotations.Collumn;
import com.durumluemrullah.demoSpringJdbc.annotations.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"OBS\".\"KONU\"")
public class Konu {
    private int konuId;
    @Collumn(name = "KONU")
    private String konu;
}
