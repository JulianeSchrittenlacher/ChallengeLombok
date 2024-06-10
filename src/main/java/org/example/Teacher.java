package org.example;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder

public record Teacher(String id, String name, String subject) {
}
