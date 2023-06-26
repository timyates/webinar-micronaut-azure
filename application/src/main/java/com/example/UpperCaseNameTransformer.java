package com.example;

import jakarta.inject.Singleton;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Singleton
public class UpperCaseNameTransformer implements NameTransformer {
    @NotNull
    @Override
    public String transform(@NotNull @NotBlank @Pattern(regexp = "sergio") String name) {
        return name.toUpperCase();
    }
}
