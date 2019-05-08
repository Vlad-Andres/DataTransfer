package com.doxbit.dataTransfer;


public class NotFoundException extends RuntimeException {

    NotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}