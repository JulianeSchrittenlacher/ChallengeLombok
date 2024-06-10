package org.example;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.With;

@With
@Builder

public record University(String id, String name, String courses) {

}
