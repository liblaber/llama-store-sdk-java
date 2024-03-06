package com.liblab.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum LlamaColor {
    BROWN("brown"),
    WHITE("white"),
    BLACK("black"),
    GRAY("gray");

  public final String label;
}
