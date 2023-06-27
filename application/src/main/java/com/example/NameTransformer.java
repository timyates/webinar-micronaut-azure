package com.example;

import io.micronaut.context.annotation.DefaultImplementation;
import io.micronaut.core.annotation.NonNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@DefaultImplementation(UpperCaseNameTransformer.class)
public interface NameTransformer {

    @NonNull
    String transform(@NonNull @NotBlank @Pattern(regexp = "sergio") String name);
}
