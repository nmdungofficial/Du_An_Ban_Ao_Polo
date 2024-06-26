package com.example.Xuong_duAn_L1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idColor;
    private String code;

    private String name;

    private Integer status;

    private LocalDate uploadDate;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "color")
    @JsonIgnoreProperties
    Set<ProductDetail> productDetailSet;
}
