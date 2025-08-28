package co.vinni.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Temperatura {
    private String ciudad;
    private int minima;
    private int maxima;

}
