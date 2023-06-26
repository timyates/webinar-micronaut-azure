package com.example;

import io.micronaut.context.annotation.DefaultImplementation;
import io.micronaut.core.annotation.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@DefaultImplementation(UpperCaseNameTransformer.class)
public interface NameTransformer {

    @NonNull
    String transform(@NonNull @NotBlank @Pattern(regexp = "sergio") String name);
}
