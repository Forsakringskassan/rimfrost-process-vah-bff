package se.fk.github.vahbff.model;

import jakarta.validation.constraints.NotBlank;

public record TaskRequest(@NotBlank String handlaggningId){}
