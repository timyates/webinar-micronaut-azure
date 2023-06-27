package com.example;

import jakarta.inject.Singleton;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Singleton
public class UpperCaseNameTransformer implements NameTransformer {
    @NotNull
    @Override
    public String transform(@NotNull @NotBlank @Pattern(regexp = "sergio") String name) {
        return name.toUpperCase();
    }
}
