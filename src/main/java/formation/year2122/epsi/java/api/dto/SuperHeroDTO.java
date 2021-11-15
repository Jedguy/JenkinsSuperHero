package formation.year2122.epsi.java.api.dto;

import lombok.*;

@Data
@Builder
public class SuperHeroDTO {
    private long id;
    private String superHeroName;
    private String secretIdentity;
}
